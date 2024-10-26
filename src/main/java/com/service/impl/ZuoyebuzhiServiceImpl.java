package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZuoyebuzhiDao;
import com.entity.ZuoyebuzhiEntity;
import com.service.ZuoyebuzhiService;
import com.entity.vo.ZuoyebuzhiVO;
import com.entity.view.ZuoyebuzhiView;

@Service("zuoyebuzhiService")
public class ZuoyebuzhiServiceImpl extends ServiceImpl<ZuoyebuzhiDao, ZuoyebuzhiEntity> implements ZuoyebuzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyebuzhiEntity> page = this.selectPage(
                new Query<ZuoyebuzhiEntity>(params).getPage(),
                new EntityWrapper<ZuoyebuzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyebuzhiEntity> wrapper) {
		  Page<ZuoyebuzhiView> page =new Query<ZuoyebuzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoyebuzhiVO> selectListVO(Wrapper<ZuoyebuzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyebuzhiVO selectVO(Wrapper<ZuoyebuzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyebuzhiView> selectListView(Wrapper<ZuoyebuzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyebuzhiView selectView(Wrapper<ZuoyebuzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
