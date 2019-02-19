package reservations;

public class boeingSeatmap {

	protected int rows = 7;
	protected int columns = 10;
	protected int firstClass = 4;
	protected char[] type;
	
	public boeingSeatmap()
	{
		type = new char[7];
		type[0] = 'w';
		type[1] = 'a';
		type[2] = 'a';
		type[3] = 'm';
		type[4] = 'a';
		type[5] = 'a';
		type[6] = 'w';
	}
	
	
}
