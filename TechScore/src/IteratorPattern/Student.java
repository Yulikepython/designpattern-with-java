package IteratorPattern;

/** バージョン1 */
public class Student{
  	private String name;
	private int sex; //男の子:1  女の子:2

	public Student(String name,int sex){
		this.name = name;
		this.sex = sex;
	}
	public String getName(){
		return name;
	}
	/** 性別を取得*/
	public int getSex(){
		return sex;
	} 
}
