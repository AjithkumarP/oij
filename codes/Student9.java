class Student9{  
     int rollno;  
     String name;  
     static String college = "ITS";  
       
      static void change(){  
     college = "BBDIT";  
     System.out.println(college);
     }  
  
     Student9(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college);}  
  
    public static void main(String args[]){  
    //Student9.change();  
  
    Student9 s1 = new Student9 (111,"Karan");  
    Student9 s2 = new Student9 (222,"Aryan");  
    Student9 s3 = new Student9 (333,"Sonoo");  
   //  Student9 s4 = new Student9();
     //s3.change(); 
    s1.display();  
    s2.display();  
    s3.display(); 
    Student9.change(); 
    }  
}  