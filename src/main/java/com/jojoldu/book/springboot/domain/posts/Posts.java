package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // 클래스 내 모든 필드의 Getter 메소드를 자동생성
@NoArgsConstructor // 기본 생성자 자동 추가. public Posts(){} 와 같은 효과
@Entity // 테이블과 링크될 클래스임을 나타냄.
public class Posts {

    @Id // 해당 테이블의 PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK의 생성규칙. 스프링 부트 2.0 에서는 GenerationType.IDENTITY 옵션을 추가해야만 auto_increment가 됨
    private Long id;

    @Column(length = 500, nullable = false) // 굳이 선언하지 않아도 해당 클래스의 필드는 모두 컬럼이 된다. 기본값 외에 추가로 변경이 필요한 옵션이 있다면 사용.
    private String title; // 문자열은 VARCHAR2(255)가 기본값인데 사이즈를 500으로 늘림

    @Column(columnDefinition = "TEXT", nullable = false) // 타입을 TEXT로 변경
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌더 패턴 클래스를 생성. 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
