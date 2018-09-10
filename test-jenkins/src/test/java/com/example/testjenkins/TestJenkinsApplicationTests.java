package com.example.testjenkins;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestJenkinsApplicationTests {

	
	@Test
	public void testMethod() {
		CodeClass class1 = new CodeClass();
		class1.method();
	}

}
