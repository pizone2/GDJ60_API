package com.iu.api1.objects;

public class ObjectStudy {
	public static void main(String[] args) {
		//객체 생성 공식
		Object object = new Object();
		
		//맴버 사용(접근)
		//참조변수명.변수명, 참조변수명.메서드()
		int result = object.hashCode();
		
		System.out.println(result);
		
		Object object2 = new Object();
		
		String result2 = object2.toString();
		
		System.out.println(result2);
		System.out.println(object2);
		
		Child child = new Child();
		Object obj = new Object();
		System.out.println(object == obj);
		boolean check = object.equals(obj);
		System.out.println(check);
		
		System.out.println(child.toString());
		System.err.println(child);
		System.out.println(child.hashCode());
		
		Object o = child; // 다형성
	
	}
}
