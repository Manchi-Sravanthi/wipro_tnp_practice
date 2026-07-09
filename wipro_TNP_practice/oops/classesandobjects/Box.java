package oops.classesandobjects;

public class Box {
	int width;
	int height;
	int depth;
	Box(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	int volume(){
		return width*height*depth;
	}
	public static void main(String[] args) {
		Box b=new Box(5,4,3);
		System.out.println("width:"+ b.width);
		System.out.println("height:"+b.height);
		System.out.println("depth:"+b.depth);
		System.out.println("volume:"+b.volume());
		
		
	}
	
}
