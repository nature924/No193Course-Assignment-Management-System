package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengziyuanView;


/**
 * 课程资源
 *
 * @author 
 * @email 
 * @date 2021-03-04 10:22:19
 */
public interface KechengziyuanService extends IService<KechengziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengziyuanVO> selectListVO(Wrapper<KechengziyuanEntity> wrapper);
   	
   	KechengziyuanVO selectVO(@Param("ew") Wrapper<KechengziyuanEntity> wrapper);
   	
   	List<KechengziyuanView> selectListView(Wrapper<KechengziyuanEntity> wrapper);
   	
   	KechengziyuanView selectView(@Param("ew") Wrapper<KechengziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengziyuanEntity> wrapper);
   	
}

