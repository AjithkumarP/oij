import java.io.*;
class Engine 
{

    public void work()
    {
         
        System.out.println("Engine of car has been started ");
         
    }
     
}
 
final class Car 
{
      private final Engine engine; 
     
    Car(Engine engine)
    {
        this.engine = engine;
    }
     
    public void move() 
    {
         
        if(engine != null)
        {
            engine.work();
            System.out.println("Car is moving ");
        }
    }
}
 
class GFG 
{
    public static void main (String[] args) 
    {
         Engine engine = new Engine();
        Car car = new Car(engine);
        car.move();
         
    }
}