package Item;

public class Weapon {
	
	public int type; // 아이템 종류
	/*
	 * 0 - Sword
	 * 1 - Bow
	 * 2 - Axe 
	 */
	public String name; // 아이템 이름
	public String unit; // 사용 가능 종족
	public int dmg;
	public float asp;
	

	public Weapon() {
		
	}
	
	public Weapon(int type, String name, String unit, int dmg, float asp) {
		this.type = type;
		this.name = name;
		this.unit = unit;
		this.dmg = dmg;
		this.asp = asp;
	}
	
	

}
