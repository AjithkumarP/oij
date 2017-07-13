import java.util.*;
class Testfor
{
    public static void main(String args[])
    {
        List<String> a=new ArrayList<String>();
        a.add("ajith");
        a.add("kumar");
        a.forEach(System.out::println);
        Iterator i=a.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        for(String s:a)
        System.out.println(s);
      //  for(int j=0;j<a.length;j++)
        
            System.out.println(a);
        
    }
}