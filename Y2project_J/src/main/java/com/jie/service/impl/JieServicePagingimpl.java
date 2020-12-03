package com.jie.service.impl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jie.mapper.JieMapper;
import com.jie.pojo.Pagingentity;
import com.jie.pojo.Projectdata.userList;
import com.jie.service.JieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/221:50     分页service 业务      JieServicePagingimpl
 * -♥---J
 */
@Service
public class JieServicePagingimpl implements JieService {
    @Autowired
    private JieMapper  jieMapper;
    /**
     * UserListFunction
     * @param page
     * @param rows
     * @return
     */
    @Override
    public Pagingentity<userList> selectUserAll(Integer page, Integer rows) {
        Page pages = PageHelper.startPage(page, rows);
        List<userList> userLists = jieMapper.selectAll();
        Pagingentity<userList>  pagingUser=new Pagingentity<userList>();
        pagingUser.setRows(userLists);
        pagingUser.setTotal(pages.getTotal());
        pagingUser.setPages(pages.getPages());
        pagingUser.setCurrentPage(page);
        return pagingUser;
    }
}
