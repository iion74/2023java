package SyncTest;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int money) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		Thread.sleep(2000);
		}
		System.out.println(Thread.currentThread().getName()+ ":" + this.memory)
		
	}
}
