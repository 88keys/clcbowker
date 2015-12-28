package com.clc;

import org.jonix.JonixParser.JonixFactory;
import org.jonix.basic.BasicHeader;
import org.jonix.resolve.JonixResolver;

public class BowkerFactory implements JonixFactory<BasicHeader, BowkerProduct>
{

	@Override
	public BasicHeader newHeaderProcessor(JonixResolver resolver) {
		return new BasicHeader(resolver);
	}

	@Override
	public BowkerProduct newProductProcessor(JonixResolver resolver) {
		return new BowkerProduct(resolver);
	}

}
