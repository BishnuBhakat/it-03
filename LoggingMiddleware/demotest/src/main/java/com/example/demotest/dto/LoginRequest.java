package com.example.demotest.dto;



public class LoginRequest {
    private String stack;
    private String level;
    private String logPackage;
    private String message;

    public LoginRequest(String stack, String level, String logPackage, String message) {
        this.stack = stack;
        this.level = level;
        this.logPackage = logPackage;
        this.message = message;
    }

    public String getStack() { return stack; }
    public String getLevel() { return level; }
    public String getLogPackage() { return logPackage; }
    public String getMessage() { return message; }

    public void setStack(String stack) { this.stack = stack; }
    public void setLevel(String level) { this.level = level; }
    public void setLogPackage(String logPackage) { this.logPackage = logPackage; }
    public void setMessage(String message) { this.message = message; }
}

