package com.task.spring_boot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/discipline")
@RestController
public class DisciplineController {

    @GetMapping("/name")
    @ResponseStatus(HttpStatus.OK)
    public String discipline () {
        return "Philosophy";
    }

}
