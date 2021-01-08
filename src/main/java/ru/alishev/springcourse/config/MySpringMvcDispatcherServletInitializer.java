package ru.alishev.springcourse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
// класс заменяющий web.xml
public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override // метод обращается к настройкам Spring в конф. классе
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};
    }

    @Override // эквивав. - все запр. от польз. отсылаются на DispatcherServlet
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
