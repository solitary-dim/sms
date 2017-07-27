package com.xingtai.sms.entity;

public class Task {
	private int tid;
	private String task;
	private String team;
	private String publisher;
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(int tid, String task, String team, String publisher) {
		super();
		this.tid = tid;
		this.task = task;
		this.team = team;
		this.publisher = publisher;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Task [publisher=" + publisher + ", task=" + task + ", team="
				+ team + ", tid=" + tid + "]";
	}
	
	
	

}
