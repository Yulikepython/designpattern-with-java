package Decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icecream ice1 = new CashewNutsToppingIcecream(new VanillaIcecream());
		Icecream ice2 = new CashewNutsToppingIcecream(new GreenTeaIcecream());
		
		System.out.println(ice1.getName());
		System.out.println(ice2.getName());
	}

}
