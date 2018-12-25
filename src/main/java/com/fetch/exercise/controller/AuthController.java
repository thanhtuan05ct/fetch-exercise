package com.fetch.exercise.controller;

import com.fetch.exercise.jwt.AuthenticationRequest;
import com.fetch.exercise.jwt.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.ResponseEntity.ok;

/**
 * Created by tuanle on 24/12/2018.
 */
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider jwtTokenProvider;


    @RequestMapping( value = "/signin", method = RequestMethod.POST)
    public ResponseEntity signin(@RequestBody AuthenticationRequest request) {

        String token = jwtTokenProvider.createToken(request.getUserName(),null);

        Map<Object, Object> model = new HashMap<>();
        model.put("userName", request.getUserName());
        model.put("token", token);
        return ok(model);
    }
}
