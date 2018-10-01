package mes.kors.web.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mes.kors.web.dao.ComponentDao;

@Service
@Transactional
public class ComponentService {
	
	@Inject
	ComponentDao componentDao;
	

	//ǰ������ (selectbox) ��ȸ
	public List<Map<String, Object>> getIform(){
		return componentDao.getIform();
	}

	//���� ���� ��ȸ 
	public List<Map<String, Object>> getStatus(){
		return componentDao.getStatus();
	}
	
	//��ǰ�� ���� ��ȸ
	public List<Map<String, Object>> getItcls(){
		return componentDao.getItcls();
	}
	
	//�����ڱ��� ���� ��ȸ
	public List<Map<String, Object>> getMccod(){
		return componentDao.getMccod();
	}
	
	//ǰ������ ���� ��ȸ
	public List<Map<String, Object>> getItemtype(){
		return componentDao.getItemtype();
	}

}
