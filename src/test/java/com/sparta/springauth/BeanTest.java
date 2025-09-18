package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    // 방법 1: Autowird는 빈등록을 할 때 타입을 기준으로 빈을 등록하는데 이름이 없으면 구현체를 찾는다. 현재 구현체가 2개여서 오류
//    @Autowired
//    Food food;

    @Autowired
    Food pizza;

    @Autowired
    Food chicken;

    // 방법 2: 구현체에 @Primary를 붙여줌
    
    // 방법 3: 구현체에 @Qualifier("별칭") 정한 후 구현체에 동일하게 붙여줌

    // @Qualifier가 우선순위가 높다.

    @Test
    @DisplayName("테스트")
    void test1() {
        pizza.eat();
        chicken.eat();
    }

}
