package AdaptorPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TaroをChairPersonに任命
		ChairPerson chairperson = new NewTaro();
		
		//任命されたChairPersonの名前
		chairperson.getChairpersonName();
		//organizeClass()の実行
		chairperson.organizeClass();
	}

}
