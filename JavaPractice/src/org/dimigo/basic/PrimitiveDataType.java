package org.dimigo.basic;

/**
 * << 첫번째 수행평가 과제 >>
 * 내용 : 아이유 프로필 출력하기
 * 작성일자 : 2015년 3월 13일
 * @author kms7530
 * @version 1.0
 *
 */

public class PrimitiveDataType {
	public static void main(String[] args) {
		String name = "아이유";
		boolean isMan = false;
		int age = 23;
		double h = 161.8;
		float w = 44.3f;
		char bloodType = 'A';
		
		System.out.printf("<< %s 프로필 >>\n", name);
		System.out.printf("이름 : %s\n", name);
		
		if(isMan) {
			System.out.printf("성별 : %s\n", "남자");
		}
		else {
			System.out.printf("성별 : %s\n", "여자");
		}

		System.out.printf("나이 : %d 세\n", age);
		System.out.printf("키 : %s cm\n", h);
		System.out.printf("몸무게 : %.1f kg\n", w);
		System.out.printf("혈액형 : %c 형\n", bloodType);
		
		// Add comment
	}
}
