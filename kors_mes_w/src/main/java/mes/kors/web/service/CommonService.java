package mes.kors.web.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mes.kors.web.dao.CommonDao;

@Service
@Transactional
public class CommonService {
	
	@Inject
	CommonDao commonDao;

	//�α��� ���� ��ȸ
	public List<Map<String, Object>> getUserInfo(Map<String, Object> map){
		return commonDao.getUserInfo(map);
	}
	
	//user�� ���α׷� ���� ��ȸ
	public List<Map<String, Object>> getMenuAuth(Map<String, Object> map){
		return commonDao.getMenuAuth(map);
	}
	
	//�����ڵ� : ȸ������
	public List<Map<String, Object>> getCompanyInfo(Map<String, Object> map){
		return commonDao.getCompanyInfo(map);
	}
	
	//�����ڵ� : �������� 
	public List<Map<String, Object>> getPlantInfo(Map<String, Object> map){
		return commonDao.getPlantInfo(map);
	}
}
