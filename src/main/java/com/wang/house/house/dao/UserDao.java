package com.wang.house.house.dao;

import com.wang.house.house.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    @Insert("insert into user(`name`) values(#{name})")
    void saveUser(User user);
}
