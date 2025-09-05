package com.task.spring_boot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/class")
@RestController
public class ClassController {

    String entityClass;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createClass (@RequestBody String className) {

        entityClass = className;

        return "Class: " + className + " was created!";

    }

    @PutMapping("/name")
    @ResponseStatus(HttpStatus.OK)
    public String updateClass (@RequestBody String className) {

        String tmpString = "The " + entityClass + " is updated for the " + className + " !";

        entityClass = className;

        return tmpString;
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public String deleteClass (@RequestBody String className) {

        entityClass = "";

        return "Class: " + className + "deleted!";
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/name")
    public String getNameClass () {
        return entityClass;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/quantity")
    public Integer getMembersQuantity () {
        return 30;
    }


}
