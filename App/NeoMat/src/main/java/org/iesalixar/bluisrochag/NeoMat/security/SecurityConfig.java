//package org.iesalixar.bluisrochag.neomat.security;
//
//import org.iesalixar.bluisrochag.neomat.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	String[] resources = new String[]{
//            "/include/**","/css/**","/icons/**","/assets/**","/Javascript/**","/layer/**","/style/**","/jquery/**","/js/**"
//    };
//
//	@Autowired
//	OwnSuccessHandler ownSuccessHandler;
//	
//	@Autowired
//    UserService userDetailsService;
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//		.antMatchers(resources).permitAll()
//		.antMatchers("/", "/login", "/register").permitAll()
//		.antMatchers("/user/*").hasAuthority("user")
//		.antMatchers("/admin/*").hasAuthority("admin")
//            .anyRequest().authenticated()
//           .and()
//        .formLogin()
//            .loginPage("/login")
//            .successHandler(ownSuccessHandler)
//            .permitAll()
//            .failureUrl("/login?error=true")
//            .usernameParameter("email")
//            .passwordParameter("password")
//            .and()
//        .logout()
//            .permitAll()
//            .logoutSuccessUrl("/login?logout");
//    
//    http.exceptionHandling().accessDeniedPage("/");
//	}
//
//	BCryptPasswordEncoder bCryptPasswordEncoder;
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//		bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
//        return bCryptPasswordEncoder;
//    }
//
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//	}
//}
