package com.epam.hibernatetest.mapper;

import com.epam.hibernatetest.dto.TaskDTO;
import com.epam.hibernatetest.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TaskMapper {
    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);
    TaskDTO taskToTaskDTO(Task entity);
    Task taskDTOToTask(TaskDTO dto);
}
