package com.mycompany.app;
import static org.junit.Assert.assertEquals;
 
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestUsingConstructor {

public int arg1;
public int arg2;

public ParameterizedTestUsingConstructor(int p1, int p2) {
arg1 = p1;
arg2 = p2;
}

public int actual;

@Parameters
public static Collection<Object[]> data() {
Object[][] data = new Object[][] { { 1, 2 }, { 2147483647, 1 }, { 1.5, 2 }, { null, 2 }, { "string", 2 },
{ 5, 3 }, { 121, 4 } };
return Arrays.asList(data);
}

Cal c = new Cal();

@Test
public void parmeterisedConstructorsumTest() {
actual = c.sum(arg1, arg2);
assertEquals("Test Result", arg1 + arg2, actual);
}

}
