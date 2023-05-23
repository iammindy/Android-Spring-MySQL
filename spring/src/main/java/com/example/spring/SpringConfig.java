package com.example.spring;

import com.example.spring.repository.JpaMemberRepository;
import com.example.spring.repository.MemberRepository;
import com.example.spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

    private EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public MemberService memberService() {return new MemberService(memberRepository()); }

    @Bean
    public MemberRepository memberRepository() { return new JpaMemberRepository(em); }
}
