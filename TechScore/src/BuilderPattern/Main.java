package BuilderPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder = new SaltWaterBuilder();
		Director dir = new Director(builder);
		dir.constract();
		SaltWater saltWater = (SaltWater)builder.getResult();
		System.out.println(saltWater.salt);
		System.out.println(saltWater.water);
	}

}
