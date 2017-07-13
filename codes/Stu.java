public class Stu {  
int id;  
String name;  
Address address;  
  
public Stu(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
  
public static void main(String[] args) {  
Address address1=new Address("gzb","UP","india");  
Address address2=new Address("gno","UP","india");  
  
Stu e=new Stu(111,"varun",address1);  
Stu e2=new Stu(112,"arun",address2);  
      
e.display();  
e2.display();  
      
}  
} 