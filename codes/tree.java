import java.util.*;
import java.lang.*;
class tree
{
    public static void main(String args[])
    {
        TreeSet<Integer> tt=new TreeSet<Integer>();
        tt.add(100);
        tt.add(34);
        tt.add(100);
        tt.add(23);
        tt.add(55);
       Iterator<Integer> itr= tt.iterator();
       while(itr.hasNext()){  
     System.out.println(itr.next());
     

                                 }  
                                 System.out.println(tt.first());
     System.out.println(tt.last());
      System.out.println(tt.subSet(23,100));

    }
}