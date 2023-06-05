package com.code.myApp.config;

import jakarta.servlet.http.*;

public interface LoggingService {
	
	void displayReq(HttpServletRequest request, Object object);
	
	void displayReq(HttpServletRequest request, HttpServletResponse response, Object object);
}
