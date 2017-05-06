package entity.wip;

import java.sql.Timestamp;

public class WipGet {
	private int Wip_id;
	private int Station_id;
	private Timestamp StationGetWip_time;
	private int StationGetWip_amount;
	private int StationGetWip_location;
	private int StationGetWip_status;
	public int getWip_id() {
		return Wip_id;
	}
	public void setWip_id(int wip_id) {
		Wip_id = wip_id;
	}
	public int getStation_id() {
		return Station_id;
	}
	public void setStation_id(int station_id) {
		Station_id = station_id;
	}
	public Timestamp getStationGetWip_time() {
		return StationGetWip_time;
	}
	public void setStationGetWip_time(Timestamp stationGetWip_time) {
		StationGetWip_time = stationGetWip_time;
	}
	public int getStationGetWip_amount() {
		return StationGetWip_amount;
	}
	public void setStationGetWip_amount(int stationGetWip_amount) {
		StationGetWip_amount = stationGetWip_amount;
	}
	public int getStationGetWip_location() {
		return StationGetWip_location;
	}
	public void setStationGetWip_location(int stationGetWip_location) {
		StationGetWip_location = stationGetWip_location;
	}
	public int getStationGetWip_status() {
		return StationGetWip_status;
	}
	public void setStationGetWip_status(int stationGetWip_status) {
		StationGetWip_status = stationGetWip_status;
	}
	
}
