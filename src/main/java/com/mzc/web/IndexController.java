package com.mzc.web;

import com.mzc.service.BlogService;
import com.mzc.service.TagService;
import com.mzc.service.TypeService;
import com.mzc.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author mazhicheng
 * @date 2020/5/1 - 12:07
 */

@Controller
public class IndexController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private TypeService typeService;

    @Autowired
    private TagService tagService;

    @GetMapping("/")
    public String index(@PageableDefault(size = 6,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable, Model model) {


        model.addAttribute("page",blogService.listBlog(pageable));
        model.addAttribute("types",typeService.listTypeTop(6));
        model.addAttribute("tags",tagService.lsitTagTop(10));
        model.addAttribute("recommenedBlogs",blogService.listRecommendlistBlogTop(8));
        return "index";
    }


    @GetMapping("/blog/{id}/")
    public String blog(){
        return "blog";
    }
}
