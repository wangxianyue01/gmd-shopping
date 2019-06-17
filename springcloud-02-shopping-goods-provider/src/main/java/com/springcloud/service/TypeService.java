package com.springcloud.service;

import java.util.List;


import com.springcloud.entity.TypeOne;
import com.springcloud.entity.TypeTwo;


/**
 *	 ���ڶ���һ�������������ģ��ķ���
 * 
 * @author ����Ծ
 *
 */
public interface TypeService {

	/**
	 * 	��ѯ����һ��������Ϣ
	 * 
	 * @return �ɹ�����java.util.List���͵�ʵ�������򷵻�null
	 */
	public abstract List<TypeOne> selectAllTypeOne();
	
	/**
	 *	 ����һ������Ų�ѯ���������Ϣ
	 * 
	 * @return �ɹ�����java.util.List���͵�ʵ�������򷵻�null
	 */
	public abstract List<TypeTwo> selectTypeTwoByTypeOneId(Integer typeOneId);
	
	
}
