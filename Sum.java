// Sum of all input taken from cmdline

class Sum
{
  public static void main(String args[])
  {
    int len=args.length;
    double d = 0;
    for(int i=0;i<len;i++)
    {
      int a=Integer.parseInt(args[i]);
      d += a;
    }
    System.out.println("THe Sum is = "+d);
  }
}
