package edu.datastructure.excerise.heap;

import edu.datastructure.excerise.heap.common.Heap;
import edu.datastructure.excerise.heap.common.HeapAccessor;
import edu.datastructure.excerise.heap.common.NumberComparator;

public abstract class HeapSort<T extends Number> {
    
	private Heap<T> heap = null;
	protected NumberComparator<Number> compareValue = new NumberComparator<Number>();
	
	public HeapSort(){
		heap = new Heap<T>();
	}
	
	abstract protected boolean requiredToSwap(T source, T destination);
	abstract protected boolean moveRightSide(T left, T right);
	
	public void push(T data) {
		heap.addElement(data);
		heapifyUp();
	}

	public T pop() {
		T data = heap.deleteElement();
		heapifyDown();
		return data;
	}
	
	private void swap(int fromIndex, int toIndex){
		T temp = heap.getElement(fromIndex);
		heap.addElement(fromIndex, heap.getElement(toIndex));
		heap.addElement(toIndex, temp);
	}
	
	private void heapifyUp(){
		
		HeapAccessor<T> accessor = new HeapAccessor<T>(heap);
		int currentIndex = heap.getActualSize();
		accessor.setCurrentIndex(currentIndex);
		
		while(accessor.hasParent()){
			T source = accessor.getParentElement();
			T destination = accessor.getElement();
			boolean flag = requiredToSwap(source, destination);
			if(flag){
				int parentIndex = accessor.getParentIndex(accessor.getCurrentIndex());
				swap(accessor.getCurrentIndex(), parentIndex);
				accessor.setCurrentIndex(parentIndex);
			}else{
				break;
			}
		}
	}
	
	private void heapifyDown(){
		
		HeapAccessor<T> accessor = new HeapAccessor<T>(heap);
		accessor.setCurrentIndex(0);
		
		while(accessor.hasLeftChild()){
			
			int directionIndex = accessor.getLeftChildIndex(accessor.getCurrentIndex());
			if(accessor.hasRightChild()){
				boolean moveRight = moveRightSide(accessor.getLeftChildElement(), accessor.getRightChildElement());
				if(moveRight){
					directionIndex = accessor.getRightChildIndex(accessor.getCurrentIndex());
				}
			}
			T source = accessor.getElement();
			T destination = accessor.getElementByIndex(directionIndex);
			boolean flag = requiredToSwap(source, destination);
			if(flag){
				swap(accessor.getCurrentIndex(), directionIndex);
				accessor.setCurrentIndex(directionIndex);
			}else{
				break;
			}
		}
	}
}
