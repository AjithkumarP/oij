class AS
{   
  static int a=10;
   void display()
    {
        a++;
    }
    public static void main(String args[])
    {
        //int a=10;
        AS as=new AS();
        for(int i=0;i<10;i++)
        {
            as.display();
        }
        System.out.println("a value is "+new AS().a);
    }
}