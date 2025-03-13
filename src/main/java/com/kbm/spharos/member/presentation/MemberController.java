package com.kbm.spharos.member.presentation;

import com.kbm.spharos.member.application.MemberService;
import com.kbm.spharos.member.dto.in.MemberAddDto;
import com.kbm.spharos.member.vo.MemberSignUpVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/member")
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/sign-up")
    public void singUp(
            @RequestBody MemberSignUpVo memberSignUpVo
    ) {
        memberService.addMember(MemberAddDto.from(memberSignUpVo));
    }
}
