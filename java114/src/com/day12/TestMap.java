package com.day12;

import java.util.*;

public class TestMap {

	/**
	 * Map�е�Ԫ���� ��--->ֵ ��ʽ����
	 * �������ظ�
	 */
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		//�� ��ֵ�� ����map����
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
	//	map.put("key4", null);
		
		//��ѯ��ֵ������
	//	System.out.println(map.size());

		//���ݼ�ȡ��ֵ
		//System.out.println(map.get("key3"));
		
		//��ֵ�Թ�ϵ ������,ȡ������null;��ֵ�Դ���,��ֵΪnull,ȡ����Ҳ��null
		/*System.out.println(map.get("key5"));
		System.out.println(map.get("key4"));*/
		
		//����keyɾ��  key-value
		//map.remove("key3");
		//System.out.println(map.get("key3"));
		
		//�����һ����ֵ��,��key�Ѿ�����;���µ�value����ԭvalue
		/*map.put("key3", "value0000");
		System.out.println(map.get("key3"));*/
		
		//Map���ϵı���
		//1.�ȱ�����,ͨ����ȡֵ
//		Set<String> keys = map.keySet();//ȡ�����key��set����
//		for(String key:keys){
//			System.out.println(key+"----->"+map.get(key));
//		}
		
		//2.ֱ�ӱ���ֵ
//		 Collection<String> values = map.values();
//		 for(String value:values){
//				System.out.println(value);
//			}
		 
		 //3.����ӡ���ϵ
		 Set entrySet = map.entrySet();
		 for(Object entry:entrySet){
				System.out.println(entry);
			}
		 
		 System.out.println(map);
	}

}
