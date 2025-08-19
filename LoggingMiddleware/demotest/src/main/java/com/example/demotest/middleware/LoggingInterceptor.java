package com.example.demotest.middleware;


import com.example.demotest.service.LoggingService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoggingInterceptor implements HandlerInterceptor {

    private final LoggingService loggingService;

    public LoggingInterceptor(LoggingService loggingService) {
        this.loggingService = loggingService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) {

        loggingService.log("backend", "info", "middleware",
                "Incoming request: " + request.getMethod() + " " + request.getRequestURI());

        return true;
    }
}
