package com.dao;

import com.entity.ZuoyebuzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyebuzhiVO;
import com.entity.view.ZuoyebuzhiView;


/**
 * 作业布置
 * 
 * @author 
 * @email 
 * @date 2021-03-04 10:22:19
 */
public interface ZuoyebuzhiDao extends BaseMapper<ZuoyebuzhiEntity> {
	
	List<ZuoyebuzhiVO> selectListVO(@Param("ew") Wrapper<ZuoyebuzhiEntity> wrapper);
	
	ZuoyebuzhiVO selectVO(@Param("ew") Wrapper<ZuoyebuzhiEntity> wrapper);
	
	List<ZuoyebuzhiView> selectListView(@Param("ew") Wrapper<ZuoyebuzhiEntity> wrapper);

	List<ZuoyebuzhiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyebuzhiEntity> wrapper);
	
	ZuoyebuzhiView selectView(@Param("ew") Wrapper<ZuoyebuzhiEntity> wrapper);
	
}
