package com.mycompany.app;
import java.util.*;
class Book
{
    private int id,quantity;
    private String name,publisher,author;
    public Book(int id,String name,String author,String publisher,int quantity)
    {
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
    
    public boolean equals(Object obj){
Book emp = (Book) obj;
boolean status = false;
if(this.name.equalsIgnoreCase(emp.name)
&& this.id == emp.id
&& this.quantity == emp.quantity
&& this.author==emp.author
&& this.publisher==emp.publisher){
status = true;
}
return status;
}
   /* public String toString()
    {
        return id+" "+name+" "+author+" "+publisher+" "+quantity;
    }*/

    public static List<Book> getNumberofbooks()
    {

     List<Book> book=new ArrayList<Book>();
     book.add(new Book(1,"ajith","ak","kg",100));
     book.add(new Book(2,"kkkkk","kk","kkk",100));
     book.add(new Book(3,"sss","ss","s",50));
     return book;
}
}