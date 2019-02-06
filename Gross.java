//calculating gross salary when salary input from keyboard

import java.lang.*;
import java.io.*;

class Gross
{
  public static void main(String args[])
  {
    Double bas= Double.parseDouble(args[0]);
    Double da,hrs,total;
    
    da=(bas*40/100);
    hrs=(bas*20/100);
    total =bas+da+hrs;
    System.out.println("Gross Salary = "+total);
  }
}
