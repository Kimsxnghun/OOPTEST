package View;

import java.util.Scanner;

import Controller.Species;
import Model.Unit;

public class GameStart {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Unit u = null;
		Species s = new Species();
		
		System.out.println("종족을 선택하세요.");
		System.out.println("1.휴먼 \t 2.오크 \t 3.엘프");
		System.out.print(">> ");
		int select = sc.nextInt();
		
		u = s.create(select); // 종족 선택
		
		boolean g = true;
		
		while(g) {
			System.out.println();
			System.out.println("무기 착용하기");
		}

	}

}
