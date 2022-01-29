package Model;

public class Elf extends Unit{
	
	public Elf() {
		Level = 1;
		HP = 800;
		MP = 300;
		Power = 100;
		AttackSpeed = 1;
		Defense = 5;
		MissRate = 20/100;
	}
	
	public void Elusion() {
		MP -= 10;
		MissRate+=MissRate*(30/100);
	}
	
	public void Rapid() {
		MP -= MP*(30/100);
		AttackSpeed += AttackSpeed*(500/100);
	}
	
}
