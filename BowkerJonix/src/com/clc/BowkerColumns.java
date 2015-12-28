package com.clc;

import org.jonix.JonixColumn;

import com.clc.jonix.A001s.A001;
import com.clc.jonix.Barcodes.Barcode;
import com.clc.jonix.EditionTypeCodes.EditionTypeCode;
import com.clc.jonix.ProductFormDetails.ProductFormDetail;
import com.clc.jonix.ProductForms.ProductForm;
import com.clc.jonix.ProductIdentifiers.ProductIdentifier;
import com.clc.jonix.SeriesIdentifiers.SeriesIdentifier;
import com.clc.jonix.WorkIdentifiers.WorkIdentifier;

public enum BowkerColumns implements JonixColumn<BowkerProduct>
{
	A001s
	{
		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (A001 refname : product.a001)
            {
                    fieldData[pos + 0] = refname.recordReference;
                    if ((pos += 1) == fieldData.length)
                            break;
            }
            return pos > 0;

		}

		@Override
		public int getRepetitions() {
			
			return 2;
		}

		@Override
		public String[] getSubColumnNames() {
			
			return new String[]
                    { "MarketItemRecordNumber" };

		}
	},
	ProductIdentifiers
	{

		@Override
		public int getRepetitions() {
			return 3;
		}

		@Override
		public String[] getSubColumnNames() 
		{
			return new String[]
                    { "ISBN10", "ISBN13", "DOI", "LCCN" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (ProductIdentifier prodId : product.prodIdent)
            {
                    //fieldData[pos + 0] = prodId.b221.name();
                    //fieldData[pos + 0] = prodId.b233;
            		
                    fieldData[pos + 0] = prodId.isbn10;
                    fieldData[pos + 1] = prodId.isbn13;
                    fieldData[pos + 2] = prodId.doi;
                    fieldData[pos + 3] = prodId.lccn;
                    if ((pos += 4) == fieldData.length)
                            break;
            }
            return pos > 0;
		}
		
	},
	BarCodes
	{
		@Override
		public int getRepetitions() {
			return 1;
		}

		@Override
		public String[] getSubColumnNames() 
		{
			return new String[]
                    { "ProductFormCode", "ProductgFormName" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (Barcode barcode : product.barCode)
            {
                    fieldData[pos + 0] = barcode.value;

                    if ((pos += 1) == fieldData.length)
                            break;
            }
            return pos > 0;
		}
	}, 
	ProductForms
	{

		@Override
		public int getRepetitions() {
			return 2;
		}

		@Override
		public String[] getSubColumnNames() {
			return new String[]
                    { "ProductFormCode", "ProductFormName" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) 
		{
			int pos = 0;
            for (ProductForm productForm : product.productForm)
            {
                    fieldData[pos + 0] = productForm.productFormCode;
                    if(null != productForm.productFormName)
                    {
                    	fieldData[pos + 1] = productForm.productFormName.name();
                    }
                    
                    if ((pos += 2) == fieldData.length)
                            break;
            }
            return pos > 0;
		}
		
	},
	ProductFormDetails
	{

		@Override
		public int getRepetitions() {
			return 1;
		}

		@Override
		public String[] getSubColumnNames() {
			return new String[]
                    { "ProductFormDetail" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (ProductFormDetail productForm : product.productFormDetails)
            {
                    fieldData[pos + 0] = productForm.productFormDetailCode;
                    
                    if ((pos += 1) == fieldData.length)
                            break;
            }
            return pos > 0;
		}
		
	},
	WorkIdentifiers
	{

		@Override
		public int getRepetitions() {
			return 3;
		}

		@Override
		public String[] getSubColumnNames() 
		{
			return new String[]
                    { "WorkIdType", "b233", "b244" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (WorkIdentifier workId : product.workIdentifiers)
            {
                    fieldData[pos + 0] = workId.b201.name();
                    fieldData[pos + 1] = workId.b233;
                    fieldData[pos + 2] = workId.b244;
                    if ((pos += 3) == fieldData.length)
                            break;
            }
            return pos > 0;
		}
		
	},
	EditionTypeCodes
	{

		@Override
		public int getRepetitions() 
		{
			return 1;
		}

		@Override
		public String[] getSubColumnNames() {
			return new String[]
                    { "EditionTypeCode" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (EditionTypeCode refname : product.editionTypeCodes)
            {
                    fieldData[pos + 0] = refname.editionTypeCode;
                    if ((pos += 1) == fieldData.length)
                            break;
            }
            return pos > 0;
		}
		
	};
//	SeriesIdentifiers
//	{
//
//		@Override
//		public int getRepetitions() {
//			return 3;
//		}
//
//		@Override
//		public String[] getSubColumnNames() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public boolean extractTo(String[] fieldData, BowkerProduct product) {
//			int pos = 0;
//            for (SeriesIdentifier seriesIdentifier : product.seriesIdentifiers)
//            {
//                    fieldData[pos + 0] = seriesIdentifier.b233;
//                    fieldData[pos + 0] = seriesIdentifier.b244;
//                    fieldData[pos + 0] = seriesIdentifier.b273;
//                    if ((pos += 1) == fieldData.length)
//                            break;
//            }
//            return pos > 0;
//		}
//		
//	};


	

}
