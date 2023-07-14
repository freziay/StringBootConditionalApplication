package ru.netologe.dao;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import ru.netologe.dao.SystemProfile;

public class ProductionProfile implements SystemProfile {

    @Override
    public String getProfile() {
        return "Current profile is production";
    }

    @Bean(name = "productionProfile")
    @ConditionalOnProperty(prefix = "current profile is production", name = "service")
    public SystemProfile systemProfile() {
        return new ProductionProfile();
    }
}
