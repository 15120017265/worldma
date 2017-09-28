package com.hong.worldma.dao;

import com.hong.worldma.entity.wm.ActivityImgPath;
import com.hong.worldma.entity.wm.ActivityMsg;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Description:   //CRUD  activity_img_path表
 * @Author: hong
 * @Date: 2017-09-24
 */
@Mapper
public interface ActivityImgPathMapper {
    //插入图片消息在服务器中的路径信息
    @Insert("insert into activity_img_path(activity_img_path, activity_msg_id, user_number) values(#{activity_img_path}, #{activity_msg_id}, #{user_number})")
    int addImgPath(ActivityImgPath imgPath);

    //获取图片消息在服务器中的路径信息
    @Select("select activity_img_path from activity_img_path where activity_msg_id = #{activity_msg_id} and user_number = #{user_number}")
    String getImgPath(@Param("activity_msg_id") Integer activity_msg_id, @Param("user_number") String user_number);


    //删除图片消息在服务器中的路径数据
    @Delete("delete from activity_img_path where activity_msg_id = #{activity_msg_id} and user_number = #{user_number}")
    int deleteImgPath(@Param("activity_msg_id") Integer id, @Param("user_number") String user_number);
}
