package com.jie.controller.accesspathController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/221:51     路径Controller      PathController
 * -♥---J
 */
@Controller
public class PathController {
    /**
     * 首页
     * @return
     */
    @RequestMapping("/index")
    String long_J(){
        return "index";
    }
    /**
     *栏目列表
     * @return
     */
    @RequestMapping("/column_show")
    String column_show(){
        return "column_show";
    }
    /**
     *创建栏目
     * @return
     */
    @RequestMapping("/column_create")
    String column_create(){
        return "column_create";
    }
    /**
     * 文档列表
     * @return
     */
    @RequestMapping("/article_show")
    String article_show(){
        return "article_show";
    }
    /**
     * 创建文档
     * @return
     */
    @RequestMapping("/article_create")
    String article_create(){
        return "article_create";
    }
    /**
     *图片列表
     * @return
     */
    @RequestMapping("/image_show")
    String image_show(){
        return "image_show";
    }
    /**
     *创建图片
     * @return
     */
    @RequestMapping("/image_create")
    String image_create(){
        return "image_create";
    }
    @RequestMapping("/page_show")
    String page_show(){
        return "page_show";
    }
    @RequestMapping("/page_create")
    String page_create(){
        return "page_create";
    }

    /**
     * 网站设置
     * @return
     */
    @RequestMapping("/web_baseset")
    String web_baseset(){
        return "web_baseset";
    }
    @RequestMapping("/web_baseseo")
    String web_baseseo(){
        return "web_baseseo";
    }
    @RequestMapping("/web_basemap")
    String web_basemap(){
        return "web_basemap";
    }
    @RequestMapping("/web_basefield")
    String web_basefield(){
        return "web_basefield";
    }
    @RequestMapping("/web_email")
    String web_email(){
        return "web_email";
    }
    /**
     * 用户列表
     */
    @RequestMapping("/user_show")
    public String user_show(){
        return "user_show";
    }
}
