package io.visitor.acyclic.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import io.visitor.acyclic.Visitee;
import io.visitor.acyclic.Visitor;
import io.visitor.acyclic.util.Visit;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class VisitTest {

	class TestVisitee implements Visitee<TestVisitee> {
	}
	
	@Mock TestVisitee  visitee;
	@Mock Visitor<TestVisitee> visitor;
	
	@Test
	public void perform() {
		
		Visit<TestVisitee> visit = new Visit<>(visitee, visitor);
		
		visit.perform();
		
		verify(visitee).accept(visitor);
	}
}
