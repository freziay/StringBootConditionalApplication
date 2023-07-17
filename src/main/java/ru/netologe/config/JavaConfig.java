package ru.netologe.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netologe.model.impl.DevProfile;
import ru.netologe.model.impl.ProductionProfile;
import ru.netologe.model.SystemProfile;

@Configuration
public class JavaConfig {

    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true", matchIfMissing = true)
    @Bean(name = "DevProfile")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false")
    @Bean(name = "ProductionProfile")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
