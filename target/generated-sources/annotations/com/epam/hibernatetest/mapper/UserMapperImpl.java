package com.epam.hibernatetest.mapper;

import com.epam.hibernatetest.dto.UserDTO;
import com.epam.hibernatetest.entity.User;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-06T13:23:45+0300",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_161 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User userDTOToUser(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setUserName( dto.getUserName() );

        return user;
    }
}
