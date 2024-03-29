package com.ohgiraffers.dailylogbackend.report.command.domain.repository;

import com.ohgiraffers.dailylogbackend.report.command.domain.aggregate.entity.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<ReportEntity, Long> {

}
