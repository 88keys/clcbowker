package com.clc.jonix;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;


public class EditionNumbers extends JonixComposite<EditionNumbers.EditionNumber>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8370273455497993307L;

	public static class EditionNumber implements Serializable
    {

		/**
		 * 
		 */
		private static final long serialVersionUID = 7832987857915003733L;
		public final String editionNumber;
		
		public EditionNumber (String editionNumber)
		{
			this.editionNumber = editionNumber;
		}
    }
	
	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
		if (resolver.onixTypeOf(o) == ONIX.EditionNumber)
        {
				String editionNumber = (String) JonixUtils.getProperty(o, "value");
				
				if(null != editionNumber)
				{
					add(new EditionNumber(editionNumber));
	                return this;
				}
                
        }

        return null;
	}
}
