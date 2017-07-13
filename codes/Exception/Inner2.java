
public abstract class abs
{
    int num=10;
    abstract void display();
}
class Inner2 extends abs
{
    public static void main()
    {
        abs a=new abs()
        {
            System.out.println(" i am an anonymous class ");
        };
        public void display()
        {
            System.out.println("hai");

        }
        a.display();
    }
}