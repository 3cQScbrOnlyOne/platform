package com.platform.dao.shop;

import com.platform.dao.BaseDao;
import com.platform.entity.shop.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-21 15:32:31
 */
@Mapper
public interface CategoryDao extends BaseDao<CategoryEntity> {

    public int deleteByParentBatch(Object[] id);
}
