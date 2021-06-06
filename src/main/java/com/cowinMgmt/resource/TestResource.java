package com.cowinMgmt.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {

    @RequestMapping(value = "/cowinMgmt/test")
    public ResponseEntity<Object> testServer(){
        return ResponseEntity.status(HttpStatus.OK)
                .body("Server is reachable");
    }
    
}
