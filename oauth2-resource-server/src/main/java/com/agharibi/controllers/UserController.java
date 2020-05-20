package com.agharibi.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secured")
public class UserController {

    @GetMapping
    @PreAuthorize("#oauth2.hasScope('read')")
    public String loadSecureResource() {
        return "<h3>This is the result from from custom resource server.. Have a great day!</h3>";
    }
}
