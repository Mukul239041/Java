package mess;

public enum MessPlan {

	 Monthly(3000), Quarterly(11700), Half_Year(17500), Yearly(32000);
	
	private double price;
	
	private MessPlan(double price) {
		this.price=price;
	}
	
}
