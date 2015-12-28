package com.clc.jonix;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class ProductForms extends JonixComposite<ProductForms.ProductForm>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1822129636722406624L;

	public static class ProductForm implements Serializable
    {

		/**
		 * 
		 */
		private static final long serialVersionUID = -1546966613478520753L;
		public final org.jonix.codelist.ProductForms productFormName;
		public final String productFormCode;
		
		public ProductForm (String productFormCode, org.jonix.codelist.ProductForms productFormName)
		{
			this.productFormCode = productFormCode;
			this.productFormName = productFormName;
		}
    }

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
		if (resolver.onixTypeOf(o) == ONIX.ProductForm)
        {
                String code = (String) JonixUtils.getProperty(o, "value");
                
                add(new ProductForm(code, org.jonix.codelist.ProductForms.fromCode(code)));
                return this;
        }

        return null;
	}
}
