package com.shiyanlou.mybatis.onetoone.mapper;

import com.shiyanlou.mybatis.onetoone.model.Classes;

public interface ClassesMapper {

    public Classes selectClassById(Integer id) throws Exception;
}
