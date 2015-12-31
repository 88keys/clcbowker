package com.clc.jonix;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class NumberOfIllustrations extends JonixComposite<NumberOfIllustrations.NumberOfIllustration> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5625131682017022529L;

	public static class NumberOfIllustration implements Serializable
    {

		/**
		 * 
		 */
		private static final long serialVersionUID = -4387955623106925784L;
		public final String numOfIllustrations;
		
		public NumberOfIllustration (String numOfIllustrations)
		{
			this.numOfIllustrations = numOfIllustrations;
		}
    }
	
	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
		if (resolver.onixTypeOf(o) == ONIX.NumberOfIllustrations)
        {
				String numberOfIllustrations = (String) JonixUtils.getProperty(o, "value");
				
				if(null != numberOfIllustrations)
				{
					add(new NumberOfIllustration(numberOfIllustrations));
	                return this;
				}
                
        }

        return null;
	}
}
