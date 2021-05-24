package com.no.spring.manual.boot.config;

import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ClassUtils;

@Configuration
@Conditional(UndertowConfig.OnUndertowCondition.class)
public class UndertowConfig {

    @Bean
    public ServletWebServerFactory servletWebServerFactory() {
        return new UndertowServletWebServerFactory();
    }

    public class OnUndertowCondition implements Condition {

        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            return ClassUtils.isPresent("io.undertow.Undertow", context.getClassLoader());
        }
    }
}
