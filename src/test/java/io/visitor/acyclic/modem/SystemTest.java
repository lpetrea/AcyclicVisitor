package io.visitor.acyclic.modem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import io.visitor.acyclic.Visitor;
import io.visitor.acyclic.modem.Modem;
import io.visitor.acyclic.modem.System;
import io.visitor.acyclic.modem.hayes.Hayes;
import io.visitor.acyclic.modem.hayes.HayesUnixConfig;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SystemTest {

	abstract class TestModem implements Modem<TestModem> {
		
	}

	@Mock TestModem modem;
	@Mock Visitor<TestModem> modemVisitor;
	
	@Test
	public void visit() {
		
		System.visit(modem, modemVisitor);
		
		verify(modem).accept(modemVisitor);
	}
}
