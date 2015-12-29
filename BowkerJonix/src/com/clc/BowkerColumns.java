package com.clc;

import org.jonix.JonixColumn;
import org.jonix.basic.BasicProduct;
import org.jonix.codelist.ProductIdTypes;
import org.jonix.composite.ProductIdentifiers.ProductIdentifier;

import com.clc.jonix.MarketItemRecordNumbers.MarketItemRecordNumber;
import com.clc.jonix.Barcodes.Barcode;
import com.clc.jonix.EditionTypeCodes.EditionTypeCode;
import com.clc.jonix.ProductFormDetails.ProductFormDetail;
import com.clc.jonix.ProductForms.ProductForm;
import com.clc.jonix.SeriesIdentifiers.SeriesIdentifier;
import com.clc.jonix.WorkIdentifiers.WorkIdentifier;
import com.clc.jonix.RecordSourceNames.RecordSourceName;

public enum BowkerColumns implements JonixColumn<BowkerProduct>
{

	MarketItemRecordNumber
	{
		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (MarketItemRecordNumber refname : product.recordReference)
            {
                    fieldData[pos + 0] = refname.recordReference;
                    if ((pos += 1) == fieldData.length)
                            break;
            }
            return pos > 0;

		}

		@Override
		public int getRepetitions() {
			
			return 1;
		}

