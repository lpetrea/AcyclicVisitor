package io.visitor.acyclic;

import static org.mockito.Mockito.*;
import io.visitor.acyclic.Visitee;
import io.visitor.acyclic.Visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class VisiteeTest {

	class TestVisitee implements Visitee<TestVisitee> {
	}
	
	@Mock Visitor<TestVisitee> testVisitor;
	
	@Test
	public void testAccept() throws Exception {
		
		TestVisitee testVisitee= new TestVisitee();
		
		testVisitee.accept(testVisitor);
		
		verify(testVisitor).visit(testVisitee);
	}
}
