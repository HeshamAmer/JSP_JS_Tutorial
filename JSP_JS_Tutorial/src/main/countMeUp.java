package main;

public class countMeUp {

	private int counter=0;
	
	public int getCounter() {
		System.out.println("getCounter called");
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	public void increment(){
		this.counter++;
	}
	
	
}
