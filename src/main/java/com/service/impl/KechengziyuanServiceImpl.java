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


import com.dao.KechengziyuanDao;
import com.entity.KechengziyuanEntity;
import com.service.KechengziyuanService;
import com.entity.vo.KechengziyuanVO;
import com.entity.view.KechengziyuanView;

@Service("kechengziyuanService")
public class KechengziyuanServiceImpl extends ServiceImpl<KechengziyuanDao, KechengziyuanEntity> implements KechengziyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengziyuanEntity> page = this.selectPage(
                new Query<KechengziyuanEntity>(params).getPage(),
                new EntityWrapper<KechengziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengziyuanEntity> wrapper) {
		  Page<KechengziyuanView> page =new Query<KechengziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengziyuanVO> selectListVO(Wrapper<KechengziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengziyuanVO selectVO(Wrapper<KechengziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengziyuanView> selectListView(Wrapper<KechengziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengziyuanView selectView(Wrapper<KechengziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
