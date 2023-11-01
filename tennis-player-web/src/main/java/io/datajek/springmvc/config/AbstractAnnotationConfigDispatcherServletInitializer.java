package io.datajek.springmvc.config;

public abstract class AbstractAnnotationConfigDispatcherServletInitializer {
    protected abstract Class<?>[] getRootConfigClasses();

    protected abstract Class<?>[] getServletConfigClasses();

    protected abstract String[] getServletMappings();
}
