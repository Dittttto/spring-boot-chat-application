package com.example.chat.domain.member.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Member {
    private Long id;
    private String name;
    private String nickname;

    @Builder
    public Member(Long id, String name, String nickname) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
    }

    public static Member from(MemberCreate memberCreate) {
        return Member.builder()
                .name(memberCreate.getName())
                .nickname(memberCreate.getNickName())
                .build();
    }

    public Member update(MemberUpdate memberUpdate) {
        return Member.builder()
                .id(id)
                .name(name)
                .nickname(memberUpdate.getNickname())
                .build();
    }
}
