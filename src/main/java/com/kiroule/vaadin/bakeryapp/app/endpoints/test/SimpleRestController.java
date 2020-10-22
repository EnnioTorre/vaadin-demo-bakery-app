package com.kiroule.vaadin.bakeryapp.endpoints.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class SimpleRestController {

  @GetMapping(value = "/test", produces = "application/json")
  public String test() {
    return "Test worked";
  }
}