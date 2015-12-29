package com.clc.jonix;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class NotificationTypes extends JonixComposite<NotificationTypes.NotificationType>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2577428746381805303L;

	public static class NotificationType implements Serializable
    {

		/**
		 * 
		 */
		private static final long serialVersionUID = -8900445572174417736L;
		public final String notificationType;
		
		public NotificationType (String notificationType)
		{
			this.notificationType = notificationType;
		}
    }

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
		if (resolver.onixTypeOf(o) == ONIX.NotificationType)
        {
                String notificationType = (String) JonixUtils.getProperty(o, "value");

                add(new NotificationType(notificationType));
                return this;
        }

        return null;
	}
}
