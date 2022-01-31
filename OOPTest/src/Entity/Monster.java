package Entity;

import Item.Weapon;

public class Monster extends Unit {
	
	public Monster() {
		
		level=1; // ����
		unit = "Monster"; // ����
		
		hp = 100; // ���� �����
		maxHp = 100; // �ִ� �����
		dead = false; // ���� ����
		
		mp = 50; // ���� ����
		maxMp = 50; // �ִ� ����
		mpUse = 0; // ���� ��뷮
		
		damage = 10; // ���ݷ� 
		applyDamage = 0; // �޴� ������
		attackSpeed = 0.5f; // ���� �ӵ�
		defense = 5; // ����
		missRate = 5; // ȸ���� (%)

	}
	
	// �ݰ� ��ų (30% Ȯ��)
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
