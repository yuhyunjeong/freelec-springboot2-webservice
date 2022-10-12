package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat; // Junit의 기본 assertThat이 아닌 assertj의 assertThat을 사용. assertj 역시 Junit에서 자동으로 라이브러리 등록을 해줌.

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name); // assertj라는 테스트 검증 라이브러리의 검증 메소드. 검증하고 싶은 대상을 메소드 인자로 받는다. 메소드 체이닝 지원
        assertThat(dto.getAmount()).isEqualTo(amount); // isEqualTo : assertj의 동등 비교 메소드. assertThat에 있는 값과 isEqualTo의 값을 비교해서 같을 때만 성공


    }
}
