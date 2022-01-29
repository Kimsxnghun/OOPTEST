package Model;

import ModelWeapon.Axe;

public class Orc extends Unit{
	
	public Orc() {
		
		level=1; // 레벨
		
		hp = 150; // 현재 생명력
		maxHp = 150; // 최대 생명력
		dead = false; // 생존 여부
		
		mp = 50; // 현재 마나
		maxMp = 50; // 최대 마나
		mpUse = 0; // 마나 사용량
		
		damage = 30; // 공격력 
		attackSpeed = 0.7f; // 공격 속도
		defense = 30; // 방어력
		missRate = 0.05f; // 회피율 (%)

		weapon = new Axe();
	}
	
	// 오크 스킬
	public void Anger() {
		mpUse -= 10;
		
		if (mp >= mpUse) {
			mp -= mpUse;
			damage+=damage*(50/100); // 공격력 50% 상승
			defense-=defense*(10/100); // 방어력 10% 하락
		}
	}
	
	// 궁극 스킬
	public void Frenzy() {
		if (this.level >= 99) {			
			mpUse -= mp*(30/100);
			if (mp >= mpUse) {
				mp -= mpUse;
				damage += damage*(500/100); // 공격력 500% 상승
			}
		}
	}
	
}
