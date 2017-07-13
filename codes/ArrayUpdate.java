import java.util.*;
public class ArrayUpdate
{
   public static void main(String args[])
   {
       int size, i, upd, count=0;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Array Size : ");
       size = scan.nextInt();
	   
       System.out.print("Enter Array Elements : ");
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
      System.out.println(" enter the current element");
      int cur=scan.nextInt();
      System.out.println(" enter the update element");
      upd=scan.nextInt();

      for(i=0;i<=size;i++)
      {
          if(arr[i]==cur)
          {
              arr[i]=upd;
              count++;
          }
      }

     if(count==0)
     {
      System.out.println(" enter the position");
      int pos=scan.nextInt();
      System.out.println("enter the insert element\n \n");
      int insert=scan.nextInt();
         for(i=size;i>pos;i--)
         {
         arr[i] = arr[i-1];
       }
	   
       arr[pos] = insert;
     }
      for(i=0;i<size;i++)
      System.out.println(arr[i]);
   }
}