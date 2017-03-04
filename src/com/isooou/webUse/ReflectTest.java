package com.isooou.webUse;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ReflectTest{

	public static void main(String[] args)throws Exception{
		Student st = new Student();
		Class clazz = st.getClass();//��ȡ������ڵİ�
		System.out.println(clazz);
		System.out.println(clazz.getSuperclass());//��ȡ�丸��
		
		Type type = clazz.getGenericSuperclass();//��ô��з��͵ĸ���
		System.out.println(type);
		
		ParameterizedType p = (ParameterizedType)type;//getActualTypeArguments��ȡ���������͵����飬���Ϳ����ж��,�����������ע��Ҫ�ӷ���<>�������ǿת����
		Class c = (Class) p.getActualTypeArguments()[0];
		System.out.println(c);
		
	}
	
	
}
