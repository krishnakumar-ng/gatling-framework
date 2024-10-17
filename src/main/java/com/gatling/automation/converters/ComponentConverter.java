package com.gatling.automation.converters;

import org.aeonbits.owner.Converter;
import com.gatling.automation.enums.Component;

import java.lang.reflect.Method;

public class ComponentConverter implements Converter<Component> {

    @Override
    public Component convert(Method method, String input) {
        return Component.valueOf(input.toUpperCase());
    }
}
