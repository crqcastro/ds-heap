package edu.datastructure.excerise.heap.common;

import java.util.Arrays;

public class Heap<T extends Number> {

	private T data[] = null;
	private int totalSize = 0;
	private int actualSize = Constant.EMPTY_HEAP;
	
	public Heap(){
		data = (T[]) new Number[Constant.DEFUALT_HEAP_SIZE];
		totalSize = Constant.DEFUALT_HEAP_SIZE;
	}
	
	private boolean requireMoreSize(){
		return totalSize <= ((actualSize+1)*2);
	}
	
	private int computeTotalSize(){
		return totalSize + totalSize/2;
	}
	
	public void reSize(){
		if(requireMoreSize()){
			int newSize = computeTotalSize();
			data = Arrays.copyOf(data, newSize);
			totalSize+=newSize;
		}
	}
	
	public void addElement(T element){
		reSize();
		data[++actualSize] = element;
	}
	
	public void addElement(int index, T element){
		reSize();
		data[index] = element;
	}
	
	public T deleteElement(){
		T topElement = data[0];
		data[0] = data[actualSize];
		actualSize--;
		return topElement;
	}
	
	public T getElement(int index){
		return data[index];
	}

	public int getTotalSize() {
		return totalSize;
	}

	public int getActualSize() {
		return actualSize;
	}
	
	public boolean isHeapEmpty(){
		return actualSize == Constant.EMPTY_HEAP ? true : false;
	}
	
	public T[] getData(){
		return data;
	}
	
}
