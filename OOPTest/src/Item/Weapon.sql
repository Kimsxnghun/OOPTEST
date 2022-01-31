create table Weapon(
	type INT NOT NULL
	,name VARCHAR(40) NOT NULL PRIMARY KEY
	,unit VARCHAR(10) NOT NULL
	,dmg INT NOT NULL
	,asp FLOAT NOT NULL
);

insert into Weapon() values(0,'Short Sword', 'Human', 5, 0);
insert into Weapon() values(0,'Long Sword', 'Human', 10, 0);

insert into Weapon() values(1,'Short Bow','Elf', 0, 0.05);
insert into Weapon() values(1,'Long Bow','Elf', 0, 0.1);

insert into Weapon() values(2,'Short Axe','Orc', 10, -0.05);
insert into Weapon() values(2,'Iron Hammer','Orc', 20, -0.1);