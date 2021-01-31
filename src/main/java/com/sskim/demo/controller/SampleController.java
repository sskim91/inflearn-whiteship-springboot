package com.sskim.demo.controller;

import com.sskim.demo.exception.AppError;
import com.sskim.demo.exception.SampleException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/hello")
    public String hello(Model model) {
        throw new SampleException();
    }

    @ExceptionHandler(SampleException.class)
    @ResponseBody
    public AppError sampleError(SampleException e) {
        AppError appError = new AppError();
        appError.setMessage("error.app.key");
        appError.setReason("IDK IDK IDK");
        return appError;
    }

//    @GetMapping("/hello")
//    public String hello(Model model) {
//        model.addAttribute("name", "keesun");
//        return "hello";
//    }
}
