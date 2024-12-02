<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Location</title>
<script>

  window.onload = () => {  // window 객체는 항상 생략할 수 있습니다. onload = () => {} 로 작성해도 됩니다.
    
    const btn1 = document.getElementById("btn1");
      
    btn1.addEventListener('click', (event) => {
      
      // location 객체의 href 속성을 이용해서 요청할 수 있습니다.
      
      // Java 변수는 JavaScript 내부에서 사용할 수 있습니다. (하지만 반대는 안 됩니다.)
      const contextPath = '<%=request.getContextPath()%>';
      location.href = contextPath + '/webdir5/req1?param=' + event.currentTarget.textContent;  // 클릭한 요소(event.currentTarget)의 내부 텍스트(textContent)
      
    });
  
  }
  
</script>
</head>
<body>

  <%-- 요청 만들기 3 : JavaScript 의 Location 객체 활용하기 (<a> 태그와 동일한 요청입니다.) --%>
  
  <button type="button" id="btn1">요청1</button>
  
  
  

</body>
</html>