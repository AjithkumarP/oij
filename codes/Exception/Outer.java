class Outer
{
   private int a=10;
void display()
{
    System.out.println(" outer class ");
}
class Inner
{
    void display1()
    {
       System.out.println(" inner class");
    }
}
public static void main(String args[])
{
    Outer o=new Outer();
    Inner i=o.new Inner();
    o.display();
    i.display1();
}
}