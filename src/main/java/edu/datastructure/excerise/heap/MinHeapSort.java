package edu.datastructure.excerise.heap;

public class MinHeapSort<T extends Number> extends HeapSort<T>{
	
	
	@Override
	public boolean requiredToSwap(T source, T destination) {
		Number sourceNum = (Number) source;
		Number destinationNum = (Number) destination;
		
		if(compareValue.compare(sourceNum, destinationNum) == 1){
			return true;
		}
		return false;
	}

	@Override
	public boolean moveRightSide(T left, T right) {
		Number sourceNum = (Number) left;
		Number destinationNum = (Number) right;
		
		if(compareValue.compare(sourceNum, destinationNum) == 1){
			return true;
		}
		return false;
	}
}
