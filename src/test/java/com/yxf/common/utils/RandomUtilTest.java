package com.yxf.common.utils;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		
		int rr = RandomUtil.random(1, 50);
		System.out.println(rr);
		
	}

	@Test
	public void testSubRandom() {
		
	}

	@Test
	public void testRandomCharacter() {
		
		String rr = RandomUtil.randomCharacter();
		System.out.println(rr);
		
	}

	@Test
	public void testRandomString() {
		
		String rr = RandomUtil.randomString(5);
		System.out.println(rr);
		
	}

}
