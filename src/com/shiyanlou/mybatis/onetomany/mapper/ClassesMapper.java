package com.shiyanlou.mybatis.onetomany.mapper;
import com.shiyanlou.mybatis.onetomany.model.Classes;

public interface ClassesMapper {
    /*
        * 根据 id 查询班级 Classes 和它的学生
        * @param id
        * @return
        * @throws Exception
        */
    public Classes selectClassAndStudentsById(Integer id) throws Exception;


}
