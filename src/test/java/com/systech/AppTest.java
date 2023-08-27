package com.systech;

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
