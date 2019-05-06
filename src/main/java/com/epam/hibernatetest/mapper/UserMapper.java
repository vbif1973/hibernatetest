package com.epam.hibernatetest.mapper;

import com.epam.hibernatetest.dto.TaskDTO;
import com.epam.hibernatetest.dto.UserDTO;
import com.epam.hibernatetest.entity.Task;
import com.epam.hibernatetest.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User userDTOToUser(UserDTO dto);
}
