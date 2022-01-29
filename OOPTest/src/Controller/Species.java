package Controller;

import Model.Elf;
import Model.Human;
import Model.Orc;
import Model.Unit;

public class Species {
	
	public Unit create(int select) {
		if (select == 1) {
			return new Human();
		} else if (select == 2) {
			return new Orc();
		} else if (select == 3) {
			return new Elf();
		} else {
			return null;			
		}
	}
}
