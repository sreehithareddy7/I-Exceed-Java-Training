class staticvar
{
   static int x=5;
 
    staticvar()
	{
	   x--;
	   System.out.println(x);
	}
 
    public static void main(String asd[])
	{
	   staticvar obj1=new staticvar();
	   staticvar obj2=new staticvar();
	   staticvar obj3=new staticvar();
	}
}