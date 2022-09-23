package com.jojoldu.book.springboot;

// import : Mac - option + Enter / Window/Linux : Alt + Enter
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링 부트의 자동 설정, 스프링 Bean 읽기과 생성을 모두 자동으로 설정, 이것이 있는 위치부터 설정을 읽으므로 이 클래스는 항상 프로젝트 최상단에 위치해야함
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args); // 내장 WAS 실행
    }
}
