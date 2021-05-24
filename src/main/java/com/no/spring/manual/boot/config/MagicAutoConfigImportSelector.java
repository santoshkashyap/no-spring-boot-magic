package com.no.spring.manual.boot.config;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;

public class MagicAutoConfigImportSelector implements DeferredImportSelector, BeanClassLoaderAware {

    private ClassLoader classLoader;

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return SpringFactoriesLoader
            .loadFactoryNames(EnableMagicAppConfig.class, this.classLoader)
            .toArray(new String[]{});

       /* return new String[]{"com.no.spring.manual.boot.config.TomcatConfig",
            "com.no.spring.manual.boot.config.DispatcherServletConfig",
            "com.no.spring.manual.boot.config.MvcConfig"};*/

    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }
}
