package Model;

import ModelWeapon.Sword;

public class Human extends Unit{
	
	public Human() {
		
		level=1; // ����
		
		hp = 200; // ���� �����
		maxHp = 200; // �ִ� �����
		dead = false; // ���� ����
		
		mp = 200; // ���� ����
		maxMp = 200; // �ִ� ����
		mpUse = 0; // ���� ��뷮
		
		damage = 20; // ���ݷ� 
		attackSpeed = 1; // ���� �ӵ�
		defense = 20; // ����
		missRate = 0.1f; // ȸ���� (%)
		
		weapon = new Sword();
	}
	
	// �޸� ��ų
	public void Guard() {
		mpUse -= 10;
		
		if (mp >= mpUse) {
			mp -= mpUse;
			defense+=defense*(30/100); // ���� 30% ���		
		}
		
	}
	
	// �ñ� ��ų
	public void Invincible() {
		if (this.level >= 99) { // level�� 99�� ������ ��� ����
			mpUse -= mp*(30/100);
			
			if (mp >= mpUse) {
				mp -= mpUse;
				
				if(hp<=0) {
					dead = false; // ����
				}	
			}					
		}
	}
	
}
