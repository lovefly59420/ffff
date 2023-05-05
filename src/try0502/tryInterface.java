package try0502;

public class tryInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle c = new CCircle(10);
		c.setColor("紅色");
		c.show();
	}
}


interface CShape{
	final double pi = 3.14;
	public abstract void show();
}

interface CColor{
	abstract void setColor(String str);
}

class CCircle implements CShape,CColor{
	double radius ;
	String color;
	
	CCircle(double r){
		this.radius = r;
	}

	@Override
	public void setColor(String str) {
		// TODO Auto-generated method stub
		this.color=str;
		System.out.println("顏色: "+color);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("area="+pi*radius*radius);
	}
}
