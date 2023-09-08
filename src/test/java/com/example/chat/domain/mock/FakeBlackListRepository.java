package com.example.chat.domain.mock;

import com.example.chat.domain.chatroom.domain.BlackList;
import com.example.chat.domain.chatroom.domain.ChatRoom;
import com.example.chat.domain.chatroom.service.port.BlackListRepository;
import com.example.chat.domain.member.domain.Member;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FakeBlackListRepository implements BlackListRepository {
    private Long autoGeneratedId = 0L;
    private final List<BlackList> store = new ArrayList<>();

    @Override
    public BlackList save(BlackList blackList) {
        BlackList newBlacklist = BlackList.builder()
                .id(++autoGeneratedId)
                .room(blackList.getRoom())
                .member(blackList.getMember())
                .registrationAt(LocalDateTime.MIN)
                .build();
        store.add(newBlacklist);
        return newBlacklist;
    }

    @Override
    public Optional<BlackList> findByRoomAndMember(ChatRoom chatRoom, Member member) {
        return store.stream().filter(room ->
                        Objects.equals(room.getRoom().getId(), chatRoom.getId())
                                && Objects.equals(room.getMember().getId(), member.getId()))
                .findAny();
    }
}