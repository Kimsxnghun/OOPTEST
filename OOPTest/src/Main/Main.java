package Main;

import java.util.Random;

import Entity.Unit;
import Entity.UnitFactory;
import Entity.UnitFactory.UnitType;
import Item.Weapon;

public class Main {
	
	public Unit unit;
	public UnitFactory uf;
	public Weapon wp;
	public UnitType ut;
	public Random ran;
	
	public void create() {
		
		unit = new Unit();
		uf = new UnitFactory();
		wp = new Weapon();
		ran = new Random();

		unit = uf.getUnit(ut);
		

	}

	
}
