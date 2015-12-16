package FirstCode;
import java.lang.*;
class WelcomeMessage
{
  void printMessage()
  {
      System.out.println("Hello World");
  }
}
class Myclass
{
   public static void main(String  []args)
   {
      WelcomeMessage obj=new  WelcomeMessage ();
      obj.printMessage();
   }
}
