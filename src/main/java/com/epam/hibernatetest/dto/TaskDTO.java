package com.epam.hibernatetest.dto;

import com.epam.hibernatetest.entity.User;

public class TaskDTO {

    String taskName;
    User user;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
