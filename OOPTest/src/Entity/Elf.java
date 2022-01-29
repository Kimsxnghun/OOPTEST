package Model;

import ModelWeapon.Bow;

public class Elf extends Unit{
	
	public Elf() {
		
		level=1; // ����
		
		hp = 100; // ���� �����
		maxHp = 100; // �ִ� �����
		dead = false; // ���� ����
		
		mp = 300; // ���� ����
		maxMp = 300; // �ִ� ����
		mpUse = 0; // ���� ��뷮
		
		damage = 10; // ���ݷ� 
		attackSpeed = 2; // ���� �ӵ�
		defense = 10; // ����
		missRate = 0.2f; // ȸ���� (%)
		
		weapon = new Bow();
	}
	
	// ���� ��ų
	public void Elusion() {
		mpUse -= 10;
		if (mp >= mpUse) {
			mp -= mpUse;
			missRate+=missRate*(30/100); // ȸ�Ƿ� 30% ���
		}
	}
	
	// �ñ� ��ų
	public void Rapid() {
		if (this.level >= 99) {			
			if (mp >= mpUse) {
				mpUse -= mp*(30/100);
				mp -= mpUse;
				attackSpeed += attackSpeed*(500/100); // ���ݼӵ� 500% ���
			}
		}
	}
	
}
