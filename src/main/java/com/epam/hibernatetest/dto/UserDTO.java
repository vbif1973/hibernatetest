package com.epam.hibernatetest.dto;

import com.epam.hibernatetest.entity.Task;

import java.util.Set;

public class UserDTO {

    String userName;

    Set<TaskDTO> tasks;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<TaskDTO> getTasks() {
        return tasks;
    }

    public void setTasks(Set<TaskDTO> tasks) {
        this.tasks = tasks;
    }
}
