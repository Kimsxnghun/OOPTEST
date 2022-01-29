package Model;

import ModelWeapon.Sword;

public class Human extends Unit{
	
	public Human() {
		
		level=1; // 레벨
		
		hp = 200; // 현재 생명력
		maxHp = 200; // 최대 생명력
		dead = false; // 생존 여부
		
		mp = 200; // 현재 마나
		maxMp = 200; // 최대 마나
		mpUse = 0; // 마나 사용량
		
		damage = 20; // 공격력 
		attackSpeed = 1; // 공격 속도
		defense = 20; // 방어력
		missRate = 0.1f; // 회피율 (%)
		
		weapon = new Sword();
	}
	
	// 휴먼 스킬
	public void Guard() {
		mpUse -= 10;
		
		if (mp >= mpUse) {
			mp -= mpUse;
			defense+=defense*(30/100); // 방어력 30% 상승		
		}
		
	}
	
	// 궁극 스킬
	public void Invincible() {
		if (this.level >= 99) { // level이 99가 넘으면 사용 가능
			mpUse -= mp*(30/100);
			
			if (mp >= mpUse) {
				mp -= mpUse;
				
				if(hp<=0) {
					dead = false; // 무적
				}	
			}					
		}
	}
	
}
