package com.example.imperialapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImperialAPIControllerTest {
    private ImperialAPIController impperal =new ImperialAPIController();

    @Test
    public void itcTest(){
        int i=10;
        assertEquals(impperal.itc(i),1);
    }

}