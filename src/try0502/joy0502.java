package try0502;

import java.util.Arrays;
import java.util.List;

import org.json.simple.JSONObject;


public class joy0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(5);
		Square s = new Square(7);
		Calculator cal = new Calculator(1000);

		func_dataToJson();
		func_dataToJson_2();

		System.out.println("圓形土地" + cal.calaulatorPrice(c));
		System.out.println("方形土地" + cal.calaulatorPrice(s));

	}

	// https://code.google.com/archive/p/json-simple/downloads
	static void func_dataToJson() {
		JSONObject object = new JSONObject();
		// string
//		object.put("firstName", "Rohan");
//		object.put("lastName", "Singh");
//		object.put("dateOfBirth", "1990-12-15");
//		object.put("address", "34/Art");
//		object.put("city", "California");
//		object.put("contact", "85652321");
		List<Integer> r1 = Arrays.asList(1, 2, 3);
		List<Integer> r2 = Arrays.asList(4,5,6);
		List<Integer> r3 = Arrays.asList(1, 2, 8);
		List<Integer> r4 = Arrays.asList(1, 12, 3);
		List<Integer> r5 = Arrays.asList(11, 12, 3);
		object.put("r1", r1);
		object.put("r2", r2);
		object.put("r3", r3);
		object.put("r4", r4);
		object.put("r5", r5);

		System.out.println(object);
//		System.out.println("{\"boolean\":true,\"string\":\"string\",\"list\":[1,2,3],\"int\":2}");
	}

	static void func_dataToJson_2() {
		JSONObject object = new JSONObject();
		object.put("name", "Leon");
		object.put("age", 18);
		object.put("isSingle", true);

		// {"isSingle":true,"name":"Leon","age":18}
		System.out.println(object.toString());

		// 移除不要的值
		// object.remove("age");
	}
	
	

}

class Land {
	double area() {
		return 0;
	}
}

class Circle extends Land {
	int r;

	Circle(int r) {
		this.r = r;
	}

	double area() {
		return 3.14 * r * r;
	}
}

class Square extends Land {
	int side;

	Square(int side) {
		this.side = side;
	}

	double area() {
		return side * side;
	}
}

class Calculator {
	double price;

	Calculator(double price) {
		this.price = price;
	}

	double calaulatorPrice(Land l) {
		return l.area() * price;
	}
}
