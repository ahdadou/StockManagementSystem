//package ma.suppliers.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builder s.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@EnableWebSecurity
//public class SecurityConfig {
//
//    /**
//     * For the backend-resources, I indicate that all the endpoints are protected.
//     * To request any endpoint, the OAuth2 protocol is necessary, using the server configured and with the given scope.
//     * Thus, a JWT will be used to communicate between the backend-resources and backend-auth when backend-resources
//     * needs to validate the authentication of a request.
//     */
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
//                .oauth2Login()
//                .and()
//                .oauth2ResourceServer()
//                .jwt();
//        return http.build();
//    }
//}
