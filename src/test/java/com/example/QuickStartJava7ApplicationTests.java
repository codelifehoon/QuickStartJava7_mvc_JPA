package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.job.MyRestControllerTest;


@RunWith(SpringJUnit4ClassRunner.class )
@SpringApplicationConfiguration(classes = QuickStartJava7Application.class)
@WebAppConfiguration
public class QuickStartJava7ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
