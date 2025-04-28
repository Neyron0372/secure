package edu.lab.secureweb.config;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;

/*
  @author   neyron
  @project   secureweb
  @class  AuditorAwareImpl
  @version  1.0.0 
  @since 19.04.2025 - 20.37
*/
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(System.getProperty("user.name"));
    }
}
