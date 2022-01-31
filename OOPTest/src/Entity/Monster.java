package Entity;

import Item.Weapon;

public class Monster extends Unit {
	
	public Monster() {
		
		level=1; // 레벨
		unit = "Monster"; // 종족
		
		hp = 100; // 현재 생명력
		maxHp = 100; // 최대 생명력
		dead = false; // 생존 여부
		
		mp = 50; // 현재 마나
		maxMp = 50; // 최대 마나
		mpUse = 0; // 마나 사용량
		
		damage = 10; // 공격력 
		applyDamage = 0; // 받는 데미지
		attackSpeed = 0.5f; // 공격 속도
		defense = 5; // 방어력
		missRate = 5; // 회피율 (%)

	}
	
	// 반격 스킬 (30% 확률)
	public void counterAttack() {
		mpUse -= 10;
		if(mp >= mpUse) {
			mp -= mpUse;
			hp -= damage*(70/100);
		}
	}

	@Override
	public void equip(Weapon w) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unequip(Weapon w) {
		// TODO Auto-generated method stub
		
	}
}
