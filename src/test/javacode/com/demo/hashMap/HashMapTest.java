package com.demo.hashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class HashMapTest {
	MyHashMap<String,Integer> map;

	@Before
	public void setUp() throws Exception {
		map=new MyHashMap<String,Integer>();
	}
    
	/*@Test
	public void shouldReturnDefaultArraySizeSixtin(){
	    MyHashMap map=new MyHashMap();
	    assertEquals(16, map.size());
	}
	
	@Test
	public void shouldReturnUserDefinedSize(){
	    MyHashMap map=new MyHashMap(8);
	    assertEquals(8, map.size());
	}*/
	
	@Test
	public void shouldReturnOneWhenSingleObjectAdd(){
		Integer value=map.put("1",123);
		assertEquals(1, map.size());
	 	assertTrue(123==value);
	}
	@Test
	public void shouldReturnTwoWhenTwoObjectAdd(){
		Integer value=map.put("1",123);
		Integer value2=map.put("2",124);
		assertEquals(2, map.size());
	 	assertTrue(123==value);
	 	assertTrue(124==value2);
	}
	
	

}
