package com.waylon;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CatTest {
    @Test
    public void notIoc() {
        Cat cat = new Cat();
        cat.setName("li");
    }
    @Test
    public void Ioc() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:Ioc.xml");
        Cat cat1 = (Cat)applicationContext.getBean("cat1");
        cat1.eat();
    }
}


