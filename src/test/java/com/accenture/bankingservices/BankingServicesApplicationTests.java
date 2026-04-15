package com.accenture.bankingservices;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
		"spring.cloud.config.enabled=false"
})
class BankingServicesApplicationTests {

	@Test
	void contextLoads() {
	}

}
