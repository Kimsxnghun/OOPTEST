package Entity;

import java.util.Random;

import Item.Weapon;

public class Unit {
	
	protected int level; // ����
	protected String unit; // ����
	
	protected int hp; // ���� �����
	protected int maxHp; // �ִ� �����
	protected boolean dead = false; // ���� ����
	
	protected int mp; // ���� ����
	protected int maxMp; // �ִ� ����
	protected int mpUse; // ���� ��뷮
	
	protected int damage; // ���ݷ�
	protected int applyDamage; // �޴� ������
	protected float attackSpeed; // ���� �ӵ�
	protected int defense; // ����
	protected int missRate; // ȸ���� (%)
	
	protected boolean equipped;// ���� ���� ����
	
	// ������ ����
	public void damageHp(int damage, Random ran) { 
		
		if(ran.nextInt(100)>missRate) { // ������ ���� Ȯ��
			
			applyDamage = damage - defense; // �޴� ���� ������ = ��� ���ݷ� - ���� ����
			hp -= applyDamage; // ���� ü�� -= ������
			
			applyDamage = 0; // ���� ���� �� ������ �ʱ�ȭ
			
		} else { // ���� Ȯ��
			applyDamage = 0;
		}
		
		if (hp <= 0) { // ������� 0�� �Ǹ� ���
			hp = 0;
			dead = true;
		}
	}
	
	
	 // ��
	public void heal() {
		mpUse = maxMp*(10/100); // ���� ��뷮
		
		if (mp >= mpUse) { // ��ų ���� �ʿ��� �������� ���ų� 0�̵Ǹ� ��ų�� ����� �� ����.
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
		// ������ 1������ ���� �ɷ�ġ�� 10% ���
		maxHp += maxHp*(10/100);
		maxMp += maxMp*(10/100);
		damage += damage*(10/100);
		attackSpeed += attackSpeed*(10/100);
		defense += defense*(10/100);
		missRate += missRate*(10/100);
		
		// ���� ����°� ������ �ִ�ġ�� ȸ��
		hp = maxHp; 
		mp = maxMp;
	}
	
	// �⺻ ����
	public void attack(int damage) {
		this.damage = damage; // ���� �������� �޴� ���������� ���
	}
	
	
	// ����
	public void steam() { 
		mpUse -= maxMp*(5/100); // ���� ��뷮
		
		if (mp >= mpUse) { // ��ų ���� �ʿ��� �������� ���ų� 0�̵Ǹ� ��ų�� ����� �� ����.
			mp -= mpUse;
			damage += damage*(20/100); // ���ݷ� 20% ���
		}
	}

	// ���� ����
	public void equip(Weapon w) {
		damage += w.dmg;
		attackSpeed += w.asp;
	};
	// ���� ���� ����
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


	public void setDamage(int damage) { // Attack�̶� ������...
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
