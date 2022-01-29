package Model;

import ModelWeapon.Weapon;

public class Unit {
	
	protected int level; // 레벨
	
	protected int hp; // 현재 생명력
	protected int maxHp; // 최대 생명력
	protected boolean dead = false; // 생존 여부
	protected int damage; // 유닛이 받는 데미지
	
	protected int mp; // 현재 마나
	protected int maxMp; // 최대 마나
	protected int mpUse; // 마나 사용량
	
	protected int power; // 공격력 
	protected int attackSpeed; // 공격 속도
	protected int defense; // 방어력
	protected float missRate; // 회피율 (%)
	
	protected Weapon weapon;

	
	// 데미지 받음
	public void damageHp(int damage) { 
		
		damage -= defense; // 받는 최종 데미지 = 대상 공격력 - 유닛 방어력
		hp -= damage; // 현재 체력 -= 데미지
		
		damage = 0; // 피해 입은 후 데미지 초기화
		
		if (hp <= 0) { // 생명력이 0이 되면 사망
			hp = 0;
			dead = true;
		}
	}
	
	
	 // 힐
	public void heal() {
		mpUse = maxMp*(10/100); // 마나 사용량
		
		if (mp >= mpUse || mp == 0) { // 스킬 사용시 필요한 마나보다 적거나 0이되면 스킬을 사용할 수 없다.
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
	}
	
	// 기본 공격
	public void attack(int power) {
		this.power = power; // 최종 데미지는 받는 데미지에서 계산
	}
	
	
	// 스팀
	public void steam() { 
		mpUse -= maxMp*(5/100); // 마나 사용량
		
		if (mp >= mpUse || mp == 0) { // 스킬 사용시 필요한 마나보다 적거나 0이되면 스킬을 사용할 수 없다.
			mp -= mpUse;
			power += power*(20/100); // 공격력 20% 상승
		}
	}

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


	public void setDamage(int damage) {
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


	public int getPower() {
		return power;
	}


	public void setPower(int power) { // Attack이랑 같은데.. 흠..
		this.power = power; 
	}


	public int getAttackSpeed() {
		return attackSpeed;
	}


	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public float getMissRate() {
		return missRate;
	}


	public void setMissRate(float missRate) {
		this.missRate = missRate;
	}


	public Weapon getWeapon() {
		return weapon;
	}


	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
}
