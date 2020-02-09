package demo1;
abstract class Shape
{
  abstract void area();//ABSTRACTION
  void show()
  {
	  System.out.println("this is concerete method");
  }
}
 class E extends Shape
 {
	 int r=10;
	 void area()
	 { 
		 float a;//ENCAPSULATION
		 a= (float)3.14*r*r;
		 System.out.println("area :"+a);
	 }
 
}
class A
{
    public void m1()
    {
        System.out.println("this is the method 1");
    }
    public void m3(int i)
    {
        System.out.println(" value :"+i);
    }
    public void m5()
    {
    	System.out.println("this is method 5 in parent class");
    }
    
}
class B extends A//SINGLE INHERITANCE
{ 
	
  public void m2()
  {
    System.out.println("this is method 2");  
  }
  public void m1()
  {
      System.out.println("this is method 1 in child class");//POLYMORPHISM(METHOD OVERRIDING)
  }
  public void m3(int i,int j)  //POLYMORHISM(METHOD OVERLOADING)
  {
      System.out.println(" value :"+i);
      System.out.println("jvalue :"+j);
  }
 
  public void m5()
  {
  	System.out.println("this is method 5 in child class");
  }
  public void display()
  {
	  super.m5();// USING SUPER KEYWORD FOR METHOD
  }
}
class C
{ 
    int bal;
    public void m4(int bal)
    {
        this.bal=bal; //THIS KEYWORD
        System.out.println("bal :"+bal);
    }
    
    
}


public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj1 = new B();
		obj1.m1();
		obj1.m3(10);
		obj1.display();
		E obj = new E();
		obj.area();
		obj.show();
		
		
		
		

	}

}
