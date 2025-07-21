package com.blk.auto_ahorro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
                🚀 Welcome to the API! Try the following paths:\
                <br>
                /blackrock/challenge/v1/transactions:parse\
                <br>
                /blackrock/challenge/v1/transactions:validator\
                <br>
                /blackrock/challenge/v1/transactions:filter(Incomplete)\
                <br>
                /blackrock/challenge/v1/performance""";
    }
}
