package med.voll.api.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //Classe de Configuração
@EnableWebSecurity //Personalizar as configurações de segurança
public class SecurityConfigurations {

    @Bean //Exporta a classe para o Spring, para carregar e realizar a injeção de dependencias em outras classes.
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable() //Desabilita ataques contra CSRF
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().build(); //Desabilita o processo padrão de autenticação do spring, e altera de STATEFULL para STATELESS
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
        }

}
