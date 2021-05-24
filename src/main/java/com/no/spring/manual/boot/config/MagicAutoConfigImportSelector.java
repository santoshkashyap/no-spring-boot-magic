package com.no.spring.manual.boot.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MagicAutoConfigImportSelector implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"config.TomcatConfig",
            "config.DispatcherServletConfig",
            "config.MvcConfig"};
    }

}
