class demoinher
{
    public static void main(String asd[])
	{
	    teacher obj=new teacher("sivam",32,"CSE");
	}
}
class sample
{
    String name,dept;
    int age; 
    sample(String name,int age,String dept)
	{
	  this.name=name;
	  this.age=age;	 
	  this.dept=dept;
	}
    public void displayStudent()
	{
	   System.out.println("Name="+name);
	   System.out.println("Age="+age);
	   System.out.println("Department="+dept);
	}
   }
 
class teacher extends sample 
{
    teacher(String name,int age,String dept)
	{
	   super(name,age,dept);
	   System.out.println("Name of the Teacher"+name);
	}
}










class car
{
    String  nameofCompany;
    boolean isAvailable;
 
    car(String nameofCompany,boolean isAvailable)
	{
	   this.nameofCompany=nameofCompany;
	   this.isAvailable=isAvailable;
 
	}
 
    public void getCarDetails()
	{
	  System.out.println("Company"+nameofCompany);
	  System.out.println("Availability"+isAvailable);
 
	}
   }
 
   class Scorpio extends car  // derived class
     {
	 String carName,modelName,color;
 
	 Scorpio(String carName,String modelName,String color)
	  {
	     super("Mahindra",true);
	     this.carName=carName;
	     this.modelName=modelName;
	     this.color=color;
	   }
 
	  public void displayCarModel()
		{
	           System.out.println("Name of the car"+carName);
		   System.out.println("Model"+modelName);
		   System.out.println("Color"+color);
		}
      }	
 
    class demoinher1
     {
       public static void main(String ads[])
	{
	   Scorpio c1=new Scorpio("Scorpio","vlx","black");
	   c1.getCarDetails();
	   c1.displayCarModel();				
	}
     }	
