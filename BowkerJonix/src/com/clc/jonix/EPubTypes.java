package com.clc.jonix;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class EPubTypes extends JonixComposite<EPubTypes.EPubType>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8606710720468766734L;

	public static class EPubType implements Serializable
    {

		/**
		 * 
		 */
		private static final long serialVersionUID = 6007223335857176181L;
		public final String ePubType;
		
		public EPubType (String ePubType)
		{
			this.ePubType = ePubType;
		}
    }

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
		if (resolver.onixTypeOf(o) == ONIX.EpubType)
        {
                String ePubType = (String) JonixUtils.getProperty(o, "value");

                add(new EPubType(ePubType));
                return this;
        }

        return null;
	}
}
