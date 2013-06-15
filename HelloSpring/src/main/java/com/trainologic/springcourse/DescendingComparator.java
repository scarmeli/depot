package com.trainologic.springcourse;

import java.util.Comparator;

public class DescendingComparator<T> implements Comparator<T> {
	
	private Comparator<T> delegate;
	
	public DescendingComparator(Comparator<T> delegate) {
		this.delegate = delegate;
	}


	public int compare(T o1, T o2) {
		
		return -1 * (delegate.compare(o1, o2));
	}
	

}
