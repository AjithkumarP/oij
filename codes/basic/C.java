 class A
{
    public void show1()
    {
        System.out.println("\n hai hai");
    }
}
 class B extends A
{       @Override
        public void show1()
    {
        System.out.println("\n hai hai hai hai");
    }
}
class C{
    public static void main(String args[])
    {
        A a=new B();
        a.show1();
    }
}