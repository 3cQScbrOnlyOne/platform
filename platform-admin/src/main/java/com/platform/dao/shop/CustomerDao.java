package com.platform.dao.shop;

import java.util.List;
import java.util.Map;

import com.platform.dao.BaseDao;
import com.platform.entity.shop.CustomerEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 客户Dao
 */
@Mapper
public interface CustomerDao extends BaseDao<CustomerEntity> {
	  List<CustomerEntity> query2List(Map<String, Object> map);
	 int query2Total(Map<String, Object> map);
}
