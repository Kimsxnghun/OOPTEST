package Model;

public class Unit {
	String name;
	int Level;
	int HP;
	int MP;
	int Power;
	int AttackSpeed;
	int Defense;
	int MissRate;
	int Damage;
	

	public void Death() {
		if(this.HP == 0) {
			System.out.println("ĳ���Ͱ� �׾����ϴ�");
		}
	}
	
	public void Defletion() {
		if(this.MP == 0) {
			System.out.println("������ �����մϴ�.");
		}
	}
	
	public void Attack(int Defense) {
		Damage = Power - Defense;
	}
	
	public void Heal() {
		MP -= MP*(10/100);
		HP += HP*(10/100);
	}
	
	public void Steam() {
		MP -= MP*(5/100);
		AttackSpeed += AttackSpeed*(20/100);
	}
	
}
