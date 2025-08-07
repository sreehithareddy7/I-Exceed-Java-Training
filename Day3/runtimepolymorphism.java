interface cherry

{

    public void method1();
 
}
 
interface honey extends cherry

{

    public void method2();

}
 
class sample implements honey

  {

    sample()

	{
 
	}

    @Override

     public void method1(){

	 System.out.println("From interface honey");

	}
 
    @Override

     public void method2(){

	System.out.println("From interface cherry ");

	}

}
 
class runtimepolymorphism

{

    public static void main(String asd[])

	{

	   sample obj=new sample();

	   obj.method1();

	   obj.method2();	

	}

}
 