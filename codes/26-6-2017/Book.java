import java.util.*;

 public class Book {
private int id;
private String name, author, publiser;
private int quantity;
 Book(int id,String name,String author,String publiser,int quantity)
 {
 //super();
 this.id=id;
 this.name=name;
 this.author=author;
 this.publiser=publiser;
 this.quantity=quantity;
 }




public String toString() {
return "id : " + id + ", name : " + name + ", author : " + author + ", publiser : " + publiser + ", quantity : "
+ quantity;
}
}