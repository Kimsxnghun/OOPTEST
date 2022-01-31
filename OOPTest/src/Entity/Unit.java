package Entity;

import java.util.Random;

import Item.Weapon;

public class Unit {
	
	protected int level; // 레벨
	protected String unit; // 종족
	
	protected int hp; // 현재 생명력
	protected int maxHp; // 최대 생명력
	protected boolean dead = false; // 생존 여부
	
	protected int mp; // 현재 마나
	protected int maxMp; // 최대 마나
	protected int mpUse; // 마나 사용량
	
	protected int damage; // 공격력
	protected int applyDamage; // 받는 데미지
	protected float attackSpeed; // 공격 속도
	protected int defense; // 방어력
	protected int missRate; // 회피율 (%)
	
	protected boolean equipped;// 무기 장착 여부
	
	// 데미지 받음
	public void damageHp(int damage, Random ran) { 
		
		if(ran.nextInt(100)>missRate) { // 피하지 못할 확률
			
			applyDamage = damage - defense; // 받는 최종 데미지 = 대상 공격력 - 유닛 방어력
			hp -= applyDamage; // 현재 체력 -= 데미지
			
			applyDamage = 0; // 피해 입은 후 데미지 초기화
			
		} else { // 피할 확률
			applyDamage = 0;
		}
		
		if (hp <= 0) { // 생명력이 0이 되면 사망
			hp = 0;
			dead = true;
		}
	}
	
	
	 // 힐
	public void heal() {
		mpUse = maxMp*(10/100); // 마나 사용량
		
		if (mp >= mpUse) { // 스킬 사용시 필요한 마나보다 적거나 0이되면 스킬을 사용할 수 없다.
			mp -= mpUse;
			hp += maxHp*(10/100); // 전체 체력의 10% 회복	
		}

		if (hp > maxHp) { // 현재체력이 최대체력보다 커지면 -> 현재체력 = 최대체력
			hp = maxHp;
		}
	}

	
	// 레벨 업
	public void levelUp() {
		level++; 
		// 레벨이 1오르면 현재 능력치가 10% 상승
		maxHp += maxHp*(10/100);
		maxMp += maxMp*(10/100);
		damage += damage*(10/100);
		attackSpeed += attackSpeed*(10/100);
		defense += defense*(10/100);
		missRate += missRate*(10/100);
		
		// 현재 생명력과 마나가 최대치로 회복
		hp = maxHp; 
		mp = maxMp;
	}
	
	// 기본 공격
	public void attack(int damage) {
		this.damage = damage; // 최종 데미지는 받는 데미지에서 계산
	}
	
	
	// 스팀
	public void steam() { 
		mpUse -= maxMp*(5/100); // 마나 사용량
		
		if (mp >= mpUse) { // 스킬 사용시 필요한 마나보다 적거나 0이되면 스킬을 사용할 수 없다.
			mp -= mpUse;
			damage += damage*(20/100); // 공격력 20% 상승
		}
	}

	// 무기 장착
	public void equip(Weapon w) {
		damage += w.dmg;
		attackSpeed += w.asp;
	};
	// 무기 장착 해제
	public void unequip(Weapon w) {
		damage -= w.dmg;
		attackSpeed -= w.asp;
	};
	
	
	
	// getter, setter

	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMaxHp() {
		return maxHp;
	}


	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}


	public boolean isDead() {
		return dead;
	}


	public void setDead(boolean dead) {
		this.dead = dead;
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) { // Attack이랑 같은데...
		this.damage = damage;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	public int getMaxMp() {
		return maxMp;
	}


	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}


	public int getMpUse() {
		return mpUse;
	}


	public void setMpUse(int mpUse) {
		this.mpUse = mpUse;
	}

	public float getAttackSpeed() {
		return attackSpeed;
	}


	public void setAttackSpeed(float attackSpeed) {
		this.attackSpeed = attackSpeed;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public int getMissRate() {
		return missRate;
	}


	public void setMissRate(int missRate) {
		this.missRate = missRate;
	}


	
}
