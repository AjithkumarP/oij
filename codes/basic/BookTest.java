public class BookTest
{
    public int id,quantity;
    public String name,publisher,author;
   // List<Book1>b1=new ArrayList<Book1>();
   
Object[] expectedEmps = new Object[3];

@Before
public void initValues()
{
    expectedEmps.add(1,"ajith","ak","kg",100);
    expectedEmps.add(2,"kkkkk","kk","kkk",100);
    expectedEmps.add(3,"sss","ss","s",50);

}
@Test
public void compareBooks(){
    Object[] testOutput = Book.getNumberofbooks().toArray();
assertArrayEquals(expectedEmps, testOutput);

}