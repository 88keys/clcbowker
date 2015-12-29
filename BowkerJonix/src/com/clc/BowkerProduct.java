package com.clc;

import org.jonix.basic.BasicProduct;
import org.jonix.resolve.JonixResolver;

import com.clc.jonix.MarketItemRecordNumbers;
import com.clc.jonix.NotificationTypes;
import com.clc.jonix.Barcodes;
import com.clc.jonix.EditionTypeCodes;
import com.clc.jonix.ProductFormDetails;
import com.clc.jonix.ProductForms;
import com.clc.jonix.ProductIdentifiers;
import com.clc.jonix.RecordSourceNames;
import com.clc.jonix.RecordSourceTypes;
import com.clc.jonix.SeriesIdentifiers;
import com.clc.jonix.WorkIdentifiers;

public class BowkerProduct extends BasicProduct
{

	public BowkerProduct(JonixResolver resolver) 
	{
		super(resolver);

	}
	
	public final MarketItemRecordNumbers recordReference = new MarketItemRecordNumbers();
	public final NotificationTypes notificationType = new NotificationTypes();
	public final RecordSourceTypes recordSourceType = new RecordSourceTypes();
	public final RecordSourceNames recordSourceName = new RecordSourceNames();
	//public final ProductIdentifiers prodIdent = new ProductIdentifiers();
	public final Barcodes barCode = new Barcodes();
	public final ProductForms productForm = new ProductForms();
//	public final B221s b221 = new B221s();
//	public final B244s b244 = new B244s();


	//public final ProductFormDetails productFormDetails = new ProductFormDetails();
	//public final SeriesIdentifiers seriesIdentifiers = new SeriesIdentifiers();
	//public final WorkIdentifiers workIdentifiers = new WorkIdentifiers();
	//public final EditionTypeCodes editionTypeCodes = new EditionTypeCodes();
}
