public class A
{  
void test_A()
	{
	System.out.println("In class A");
	}  
}  
class B extends A
{  
	void test_B()
	{
		System.out.println("In class B");
	}  
}  
public class T1 {
	public static void main(String[] args) {
		B b1=new B();  
		b1.test_B();  
		b1.test_A();  
	}
}
