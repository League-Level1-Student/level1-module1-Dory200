package _05_vault;

import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
	int code;
	Vault(){
		Random ran = new Random();
		code = ran.nextInt(1000000);
	}
	boolean trycode(int guess) {
		if(guess==code) {
			return true;
		}
		else {
			return false;
		}
	}
}

