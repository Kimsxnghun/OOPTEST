package View;

import java.util.Scanner;

import Controller.Species;
import Model.Unit;

public class GameStart {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Unit u = null;
		Species s = new Species();
		
		System.out.println("������ �����ϼ���.");
		System.out.println("1.�޸� \t 2.��ũ \t 3.����");
		System.out.print(">> ");
		int select = sc.nextInt();
		
		u = s.create(select); // ���� ����
		
		boolean g = true;
		
		while(g) {
			System.out.println();
			System.out.println("���� �����ϱ�");
		}

	}

}
