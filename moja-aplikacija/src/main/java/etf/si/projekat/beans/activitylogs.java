package etf.si.projekat.beans;

import java.sql.Date;



public class activitylogs implements java.io.Serializable{

	Long id;
	String command;
	boolean isGranted;
	Date timestamp;
	String user;
	String fixtureName;
	
	public activitylogs(){}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	
	public boolean isGranted() {
		return isGranted;
	}

	public void setGranted(boolean isGranted) {
		this.isGranted = isGranted;
	}


	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getFixtureName() {
		return fixtureName;
	}
	public void setFixtureName(String fixtureName) {
		this.fixtureName = fixtureName;
	}

	

}
