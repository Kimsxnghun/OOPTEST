package Entity;

public class Human extends Unit{
	
	public Human() {
		level=1; // ����
		unit = "Human"; //���� 
		
		hp = 200; // ���� �����
		maxHp = 200; // �ִ� �����
		dead = false; // ���� ����
		
		mp = 200; // ���� ����
		maxMp = 200; // �ִ� ����
		mpUse = 0; // ���� ��뷮
		
		damage = 20; // ���ݷ� 
		applyDamage = 0; // �޴� ������
		attackSpeed = 1; // ���� �ӵ�
		defense = 20; // ����
		missRate = 10; // ȸ���� (%)
		
		equipped = false; // ���� ���� ����
		
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
