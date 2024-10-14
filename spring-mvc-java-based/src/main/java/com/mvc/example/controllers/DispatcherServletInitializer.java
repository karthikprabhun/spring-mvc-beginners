package com.mvc.example.controllers;

import com.mvc.example.config.AppConfig;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("DispatcherServletInitializer loaded");
        return new Class[] { AppConfig.class }; // Your Spring configuration class
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" }; // Map all requests to the DispatcherServlet
    }
}
