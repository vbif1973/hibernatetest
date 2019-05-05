package com.epam.hibernatetest.mapper;

import com.epam.hibernatetest.dto.TaskDTO;
import com.epam.hibernatetest.entity.Task;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-05T23:51:35+0400",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_25 (Oracle Corporation)"
)
public class TaskMapperImpl implements TaskMapper {

    @Override
    public TaskDTO taskToTaskDTO(Task entity) {
        if ( entity == null ) {
            return null;
        }

        TaskDTO taskDTO = new TaskDTO();

        taskDTO.setTaskName( entity.getTaskName() );

        return taskDTO;
    }

    @Override
    public Task taskDTOToTask(TaskDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Task task = new Task();

        task.setTaskName( dto.getTaskName() );

        return task;
    }
}
