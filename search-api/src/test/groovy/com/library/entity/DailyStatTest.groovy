package com.library.entity

import spock.lang.Specification

import java.time.LocalDateTime

class DailyStatTest extends Specification {
    def "create"(){
        given:
        def givenQuery="HTTP"
        def givenEventDateTime= LocalDateTime.of(2024,1,10,1,1,1)

        when:
        def result = new DailyStat(query: givenQuery, eventDateTime: givenEventDateTime)

        then:
        verifyAll{
            result.query == givenQuery
            result.query == givenQuery
        }
    }

}
