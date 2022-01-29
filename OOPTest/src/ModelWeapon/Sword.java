package ModelWeapon;

public class Sword extends Weapon{
	
	public void ShortSword() {
		Power+=Power*(5/100);
	}
	
	public void LongSword() {
		Power+=Power*(10/100);
	}
}
