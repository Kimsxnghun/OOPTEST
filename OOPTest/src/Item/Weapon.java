package Item;

public class Weapon {
	
	public int type; // ������ ����
	/*
	 * 0 - Sword
	 * 1 - Bow
	 * 2 - Axe 
	 */
	public String name; // ������ �̸�
	public String unit; // ��� ���� ����
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
