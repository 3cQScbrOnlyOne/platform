package com.platform.dao;

import com.platform.dao.BaseDao;
import com.platform.entity.SysSmsLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 发送短信日志Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-12-16 23:38:05
 */
@Mapper
public interface SysSmsLogDao extends BaseDao<SysSmsLogEntity> {

}
