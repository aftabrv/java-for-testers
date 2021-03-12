package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteToConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void ageTeller(){
        int age = 20;
       int ageNew = age + 1;
       System.out.println("age is" +ageNew);


    }
}
