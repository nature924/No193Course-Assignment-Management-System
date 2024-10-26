package com.entity.view;

import com.entity.ZuoyebuzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作业布置
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-04 10:22:19
 */
@TableName("zuoyebuzhi")
public class ZuoyebuzhiView  extends ZuoyebuzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyebuzhiView(){
	}
 
 	public ZuoyebuzhiView(ZuoyebuzhiEntity zuoyebuzhiEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyebuzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
