package edu.self.ar.server;

public class Location {

	private long latitude;
	private long longitude;
	private long altitude;
	
	
	public Location(long latitude, long longitude, long altitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
	}
	public long getLatitude() {
		return latitude;
	}
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}
	public long getLongitude() {
		return longitude;
	}
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
	public long getAltitude() {
		return altitude;
	}
	public void setAltitude(long altitude) {
		this.altitude = altitude;
	}
	
	
}
