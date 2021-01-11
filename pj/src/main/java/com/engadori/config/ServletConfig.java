package com.engadori.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.engadori.blog.controller"},
includeFilters = @ComponentScan.Filter(value = {Controller.class}),
useDefaultFilters = false)
public class ServletConfig {

    @Bean
    public ViewResolver contentNegotiationViewResolver(ContentNegotiationManager manager) {
        List<ViewResolver> viewResolvers = new ArrayList<ViewResolver>();
        InternalResourceViewResolver defaultViewResolver = new InternalResourceViewResolver();
        defaultViewResolver.setPrefix("/WEB-INF/views/");
        defaultViewResolver.setSuffix(".jsp");

        ContentNegotiatingViewResolver contentViewResolver = new ContentNegotiatingViewResolver();
        contentViewResolver.setViewResolvers(viewResolvers);
        contentViewResolver.setContentNegotiationManager(manager);
        contentViewResolver.setOrder(0);
        return contentViewResolver;
    }
}
