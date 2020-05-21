package com.mzc.dao;

import com.mzc.po.Tag;
import com.mzc.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mazhicheng
 * @date 2020/5/19 - 17:15
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);

}
