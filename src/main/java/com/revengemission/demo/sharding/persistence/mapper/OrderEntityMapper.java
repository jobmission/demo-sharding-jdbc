package com.revengemission.demo.sharding.persistence.mapper;

import com.revengemission.demo.sharding.persistence.entity.OrderEntity;
import com.revengemission.demo.sharding.persistence.entity.OrderEntityExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderEntityMapper {
    long countByExample(OrderEntityExample example);

    int deleteByExample(OrderEntityExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(OrderEntity record);

    int insertSelective(OrderEntity record);

    List<OrderEntity> selectByExample(OrderEntityExample example);

    OrderEntity selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") OrderEntity record, @Param("example") OrderEntityExample example);

    int updateByExample(@Param("record") OrderEntity record, @Param("example") OrderEntityExample example);

    int updateByPrimaryKeySelective(OrderEntity record);

    int updateByPrimaryKey(OrderEntity record);
}