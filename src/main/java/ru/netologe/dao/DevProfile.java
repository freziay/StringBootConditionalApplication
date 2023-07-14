package ru.netologe.dao;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;


public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
    @Bean(name = "devProfile")
    @ConditionalOnProperty(prefix = "current profile is dev", name = "service")
    public SystemProfile systemProfile() {
        return new DevProfile();
    }
}


