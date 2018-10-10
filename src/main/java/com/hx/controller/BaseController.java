package com.hx.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public class BaseController {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    protected String systemException(Exception e){
        return e.getMessage();
    }
}
