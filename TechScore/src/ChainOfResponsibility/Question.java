package ChainOfResponsibility;

public class Question {
	String question;
	Level level;
	
	public Question(String question, Level level) {
		this.question = question;
		this.level = level;
	}
}
