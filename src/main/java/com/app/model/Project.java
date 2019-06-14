package com.app.model;

public class Project {

	private int prjid;
	private String prjcode;
	private double prJCOST;
	public Project() {
		super();
	}
	public int getPrjid() {
		return prjid;
	}
	public void setPrjid(int prjid) {
		this.prjid = prjid;
	}
	public String getPrjcode() {
		return prjcode;
	}
	public void setPrjcode(String prjcode) {
		this.prjcode = prjcode;
	}
	public double getPrJCOST() {
		return prJCOST;
	}
	public void setPrJCOST(double prJCOST) {
		this.prJCOST = prJCOST;
	}
	@Override
	public String toString() {
		return "Project [prjid=" + prjid + ", prjcode=" + prjcode + ", prJCOST=" + prJCOST + "]";
	}

}
