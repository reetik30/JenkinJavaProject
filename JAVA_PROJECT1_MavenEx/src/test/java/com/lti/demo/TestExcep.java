package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class TestExcep {

	@Test
	public void testUsernameIsNull() {
		assertThrows(IllegalArgumentException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				User user = new User();
				user.setName(null);
			}
		});
	}

	// same can be written using lambda
	@Test
	public void testUsernameIsNull1() {

		assertThrows(IllegalArgumentException.class, () -> {
			User user = new User();
			user.setName(null);
		});
	}

	@Test
	public void testUsernameIsNull2() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			User user = new User();
			user.setName(null);
		});
		Assertions.assertEquals("Username cannot be blank", exception.getMessage());
	}

}