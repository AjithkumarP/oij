public class Outer1
{ 
    private static int number=100;
    void display()
    {
        class Inner
        {
            void display1()
            {
                System.out.println(" local inner class"+number);
            }
        }
        Inner i=new Inner();
        i.display1();
    }
    public static void main(String args[])
    {
        Outer1 o=new Outer1()
        o.display();
    }
}