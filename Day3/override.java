
//base class
class base{
    void method(){
	    System.out.println("Inside base class method");
	
	}

}
//sub class1
class sub extends base{
    void method(){
	   System.out.println("Inside 1st sub-class method");
	
	}
}
//sub class2
class sub1 extends base{
	void method(){
		System.out.println("Inside 2nd sub-class method");
	}
}


class override{
    public static void main(String[]args){
	    base obj=new base();
		sub obj1=new sub();
		sub1 obj2=new sub1();
		base ref;
		ref=obj1;
		
		ref.method();
	}
   }