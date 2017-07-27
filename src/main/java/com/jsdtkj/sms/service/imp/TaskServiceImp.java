package com.jsdtkj.sms.service.imp;

import java.util.List;

import com.jsdtkj.sms.dao.TaskDao;
import com.jsdtkj.sms.service.TaskService;
import com.jsdtkj.sms.dao.imp.TaskDaoImp;
import com.jsdtkj.sms.entity.Task;

public class TaskServiceImp implements TaskService {
    TaskDao t = new TaskDaoImp();

    public boolean addTask(String task, String team, String publisher) {
        return t.addTask(task, team, publisher);
    }

    public List<Task> selectTask(String team) {
        return t.selectTask(team);
    }

}
