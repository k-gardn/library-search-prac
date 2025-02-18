package com.library.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;


@Getter
@ToString
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED) //객체를 외부에서 직접 생성하지 못하도록 보호
@Table(name="daily_stat")
public class DailyStat {
    @Id // PK 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동 증가(AUTO_INCREMENT)
    private Long id;

    @Column(name = "query")
    private String query;

    @Column(name = "eventDateTime")
    private LocalDateTime eventDateTime;

    public DailyStat(String query, LocalDateTime eventDateTime) {
        this.query = query;
        this.eventDateTime = eventDateTime;
    }
}
