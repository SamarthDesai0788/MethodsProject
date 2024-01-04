package methodsexample;

public class methods {
	static int a=20,b=30;
	void add()
	{
		int result=a+b;
		System.out.println("addition of two numbers"+result);
	}
	int sub()
	{
		int res=a-b;
		return res;
		
	}
	static void mul()
	{
		System.out.println("multipication of two numbers"+(a*b));
	}
	public static void main(String[] args) {
methods m1=new methods();
m1.add();
System.out.println("substraction of 2 numbers"+m1.sub());
methods.mul();
	}
}