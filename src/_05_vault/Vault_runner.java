package _05_vault;

import javax.swing.JOptionPane;

public class Vault_runner {
	
	public static void main(String[] args) {
		Vault vault = new Vault();
		spy spy = new spy();
		int find = spy.findCode(vault);
		if(find==-1) {
			JOptionPane.showMessageDialog(null, "You failed in unlocking the code");
		}
		else {
			JOptionPane.showMessageDialog(null, "SUCCESS");
		}
	}
}
