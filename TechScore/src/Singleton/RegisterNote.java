package Singleton;

/** クラスのインスタンスがひとつであることを保証する*/
public class RegisterNote {
	private static RegisterNote registerNote = new RegisterNote();
	private RegisterNote() {
		System.out.println("インスタンスが作られました。");
	};
	public static RegisterNote getInstance() {
		return registerNote;
	}
}
