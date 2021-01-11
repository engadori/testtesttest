package com.engadori.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;
import java.util.Map;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.engadori.blog"})
public class ServletConfig implements WebMvcConfigurer {

//    @Bean
//    public InternalResourceViewResolver resolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setViewClass(JstlView.class);
//        resolver.setPrefix("/WEB-INF/views/");
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }
    /*--------------------------------*/
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        registry.jsp("/WEB-INF/views/", ".jsp");
//    }
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("hello");
//    }
//
//    @Bean
//    public ViewResolver beanNameViewResolver() {
//        BeanNameViewResolver resolver = new BeanNameViewResolver();
//        resolver.setOrder(1);
//        return resolver;
//    }
}




























//import lombok.AllArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.accept.ContentNegotiationManager;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@AllArgsConstructor
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = {"com.engadori.blog.controller"},
//includeFilters = @ComponentScan.Filter(value = {Controller.class}),
//useDefaultFilters = false)
//public class ServletConfig {
//
//    @Bean
//    public ViewResolver contentNegotiationViewResolver(ContentNegotiationManager manager) {
//        List<ViewResolver> viewResolvers = new ArrayList<ViewResolver>();
//        InternalResourceViewResolver defaultViewResolver = new InternalResourceViewResolver();
//        defaultViewResolver.setPrefix("/WEB-INF/views/");
//        defaultViewResolver.setSuffix(".jsp");
//
//        ContentNegotiatingViewResolver contentViewResolver = new ContentNegotiatingViewResolver();
//        contentViewResolver.setViewResolvers(viewResolvers);
//        contentViewResolver.setContentNegotiationManager(manager);
//        contentViewResolver.setOrder(0);
//        return contentViewResolver;
