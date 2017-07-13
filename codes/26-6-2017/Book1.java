import java.util.*;
public class Book1
{
 private int id;
 private String name;
 private String author;
private String publiser;
private int quantity;

public Book1 setid(int id)
{
 this.id=id;
 return this;
}
public Book1 setName(String name)
{
 this.name=name;
 return this;
}
public Book1 setAuthor(String author)
{
 this.author=author;
 return this;
}
public Book1 setPubliser(String publiser)
{
 this.publiser=publiser;
 return this;
}
public Book1 setQuantity(int quantity)
{
 this.quantity=quantity;
 return this;
}
public Book getbook() {
        return new Book(id, name, author, publiser, quantity);
    }
 }