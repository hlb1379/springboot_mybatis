package com.hlb.mapper;

import com.hlb.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by Fly on 2019/3/28.
 */
public interface UserMapper {
    @Select("select * from tb_user")
    List<User> getList();

    @Update("update tb_user set password = '1236378' where username = #{mike6}")
    void ModifyPwd(String mike6);
}
