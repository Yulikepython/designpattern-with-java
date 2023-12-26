package AbstractFactory;

import java.util.*;

public class HotPot {
	private Pot pot;
	private Soup soup;
	private Protein protein
	Private List vegetable;
	private List otherIgredients;
	
	public HotPot(Pot pot) {
		this.pot = pot;
	}
	
	public void addSoup(Soup soup) {
		this.soup = soup;
	}
	
	public void addMain(Protein protein) {
		this.protein = protein;
	}
	
	public void addVegetables(List<Vegetable> vegetables) {
		this.vegitables = vegetables;
	}
	
	public void addOtherIngredients(List<Ingredients> otherIncredients) {
		this.otherIgredients = otherIngredients;
	}
}
