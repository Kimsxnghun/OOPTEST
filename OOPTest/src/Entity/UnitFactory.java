package Entity;

public class UnitFactory {
	
	public enum UnitType{
		Human,
		Elf,
		Orc,
		Monster
	}
	
	public Unit getUnit(UnitType unitType) {
		Unit unit;
		switch(unitType) {
			case Human:
				unit = new Human();
				return unit;
			case Elf:
				unit = new Elf();
				return unit;
			case Orc:
				unit = new Orc();
				return unit;
			case Monster:
				unit = new Monster();
				return unit;
			default:
				return null;
		}
		
		
	}
}
