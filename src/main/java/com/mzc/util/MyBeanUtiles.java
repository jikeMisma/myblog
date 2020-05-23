package com.mzc.util;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mazhicheng
 * @date 2020/5/23 - 11:07
 */
public class MyBeanUtiles {

    /**
     * 获取所有的属性值为空属性名数组
     * @Parma sounce
     *
     */

    public static  String[] getNullPropertyNames(Object source){
        BeanWrapper beanWrapper = new BeanWrapperImpl(source);
        PropertyDescriptor[] pds = beanWrapper.getPropertyDescriptors();
        List<String> nullPropertyNames = new ArrayList<>();
        for(PropertyDescriptor pd:pds){
            String propertyName = pd.getName();
            if(beanWrapper.getPropertyValue(propertyName) ==null){
                nullPropertyNames.add(propertyName);
            }
        }
        return nullPropertyNames.toArray(new String[nullPropertyNames.size()]);
    }
}
