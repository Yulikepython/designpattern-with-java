package PrototypePattern;

public class Paper implements Cloneable {
	private String name;
	
	public Paper() {};
	
	public Paper(String name) {
		this.name=name;
	}
	
	public Cloneable createClone() {
		Paper newPaper = new Paper();
		newPaper.name = this.name;
		//newPaperとthisを重ねて、thisの形に切り抜く
		return newPaper;
	}
}
