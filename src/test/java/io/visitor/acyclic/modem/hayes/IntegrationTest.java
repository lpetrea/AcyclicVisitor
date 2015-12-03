package io.visitor.acyclic.modem.hayes;

import java.util.List;

import io.visitor.acyclic.modem.ModemVisit;
import io.visitor.acyclic.modem.config.SystemConfig;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static  java.util.Arrays.asList;


public class IntegrationTest {

	Hayes hayes = new Hayes();
	HayesUnixConfig hayesUnixConfig = new HayesUnixConfig();
	SystemConfig systemConfig = new SystemConfig();

	@Test
	public void testConfig() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		List<ModemVisit<?>> modemConfig = asList(new ModemVisit<Hayes>(hayes, hayesUnixConfig));
		
		systemConfig.config(modemConfig);
	
		assertEquals("&s1=4&D=3", Hayes.class.getDeclaredField("config").get(hayes));
	}
}
