package com.springboot.demo.dao;

import com.springboot.demo.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

//@Component
//@Mapper
public interface AccountDao {
    int deleteByPrimaryKey(Integer cardId);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer cardId);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}