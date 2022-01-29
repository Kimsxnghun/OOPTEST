package ModelWeapon;

public class Bow extends Weapon{
	
	public void ShortBow() {
		AttackSpeed += AttackSpeed*(5/100);
	}
	
	public void LongBow() {
		AttackSpeed += AttackSpeed*(10/100);
	}
}
