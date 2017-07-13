class A
{
  protected void eat()
    {
        System.out.println("\n i am a class");
    }
}
class B extends A 
{
    void eat1()
    {
        System.out.println("\n i am eating");
    }
    public static void main(String args[])
    {
        B b=new B();
        b.eat();
        b.eat1();
    }
}