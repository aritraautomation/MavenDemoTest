package org.qa.seleniumDemo;

import org.testng.annotations.Factory;

public class FactoryTestDemo1 {
	@Factory
	public Object[] getFactory(){
		return new Object[]{
			new FactoryDemo("one"),
			new FactoryDemo("two")
		};
	}
}
