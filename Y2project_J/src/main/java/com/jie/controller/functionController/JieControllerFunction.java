package com.jie.controller.functionController;
import com.jie.pojo.Pagingentity;
import com.jie.pojo.Projectdata.userList;
import com.jie.service.JieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/311:12     具体功能controller      JieControllerFunction
 * -♥---J
 */
@Controller
public class JieControllerFunction {
    @Autowired
    JieService jieService;
    @RequestMapping("/userList")
    String userList(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue ="5")Integer rows, Model model){
        Pagingentity<userList> pagingentity = jieService.selectUserAll(page,rows);
        model.addAttribute("page",pagingentity);
        return "user_show";
    }
}
