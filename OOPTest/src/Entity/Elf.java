package Model;

import ModelWeapon.Bow;

public class Elf extends Unit{
	
	public Elf() {
		
		level=1; // 레벨
		
		hp = 100; // 현재 생명력
		maxHp = 100; // 최대 생명력
		dead = false; // 생존 여부
		
		mp = 300; // 현재 마나
		maxMp = 300; // 최대 마나
		mpUse = 0; // 마나 사용량
		
		damage = 10; // 공격력 
		attackSpeed = 2; // 공격 속도
		defense = 10; // 방어력
		missRate = 0.2f; // 회피율 (%)
		
		weapon = new Bow();
	}
	
	// 엘프 스킬
	public void Elusion() {
		mpUse -= 10;
		if (mp >= mpUse) {
			mp -= mpUse;
			missRate+=missRate*(30/100); // 회피력 30% 상승
		}
	}
	
	// 궁극 스킬
	public void Rapid() {
		if (this.level >= 99) {			
			if (mp >= mpUse) {
				mpUse -= mp*(30/100);
				mp -= mpUse;
				attackSpeed += attackSpeed*(500/100); // 공격속도 500% 상승
			}
		}
	}
	
}
