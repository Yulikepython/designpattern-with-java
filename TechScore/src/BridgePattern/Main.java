package BridgePattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortImple si = new BubbleSroter();
		TimerSorter ts = new TimerSorter(si);
		ts.timerSort(args);
	}

}
