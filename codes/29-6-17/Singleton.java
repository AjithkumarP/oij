class Singleton
{
    private static Singleton instance=null;
    private Singleton()
    {
        System.out.println(" i am a constructor of singleton");
    }
   static void display()
    {
        System.out.println(" i am a method");
    }
    public static Singleton getInstance()
    { 
        if(instance==null)
        instance=new Singleton();
        return instance;
    }
    public static void main(String ars[])
    {
        Singleton tmp=Singleton.getInstance();
        Singleton tmp2=Singleton.getInstance();
        Singleton tmp3=Singleton.getInstance();
        tmp.display();
    }
}