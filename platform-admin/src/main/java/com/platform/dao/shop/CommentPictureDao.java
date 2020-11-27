package com.platform.dao.shop;

import com.platform.dao.BaseDao;
import com.platform.entity.shop.CommentPictureEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 评价图片Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-29 14:45:55
 */
@Mapper
public interface CommentPictureDao extends BaseDao<CommentPictureEntity> {
    /**
     * 根据commentId删除
     *
     * @param commentId
     * @return
     */
    int deleteByCommentId(Integer commentId);
}
