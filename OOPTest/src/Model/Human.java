package Model;

public class Human extends Unit{
	
	public Human() {
		Level = 1;
		HP = 1000;
		MP = 100;
		Power = 100;
		AttackSpeed = 1;
		Defense = 10;
		MissRate = 10/100;
	}
	
	public void Guard() {
		MP -= 10;
		Defense+=Defense*(30/100);
	}
	
	public void Invincible() {
		MP -= MP*(30/100);
		Damage = 0;
		System.out.println("¹«Àû!!");
	}
	
}
