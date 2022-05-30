package com.mudra.fakebookapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@RestController

class FakebookapiApplicationTests {

	@Test
	@GetMapping
	void contextLoads() {
	}

}
