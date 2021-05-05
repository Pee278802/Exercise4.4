class greenApple extends Apple{
	protected double price, weight;
	protected String colour;
	public greenApple(String name, int quantity, double price, String colour) {
		super(name, quantity, price);
		this.colour = colour;
		System.out.println();

}
	public String toString() { //toString //overriding
		return ("Name = " + super.name + "" + "\n colour = " + colour + "\n quanitity = " + super.quantity + "\n price :RM" + super.price + " each");
		

}
}
