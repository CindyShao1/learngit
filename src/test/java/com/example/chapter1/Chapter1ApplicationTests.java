package com.example.chapter1;

import com.example.chapter1.controller.MyRestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter1ApplicationTests {

    @Test
    public void contextLoads() {
        assertEquals("Hello,World!",new MyRestController().sayHello());
    }

}
