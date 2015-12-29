package com.clc.jonix;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class MarketItemRecordNumbers extends JonixComposite<MarketItemRecordNumbers.MarketItemRecordNumber>
{
	
	public static class MarketItemRecordNumber implements Serializable
    {
		/**
		 * 
		 */
		private static final long serialVersionUID = 6660808125602220474L;
		public final String recordReference;
		
		public MarketItemRecordNumber (String recordReference)
		{
			this.recordReference = recordReference;
		}
    }
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6174773082247357344L;

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
		if (resolver.onixTypeOf(o) == ONIX.RecordReference)
        {
                String recordReference = (String) JonixUtils.getProperty(o, "value");

                add(new MarketItemRecordNumber(recordReference));
                return this;
        }

        return null;

	}

}
