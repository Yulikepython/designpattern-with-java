package AbstractFactory;

public class Main {

	public static void main(String[] args) {
        HotPot hotPot = new HotPot(new Pot()); 
        Factory factory = new MizutakiFactory(); 
        hotPot.addSoup(factory.getSoup()); 
        hotPot.addMain(factory.getMain()); 
        hotPot.addVegetables(factory.getVegetables()); 
        hotPot.addOtherIngredients(factory.getOtherIngredients());
	}
	
    private static Factory createFactory(String str){ 
        if("キムチ鍋".equals(str)){ 
//            return new KimuchiFactory();
        	return new MizutakiFactory();
        }else if("すき焼き".equals(str)){ 
//            return new SukiyakiFactory(); 
        	return new MizutakiFactory();
        }else{ 
            return new MizutakiFactory(); 
        } 
    } 

}
