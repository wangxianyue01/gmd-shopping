package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.entity.TypeOne;
import com.springcloud.entity.TypeTwo;
import com.springcloud.service.TypeService;
import com.springcloud.vo.ResultValue;

/**
 * 	һ�������������Ŀ�����
 * 
 * @author ����Ծ
 *
 */
@RestController
@RequestMapping("type")
public class TypeController {

	@Autowired
	private TypeService typeService;
	
	/**
	 *	 ��ѯ����һ�������Ϣ
	 * 
	 * @return
	 */
	@RequestMapping(value = "/selectAll")
	private ResultValue selectAll() {
		ResultValue rv =  new ResultValue();
		
		try {
			//����service��Ӧ�ķ�����ѯ����һ��������Ϣ���������ѯ���
			List<TypeOne> list = this.typeService.selectAllTypeOne();
			//�����ѯ�ɹ�
			if(list != null && list.size() > 0) {
				//���ò�ѯ��״̬���Ϊ0
				rv.setCode(0);
				//����Map����
				Map<String,Object> map = new HashMap<>();
				//����ѯ�������Map��
				map.put("typeOneList", list);
				////��map���ϴ���ResultValue������
				rv.setDataMap(map);
				//����ResultValue����
				return rv;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		rv.setCode(1);
		return rv;
	}
	
	/**
	 * 	����һ������Ų�ѯ���������Ϣ
	 * @return
	 */
	@RequestMapping(value="/selectById")
	private ResultValue selectAll(@RequestParam("typeOneId") Integer typeOneId) {
		
		ResultValue rv =  new ResultValue();
		
		try {
			//����service��Ӧ�ķ�����ѯ����һ��������Ϣ���������ѯ���
			List<TypeTwo> list = this.typeService.selectTypeTwoByTypeOneId(typeOneId);
			//�����ѯ�ɹ�
			if(list != null) {
				//���ò�ѯ��״̬���Ϊ0
				rv.setCode(0);
				//����Map����
				Map<String,Object> map = new HashMap<>();
				//����ѯ�������Map��
				map.put("typeTwoList", list);
				//��Map���ϴ���ResultValue������
				rv.setDataMap(map);
				//����ResultValue����
				return rv;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		rv.setCode(1);
		return rv;
	}

}