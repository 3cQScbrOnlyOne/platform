package com.platform.dao.shop;

import com.platform.dao.BaseDao;
import com.platform.entity.shop.GoodsGalleryEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-23 14:41:43
 */
@Mapper
public interface GoodsGalleryDao extends BaseDao<GoodsGalleryEntity> {
    int deleteByGoodsId(Map<String, Integer> map);
}
