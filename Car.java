package ch7;

public class Car {
	double speed = 1;
	double position = 0;
	Hankooktire htire;
	KumhoTire ktire;
	
	public Car(HankookTire hTire) {
		this.htire = htire;
		
	}
	
	public Car(KumhoTire kTire) {
		this.ktire = ktire;
		
	}
	public void run() {
		if(hTire != null)
		    hTire.roll();
		if(kTire != null)
		    kTire.roll();
	}	
	
	public void SetTire(HankookTire hTire)
	{
		this.htire = hTire;	
	}	
	
	public void SetTire(KumhoTire kTire)
	{
		this.ktire = kTire;	
	}
	
	
	}
}
