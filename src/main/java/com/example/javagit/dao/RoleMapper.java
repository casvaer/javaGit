package com.example.javagit.dao;

import com.example.javagit.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper {

    User getStirng();
}
