public class Rectangulator {
	public static void main (String[]){
	 int length = Integer.parseInt(args[0]);
	 int width =Integer.parseInt(args[1]);

	Rectangler myRegtangle =new Rectangle(length, width);
	
	String output = String.format("*** Your Rectangle ***\n\nLength: %d\nWidth: %\nArea: %d\nPerimeter: %d\n\n", myRectangle.length, myRectangle.width, myRectangle.Area(), myRectangle.getPerimeter());

	System.out.println(output);
	
	}
}


