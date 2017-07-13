import java.util.*;
class Department
{
    String name,dept;
    public Department(String name,String dept)
    {
        this.name=name;
        this.dept=dept;
    }
    public String toString()
    {
        return (name +" "+dept);
    }
}

class Ven
{
    public static void main(String args[])
    {
      List a1=new ArrayList();
      Department d1=new Department("ajith","cse");
      Department d2=new Department("kumar","cse");
      Department d3=new Department("vengi","ece");
      a1.add(d1);
      a1.add(d2);
      List a2=new ArrayList();
      a2.add(d3);
      a1.addAll(a2);
      Iterator i=a1.iterator();
      while(i.hasNext())
      System.out.println(i.next().toString());
      
    }   
}