package com.xingtai.sms.domain.service.imp;

import com.xingtai.sms.domain.dao.TaskDao;
import com.xingtai.sms.domain.dao.imp.TaskDaoImp;
import com.xingtai.sms.domain.entity.Task;
import com.xingtai.sms.domain.service.TaskService;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
public class TaskServiceImp implements TaskService {
	TaskDao t=new TaskDaoImp();

	public boolean addTask(String task, String team, String publisher) {
		return t.addTask(task, team, publisher);
	}

	public List<Task> selectTask(String team) {
		return t.selectTask(team);
	}

}
