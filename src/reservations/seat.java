package reservations;

public class seat {

	private seatType type;
	
	private boolean reserved;
	private boolean firstClass;
	
	public seat(seatType type, boolean reserved, boolean firstClass)
	{
		setType(type);
		setReserved(reserved);
		setFirstClass(firstClass);
		
	}
	
	
	public seatType getType() {
		return type;
	}
	public void setType(seatType type) {
		this.type = type;
	}
	public boolean isReserved() {
		return reserved;
	}
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	public boolean isFirstClass() {
		return firstClass;
	}
	public void setFirstClass(boolean firstClass) {
		this.firstClass = firstClass;
	}
	
	public String toString()
	{
		char typeOfSeat = (Character) null;
		char reserv = (Character) null;
		char first = (Character) null;
		
		if (type.equals("ASILE"))
		{
			typeOfSeat = 'a';
		}
		else if (type.equals("MIDDLE"))
		{
			typeOfSeat = 'm';
		}
		else if (type.equals("WINDOW"))
		{
			typeOfSeat = 'w';
		}
		
		if (reserved == true)
		{
			reserv = 'X';
		}
		else if (reserved == false)
		{
			reserv = ' ';
		}
		
		if (firstClass == true)
		{
			typeOfSeat = (char) (typeOfSeat - 32);
		}
		else if (firstClass == true)
		{
		}
		
		
		return typeOfSeat+"["+reserv+"]";
	}
	
}
