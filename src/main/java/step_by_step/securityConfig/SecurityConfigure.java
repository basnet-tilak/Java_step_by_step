package step_by_step.securityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfigure{
    @Bean
    protected SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {
        return http
                .authorizeHttpRequests(
                        authorization -> {
                            authorization
                                    .requestMatchers("api/hello").permitAll()
                                    .requestMatchers("/api/get").hasRole("USER")
                                    .requestMatchers("/api/post").hasRole("ADMIN")
                                    .requestMatchers("/api/delete/**").hasRole("ADMIN")
                                    .anyRequest().authenticated();
                        }).build();

    }
}
