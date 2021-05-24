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
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }
}
