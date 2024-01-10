package com.example.demo.apis;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoApi {

    @GetMapping
    public ResponseEntity<String> get()
    {
        return ResponseEntity.ok("hi im rama,sample");
    }
}
