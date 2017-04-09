package com.java.summer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith (SpringJUnit4ClassRunner.class)
@SpringBootTest (classes = Application.class)
@TestPropertySource ({"classpath:application.yml"})
@WebAppConfiguration
public class ApplicationTests {

    @Test
    public void contextLoads() {
    }
}
