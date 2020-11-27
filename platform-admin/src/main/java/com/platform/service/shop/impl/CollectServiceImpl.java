package com.platform.service.shop.impl;

import com.platform.dao.shop.CollectDao;
import com.platform.entity.shop.CollectEntity;
import com.platform.service.shop.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("collectService")
public class CollectServiceImpl implements CollectService {
	@Autowired
	private CollectDao collectDao;

	@Override
	public CollectEntity queryObject(Integer id){
		return collectDao.queryObject(id);
	}

	@Override
	public List<CollectEntity> queryList(Map<String, Object> map){
		return collectDao.queryList(map);
	}

	@Override
	public int queryTotal(Map<String, Object> map){
		return collectDao.queryTotal(map);
	}

	@Override
	public void save(CollectEntity collect){
		collectDao.save(collect);
	}

	@Override
	public void update(CollectEntity collect){
		collectDao.update(collect);
	}

	@Override
	public void delete(Integer id){
		collectDao.delete(id);
	}

	@Override
	public void deleteBatch(Integer[] ids){
		collectDao.deleteBatch(ids);
	}

}
