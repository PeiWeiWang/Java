package com.homework.w0726;

import java.util.*;

public class Wmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Set<String> ts = new HashSet<>();
		ts.add("adc");
		ts.add("afk");
		ts.add("abb");
		ts.add("bdc");
		ts.add("cba");

		Set<String> ts1 = new HashSet<>();
		ts1.add("aaaasa");
		ts1.add("ssss");
		ts1.add("ggfgfsd");
		ts1.add("fgfg");
		ts1.add("cbaaaa");

		Set<String> ts2 = new HashSet<>();
		ts2.add("hhh");
		ts2.add("jjj");
		ts2.add("ggfgfsd");
		ts2.add("lll");
		ts2.add("pppp");

		Map<String, Set<String>> map = new HashMap<>();
		map.put("�ַ�����1", ts);
		map.put("�ַ�����2", ts1);
		map.put("�ַ�����3", ts2);
		
		Set<String> keys	= 	map.keySet();
		for(String key:keys){
			Set<String> value = map.get(key);
			System.out.println("\n"+key);
			for(String str:value){
				System.out.print(str+"\t\t");
			}
			System.out.print("\t\t");
		}*/
		
		//�ֶ�����һ���ַ���"afdsadfserwe2#@$#@$13243dgffdherewfrewrwe",
		//ͳ��ÿ���ַ�------���ֵĴ���
		String str = "aaaabbb%%%111";
		
		//1.תΪ�ַ�����
		char[] ca = str.toCharArray();
		
		//2.����Map��ϵ�������ͳ��ÿ���ַ����ֵĴ���;��Ҫͳ�Ƶ��ַ�Ϊ��,�Գ��ֵĴ���Ϊֵ
		TreeMap<Character,Integer> countMap = new TreeMap<>();
			//����ca,������Ԫ��ѭ���ķ���countMap
		for(Character c:ca){
			if(countMap.get(c)==null){//����cȡ����ֵ��Ϊnull,˵���ַ�û�з���countMap�й�
				countMap.put(c, 1);//�������countMap��,keyΪc,valueΪ1
			}else{
				//�粻Ϊnull,˵���ַ��Ѿ����ֹ�;����Ӧ�Ĵ���ȡ��+1,�ڷŻ�countMap
				countMap.put(c, countMap.get(c)+1);
			}
		}
		System.out.println(countMap);
	}

}
 