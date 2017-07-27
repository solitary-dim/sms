package com.xingtai.sms.service.imp;

import java.util.List;

import com.xingtai.sms.dao.TaskDao;
import com.xingtai.sms.dao.imp.TaskDaoImp;
import com.xingtai.sms.entity.Task;
import com.xingtai.sms.service.TaskService;

public class TaskServiceImp implements TaskService {
	TaskDao t=new TaskDaoImp();

	public boolean addTask(String task, String team, String publisher) {
		return t.addTask(task, team, publisher);
	}

	public List<Task> selectTask(String team) {
		return t.selectTask(team);
	}

}
