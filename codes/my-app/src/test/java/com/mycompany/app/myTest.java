package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameters;

 public class myTest
{
    Cal c=new Cal();
    @Test
    public void sumTest()
    {
        int num1=10;
        int num2=10;
        int actual;
        int expected=20;

        actual=c.sum(num1, num2);
     //   assertEquals(expected,actual);
     assertEquals(expected,actual);
    }
}