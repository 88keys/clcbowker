package com.clc.jonix;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;


public class SeriesIdentifiers extends JonixComposite<SeriesIdentifiers.SeriesIdentifier> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5624547614318306660L;

	public static class SeriesIdentifier implements Serializable
    {

		/**
		 * 
		 */
		private static final long serialVersionUID = 7072151630413572949L;
		public final String seriesIDType;
		public final String b233;
		public final String b244;
		
		public SeriesIdentifier (String seriesIDType, String b233, String b244)
		{
			this.seriesIDType = seriesIDType;
			this.b233 = b233;
			this.b244 = b244;
		}
    }

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
		if (resolver.onixTypeOf(o) == ONIX.SeriesIdentifier)
        {
			String seriesIDType = (String) JonixUtils.getProperty(o, resolver.onixPropOf(ONIX.SeriesIDType), "value");
            String b233 = (String) JonixUtils.getProperty(o, resolver.onixPropOf(ONIX.IDTypeName), "value");
            String b244 = (String) JonixUtils.getProperty(o, resolver.onixPropOf(ONIX.IDValue), "value");

            add(new SeriesIdentifier(seriesIDType, b233, b244));
            return this;
				
        }
		
		return null;
	}
}
