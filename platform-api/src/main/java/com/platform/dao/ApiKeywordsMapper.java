package com.platform.dao;

import com.platform.entity.KeywordsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 热闹关键词表
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-11 09:16:46
 */
@Mapper
public interface ApiKeywordsMapper extends BaseDao<KeywordsVo> {
    List<Map> hotKeywordList(Map param);
}
