package com.xingtai.sms.dao;

import java.util.List;

import com.xingtai.sms.entity.Task;

public interface TaskDao {
	public boolean addTask(String task,String team, String publisher);
	public List<Task> selectTask(String team);
	

}
