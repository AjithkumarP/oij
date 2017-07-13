package com.mycompany.app;
public class B
{
    public int create(B1 b)
    {
        System.out.println("  the inserted values are:");
        int id=b.getId();
        int y=0;
        if(id!=0 && b.getName()!=null)
        {
            y=1;
        }
        return y;
    }
    public int delete(B1 b)
    {
     int x=b.getId();
        if(x!=0)
        {
            x=0;
        }
        return x;
    }
}