package com.epam.hibernatetest.mapper;

import com.epam.hibernatetest.dto.TaskDTO;
import com.epam.hibernatetest.entity.Task;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-06T13:23:45+0300",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_161 (Oracle Corporation)"
)
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task taskDTOToTask(TaskDTO taskDTO) {
        if ( taskDTO == null ) {
            return null;
        }

        Task task = new Task();

        task.setTaskName( taskDTO.getTaskName() );
        task.setUser( taskDTO.getUser() );

        return task;
    }
}
