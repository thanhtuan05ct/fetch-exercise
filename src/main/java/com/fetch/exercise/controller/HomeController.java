package com.fetch.exercise.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tuanle on 24/12/2018.
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity index() {
        return new ResponseEntity("Welcome", HttpStatus.OK);
    }
}
