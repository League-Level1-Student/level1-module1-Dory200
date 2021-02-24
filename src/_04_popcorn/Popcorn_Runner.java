package _04_popcorn;

import javax.swing.JOptionPane;

public class Popcorn_Runner {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("what flavor of popcorn do you want?");
		String heat = JOptionPane.showInputDialog("How long do you want your popcorn cooked?");
		int he = Integer.parseInt(heat);
		Popcorn pop = new Popcorn(flavor);
		Microwave m = new Microwave();
		m.putInMicrowave(pop);
		m.setTime(he);
		m.startMicrowave();
		
		
	}
}
