package alfacentauri.com.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()//Desactiva la protección CSRF
                .cors().and()//Desactiva la protección cors
                .authorizeHttpRequests()
                .requestMatchers(HttpMethod.GET, "/api/**").permitAll()
                .anyRequest()//Permite cualquier pedición de cualquier origen
                .authenticated()
                .and()
                .httpBasic();

        return http.build();
    }
}
