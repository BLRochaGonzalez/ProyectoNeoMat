package org.iesalixar.bluisrochag.neomat.security;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//		
//	String[] resources = new String[]{
//           "/css/**","/assets/**","/jquery/**","/js/**"
//    };
//	
//	@Autowired
//	SuccessHandler successHandler;
//	
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .authorizeRequests()
//	        .antMatchers(resources).permitAll()  
//	        .antMatchers("/","/login", "/register").permitAll()
//	        .antMatchers("/user/*").hasAuthority("user")
//	        .antMatchers("/admin/*").hasAuthority("admin");
//      
//    }
//	
//	
//	BCryptPasswordEncoder bCryptPasswordEncoder;
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//		bCryptPasswordEncoder = new BCryptPasswordEncoder(10);
//        return bCryptPasswordEncoder;
//    }
//
//}
