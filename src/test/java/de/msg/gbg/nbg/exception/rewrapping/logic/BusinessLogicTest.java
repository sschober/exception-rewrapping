package de.msg.gbg.nbg.exception.rewrapping.logic;
import org.junit.Test;

import de.msg.gbg.ngb.exception.rewrapping.logic.BusinessLogic;
import de.msg.gbg.ngb.exception.rewrapping.logic.BusinessLogicException;

public class BusinessLogicTest {

	BusinessLogic cut = new BusinessLogic();
	
	@Test(expected = BusinessLogicException.class)
	public void doSomethingThrowsBusinessLogicException() {
		cut.doSomething();
		// no assertion needed; expect exception
	}

	@Test(expected = BusinessLogicException.class)
	public void doAnotherThingThrowsBusinessLogicException() {
		cut.doAnotherThing();
		// no assertion needed; expect exception
	}

}
