package level1__jessieshen;

public class JamesBond {
	public static void main(String[] args) {

		Vault vault = new Vault(234234);
		

		JamesBond jb = new JamesBond();
		int ans= jb.findCode(vault);
		System.out.println("The code was "+ ans);
		System.out.println("The vault exploded "+ ans);
	}

	public int findCode(Vault vault) {
		for (int i = 0; i < 1_000_000; i++) {
			boolean b = vault.tryCode(i);
			if (b == true) {
				
				return i;

			}
		}
		return -1;
	}
}