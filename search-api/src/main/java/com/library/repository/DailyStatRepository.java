package com.library.repository;

import com.library.entity.DailyStat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface DailyStatRepository extends JpaRepository<DailyStat, Long> {
//  query 값이 특정 문자열과 일치하고, eventDateTime이 주어진 시간 범위(start ~ end) 안에 있는 데이터의 개수를 반환하는 쿼리를 자동으로 생성
//    SELECT COUNT(*)
//    FROM daily_stat
//    WHERE query = ?
//    AND event_date_time BETWEEN ? AND ?;
    long countByQueryAndEventDateTimeBetween(String query, LocalDateTime start, LocalDateTime end);
}
