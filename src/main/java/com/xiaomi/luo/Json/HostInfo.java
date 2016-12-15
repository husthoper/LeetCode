package com.xiaomi.luo.Json;

public class HostInfo {
    
    public HostInfo() {
	this.hostName = "";
	this.ip="";
    }
    
    public HostInfo(String Name, String Ip) {
	this.hostName = Name;
	this.ip=Ip;
    }
    
    String hostName ="";
    String ip="";
	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}