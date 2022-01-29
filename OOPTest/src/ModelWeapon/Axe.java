package ModelWeapon;

public class Axe extends Weapon{
	
	public void ShortAxe() {
		Power += Power*(10/100);
		AttackSpeed -= AttackSpeed*(5/100);
	}
	
	public void LongAxe() {
		Power += Power*(20/100);
		AttackSpeed -= AttackSpeed*(10/100);
	}
}
