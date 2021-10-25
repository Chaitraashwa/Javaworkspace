public class Dog
{
public static void main(string[] args)
{
	private int age;
	String colour;
	String dogName;
}
	public void setAge(int a)
	{
		if(a<0){
			System.out.println("Boss age not a valid...!! ");
		}
		else
			age=a;
	}
	public int getAge(){
		return age;
	}
	void bark()
	{
		System.out.println("Ruff !!");
	}
	void eat()
	{
		System.out.println("Eating food...!! ");
	}
	
	void display()
	{
		System.out.println("The Dog Name is: "+dogName);
		System.out.println("The Dog Age is: "+age);
		System.out.println("The Dog Coloue is: "+colour);
	}
}