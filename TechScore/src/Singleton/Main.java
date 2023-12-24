package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegisterNote registerNote = RegisterNote.getInstance();
		System.out.println("1つめ: " + registerNote.hashCode());
		
		RegisterNote registerNote2 = RegisterNote.getInstance();
		System.out.println("2つめ: " + registerNote2.hashCode());
		
		RegisterNote registerNote3 = RegisterNote.getInstance();
		System.out.println("3つめ: " + registerNote3.hashCode());
	}

}
