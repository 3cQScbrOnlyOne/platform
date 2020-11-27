package com.platform.dao.shop;

import com.platform.dao.BaseDao;
import com.platform.entity.shop.GoodsAttributeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-13 10:41:08
 */
@Mapper
public interface GoodsAttributeDao extends BaseDao<GoodsAttributeEntity> {

    int updateByGoodsIdAttributeId(GoodsAttributeEntity goodsAttributeEntity);
}
