package com.library.feign

import feign.RequestTemplate
import spock.lang.Specification

class NaverClientCongfigurationTest extends Specification {
    NaverClientCongfiguration configuration

    void setup(){
        configuration = new NaverClientCongfiguration()
    }

    def "requestInterceptor의 header에 key값들이 적용된다."(){
        given:
        def template = new RequestTemplate()
        def clientId = "id"
        def clientSecret = "secret"

        and: "interceptor를 타기전에 header가 존재하지 않는다."
        template.headers()["X-Naver-Client-Id"] == null
        template.headers()["X-Naver-Client-Secret"] == null

        when: "interceptor를 탄다."
        def interceptor = configuration.requestInterceptor(clientId, clientSecret)
        interceptor.apply(template)

        then: "interceptor를 탄 이후에는 header가 추가된다."
        template.headers()["X-Naver-Client-Id"].contains(clientId)
        template.headers()["X-Naver-Client-Secret"].contains(clientSecret)
    }
}
