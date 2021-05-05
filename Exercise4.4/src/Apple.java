
	class Apple extends Fruit {							//subclass of Fruit
		protected int quantity;
		protected double price;
		public Apple(String name, int quantity, double price) {
			super(name); 		//call the super class constructor
			this.quantity = quantity;
			this.price = price;
			
			
			if (this.quantity < 20) {
				System.out.println("The total price is RM" + totalPrice());
			
			}else if ((this.quantity >= 20) && (this.quantity < 50)) {
				double p = 1.50;
				System.out.println("The total price is RM" + totalPrice(p));
			}
			else {
				double p = 1.00;
				int q = this.quantity;
				System.out.println("The total price is RM" + totalPrice(p,q));
			}
		}
		public void type(){	//overriding
			System.out.println("Type of Apple");
			System.out.println("1.Red Apple " + "\n 2. Green Apple");
		}
		
		public String toString() { 		//toString //overriding
			return ("Name = " + super.name + "" + "\n quantity = " + quantity + "\n price :" + price + " each");
		}
		
		public double totalPrice() {				//overloading with no arg
			return this.price * this.quantity;
		}
		
		public double totalPrice(double p) {		//overloading with 1 arg
			return p * this.quantity;
		}
		
		public double totalPrice(double p, int q) {	//overloading with 2 arg
			return p * q;
		}
}