package ChainOfResponsibility;

public class Level {
	public int responsibleLevel;
	public Level(int responsibleLevel) {
		this.responsibleLevel = responsibleLevel;
	}
	
	public boolean lessThan(Level levelObj) {
		return this.responsibleLevel <= levelObj.responsibleLevel;
	}
}
