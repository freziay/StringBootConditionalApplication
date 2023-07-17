package ru.netologe.model.impl;

import ru.netologe.model.SystemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}


