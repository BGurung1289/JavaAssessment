package assessment;

public class Weapon {
	private boolean magic = false;
	private boolean sword = false;
	private boolean noWeapon = false;
	
	public Weapon() { //was planning to implement this during the start although
					  //other aspects seemed more important
		}
	
	public void setStyle(int a) {
		if(a == 1) {
			magic = true;
		}
		else if(a == 2) {
			sword = true;
		}
		else {
			noWeapon = true;
	
		}
	}
	
	public boolean magicStyle() {
		if(magic) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean swordStyle() {
		if(sword) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean noStyle() {
		if(noWeapon) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
