package com.platform.dao;

import com.platform.entity.UserRecord;
import com.platform.util.EntityDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * <br>
 */
@Mapper
public interface UserRecordMapper extends EntityDao<UserRecord,Integer>{

}
