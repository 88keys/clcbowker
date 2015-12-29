package com.clc.jonix;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class RecordSourceTypes extends JonixComposite<RecordSourceTypes.RecordSourceType>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 662771397188959707L;

	public static class RecordSourceType implements Serializable
    {

		/**
		 * 
		 */
		private static final long serialVersionUID = -8738184055487685656L;
		public final String recordSourceType;
		
		public RecordSourceType (String recordSourceType)
		{
			this.recordSourceType = recordSourceType;
		}
    }

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
		if (resolver.onixTypeOf(o) == ONIX.RecordSourceType)
        {
                String recordSourceType = (String) JonixUtils.getProperty(o, "value");

                add(new RecordSourceType(recordSourceType));
                return this;
        }

        return null;
	}
}
