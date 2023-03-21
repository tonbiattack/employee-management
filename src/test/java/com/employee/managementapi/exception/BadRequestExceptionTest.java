package com.employee.managementapi.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BadRequestExceptionTest {

	@Test
	@DisplayName("受け取った文字列を含む、独自例外を作成することができているか")
	void testException() {
		String expectedMessage = "Test";
		BadRequestException badRequestException = assertThrows(BadRequestException.class, () -> {
			throw new BadRequestException(expectedMessage);
		});
		String actualMessage = badRequestException.getMessage();
		assertEquals(expectedMessage, actualMessage);
	}
}
