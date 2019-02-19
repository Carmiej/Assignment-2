package reservations;

public class airBussSeatMap {
	
	protected int rows = 9;
	protected int columns = 12;
	protected int firstClass = 4;
	protected char[] type;
	
	public airBussSeatMap()
	{
		type = new char[9];
		type[0] = 'w';
		type[1] = 'm';
		type[2] = 'a';
		type[3] = 'a';
		type[4] = 'm';
		type[5] = 'a';
		type[6] = 'a';
		type[7] = 'm';
		type[8] = 'w';
	}
	
	
}
