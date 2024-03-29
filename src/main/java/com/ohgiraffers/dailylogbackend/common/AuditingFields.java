package com.ohgiraffers.dailylogbackend.common;

import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@ToString
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class AuditingFields {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @CreatedDate
    protected LocalDateTime createdAt; // 생성일시

    @CreatedBy
    protected String createdBy; // 생성자

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @LastModifiedDate
    protected LocalDateTime modifiedAt; // 수정일시

    @LastModifiedBy
    protected String modifiedBy; // 수정자

    public AuditingFields() {
        this.createdAt = LocalDateTime.now();
        this.createdBy = "1";
        this.modifiedAt = LocalDateTime.now();
        this.modifiedBy = "1";
    }
}
