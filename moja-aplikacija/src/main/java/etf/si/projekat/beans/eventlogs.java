package etf.si.projekat.beans;

import java.util.Calendar;



public class eventlogs implements java.io.Serializable{
	Long id;
	String deviceName;
	String deviceType;
	String eventMessage;
	Calendar timestamp;
	
	public eventlogs(){}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getEventMessage() {
		return eventMessage;
	}
	public void setEventMessage(String eventMessage) {
		this.eventMessage = eventMessage;
	}

	public Calendar getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}
	

	

}
