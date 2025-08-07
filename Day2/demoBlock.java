class Student
 {
    String name,dept;
    int roll;
    Address adr;
 
    Student(int roll,String name,String dept,Address adr)
    {
        this.roll=roll;
        this.name=name;
        this.dept=dept;
        this.adr=adr;
    }
 
    public void displayStudent()
        {
            System.out.println("Name of the student"+name);
            System.out.println("Roll"+roll);
            System.out.println("Department"+dept);
            adr.displayAddress();
        }
 
 }
 
 class demoStudent
  {
      public static void main(String[] args) {
          Address a1=new Address("Koramangala A blk","Bangalore",2,4324324);
          Student s1=new Student(1,"Rakesh","cse",a1);
          s1.displayStudent();
 
      }
  }
 
class demoBlock
 {
 
    {
        System.out.println("Instance block is called");
    }
    static{
        System.out.println("inside static block");
    }
 
    demoBlock() // constructor
    {
        System.out.println("Inside constructor");
    }
 
     public static void main(String[] args) {
       // new demoBlock();
        System.out.println("Inside main mathod");
     }
 }
 