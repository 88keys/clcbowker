package com.clc;

import java.io.PrintStream;
import java.util.List;

import org.jonix.Jonix;
import org.jonix.JonixColumn;
import org.jonix.JonixPackages;
import org.jonix.basic.BasicColumn;
import org.jonix.basic.BasicFactory;
import org.jonix.basic.BasicHeader;
import org.jonix.basic.BasicProduct;
import org.jonix.export.JonixDumpExporter;
import org.jonix.export.JonixInMemExporter;
import org.jonix.export.JonixTabDelimitedExporter;
import org.jonix.export.JonixUniqueExporter;

public class Bowker
{
	
	public static void main(String[] args) 
	{
		
		args = new String[2];
		
		// Temp variables For Testing Purposes.
		args[0] = "C:\\Users\\Jonner\\Documents\\jonix\\onixfiles\\ConnEdu_USA-20151212_1.xml";

		args[1] = "bowkerTabDelFile.txt";
		

		if (args.length < 2 || args.length > 3)
		{
			System.out.println("Usage:");
			System.out.println("    java -jar bowker-0.1.jar <input-location> <output-file> <onix-version>");
			System.out.println("");
			System.out.println("<input-location> is an ONIX file-name, or a folder containing ONIX files with xml extension");
			System.out.println("<output-file> is the name of the tab-delimited output file");
			System.out.println("<onix-version> optional. can be: v21r (default), v21s, v30r, v30s");
			System.out.println("");
			return;
		}
		
		
		try
		{
			String inputFile = args[0];
			String outputFile = args[1];
			
			JonixPackages onixVersion = JonixPackages.v21_Short;
			if (args.length == 3)
			{
				String onixVersionArg = args[2];
				if (onixVersionArg.equalsIgnoreCase("v21r"))
					onixVersion = JonixPackages.v21_Reference;
				else if (onixVersionArg.equalsIgnoreCase("v21s"))
					onixVersion = JonixPackages.v21_Short;
				else if (onixVersionArg.equalsIgnoreCase("v30r"))
					onixVersion = JonixPackages.v30_Reference;
				else if (onixVersionArg.equalsIgnoreCase("v30s"))
					onixVersion = JonixPackages.v30_Short;
				else
				{
					System.out.println("Illegal onix version: " + onixVersionArg);
					return;
				}
			}

			PrintStream out = new PrintStream(outputFile);

			JonixTabDelimitedExporter<BasicHeader, BowkerProduct> exporter = createBasicTabDelimitedExporter(out, null);
			
			 exporter.setColumns((JonixColumn<BowkerProduct>[]) new JonixColumn<?>[]
		                { BowkerColumns.MarketItemRecordNumber,
		                BowkerColumns.NotificationType,
		                BowkerColumns.RecordSourceType,
		                BowkerColumns.RecordSourceName,
		        	BowkerColumns.ProductIdentifiers,
		        	BowkerColumns.BarCodes,
		        	BowkerColumns.ProductForms,
		        	BowkerColumns.ProductFormDetails,
//		        	BasicColumn.ISBN13, 
		        	BowkerColumns.Serieses,
//		        	BasicColumn.SeriesTitle,
		        	BowkerColumns.EPubTypes,
		        	BasicColumn.Title, 
		        	BowkerColumns.WorkIdentifiers,
		        	BowkerColumns.Author,
		        	BowkerColumns.EditionTypeCodes,
		        	BowkerColumns.EditionNumbers,
		        	BasicColumn.Language,
		        	BasicColumn.NumOfPages,
		        	BowkerColumns.NumberOfIllustrations,
		        	BasicColumn.BISAC,
		        	BasicColumn.BIC,
		        	BowkerColumns.PublisherBISACSubjectCode}); 
//		        	BasicColumn.Editor, 


//		        	BasicColumn.Publisher, 
//		        	BasicColumn.PublicationDate, 

//		        	BasicColumn.Dewey, 
 

//		        	BasicColumn.Keywords, 
//		        	BasicColumn.PriceAmount, 
//		        	BasicColumn.SalesAllowedIn, 
//		        	BasicColumn.SalesBannedIn, 
//		        	BasicColumn.Description, 
//		        	BasicColumn.ShortDescription});
//		                });
			exporter.scanFolder(onixVersion, inputFile, ".xml", "ISO-8859-1");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static JonixTabDelimitedExporter<BasicHeader, BowkerProduct> createBasicTabDelimitedExporter(PrintStream out, PrintStream log)
	{
		return new JonixTabDelimitedExporter<BasicHeader, BowkerProduct>(new BowkerFactory(), out, log);
	}
	
	
}
