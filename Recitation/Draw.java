public class Draw{
	public class void main(String[] args){
	Picasso picasso = new Picasso();
	System.out.println("Enter size of smiley:");
	int size = IO.readInt ();

	//Draaw the head
	picasso.moveDown(size);
	picasso.moveRight(size);
	picasso.drawCircle(size);

	//draw eyes
	picasso.moveUp(size/2);
	picasso.moveLeft(size/3);
	picasso.drawCircle(size/4);
	picasso.moveRight(2*size/3);
	picasso.drawCircle(size/4);

	//draw mouth
	picasso.moveDown(size/2);
	picasso.drawLineDown(size/2);
	picasso.moveDown(size/2);
	picasso.moveLeft(2 * size / 3);
	picasso.drawLineRight(2 * size / 3);
	picasso.moveUp(size / 2);
	picasso.drawLineDown(size / 2);
	
	}
}