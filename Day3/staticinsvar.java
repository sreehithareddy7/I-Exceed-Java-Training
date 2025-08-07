class  sample
{
    int x=10;  // instance variable 
    static int y=20; // class variable or static variable
 
    public void method1()
	{
	  System.out.println("x="+x);
	  System.out.println("y="+y);
	}
 
    static void method2()
	{
	  System.out.println("x="+new sample().x);
	  System.out.println("y="+y);
	}
}
 
class staticinsvar
   {
   public static void main(String args[])
	{
	   sample obj=new sample();  
	   obj.method1();
	   sample.method2(); 
	}
  }