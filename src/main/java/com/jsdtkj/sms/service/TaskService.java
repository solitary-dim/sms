package com.jsdtkj.sms.service;

import java.util.List;

import com.jsdtkj.sms.entity.Task;

public interface TaskService {
    public boolean addTask(String task, String team, String publisher);

    public List<Task> selectTask(String team);

}
