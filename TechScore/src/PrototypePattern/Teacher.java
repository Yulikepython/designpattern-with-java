package PrototypePattern;

/** 上に雪の結晶を書き、切り取る*/
public class Teacher {
	public Paper[] createManyCrystals() {
		Paper prototype = new Paper("雪の結晶");
		drawCrystal(prototype);
		cutAccordanceWithLine(prototype);
		
		Paper[] papers = new Paper[100];
		for (int n=0; n<papers.length;n++) {
			papers[n] = (Paper)prototype.createClone();
		}
		return papers;
	}
	
	private void drawCrystal(Paper paper) {
		//きれいに描くため時間がかかる
	}
	
	private void cutAccordanceWithLine(Paper paper) {
		//切り取りに時間がかかる
	}
}
