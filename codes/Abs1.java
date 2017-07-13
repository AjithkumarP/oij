interface printable{
void print();
}

class A6 implements printable{
public void print(){ System.out.println("Hello"); }

public static void main(String args[]){
//A6 obj = new printable();
printable obj2=new A6();

obj2.print();
 }
}
