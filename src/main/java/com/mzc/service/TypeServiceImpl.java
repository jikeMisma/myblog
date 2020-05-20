package com.mzc.service;

import com.mzc.ClassNotFoundException;
import com.mzc.dao.TypeRepository;
import com.mzc.po.Type;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.awt.print.Pageable;

/**
 * @author mazhicheng
 * @date 2020/5/19 - 17:14
 */

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeRepository typeRepository;

    @Transactional
    @Override
    public Type saveType(Type type) {
        return typeRepository.save(type);
    }

    @Transactional
    @Override
    public Type getType(Long id) {
        return typeRepository.getOne(id);
    }

    @Override
    public Type getTypeByName(String name) {
        return typeRepository.findByName(name);
    }


    @Override
    @Transactional
    public Page<Type> listType(org.springframework.data.domain.Pageable pageable) {
        return typeRepository.findAll((org.springframework.data.domain.Pageable) pageable);
    }


    @Transactional
    @Override
    public Type updateType(Long id, Type type) {
        Type t = typeRepository.getOne(id);
        if(t == null){
            throw new ClassNotFoundException("不存在该类型");
        }

        BeanUtils.copyProperties(type,t);

        return typeRepository.save(t);
    }

    @Transactional
    @Override
    public void deleteType(Long id) {

        typeRepository.deleteById(id);
    }
}
