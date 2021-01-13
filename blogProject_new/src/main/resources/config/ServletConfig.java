package config;

import blogService.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class ServletConfig extends HttpServlet {

    @Override
    public void init() throws ServletException {
        log.info("## Initializing servlet ##");
    }

    @Override
    protected  void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        ApplicationContext applicationContext = (ApplicationContext) getServletContext()
                .getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        BlogService bean = applicationContext.getBean(BlogService.class);

        log.info("## getting service bean ##");

        httpServletResponse.getWriter().println("<html>");
        httpServletResponse.getWriter().println("<head>");
        httpServletResponse.getWriter().println("<body>");
        httpServletResponse.getWriter().println("<h1>Hello," + bean.startUp() + "</h1>");
        httpServletResponse.getWriter().println("</body>");
        httpServletResponse.getWriter().println("</head>");
        httpServletResponse.getWriter().println("</html>");
    }

    private Object getName() {
        return getServletContext().getAttribute("name");
    }

    @Override
    public void destroy() {
        log.info("fuck you.");
    }
}
