package com.isooou.webUse;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ReflectTest{

	public static void main(String[] args)throws Exception{
		Student st = new Student();
		Class clazz = st.getClass();//获取类和所在的包
		System.out.println(clazz);
		System.out.println(clazz.getSuperclass());//获取其父类
		
		Type type = clazz.getGenericSuperclass();//获得带有泛型的父类
		System.out.println(type);
		
		ParameterizedType p = (ParameterizedType)type;//getActualTypeArguments获取参数化类型的数组，泛型可能有多个,父类和其子类注意要加泛型<>否则会有强转错误
		Class c = (Class) p.getActualTypeArguments()[0];
		System.out.println(c);
		
	}
	
	
}
