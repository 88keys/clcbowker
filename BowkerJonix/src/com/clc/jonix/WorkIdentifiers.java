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
		public final WorkIdTypes workIdType;
		public final String idTypeName;
		public final String idValue;
		
		public WorkIdentifier (WorkIdTypes workIdType, String idTypeName, String idValue)
		{
			this.workIdType = workIdType;
			this.idTypeName = idTypeName;
			this.idValue = idValue;
		}
    }

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
		if (resolver.onixTypeOf(o) == ONIX.WorkIdentifier)
        {
			String workIdType = (String) JonixUtils.getProperty(o, resolver.onixPropOf(ONIX.WorkIDType), "value");
            String idTypeName = (String) JonixUtils.getProperty(o, resolver.onixPropOf(ONIX.IDTypeName), "value");
            String idValue = (String) JonixUtils.getProperty(o, resolver.onixPropOf(ONIX.IDValue), "value");

            add(new WorkIdentifier(WorkIdTypes.fromCode(workIdType), idTypeName, idValue));
            return this;
				
        }
		
		return null;
	}
	
}
