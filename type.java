// storing the input taken from cmdline in variable

import java.lang.*;
imprt java.io.*;

class type{
  public static void main(String args[])
  {
    int a=Int.parseInt(args[0]);
    float f = Float.parseFloat(args[1]);
    double d = Double.parseDouble(args[2]);
    
    System.out.println("Stored in int a = "+a);
    System.out.println("Stored in Float f = "+f);
    System.out.println("Stored in double d = "+d);
  }
}
