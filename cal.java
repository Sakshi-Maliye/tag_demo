class cal
  {
    public int add(int a, int b)
    {
      return a+b;
    }
    public int sub(int a, int b)
    {
      return a-b;
    }
    public int mul(int a, int b)
    {
      return a*b;
    }
    public static void main(String[] args)
    {
      cal c = new cal();
      System.out.println("addition="+c.add(3,4));
      System.out.println("subtraction="+c.sub(4,2));
      System.out.println("multiplication="+c.mul(3,4));
    }
  }
