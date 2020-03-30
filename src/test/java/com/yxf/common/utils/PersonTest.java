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
			//����
			p.setName(StringUtil.generateChineseName());
			//����
			p.setAge(RandomUtil.random(1, 120));
			//����
			p.setAbout(StringUtil.randomChineseString(140));
			//����
			Calendar ca = Calendar.getInstance();
			Date time = ca.getTime();
			SimpleDateFormat ss = new SimpleDateFormat();
			p.setCreated(ss.format(time));
			
			System.out.println("��"+(i+1)+"λ:"+p);
		}

	}

}
