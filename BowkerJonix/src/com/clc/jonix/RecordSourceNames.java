package com.clc.jonix;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class RecordSourceNames extends JonixComposite<RecordSourceNames.RecordSourceName>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6879011957876203892L;

	public static class RecordSourceName implements Serializable
    {

		/**
		 * 
		 */
		private static final long serialVersionUID = 3084544622963341974L;
		public final String recordSourceName;
		
		public RecordSourceName (String recordSourceName)
		{
			this.recordSourceName = recordSourceName;
		}
    }

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
		if (resolver.onixTypeOf(o) == ONIX.RecordSourceName)
        {
                String recordSourceName = (String) JonixUtils.getProperty(o, "value");

                add(new RecordSourceName(recordSourceName));
                return this;
        }

        return null;
	}
}
