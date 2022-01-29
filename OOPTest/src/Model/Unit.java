package Model;

import ModelWeapon.Weapon;

public class Unit {
	
	protected int level; // ����
	
	protected int hp; // ���� �����
	protected int maxHp; // �ִ� �����
	protected boolean dead = false; // ���� ����
	protected int damage; // ������ �޴� ������
	
	protected int mp; // ���� ����
	protected int maxMp; // �ִ� ����
	protected int mpUse; // ���� ��뷮
	
	protected int power; // ���ݷ� 
	protected int attackSpeed; // ���� �ӵ�
	protected int defense; // ����
	protected float missRate; // ȸ���� (%)
	
	protected Weapon weapon;

	
	// ������ ����
	public void damageHp(int damage) { 
		
		damage -= defense; // �޴� ���� ������ = ��� ���ݷ� - ���� ����
		hp -= damage; // ���� ü�� -= ������
		
		damage = 0; // ���� ���� �� ������ �ʱ�ȭ
		
		if (hp <= 0) { // ������� 0�� �Ǹ� ���
			hp = 0;
			dead = true;
		}
	}
	
	
	 // ��
	public void heal() {
		mpUse = maxMp*(10/100); // ���� ��뷮
		
		if (mp >= mpUse || mp == 0) { // ��ų ���� �ʿ��� �������� ���ų� 0�̵Ǹ� ��ų�� ����� �� ����.
			mp -= mpUse;
			hp += maxHp*(10/100); // ��ü ü���� 10% ȸ��	
		}

		if (hp > maxHp) { // ����ü���� �ִ�ü�º��� Ŀ���� -> ����ü�� = �ִ�ü��
			hp = maxHp;
		}
	}
	
	 // ���� ��
	public void levelUp() {
		level++;
	}
	
	// �⺻ ����
	public void attack(int power) {
		this.power = power; // ���� �������� �޴� ���������� ���
	}
	
	
	// ����
	public void steam() { 
		mpUse -= maxMp*(5/100); // ���� ��뷮
		
		if (mp >= mpUse || mp == 0) { // ��ų ���� �ʿ��� �������� ���ų� 0�̵Ǹ� ��ų�� ����� �� ����.
			mp -= mpUse;
			power += power*(20/100); // ���ݷ� 20% ���
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


	public void setPower(int power) { // Attack�̶� ������.. ��..
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
