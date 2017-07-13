class cat extends Animal{
 public void MakeNoise()
 {
 System.out.println("Meow");
 }
 public void walk()
 {
 System.out.println("CAT IS WALKING");
 }

}
class dog extends Animal{
 public void MakeNoise()
 {
 System.out.println("Bark");
 }
 public void walk()
{
 System.out.println("DOG WALKING");
}
}
class MainClass
{
 public static void main(String args[])
 {
 Animal w=new cat(); 
 w.MakeNoise();

 }
}