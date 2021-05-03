package edu.datastructure.excerise.heap.common;

import java.util.Comparator;

public class NumberComparator<T extends Number> implements Comparator<T>{

	public int compare(T source, T destination) {
		if(source instanceof Comparable && destination instanceof Comparable){
			return ((Comparable)source).compareTo(destination);
		}
		throw new UnsupportedOperationException();
	}

}
