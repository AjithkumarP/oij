
class Test1
{
    public static void main(String args[])
    {
        try
        {
            int num=10;
            int result=10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(" the exception is "+e);
        }
    }
}