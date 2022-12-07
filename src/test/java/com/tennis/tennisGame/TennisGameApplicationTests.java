package com.tennis.tennisGame;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TennisGameApplicationTests {

	@Test
	void test()
    {
		TennisGameApplication.main(new String[]{
                "--spring.main.web-environment=false",
                "--spring.autoconfigure.exclude=test",
        });
    }

}
