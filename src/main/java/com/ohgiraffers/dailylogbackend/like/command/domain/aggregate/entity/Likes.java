package com.ohgiraffers.dailylogbackend.like.command.domain.aggregate.entity;

import com.ohgiraffers.dailylogbackend.diary.command.domain.aggregate.entity.DiaryEntity;

import javax.persistence.*;

@Entity
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id", nullable = false)
//    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "diary_id", nullable = false)
    private DiaryEntity diary;

//    public Likes(Member member, DiaryEntity diary) {
//        this.member = member;
//        this.diary = diary;
//    }

    public Likes() {

    }
}
