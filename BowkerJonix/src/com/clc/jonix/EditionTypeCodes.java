package com.clc.jonix;

import java.io.Serializable;

import org.editeur.onix.v21.shorts.List21;
import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class EditionTypeCodes extends JonixComposite<EditionTypeCodes.EditionTypeCode>
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1227804519876883510L;

	public static class EditionTypeCode implements Serializable
    {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1552011630795977377L;
		public final String editionTypeCode;
		
		public EditionTypeCode (String editionTypeCode)
		{
			this.editionTypeCode = editionTypeCode;
		}
    }

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
		if (resolver.onixTypeOf(o) == ONIX.EditionTypeCode)
        {
				List21 editionTypeCode = (List21) JonixUtils.getProperty(o, "value");
				
				if(null != editionTypeCode)
				{
					add(new EditionTypeCode(editionTypeCode.value()));
	                return this;
				}
                
        }

        return null;
	}
}
