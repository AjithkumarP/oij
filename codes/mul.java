 class mulI
 {

    void show()
    {
        System.out.println(" haihaahoa");

    }
 }
 class mulII
 {
     void show()
     {
         System.out.println("hao");
     }
 }
 class mul extends mulI,mulII {
   public static void main(String args[])
   {
       mul m=new mul();
       m.show();
         }
 }