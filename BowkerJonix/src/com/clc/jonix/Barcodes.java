package com.clc.jonix;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class Barcodes extends JonixComposite<Barcodes.Barcode>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1413828848926090221L;

	public static class Barcode implements Serializable
    {

		/**
		 * 
		 */
		private static final long serialVersionUID = -1624575394828378117L;
		public final String value;
		
		public Barcode (String value)
		{
			this.value = value;
		}
    }

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
		if (resolver.onixTypeOf(o) == ONIX.Barcode)
        {
                String value = (String) JonixUtils.getProperty(o, "value");

                add(new Barcode(value));
                return this;
        }

        return null;

	}
}
