package com.liuyao.dao;
import com.liuyao.model.Member;
import org.apache.ibatis.annotations.*;
/**
 * @program: web
 * @description: 用户DAO
 * @author: LiuB
 * @create: 2018-09-27 20:01
 **/
@Mapper
public interface MemberDao {
    /**
     * 小驼峰注解需要注意：mysql数据库字段名中带有下划线的进行重命名为没下划线的
     * @param member_id
     * @return
     */
    @Select({"select id,member_id as mid,member_name as mname,create_time as createtime,update_time as update_time,sex,pwd,a_group as agroup,department,sign from a_member where member_id=#{member_id}"})
    Member queryM(@Param("member_id") String member_id);
}
