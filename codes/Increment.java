class Increment
{
    static int x=5;
    void method()
    {

System.out.println(x);
++x;
System.out.println(x);
    }

public static void main(String args[])
{
Increment inc= new Increment();
inc.method();
}

}