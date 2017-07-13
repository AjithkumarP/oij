class T
{
    public static void main(String args[])
    {
        int i=10;
        String s=(i<20)?"true":(i>20)?"false":"true";
        s=s+((i<5)?(i>20):"sk");
        System.out.println(s);
    }
}