package edu.datastructure.excerise.heap;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class MaxHeapTest {

	@Test
	public void testIntData(){
		int[] data = {4,8,5,1,3,0};
		HeapSort<Integer> sort = new MaxHeapSort<Integer>();
		for(int i=0; i<data.length;i++){
			sort.push(data[i]);
		}
		
		Assert.assertEquals(8, sort.pop().intValue());
		Assert.assertEquals(5, sort.pop().intValue());
		Assert.assertEquals(4, sort.pop().intValue());
		Assert.assertEquals(3, sort.pop().intValue());
		Assert.assertEquals(1, sort.pop().intValue());
		Assert.assertEquals(0, sort.pop().intValue());
	}
	
	@Test
	public void testIntDataWithDuplicate(){
		int[] data = {4,8,5,1,3,4};
		HeapSort<Integer> sort = new MaxHeapSort<Integer>();
		for(int i=0; i<data.length;i++){
			sort.push(data[i]);
		}
		
		Assert.assertEquals(8, sort.pop().intValue());
		Assert.assertEquals(5, sort.pop().intValue());
		Assert.assertEquals(4, sort.pop().intValue());
		Assert.assertEquals(4, sort.pop().intValue());
		Assert.assertEquals(3, sort.pop().intValue());
		Assert.assertEquals(1, sort.pop().intValue());
	}
	
	@Test
	public void testLongData(){
		long[] data = {4,8,5,1,3,0};
		HeapSort<Long> sort = new MaxHeapSort<Long>();
		for(int i=0; i<data.length;i++){
			sort.push(data[i]);
		}
		
		Assert.assertEquals(8L, sort.pop().longValue());
		Assert.assertEquals(5L, sort.pop().longValue());
		Assert.assertEquals(4L, sort.pop().longValue());
		Assert.assertEquals(3L, sort.pop().longValue());
		Assert.assertEquals(1L, sort.pop().longValue());
		Assert.assertEquals(0L, sort.pop().longValue());
	}
	
	@Test
	public void testBigDecimalData(){
		BigDecimal[] data = {new BigDecimal(4),new BigDecimal(8),new BigDecimal(5),new BigDecimal(1),new BigDecimal(3)};
		HeapSort<BigDecimal> sort = new MaxHeapSort<BigDecimal>();
		for(int i=0; i<data.length;i++){
			sort.push(data[i]);
		}

		Assert.assertEquals(new BigDecimal(8), sort.pop());
		Assert.assertEquals(new BigDecimal(5), sort.pop());
		Assert.assertEquals(new BigDecimal(4), sort.pop());
		Assert.assertEquals(new BigDecimal(3), sort.pop());
		Assert.assertEquals(new BigDecimal(1), sort.pop());
	}
	
}
