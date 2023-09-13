package com.ancile.DemoJunit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	
	@Test
	public void assumptionTrueTest() {
		Assumptions.assumeTrue(true);
	}

}
