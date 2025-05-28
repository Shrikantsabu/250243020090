public class BoxDemo{
	public static void main(String []args){
		Box b1;
		b1=new Box();
		b1.volume();
		b1.display();

		Box b2;
		b2=new Box(2,3,6);
		b2.volume();
		b2.display();
	}
}