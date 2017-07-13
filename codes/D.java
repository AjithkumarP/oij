class AB
{
    int val=10;
}
class B  extends AB
{
    int val=20;
} 
    
class D{
    public static void main(String args[])
{
    AB ref;
     ref=new AB();
    System.out.println(ref.val);
    
    ref = new B();
    System.out.println(ref.val);

}
}


