package Model;

public class Monster extends Unit {
	
	public Monster() {
		
		level=1; // ����
		
		hp = 100; // ���� �����
		maxHp = 100; // �ִ� �����
		dead = false; // ���� ����
		
		mp = 50; // ���� ����
		maxMp = 50; // �ִ� ����
		mpUse = 0; // ���� ��뷮
		
		damage = 10; // ���ݷ� 
		attackSpeed = 0.5f; // ���� �ӵ�
		defense = 5; // ����
		missRate = 0.05f; // ȸ���� (%)

	}
	
	// �ݰ� ��ų (30% Ȯ��)
	public void counterAttack() {
		mpUse -= 10;
		if(mp >= mpUse) {
			mp -= mpUse;
			hp -= damage*(70/100);
		}
	}
}
