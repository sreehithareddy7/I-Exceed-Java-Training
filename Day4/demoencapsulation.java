class student 
  {
     private String name,dept;
     private int roll;
 
      student(String name,int roll,String dept)
	{
	   this.name=name;
	   this.roll=roll;
	   this.dept=dept;
	}
      public int getroll()
	{
	  return roll;
	}
 
      public String getname()  //write only
	{
	  return name;
	}
      public String getdept()
	{
	  return dept;
	}
 
      public void setRoll(int roll)
	{
	  this.roll=roll;
	}
      public void setName(String name)
	{
	  this.name=name;
	}
      public void setDept(String dept)
	{
	  this.dept=dept;
	}
   }
 
class demoencapsulation 
{
    public static void main(String asdd[])
	{
	   student s1=new student("Cherry",1,"CSE");
	   System.out.println(s1.getname());
	   System.out.println(s1.getroll());
	   System.out.println(s1.getdept());
	   System.out.println("After setting:");
	   
	   s1.setName("Sreehitha");
	   System.out.println(s1.getname());
	   s1.setRoll(7);
	   System.out.println(s1.getroll());
	   s1.setDept("ISE");
	   System.out.println(s1.getdept());
	   

 
	}
}