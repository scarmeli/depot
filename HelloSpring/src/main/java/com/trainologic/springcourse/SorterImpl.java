package com.trainologic.springcourse;

import java.util.Arrays;
import java.util.Comparator;

public class SorterImpl<T> {
	
	private Comparator<T> comparator;
	
	public SorterImpl(Comparator<T> comparator) {
		super();
		this.comparator = comparator;
	}

	public T[] sort(T... items){
		Arrays.sort(items, comparator);
		return items;
	}

}
