package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		String carName = "경운기";
		int carType, sum = 0;
		int l = 25;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		
		switch (carName) {
		case "고속버스":
			sum = 850;
			carType = 300;
			break;
		case "경차":
			sum = 300;
			carType = 200;
			break;
		default:
			sum = 600;
			carType = 200;
			break;
		}
		
		if((l % 10) == 0) {
			sum += (carType * ((l / 10)-1));
		}
		else {
			sum += (carType * (l / 10));
		}
		
		System.out.println("거리 : " + l + "km");
		System.out.println("차종 : " + carName);
		System.out.println("통행료 : " + sum + "원");
	}
}
