package com.clc;

import java.util.List;

import org.jonix.JonixColumn;
import org.jonix.basic.BasicProduct;
import org.jonix.codelist.ContributorRoles;
import org.jonix.codelist.ProductIdTypes;
import org.jonix.codelist.SubjectSchemeIds;
import org.jonix.composite.ProductIdentifiers.ProductIdentifier;
import org.jonix.composite.Subjects.Subject;
import org.jonix.composite.Titles;
import org.jonix.composite.Contributors.Contributor;
import org.jonix.composite.Titles.Title;

import com.clc.jonix.MarketItemRecordNumbers.MarketItemRecordNumber;
import com.clc.jonix.NumberOfIllustrations.NumberOfIllustration;
import com.clc.jonix.Barcodes.Barcode;
import com.clc.jonix.EPubTypes.EPubType;
import com.clc.jonix.EditionTypeCodes.EditionTypeCode;
import com.clc.jonix.ProductFormDetails.ProductFormDetail;
import com.clc.jonix.ProductForms.ProductForm;
import com.clc.jonix.Serieses.Series;
import com.clc.jonix.WorkIdentifiers.WorkIdentifier;
import com.clc.jonix.RecordSourceNames.RecordSourceName;
import com.clc.jonix.EditionNumbers.EditionNumber;;

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
		
	},
	Serieses
	{

		@Override
		public int getRepetitions() {
			return 1;
		}

		@Override
		public String[] getSubColumnNames() {
			return new String[]
                    { "SeriesTitle", "SeriesISSN", "NumberWithinSeries" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (Series series : product.serieses)
            {
            	Titles titles = series.titles;
            	Title title = titles.get(0);
            	
            	String titleText = title.titleText;
            	fieldData[pos + 0] = titleText;
            	
                
                fieldData[pos + 1] = series.seriesISSN;
                fieldData[pos +2] = series.numberWithinSeries;
                if ((pos += 2) == fieldData.length)
                    break;
            }
            return pos > 0;
		}
		
	},
	EPubTypes
	{

		@Override
		public int getRepetitions() {
			return 1;
		}

		@Override
		public String[] getSubColumnNames() {
			return new String[]
                    { "EPubType" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (EPubType ePubType : product.ePubTypes)
            {
            	
            	fieldData[pos + 0] = ePubType.ePubType;

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
			return 1;
		}

		@Override
		public String[] getSubColumnNames() 
		{
			return new String[]
                    { "WorkIdType", "idTypeName", "idValue" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (WorkIdentifier workId : product.workIdentifiers)
            {
                    fieldData[pos + 0] = workId.workIdType.name();
                    fieldData[pos + 1] = workId.idTypeName;
                    fieldData[pos + 2] = workId.idValue;
                    if ((pos += 3) == fieldData.length)
                            break;
            }
            return pos > 0;
		}
		
	},
	Author
	{
		
		@Override
		public int getRepetitions() {
			return 1;
		}

		@Override
		public String[] getSubColumnNames() {
			return new String[]
                    { "Author1", "Author2", "Author3", "Author4","Author5" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			return extractContributors(fieldData, ContributorRoles.By_author, product);
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
            for (EditionTypeCode editionTypeCode : product.editionTypeCodes)
            {
                    fieldData[pos + 0] = editionTypeCode.editionTypeCode;
                    if ((pos += 1) == fieldData.length)
                            break;
            }
            return pos > 0;
		}
		
	},
	EditionNumbers
	{

		@Override
		public int getRepetitions() {
			return 1;
		}

		@Override
		public String[] getSubColumnNames() {
			return new String[]
                    { "EditionNumber" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (EditionNumber editionNumber : product.editionNumber)
            {
                    fieldData[pos + 0] = editionNumber.editionNumber;
                    if ((pos += 1) == fieldData.length)
                            break;
            }
            return pos > 0;
		}
		
	},
	NumberOfIllustrations
	{
		@Override
		public int getRepetitions() {
			return 1;
		}

		@Override
		public String[] getSubColumnNames() {
			return new String[]
                    { "NumberOfIllustrations" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			int pos = 0;
            for (NumberOfIllustration numOfIllustrations : product.numOfIll)
            {
                    fieldData[pos + 0] = numOfIllustrations.numOfIllustrations;
                    if ((pos += 1) == fieldData.length)
                            break;
            }
            return pos > 0;
		}
	},
	PublisherBISACSubjectCode
	{

		@Override
		public int getRepetitions() {
			return 3;
		}

		@Override
		public String[] getSubColumnNames() {
			return new String[]
                    { "PublisherBISACSubjectCode" };
		}

		@Override
		public boolean extractTo(String[] fieldData, BowkerProduct product) {
			return extractSubjects(fieldData, SubjectSchemeIds.Publishers_own_category_code, product);
		}
		
	};


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
	
	private static boolean extractContributors(String[] fieldData, ContributorRoles stdRole, BasicProduct product)
	{
		List<Contributor> contributors = product.findContributors(stdRole);
		int pos = 0;
		for (Contributor contributor : contributors)
		{
			String displayName = contributor.displayName();
			if (displayName == null)
				continue;
			fieldData[pos] = displayName;
			if (++pos == fieldData.length)
				break;
		}
		return pos > 0;
	}
	
	private static boolean extractSubjects(String[] fieldData, SubjectSchemeIds stdScheme, BasicProduct product)
	{
		List<Subject> subjects = product.findSubjects(stdScheme);
		int pos = 0;
		for (Subject subject : subjects)
		{
			fieldData[pos] = (subject.subjectCode != null) ? subject.subjectCode : subject.subjectHeadingText;
			if (++pos == fieldData.length)
				break;
		}
		return pos > 0;
	}
	

}
