package com.yxf.common.utils;

import java.util.Random;

public class RandomUtil {
	
	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max){
		
		int src = min +((int) (new Random().nextFloat() * (max - min)));
		
		return src;
	}
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	public static int[] subRandom (int min, int max, int subs){
		
		
		return null;
	}
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static String randomCharacter (){
		String src = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		
		Random random = new Random();
		
		StringBuffer sb = new StringBuffer();
		
		int num = random.nextInt(61);
		
		return sb.append(src.charAt(num)).toString();
	}
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(randomCharacter());
		}
		return sb.toString();
	}
	
}
