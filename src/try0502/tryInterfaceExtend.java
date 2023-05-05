package try0502;

public class tryInterfaceExtend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle_2 c = new CCircle_2(100);
		c.setColor("Red");
		c.show();
	}
}

interface CShape_2{
	final double pi=3.14;
	abstract void setColor(String str);
}

interface CShape2D extends CShape_2{
	abstract void show();
}

class CCircle_2 implements CShape2D{
	double radius;
	String color;
	
	CCircle_2(double r){
		this.radius = r;
	}

	@Override
	public void setColor(String str) {
		// TODO Auto-generated method stub
		this.color = str;
		System.out.println("color:"+color);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		// CCircle 類別可以取用到 資料成員PI。
		// 原因是因為 CShape2D 繼承來自父介面的成員，
		// 因此類別實作子介面時也能取用到。
		System.out.println("area:"+pi*radius*radius);
	}
}