package com.mzc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author mazhicheng
 * @date 2020/5/1 - 12:07
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        //int i = 9/0;
//        String blog = null;
//        if(blog == null){
//            throw  new ClassNotFoundException("博客不存在");
//        }

        return "index";
    }
}
