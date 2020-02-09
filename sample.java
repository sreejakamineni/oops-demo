package demo2;
abstract class App
{
	abstract void showBalance();//ABSTRACTION
	void display()
	{
		System.out.println("detailes verified");
	}
}
class Appsub extends App
{
	void showBalance()
	{ 
		int bal=1000;
	System.out.println("balance is :"+bal);
	}
}
class A
{
	int var=10;
	void aa()
	{
		System.out.println("this parent class");
	}
	void aa2(int i)
	{
		System.out.println("value :"+i);
	}
}
class B extends A// INHERITANCE
{
	void aa()
	{
	System.out.println("this is child class");//POLYMORPHISM
	}
	void bb()
	{
		System.out.println("var value :"+super.var);//USING SUPER KEYWORD FOR VARIABLE
	}
}
class C extends A // HIERARCHICAL INHERITANCE
{ int p;
	void aa2(String name)
	{
		System.out.println("name :"+name);
	}
	void cc()
	{
		p=10+20;//ENCAPSULATION
		System.out.println("p value:"+p);
	}
	
}
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appsub app = new Appsub();
		app.showBalance();
		app.display();
		B b = new B();
		b.aa();
		b.bb();
		C c = new C();
		c.aa2(20);
		c.cc();
		
		

	}

}

