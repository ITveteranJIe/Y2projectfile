package com.jie.service;

import com.jie.pojo.Pagingentity;
import com.jie.pojo.Projectdata.userList;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/221:48     service接口      JieService
 * -♥---J
 */
public interface JieService {
    /**userListPagingSelectAll*/
  public Pagingentity<userList>  selectUserAll(Integer page ,Integer rows);
}
