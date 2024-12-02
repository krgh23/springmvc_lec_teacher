package com.min.app03.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController5 {

  @RequestMapping(value="/webdir5/main")
  public void main() {
    // 반환타입이 void 인 경우 요청 주소를 응답 JSP 의 경로와 이름으로 사용합니다.
  }
  
  @RequestMapping(value="/webdir5/req1")
  public String req1(HttpServletRequest request) {
    
    String param = request.getParameter("param");
    System.out.println(param);
    
    return "webdir5/main";
     
  }
  
}
