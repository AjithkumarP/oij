class Aj
{
    void move()
    {
        System.out.println("aj move");
    }
}
class Sk
{
    void move1()
    {
        System.out.println("sk move");
    }
}
class Text
{
    public static void main(String arg[])
    {
        Aj a=new Aj();
        Sk s=new Sk();
        a.move();
        s.move1();
    }
}