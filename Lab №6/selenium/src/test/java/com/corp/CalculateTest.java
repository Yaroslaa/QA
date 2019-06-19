package com.corp;

import org.junit.Test;



import static org.junit.Assert.*;

public class CalculateTest {
    Calculate calculate=new Calculate();
    @Test
    public void add() {
        calculate.add(1,6);
        assertEquals(7, calculate.getResult(),0);
    }

    @Test
    public void minus() {

    }

    @Test
    public void factorial(){
        calculate.factorial(5);
        assertEquals(120,calculate.getResult(),0);

    }

    @Test
    public void multiple() {
    }

    @Test
    public void div() {
        calculate.div(3,1);
        assertEquals(3, calculate.getResult(),0);
    }

    @Test
    public void mod() {
        calculate.mod(1453, 10);
        assertEquals(3.0, calculate.getResult(), 0);
    }
}
