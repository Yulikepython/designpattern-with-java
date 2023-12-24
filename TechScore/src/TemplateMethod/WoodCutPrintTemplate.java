package TemplateMethod;

/** テンプレートメソッド **/
public abstract class WoodCutPrintTemplate {
	public abstract void draw( Cuttable hanzai );
	public abstract void cut(Cuttable hanzai);
	public abstract void print(Cuttable hanzai);
	
	
	public void createWoodCutPrint() {
		Wood hanzai = new Wood(); //Wood クラスは、Cuttable インターフェースを実装している
		draw(hanzai);
		cut(hanzai);
		print(hanzai);
	}
}
