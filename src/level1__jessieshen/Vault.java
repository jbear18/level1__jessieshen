package level1__jessieshen;

import javax.swing.JOptionPane;

public class Vault {
	int secretCode=6786;

Vault(int secretCode){
	this.secretCode=secretCode;
}
	
public boolean tryCode(int num){
if(num==secretCode) {
	JOptionPane.showMessageDialog(null, "yay, you opened the vault");
	return true;
}else {
//System.out.println("*SELF DESTRUCT SYSTEM ACTIVATED*");
	return false;	
}



}
}
