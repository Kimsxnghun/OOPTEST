package Model;

public class Orc extends Unit{
	
	public Orc() {
		Level = 1;
		HP = 1200;
		MP = 50;
		Power = 100;
		AttackSpeed = 1;
		Defense = 20;
		MissRate = 5/100;
	}
	
	public void Anger() {
		MP -= 10;
		Power+=Power*(50/100);
		Defense-=Defense*(90/100);
	}
	
	public void Frenzy() {
		MP -= MP*(30/100);
		Power += Power*(500/100);
	}
	
}
