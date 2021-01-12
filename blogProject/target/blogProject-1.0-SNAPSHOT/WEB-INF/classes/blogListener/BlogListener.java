package blogListener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Slf4j
public class BlogListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("## Initializing Context ##");
        servletContextEvent.getServletContext().setAttribute("name","engadori");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        log.info("## Context getting fucked ##");
    }
}
