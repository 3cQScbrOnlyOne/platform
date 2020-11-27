package com.platform.dao.shop;

import java.util.List;

import com.platform.dao.BaseDao;
import com.platform.entity.shop.SpecificationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 规格表
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-13 10:41:10
 */
@Mapper
public interface SpecificationDao extends BaseDao<SpecificationEntity> {
	List<SpecificationEntity> queryListByGoodsId(String goodsId);

}
