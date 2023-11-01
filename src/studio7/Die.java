package studio7;

public class Die {

	private int size;
	
	public Die(int instSize) {
		this.size = instSize;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public int roll() {
		return (int)(Math.random()*(this.size+1));
	}
	
	public static void main(String[] args) {
		Die d20 = new Die(20);
		System.out.println(d20.roll());
		/*
		for(int i = 0; i < 200; i++) {
			if(d20.roll() > 20 || d20.roll() < 0) {
				System.out.println("CRINGE");
			}
		}*/
	}

}
