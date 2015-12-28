package com.clc;

import org.jonix.basic.BasicProduct;
import org.jonix.resolve.JonixResolver;

import com.clc.jonix.A001s;
import com.clc.jonix.Barcodes;
import com.clc.jonix.EditionTypeCodes;
import com.clc.jonix.ProductFormDetails;
import com.clc.jonix.ProductForms;
import com.clc.jonix.ProductIdentifiers;
import com.clc.jonix.SeriesIdentifiers;
import com.clc.jonix.WorkIdentifiers;

public class BowkerProduct extends BasicProduct
{

	public BowkerProduct(JonixResolver resolver) 
	{
		super(resolver);

	}
	
	public final A001s a001 = new A001s();
//	public final B221s b221 = new B221s();
//	public final B244s b244 = new B244s();
	public final ProductIdentifiers prodIdent = new ProductIdentifiers();
	public final Barcodes barCode = new Barcodes();
	public final ProductForms productForm = new ProductForms();
	public final ProductFormDetails productFormDetails = new ProductFormDetails();
	//public final SeriesIdentifiers seriesIdentifiers = new SeriesIdentifiers();
	public final WorkIdentifiers workIdentifiers = new WorkIdentifiers();
	public final EditionTypeCodes editionTypeCodes = new EditionTypeCodes();
}
