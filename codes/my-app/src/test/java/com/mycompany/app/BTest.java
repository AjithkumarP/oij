package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class BTest
{
    B1 b=new B1();
    B b1=new B();
@Test
    public void testCreate()
    {
        b.setName("ajith");
        b.setId(1);
        int id1=b1.create(b);
        assertEquals(1,id1);
    }
    @Test
    public void testdelete()
    {
       b.setId(1);
       b.setName("ak");
       int id2=b1.delete(b);
       assertEquals(0,id2);
    }
}