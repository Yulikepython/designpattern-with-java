package VisitorPattern;

public class TanakaHome extends Home{
	public Object praisedChild(){
		System.out.println("田中ホーム: praisedChild");
		return new Tea();
	}
	public Object reprovedChild(){
		System.out.println("うちの子に限ってそんなことは・・・。");

		return null;
	}
	/**
	 * 訪問者を受け入れるメソッド
	 */
	public void accept(Teacher teacher){
		teacher.visit(this);
	} 
}
