package FactoryMethodPattern;

public class ImagawaCutPrintSub extends CutPrint {
	protected void draw(Cuttable hanzai) {
		System.out.println(hanzai.getName() + ": drawメソッド");
	}
	
	protected void cut(Cuttable hanzai) {
		System.out.println(hanzai.getName() + ": cutメソッド");
	}
	
	protected void print(Cuttable hanzai) {
		System.out.println(hanzai.getName() + ": printメソッド");
	}
	
	protected Cuttable createCuttable() {
//		return new Potato();//新しいクラスでメソッドを上書きする
		return new Wood();
	}
}
