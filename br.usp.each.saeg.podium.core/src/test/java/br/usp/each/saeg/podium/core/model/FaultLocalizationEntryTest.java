package br.usp.each.saeg.podium.core.model;

import org.junit.Assert;
import org.junit.Test;

import br.usp.each.saeg.podium.core.model.FaultLocalizationEntry;

public class FaultLocalizationEntryTest {

	@Test
	public void findTestClasses() throws ClassNotFoundException{
		FaultLocalizationEntry entry = new FaultLocalizationEntry();
		Assert.assertNotNull(entry);
	}
	
}