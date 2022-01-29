package Model;

import ModelWeapon.Axe;

public class Orc extends Unit{
	
	public Orc() {
		
		level=1; // ����
		
		hp = 150; // ���� �����
		maxHp = 150; // �ִ� �����
		dead = false; // ���� ����
		
		mp = 50; // ���� ����
		maxMp = 50; // �ִ� ����
		mpUse = 0; // ���� ��뷮
		
		damage = 30; // ���ݷ� 
		attackSpeed = 0.7f; // ���� �ӵ�
		defense = 30; // ����
		missRate = 0.05f; // ȸ���� (%)

		weapon = new Axe();
	}
	
	// ��ũ ��ų
	public void Anger() {
		mpUse -= 10;
		
		if (mp >= mpUse) {
			mp -= mpUse;
			damage+=damage*(50/100); // ���ݷ� 50% ���
			defense-=defense*(10/100); // ���� 10% �϶�
		}
	}
	
	// �ñ� ��ų
	public void Frenzy() {
		if (this.level >= 99) {			
			mpUse -= mp*(30/100);
			if (mp >= mpUse) {
				mp -= mpUse;
				damage += damage*(500/100); // ���ݷ� 500% ���
			}
		}
	}
	
}
