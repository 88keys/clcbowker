package com.clc.jonix;

import java.io.Serializable;

import org.jonix.JonixComposite;
import org.jonix.JonixConsumer;
import org.jonix.JonixUtils;
import org.jonix.composite.Contributors;
import org.jonix.composite.SeriesIdentifiers;
import org.jonix.composite.Titles;
import org.jonix.resolve.JonixResolver;
import org.jonix.resolve.ONIX;

public class Serieses extends JonixComposite<Serieses.Series>
{

	/**
	 * Temporary setup until I can figure out how to set volumes when extending the Jonix Serieses class.
	 */
	private static final long serialVersionUID = -3306579943289380409L;
	
	
	
	public static class Series implements Serializable
	{
		
		private static final long serialVersionUID = 4119366773629153661L;
		
		public String titleOfSeries;
		public String seriesISSN;
		public SeriesIdentifiers seriesIdentifiers = new SeriesIdentifiers();
		public Titles titles = new Titles();
		public Contributors contributors = new Contributors();
		public String numberWithinSeries;

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder();
			for (SeriesIdentifiers.SeriesIdentifier seriesIdentifier : seriesIdentifiers)
				sb.append("\n    ").append(seriesIdentifier.toString());
			for (Titles.Title title : titles)
				sb.append("\n    ").append(title.toString());
			for (Contributors.Contributor contributor : contributors)
				sb.append("\n    ").append(contributor.toString());
			return String.format("Series: %s (%s) %s", titleOfSeries, seriesISSN, sb.toString());
		}
	}
	private transient Series activeItem;

	@Override
	public JonixConsumer consume(Object o, Object parent, Object grandParent, JonixResolver resolver)
	{
		if (resolver.onixTypeOf(o) == ONIX.Series)
		{
			add(activeItem = new Series());
			return this;
		}
		
		if (resolver.onixTypeOf(parent) == ONIX.Series)
		{
			switch (resolver.onixTypeOf(o))
			{
				case TitleOfSeries:
					activeItem.titleOfSeries = JonixUtils.getValueAsStr(o);
					break;
					
				case SeriesISSN:
					activeItem.seriesISSN = JonixUtils.getValueAsStr(o);
					break;
					
				case SeriesIdentifier:
					return activeItem.seriesIdentifiers.consume(o, parent, grandParent, resolver);
					
				case Title:
					return activeItem.titles.consume(o, parent, grandParent, resolver);
					
				case Contributor:
					return activeItem.contributors.consume(o, parent, grandParent, resolver);
					
				case NumberWithinSeries:
					activeItem.numberWithinSeries = JonixUtils.getValueAsStr(o);
					break;
					
				default:
					break;
			}
		}
		
		return null;
	}
}
