package com.min.app06.controller;

import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.min.app06.dto.ContactDto;
import com.min.app06.service.IContactService;

@RequestMapping(value="/contact")

@Controller  // 컨트롤러가 사용하는 @Component 입니다.
public class ContactController {

  @Autowired
  private IContactService contactService;
  
  @RequestMapping(value="/list.do")
  public String list(Model model) {
    // 서비스로부터 연락처 목록과 전체 연락처 개수를 받아옵니다.
    Map<String, Object> map = contactService.getAllContact();
    // JSP로 전달(forward)하기 위해서 Model에 저장합니다.
    model.addAttribute("contacts", map.get("contacts"));
    model.addAttribute("count", map.get("count"));
    // JSP 경로를 작성합니다.
    return "contact/list";  // "/WEB-INF/views/contact/list.jsp"
  }
  
  @RequestMapping(value="/detail.do")
  public String detail(HttpServletRequest request, Model model) {
    // 요청 파라미터를 받습니다. Integer.parseInt() 처리를 하고 있으므로 요청 파라미터의 null 체크가 필요합니다.
    Optional<String> opt = Optional.ofNullable(request.getParameter("contact_id"));
    int contact_id = Integer.parseInt(opt.orElse("0"));  // 요청 파라미터 contact_id 가 null 이면 "0"을 사용합니다.
    // 요청 파라미터를 contact_id 로 가진 연락처 정보를 가져옵니다.
    ContactDto contactDto = contactService.getContact(contact_id);
    // JSP로 전달할 연락처 정보를 Model에 저장합니다.
    model.addAttribute("contact", contactDto);
    // JSP로 전달합니다.
    return "/contact/detail";
  }
  
  
  
  
  
  
}
