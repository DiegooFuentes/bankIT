package com.bankit.web.configurations;
/*
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.WebAttributes;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authorizeHttpRequests) ->
                        authorizeHttpRequests
                                .requestMatchers("/account/register").permitAll()
                                .requestMatchers(HttpMethod.GET,"/account/login").permitAll()
                                .requestMatchers("/landing").permitAll()
                                .requestMatchers("/account/system").hasAuthority("CLIENT")
                                .requestMatchers(HttpMethod.POST, "/account/register").permitAll()
                                .requestMatchers("/home").hasAuthority("CLIENT")
                )

                .csrf(AbstractHttpConfigurer::disable)
                .headers((headers) ->
                        headers
                                .frameOptions(withDefaults()).disable()
                )
                .formLogin((formLogin) ->
                        formLogin
                                .loginPage("/account/login")
                                .usernameParameter("email")
                                .passwordParameter("password")
                                .permitAll()
                                .successHandler((req, res, auth) -> {
                                    Map<String, Object> successResponse = new HashMap<>();
                                    successResponse.put("message", "Login successful");
                                    res.setStatus(HttpServletResponse.SC_OK);
                                    res.setContentType("application/json");
                                    res.sendRedirect("/home");
                                    res.getWriter().write(new ObjectMapper().writeValueAsString(successResponse));
                                    clearAuthenticationAttributes(req);
                                })
                                .failureHandler((req, res, exc) -> {
                                    Map<String, Object> errorResponse = new HashMap<>();
                                    errorResponse.put("message", "Login failed");
                                    res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                                    res.setContentType("application/json");
                                    res.sendRedirect("/account/login?error");
                                    res.getWriter().write(new ObjectMapper().writeValueAsString(errorResponse));
                                })
                )
                .logout((logout) ->
                                logout
                                        .logoutUrl("/api/logout")
                                        .logoutSuccessUrl("/account/login")
                                        .invalidateHttpSession(true)
                                        .deleteCookies("JSESSIONID")

                        //I do not know exactly how this one works and I need to redirect, So I am using the methods above.
                        //.logoutSuccessHandler(new HttpStatusReturningLogoutSuccessHandler())


                )

                .exceptionHandling((exceptionHandling) ->
                        exceptionHandling
                                .authenticationEntryPoint(((request, response, authException) ->
                                        response.sendRedirect("/landing")))
                );

        return http.build();
    }

    private void clearAuthenticationAttributes(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
        }
    }


}

 */
