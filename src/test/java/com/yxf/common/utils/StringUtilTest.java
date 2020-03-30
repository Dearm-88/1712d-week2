package com.yxf.common.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		//String s1 = "";//��ֵ
		//String s2 = "123";//��ֵ
		String s2 = "null";//��ֵ
		boolean hh = StringUtil.hasLength(s2);
		System.out.println(hh);
	}

	@Test
	public void testHasText() {
		//String s1 = "";//��ֵ
		String s2 = "123";//��ֵ
		//String s2 = "";//��ֵ
		boolean hh = StringUtil.hasText(s2);
		System.out.println(hh);
	}

	@Test
	public void testRandomChineseString() {
		
		String rr = StringUtil.randomChineseString(10);
		System.out.println(rr);
		
	}

	@Test
	public void testGenerateChineseName() {
		
		String nn = StringUtil.generateChineseName();
		System.out.println(nn);
		
	}

}
