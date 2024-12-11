package com.min.app07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {

  @RequestMapping(value={"/", "/main.do"})
  public String main() {
    return "main";
  }
  @RequestMapping(value={"/board/write.do"})
  public String write() {
    return "board/write";
  }
  
}
