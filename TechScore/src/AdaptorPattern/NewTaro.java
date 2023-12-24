package AdaptorPattern;

public class NewTaro extends Taro implements ChairPerson{
	
//	public NewTaro() {
//		super();
//	}
	
	public void organizeClass() {
		this.enjoyWithAllClassmate();
	}
	
	public void getChairpersonName() {
		System.out.println("学級委員長に就任した" + this.getName() + "です");
	}
}
