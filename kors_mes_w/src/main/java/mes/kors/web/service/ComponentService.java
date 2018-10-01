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
	

	//품목형태 (selectbox) 조회
	public List<Map<String, Object>> getIform(){
		return componentDao.getIform();
	}

	//상태 정보 조회 
	public List<Map<String, Object>> getStatus(){
		return componentDao.getStatus();
	}
	
	//제품군 정보 조회
	public List<Map<String, Object>> getItcls(){
		return componentDao.getItcls();
	}
	
	//내외자구분 정보 조회
	public List<Map<String, Object>> getMccod(){
		return componentDao.getMccod();
	}
	
	//품목형태 정보 조회
	public List<Map<String, Object>> getItemtype(){
		return componentDao.getItemtype();
	}

}
