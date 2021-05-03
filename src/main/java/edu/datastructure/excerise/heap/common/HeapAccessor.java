package edu.datastructure.excerise.heap.common;

public class HeapAccessor<T extends Number> {

	private Heap<T> heap = null;
	private int currentIndex = 0;
	
	public HeapAccessor(Heap<T> heap){
		this.heap = heap;
	}
	
	public void setCurrentIndex(int currentIndex){
		this.currentIndex = currentIndex;
	}
	
	public int getCurrentIndex() {
		return currentIndex;
	}

	public int getLeftChildIndex(int index){
		return (index * 2) + 1;
	}
	
	public int getParentIndex(int index){
		return (index-1)/2 ;
	}
	
	public int getRightChildIndex(int index){
		return (index * 2) + 2;
	}
	
	public boolean hasRoot(){
		return heap.getActualSize() != Constant.EMPTY_HEAP ? true : false;
	}
	
	public boolean hasLeftChild(){
		return getLeftChildIndex(currentIndex) <= heap.getActualSize() ? true : false;
	}
	
	public boolean hasParent(){
		return getParentIndex(currentIndex) >= 0 ? true : false;
	}
	
	public boolean hasRightChild(){
		return getRightChildIndex(currentIndex) <= heap.getActualSize()  ? true : false;
	}
	
	public T getRootElement(){
		return heap.getElement(0);
	}
	
	public T getElement(){
		return heap.getElement(currentIndex);
	}
	
	public T getElementByIndex(int index){
		return heap.getElement(index);
	}
	
	public T getParentElement(){
		return heap.getElement(getParentIndex(currentIndex));
	}
	
	public T getLeftChildElement(){
		return heap.getElement(getLeftChildIndex(currentIndex));
	}
	
	public T getRightChildElement(){
		return heap.getElement(getRightChildIndex(currentIndex));
	}
	
}
