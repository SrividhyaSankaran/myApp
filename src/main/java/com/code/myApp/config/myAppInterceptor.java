package com.code.myApp.config;

import org.slf4j.*;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.*;


@Component
public class myAppInterceptor implements HandlerInterceptor {

	private static final Logger log = LoggerFactory.getLogger(myAppInterceptor.class);
	
	@Override
	public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	       
	      log.info("Pre Handle method is Calling>>>>>>>>>>>>>>>>>");
	      return true;
	       
	}
	
	@Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, 
       Object handler, ModelAndView modelAndView) throws Exception {
       
      log.info("Post Handle method is Calling>>>>>>>>>>>>>>>");
    }

    @Override
    public void afterCompletion
       (HttpServletRequest request, HttpServletResponse response, Object 
       handler, Exception exception) throws Exception {
       
       log.info("Request and Response is completed>>>>>>>>>>>>");
    }
}
