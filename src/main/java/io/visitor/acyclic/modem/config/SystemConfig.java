package io.visitor.acyclic.modem.config;

import java.util.List;

import io.visitor.acyclic.modem.ModemVisit;

public class SystemConfig {
	
	public void config(List<ModemVisit<?>> modemConfiguration) {
		
		modemConfiguration.stream().forEach(ModemVisit::perform);
	}
}