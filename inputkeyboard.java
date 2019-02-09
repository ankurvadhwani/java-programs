//taking input from user
import java.util.Scanner;


public class inputkeyboard
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    float f = sc.nextFloat();
    double d sc.nextDouble();
    String s = sc.next();
    
    System.out.println("Int a = "+a);
    System.out.println("Float f = "+f);
    System.out.println("Double d = "+d);
    System.out.println("String s = "+s);
  }
}
