class Outer
{
    private int num=10;
    class Innner{
    public void display()
    {
        System.out.println("\n the num value"+num);
    }
    }
    public static void main(String args[])
    {
        Outer out=new Outer();
        Outer.Innner in=out.new Innner();
        in.display();
    
    }
}