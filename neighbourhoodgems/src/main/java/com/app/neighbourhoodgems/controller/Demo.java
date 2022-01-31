package com.app.neighbourhoodgems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class Demo {

  @GetMapping(value = "/")
  public String getDemo() {

    String s = getString();

    System.out.println(s);
    return "Demo is working. Live Reload";
  }

  private String getString() {
    return "Breakpoint is working";
  }
}
