 public class Box{
	int height;
	int width;
	int depth;


public Box(){
	height=1;
	width=1;
	depth=1;
}

public Box(int h, int w, int d){
	this.height=h;
	this.width=w;
	this.depth=d;
}
public void display(){
	System.out.println(height+" "+width+" "+depth);	
}

void volume(){
	int volume;
	volume=height*width*depth;
}

}