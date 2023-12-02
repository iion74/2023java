package innerinterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button();
		
		//Call c = new Call;
		
		b.SetOnClickListener(new Button.OnClickListener( ) {
			
			@Override
			public void onClick() {
				//TODO Auto-generated method stub
				System.out.println("Make a call.");
			}
		});
		
		b.touch();
		
		Massage m = new Massage();
		b.SetOnClickListener(m);
		b.touch();
		

	}

}
