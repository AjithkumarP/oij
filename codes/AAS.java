class AAAA
{
  static void show()
    {
        System.out.println(" hai hai hai");
    }
}
class AAS extends AAAA
{
    void show()
    {
        System.out.println("hai gai");
    }
    public static void main(String args[])
    {
        AAAA a=new AAAA();
        AAS s=new AAS();
        a.show();
        s.show();
    }
}