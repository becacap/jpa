package cap.curso.jpa.configuracion;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;




public class JpaAppWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { JpaAppWebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}