package com.xingtai.sms.domain.service;

import com.xingtai.sms.domain.entity.Task;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
public interface TaskService {
	public boolean addTask(String task, String team, String publisher);
	public List<Task> selectTask(String team);

}
