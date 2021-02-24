package _03_harry_potter;

public class harry_potter_runner {
	public static void main(String[] args) {
		HarryPotter potter = new HarryPotter();
		potter.makeInvisible(true);
		potter.spyOnSnape();
		potter.makeInvisible(false);
		potter.castSpell("wingardian joe");
	}
}
