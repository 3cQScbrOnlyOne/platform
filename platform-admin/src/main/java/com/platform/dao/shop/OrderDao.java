package com.platform.dao.shop;

import java.util.List;
import java.util.Map;

import com.platform.dao.BaseDao;
import com.platform.entity.shop.GroupBuyingEntity;
import com.platform.entity.shop.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-13 10:41:09
 */
@Mapper
public interface OrderDao extends BaseDao<OrderEntity> {
    List<GroupBuyingEntity> queryGroupList(Map<String, Object> map);
    int queryGroupTotal(Map<String, Object> map);

}
