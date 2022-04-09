package com.example.javagit.dao;

import com.example.javagit.controller.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     *
     * @return
     */
    public List<User> getUserList();
    public User selectOne(Integer id);
    public int insertOne(User user);
    public int updateOne(Integer id);
    public int deleteOne(Integer id);

}
