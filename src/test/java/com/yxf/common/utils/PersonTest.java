package com.yxf.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testToString() {
		for (int i = 0; i < 10000; i++) {
			Person p = new Person();
			//姓名
			p.setName(StringUtil.generateChineseName());
			//年龄
			p.setAge(RandomUtil.random(1, 120));
			//介绍
			p.setAbout(StringUtil.randomChineseString(140));
			//日期
			Calendar ca = Calendar.getInstance();
			Date time = ca.getTime();
			SimpleDateFormat ss = new SimpleDateFormat();
			p.setCreated(ss.format(time));
			
			System.out.println("第"+(i+1)+"位:"+p);
		}

	}

}
