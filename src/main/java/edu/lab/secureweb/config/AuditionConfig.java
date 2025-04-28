package edu.lab.secureweb.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

/*
  @author   neyron
  @project   secureweb
  @class  AuditionConfig
  @version  1.0.0 
  @since 19.04.2025 - 20.31
*/
@EnableMongoAuditing
@Configuration
public class AuditionConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        return new AuditorAwareImpl();
    }

}
