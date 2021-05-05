
public class Main {

	public static void main(String[] args) {
		Fruit a = new Fruit ("Fruit");
		System.out.println(a);
		
		Apple b = new Apple ("Apple", 10, 2.00);
		System.out.println(b);
		
		redApple c = new redApple ("Red Apple", 10, 2.00, "Red");
		System.out.println(c);
		
		greenApple d = new greenApple("Green Apple", 10, 2.00, "Green");
		System.out.println(d);
		
		Orange e = new Orange ("Orange", "Orange", 0.5, 6.00);
		System.out.println(e);
		
		Strawberry f = new Strawberry("Strawberry", 14, 2);
		System.out.println(f);
	}

}
