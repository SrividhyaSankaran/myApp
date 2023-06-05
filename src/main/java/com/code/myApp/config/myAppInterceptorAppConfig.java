package com.code.myApp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.*;

public class myAppInterceptorAppConfig implements WebMvcConfigurer {
	
	@Autowired
    private myAppInterceptor myAppInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myAppInterceptor);
        
    }

}
