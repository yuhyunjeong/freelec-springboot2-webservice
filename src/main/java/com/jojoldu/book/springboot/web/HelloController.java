package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // JSON을 반환하는 컨트롤러로 만들어줌. @ResponseBody를 각 메소드마다 선언했던 것을 한번에 사용할 수 있게 해준다
public class HelloController {

    @GetMapping("/hello") // Http Method인 Get의 요청을 받을 수 있는 API를 만들어줌. 이 프로젝트는 /hello 로 요청이 오면 문자열 hello를 반환하는 기능을 가지게 되었다
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, // @RequestParam : 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
                                     @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}
