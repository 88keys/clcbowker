package com.clc.jonix;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.codelist.WorkIdTypes;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class WorkIdentifiers extends JonixComposite<WorkIdentifiers.WorkIdentifier>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6282666706657300688L;

	public static class WorkIdentifier implements Serializable
    {

		/**
		 * 
		 */
		private static final long serialVersionUID = 4588149165523961576L;
		public final WorkIdTypes b201;
		public final String b233;
		public final String b244;
		
		public WorkIdentifier (WorkIdTypes b201, String b233, String b244)
		{
			this.b201 = b201;
			this.b233 = b233;
			this.b244 = b244;
		}
    }

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
		if (resolver.onixTypeOf(o) == ONIX.WorkIdentifier)
        {
			String b201 = (String) JonixUtils.getProperty(o, resolver.onixPropOf(ONIX.WorkIDType), "value");
            String b233 = (String) JonixUtils.getProperty(o, resolver.onixPropOf(ONIX.IDTypeName), "value");
            String b244 = (String) JonixUtils.getProperty(o, resolver.onixPropOf(ONIX.IDValue), "value");

            add(new WorkIdentifier(WorkIdTypes.fromCode(b201), b233, b244));
            return this;
				
        }
		
		return null;
	}
	
}
