package config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebApplication implements WebApplicationInitializer {


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext =
                new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.setServletContext(servletContext);
        annotationConfigWebApplicationContext.register(WebConfig.class);
        annotationConfigWebApplicationContext.refresh();

        DispatcherServlet dispatcherServlet = new DispatcherServlet(annotationConfigWebApplicationContext);
        ServletRegistration.Dynamic app = servletContext.addServlet("app", dispatcherServlet);
        app.addMapping("/app/*");
    }
}
