package com.jie.pojo.Projectdata;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/222:29     用户表实体类      userList
 * -♥---J
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("userList")
public class userList {
    private Integer uid;
    private String  userName;
    private String  penName;
    private String  trueName;
    private Integer numBer;
    private String  ip;
    private String  creationTime;
    private String  loginTime;
    private Integer state;
}
