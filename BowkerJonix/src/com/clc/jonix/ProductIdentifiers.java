package com.clc.jonix;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.codelist.ProductIdTypes;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class ProductIdentifiers  extends org.jonix.composite.ProductIdentifiers
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8382690964096745610L;

//	public static class ProductIdentifier implements Serializable
//    {
//
//		/**
//		 * 
//		 */
//		private static final long serialVersionUID = -6288979784271647282L;
//		//public final ProductIdTypes b221;
////		public final String isbn10;
////		public final String isbn13;
////		public final String doi;
////		public final String lccn;
//		//public final String b233;
//		//public final String b244;
//		
////		public ProductIdentifier (String isbn10, String isbn13, String doi, String lccn)
////		{
////			this.isbn10 = isbn10;
////			this.isbn13 = isbn13;
////			this.doi = doi;
////			this.lccn = lccn;
////			//this.b233 = b233;
////			//this.b244 = b244;
////		}
//    }

//	@Override
//	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver) {
//		if (resolver.onixTypeOf(o) == ONIX.ProductIdentifier)
//        {
//			String b221 = (String) JonixUtils.getProperty(o, resolver.onixPropOf(ONIX.ProductIDType), "value");
//            //String b233 = (String) JonixUtils.getProperty(o, resolver.onixPropOf(ONIX.IDTypeName), "value");
//            String b244 = (String) JonixUtils.getProperty(o, resolver.onixPropOf(ONIX.IDValue), "value");
//            String isbn10 = "";
//            String isbn13 = "";
//            String doi = "";
//            String lccn = "";
//            
//            if(ProductIdTypes.ISBN10.equals(ProductIdTypes.fromCode(b221)))
//            {
//            	isbn10 = b244;
//            }
//            
//            if(ProductIdTypes.ISBN13.equals(ProductIdTypes.fromCode(b221)))
//            {
//            	isbn13 = b244;
//            }
//            
//            if(ProductIdTypes.DOI.equals(ProductIdTypes.fromCode(b221)))
//            {
//            	doi = b244;
//            }
//            
//            if(ProductIdTypes.LCCN.equals(ProductIdTypes.fromCode(b221)))
//            {
//            	lccn = b244;
//            }
//            
//            add(new ProductIdentifier(isbn10, isbn13, doi, lccn));
//            return this;
//				
//        }
//		
//		return null;
//	}
}
