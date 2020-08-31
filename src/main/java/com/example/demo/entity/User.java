package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_user")  //指定对应表
public class User {
    //@TableId(type= IdType.ID_WORKER)
    private Long userId;

    private String username;
    private String ustatus;
}
