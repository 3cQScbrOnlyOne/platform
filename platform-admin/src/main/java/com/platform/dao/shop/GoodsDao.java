package com.platform.dao.shop;

import com.platform.dao.BaseDao;
import com.platform.entity.shop.GoodsEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-21 21:19:49
 */
@Mapper
public interface GoodsDao extends BaseDao<GoodsEntity> {
    Integer queryMaxId();
}
