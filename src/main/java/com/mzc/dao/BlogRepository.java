package com.mzc.dao;

import com.mzc.po.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author mazhicheng
 * @date 2020/5/20 - 19:14
 */

//JpaSpecificationExecutor帮助实现组合动态的查询
public interface BlogRepository extends JpaRepository<Blog,Long>, JpaSpecificationExecutor<Blog> {
}
