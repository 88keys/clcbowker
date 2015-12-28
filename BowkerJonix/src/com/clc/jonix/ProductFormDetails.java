package com.clc.jonix;

import java.io.Serializable;

import org.editeur.onix.v21.shorts.List78;
import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class ProductFormDetails extends JonixComposite<ProductFormDetails.ProductFormDetail>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1181903779230103111L;

	public static class ProductFormDetail implements Serializable
    {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1960456133887997894L;
		public final String productFormDetailCode;
		
		public ProductFormDetail (String productFormDetailCode)
		{
			this.productFormDetailCode = productFormDetailCode;
		}
    }

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
		if (resolver.onixTypeOf(o) == ONIX.ProductFormDetail)
        {
			List78 detailCode = (List78) JonixUtils.getProperty(o, "value");
            if(null != detailCode)
            {
            	add(new ProductFormDetail(detailCode.value()));
                return this;
            }
            
        }

        return null;
	}
}
