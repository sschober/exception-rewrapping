package de.msg.gbg.ngb.exception.rewrapping.logic;

public aspect ExceptionRewrapping {

	after() throwing(Throwable t) : execution(* BusinessLogic.*(..)){
		throw new BusinessLogicException(t);
	}
}
