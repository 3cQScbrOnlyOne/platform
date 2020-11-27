package com.platform.dao.shop;

import com.platform.dao.BaseDao;
import com.platform.entity.MlsUserEntity2;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-16 15:02:28
 */
@Mapper
public interface MlsUserDao extends BaseDao<MlsUserEntity2> {

    int updatefx(MlsUserEntity2 user);

    int mlsUseCount();

    int insertMlsUse();

    int updateMlsUse();
}
