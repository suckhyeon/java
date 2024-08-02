package test240716.object1;

public class RectangleController {
	private Rectangle r = new Rectangle();

	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		double calcarea =  r.getHeight() * r.getWidth();
		return "면적 : " + r.toString() + " / " + calcarea;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		double perimeter = 2 * (r.getHeight() + r.getWidth());
		return "둘레 : " + r.toString() + " / " + perimeter;
	}

}


/*
private Rectangle r

public RectangleController(){
this.r = new Rectangle();
}
 위와 동일
*/