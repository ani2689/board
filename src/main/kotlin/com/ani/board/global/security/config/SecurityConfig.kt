package com.ani.board.global.security.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {

    fun filterChain(httpSecurity: HttpSecurity) : SecurityFilterChain{
        httpSecurity
            .authorizeRequests()
            .antMatchers("/").authenticated()
            .anyRequest().permitAll()

        httpSecurity
            .formLogin()
                .loginPage("/auth/login")
                .loginProcessingUrl("/api/login")
                .defaultSuccessUrl("/board")
            .and()
                .logout()
            .and()
                .csrf().disable()

        httpSecurity.rememberMe()
            .rememberMeParameter("remember")
            .tokenValiditySeconds(3600)
            .alwaysRemember(true)

        return httpSecurity.build()
    }

}