		@Override
		public String[] getSubColumnNames() {
			
			return new String[]
                    { "MarketItemRecordNumber" };

		}
	},
	NotificationType
	{

		@Override
		public int getRepetitions() {
			// TODO Auto-generated method stub
			return 1;
		}

		@Override
		public String[] getSubColumnNames() {
			return new String[]
                    { "NotificationType" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (com.clc.jonix.NotificationTypes.NotificationType notificationType : product.notificationType)
            {
                    fieldData[pos + 0] = notificationType.notificationType;
                    if ((pos += 1) == fieldData.length)
                            break;
            }
            return pos > 0;
		}
		
	},
	RecordSourceType
	{

		@Override
		public int getRepetitions() {
			return 1;
		}

		@Override
		public String[] getSubColumnNames() {
			return new String[]
                    { "RecordSourceType" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (com.clc.jonix.RecordSourceTypes.RecordSourceType recordSourceType : product.recordSourceType)
            {
                    fieldData[pos + 0] = recordSourceType.recordSourceType;
                    if ((pos += 1) == fieldData.length)
                            break;
            }
            return pos > 0;
		}
		
	},
	RecordSourceName
	{

		@Override
		public int getRepetitions() {
			
			return 1;
		}

		@Override
		public String[] getSubColumnNames() {
			return new String[]
                    { "RecordSourceName" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (RecordSourceName recordSourceName : product.recordSourceName)
            {
                    fieldData[pos + 0] = recordSourceName.recordSourceName;
                    if ((pos += 1) == fieldData.length)
                            break;
            }
            return pos > 0;
		}
		
	},
	ProductIdentifiers
	{

		@Override
		public int getRepetitions() {
			return 1;
		}

		@Override
		public String[] getSubColumnNames() 
		{
			return new String[]
                    { "Proprietary", "IDTypeName", "ISBN10",  "GTIN13","UPC","ISMN10","DOI","LCCN","GTIN14","ISBN13","Legal_deposit_number","URN","OCLC_number","Copublishers_ISBN13","ISMN13","ISBNA","JP_ecode","OLCC_number"};
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) 
		{
			int pos = 0;
            for (ProductIdentifier prodId : product.productIdentifiers)
            {

        		if (prodId != null)
        		{
        			if(ProductIdTypes.Proprietary.equals(prodId.productIDType))
        			{
        				fieldData[pos + 0] = prodId.idValue;
        				fieldData[pos + 1] = prodId.idTypeName;
        				continue;
        			}
        			
        			else if(ProductIdTypes.ISBN10.equals(prodId.productIDType))
        			{
        				fieldData[pos + 2] = prodId.idValue;
        				continue;
        			}
        			
        			
        			else if(ProductIdTypes.GTIN13.equals(prodId.productIDType))
        			{
        				fieldData[pos + 3] = prodId.idValue;
        				continue;
        			}
        			
        			else if(ProductIdTypes.UPC.equals(prodId.productIDType))
        			{
        				fieldData[pos + 4] = prodId.idValue;
        				continue;
        			}
        			
        			else if(ProductIdTypes.ISMN10.equals(prodId.productIDType))
        			{
        				fieldData[pos + 5] = prodId.idValue;
        				continue;
        			}
        			
        			else if(ProductIdTypes.DOI.equals(prodId.productIDType))
        			{
        				fieldData[pos + 6] = prodId.idValue;
        				continue;
        			}
        			
        			else if(ProductIdTypes.LCCN.equals(prodId.productIDType))
        			{
        				fieldData[pos + 7] = prodId.idValue;
        				continue;
        			}
        			
        			else if(ProductIdTypes.GTIN14.equals(prodId.productIDType))
        			{
        				fieldData[pos + 8] = prodId.idValue;
        				continue;
        			}
        			
        			else if(ProductIdTypes.ISBN13.equals(prodId.productIDType))
        			{
        				fieldData[pos + 9] = prodId.idValue;
        				continue;
        			}
        			
        			else if(ProductIdTypes.Legal_deposit_number.equals(prodId.productIDType))
        			{
        				fieldData[pos + 10] = prodId.idValue;
        				continue;
        			}
        			
        			else if(ProductIdTypes.URN.equals(prodId.productIDType))
        			{
        				fieldData[pos + 11] = prodId.idValue;
        				continue;
        			}
        			
        			else if(ProductIdTypes.OCLC_number.equals(prodId.productIDType))
        			{
        				fieldData[pos + 12] = prodId.idValue;
        				continue;
        			}
        			
        			else if(ProductIdTypes.Copublishers_ISBN13.equals(prodId.productIDType))
        			{
        				fieldData[pos + 13] = prodId.idValue;
        				continue;
        			}
        			
        			else if(ProductIdTypes.ISMN13.equals(prodId.productIDType))
        			{
        				fieldData[pos + 14] = prodId.idValue;
        				continue;
        			}
        			
        			else if(ProductIdTypes.ISBNA.equals(prodId.productIDType))
        			{
        				fieldData[pos + 15] = prodId.idValue;
        				continue;
        			}
        			
        			else if(ProductIdTypes.JP_ecode.equals(prodId.productIDType))
        			{
        				fieldData[pos + 16] = prodId.idValue;
        				continue;
        			}
        			
        			else if(ProductIdTypes.OLCC_number.equals(prodId.productIDType))
        			{
        				fieldData[pos + 17] = prodId.idValue;
        				continue;
        			}

        			return true;
        		}
            	
        		if ((pos += 18) == fieldData.length)
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
                    { "ProductFormCode", "ProductFormName" };
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
			return 1;
		}

		@Override
		public String[] getSubColumnNames() {
			return new String[]
                    { "ProductFormCode" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) 
		{
			int pos = 0;
            for (ProductForm productForm : product.productForm)
            {
                    fieldData[pos + 0] = productForm.productFormCode;
//                    if(null != productForm.productFormName)
//                    {
//                    	fieldData[pos + 1] = productForm.productFormName.name();
//                    }
                    
                    if ((pos += 1) == fieldData.length)
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
		
	};
//	WorkIdentifiers
//	{
//
//		@Override
//		public int getRepetitions() {
//			return 3;
//		}
//
//		@Override
//		public String[] getSubColumnNames() 
//		{
//			return new String[]
//                    { "WorkIdType", "b233", "b244" };
//		}
//
//		@Override
//		public boolean extractTo(String[] fieldData, BowkerProduct product) {
//			int pos = 0;
//            for (WorkIdentifier workId : product.workIdentifiers)
//            {
//                    fieldData[pos + 0] = workId.b201.name();
//                    fieldData[pos + 1] = workId.b233;
//                    fieldData[pos + 2] = workId.b244;
//                    if ((pos += 3) == fieldData.length)
//                            break;
//            }
//            return pos > 0;
//		}
//		
//	},
//	EditionTypeCodes
//	{
//
//		@Override
//		public int getRepetitions() 
//		{
//			return 1;
//		}
//
//		@Override
//		public String[] getSubColumnNames() {
//			return new String[]
//                    { "EditionTypeCode" };
//		}
//
//		@Override
//		public boolean extractTo(String[] fieldData, BowkerProduct product) {
//			int pos = 0;
//            for (EditionTypeCode refname : product.editionTypeCodes)
//            {
//                    fieldData[pos + 0] = refname.editionTypeCode;
//                    if ((pos += 1) == fieldData.length)
//                            break;
//            }
//            return pos > 0;
//		}
//		
//	};
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

	private static boolean extractProductData(String[] fieldData, ProductIdTypes stdType, BasicProduct product)
	{
		ProductIdentifier prodId = product.findProductId(stdType);
		if (prodId != null)
		{
			fieldData[0] = prodId.idValue;
			return true;
		}
		return false;
	}
	

}
