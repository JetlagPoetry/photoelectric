package entity.materials;

import java.sql.Timestamp;
//MySQL里的timestamp用什么格式表示？

public class MaterialGet {
	private int Materials_id;
	private int Station_id;
	private Timestamp StationGetMaterials_time;
	private int StationGetMaterials_amount;
	private int StationGetMaterials_location;
	private int StationGetMaterials_status;
	public int getMaterials_id() {
		return Materials_id;
	}
	public void setMaterials_id(int materials_id) {
		Materials_id = materials_id;
	}
	public int getStation_id() {
		return Station_id;
	}
	public void setStation_id(int station_id) {
		Station_id = station_id;
	}
	public Timestamp getStationGetMaterials_time() {
		return StationGetMaterials_time;
	}
	public void setStationGetMaterials_time(Timestamp stationGetMaterials_time) {
		StationGetMaterials_time = stationGetMaterials_time;
	}
	public int getStationGetMaterials_amount() {
		return StationGetMaterials_amount;
	}
	public void setStationGetMaterials_amount(int stationGetMaterials_amount) {
		StationGetMaterials_amount = stationGetMaterials_amount;
	}
	public int getStationGetMaterials_location() {
		return StationGetMaterials_location;
	}
	public void setStationGetMaterials_location(int stationGetMaterials_location) {
		StationGetMaterials_location = stationGetMaterials_location;
	}
	public int getStationGetMaterials_status() {
		return StationGetMaterials_status;
	}
	public void setStationGetMaterials_status(int stationGetMaterials_status) {
		StationGetMaterials_status = stationGetMaterials_status;
	}
	
}
