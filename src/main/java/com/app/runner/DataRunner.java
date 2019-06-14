package com.app.runner;

import java.util.List;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.app.model.Project;

@Component
@ConfigurationProperties("my.data")
public class DataRunner implements CommandLineRunner{

	//private data
	private int sid;
	private String scode;
	private double sfee;
	//or set Arrey
	private List<String>sprjs;
	//or properties
	private Map<String,String>subjs;
	//HAS-A
	private Project pob;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
	}
	public List<String> getSprjs() {
		return sprjs;
	}
	public void setSprjs(List<String> sprjs) {
		this.sprjs = sprjs;
	}
	public Map<String, String> getSubjs() {
		return subjs;
	}
	public void setSubjs(Map<String, String> subjs) {
		this.subjs = subjs;
	}
	public Project getPob() {
		return pob;
	}
	public void setPob(Project pob) {
		this.pob = pob;
	}
	@Override
	public String toString() {
		return "DataRunner [sid=" + sid + ", scode=" + scode + ", sfee=" + sfee + ", sprjs=" + sprjs + ", subjs="
				+ subjs + ", pob=" + pob + "]";
	}

}
