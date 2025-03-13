package com.kbm.spharos.member.infrastructure;

import com.kbm.spharos.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

