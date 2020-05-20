package com.agharibi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;


@Controller
public class AppController {

    @Autowired
    private WebClient webClient;

    @GetMapping("/index")
    public String greetings()  {

        String response = null;
        try {
            response = webClient.get()
                .uri(new URI("http://localhost:8084/secured"))
                .retrieve().bodyToMono(String.class)
                .block();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Response is: " + response);
        return response;
    }

}
