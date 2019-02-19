package reservations;

public class flight {
	
	private String start;
	private String destination;
	private double departureTime;
	private String flightNumber;
	
	public flight(String start, String destination, double departureTime, String flightNumber)
	{
		setStart(start);
		setDestination(destination);
		setDepartureTime(departureTime);
		setFlightNumber(flightNumber);		
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(double departureTime) {
		this.departureTime = departureTime;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

}
