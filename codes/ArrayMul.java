class ArrayMul
{
  
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a[][]={{1,3},{3,4}};
    int b[][]={{1,3},{3,4}};
    int c[][]=new int[2][2];
    for(int i=0;i<2;i++)
    {
    for(int j=0;j<2;j++)
    {
        System.out.print(a[i][j]+" ");
    }
    System.out.println();
    }

    System.out.println("after computation");
    for(int i=0;i<2;i++)
    {
    for(int j=0;j<2;j++)
    {
       c[i][j]=a[i][j]+b[i][j];
        System.out.print(c[i][j]+" ");
    }
    System.out.println();
    }
  }
}