package com.library.utill

import spock.lang.Specification

import java.time.LocalDate

class DateUtillsTest extends Specification {

    def "문자열(yyyyMMdd)을 LocalDate 객체로 변환한다."(){
        given:
        def date = "20241210"

        when:
        def result = DateUtills.parseYYYMMDD(date)

        then:
        result == LocalDate.of(2024,12,10)
    }
}
