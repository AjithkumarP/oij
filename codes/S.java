public class S {

   private static S instance = new S();
   private S(){}

 public static S getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}
class 