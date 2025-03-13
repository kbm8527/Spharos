package com.kbm.spharos.member.application;

import com.kbm.spharos.member.dto.in.MemberAddDto;
import com.kbm.spharos.member.infrastructure.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public void addMember(MemberAddDto memberAddDto) {
        memberRepository.save(memberAddDto.toEntity(UUID.randomUUID().toString()));
    }
}
