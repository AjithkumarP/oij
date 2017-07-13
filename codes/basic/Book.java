class Book
{
    private int id,quantity;
    private String name,publisher,auther;
    public void Book(int id,String name,String author,String publisher,int quantity)
    {
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
    }
    public String toString()
    {
        return id+" "+name+" "+author+" "+publisher+" "+quantity;
    }

    public static List<Book> getNumberofbooks()
    {

     List<Book> book=new ArrayList<Book>();
     book.add(1,"ajith","ak","kg",100);
     book.add(2,"kkkkk","kk","kkk",100);
     book.add(3,"sss","ss","s",50);
     return book;
}
}