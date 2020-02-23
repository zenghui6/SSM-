package com.zenghui.mapper;

import com.zenghui.entity.Property;

/**
 * @author zeng
 */
public interface PropertyMapper {
    /**
     * 通过主键删除
     * @param id
     * @return int
     */
    int deleteByPrimaryKey(Integer id);

    int insert(Property record);

    int insertSelective(Property record);

    Property selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKey(Property record);
}