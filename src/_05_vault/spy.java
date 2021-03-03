package _05_vault;

public class spy {
	String name;
	int findCode(Vault open) {
		for(int i = 0; i < 1000000; i++) {
			boolean success = open.trycode(i);
			if(success) {
				return i;
			}
		}
		return -1;
	}
}
