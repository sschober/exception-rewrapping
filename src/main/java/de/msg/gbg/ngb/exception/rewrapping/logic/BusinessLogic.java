package de.msg.gbg.ngb.exception.rewrapping.logic;

import de.msg.gbg.ngb.exception.rewrapping.db.DataAccessException1;
import de.msg.gbg.ngb.exception.rewrapping.db.DataAccessException2;

public class BusinessLogic {

	public void doSomething() {
		throw new DataAccessException1();
	}
	
	public void doAnotherThing() {
		throw new DataAccessException2();
	}
}
