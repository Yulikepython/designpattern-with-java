package TemplateMethod;

public class TanakaWoodCutPrint extends WoodCutPrintTemplate{
	
	public void draw(Cuttable hanzai) {
		System.out.println(hanzai.getName() + ": drawメソッド");
	}
	
	public void cut(Cuttable hanzai) {
		System.out.println(hanzai.getName() + ": cutメソッド");
	}
	
	public void print(Cuttable hanzai) {
		System.out.println(hanzai.getName() + ": printメソッド");
	}
}