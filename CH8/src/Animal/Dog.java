package Animal;

public class Dog implements Payient, Item{
	public void Sound() {
	   System.out.println("Mong Mong");
	}
	
	public void GetPrice()
	{
		System.out.println("10000");
	}
}
