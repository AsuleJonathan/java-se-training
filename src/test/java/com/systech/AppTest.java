package com.systech;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    //? Reference =>
    App app=new App();
@Test
    void add() {
        //when
        int result = app.add(2,3);
        //then
        int expected = 5;
        //verify that result = expected 
       Assertions.assertEquals(expected, result);
    
    }
}
