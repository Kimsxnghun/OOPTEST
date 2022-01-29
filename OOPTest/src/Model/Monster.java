package Model;

public class Monster extends Unit {
	
	public Monster() {
		Level = 1;
		HP = 300;
		MP = 100;
		Power = 100;
		AttackSpeed = 1;
		Defense = 10;
		MissRate = 10/100;
	}
	
	public void counterAttack() {
		MP -= 20;
		HP -= Power*(70/100);
	}
}
