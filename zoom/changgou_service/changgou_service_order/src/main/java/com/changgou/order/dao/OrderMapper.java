package com.changgou.order.dao;

import com.changgou.order.pojo.Order;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface OrderMapper extends Mapper<Order> {


}
