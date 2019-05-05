package com.epam.hibernatetest.mapper;

import com.epam.hibernatetest.dto.UserDTO;
import com.epam.hibernatetest.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDTO userToUserDTO(User entity);
    User userDTOToUser(UserDTO dto);
}
