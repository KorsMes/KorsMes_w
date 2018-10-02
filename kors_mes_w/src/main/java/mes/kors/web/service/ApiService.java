package mes.kors.web.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mes.kors.web.dao.ApiDao;

@Service
@Transactional
public class ApiService {

	@Inject
	ApiDao apiDao;
	
	

	//���Ŵܰ����� ��ȸ
	public List<Map<String, Object>> paf06_list(Map<String, Object> map){
		return apiDao.paf06_list(map);
	}
	
	//���⳻������ ��ȸ
	public List<Map<String, Object>> pda12_list(Map<String, Object> map){
		return apiDao.pda12_list(map);
	}

	//������ ����(����)
	public List<Map<String, Object>> scb10_list(Map<String, Object> map){
		return apiDao.scb10_list(map);
	}
	
	//PJT ���ֳ��� ��ȸ (��) ��ȸ
	public List<Map<String, Object>> sea12_list1(Map<String, Object> map){
		return apiDao.sea12_list1(map);
	}

	//PJT ���ֳ��� ��ȸ (��ü��) ��ȸ
	public List<Map<String, Object>> sea12_list2(Map<String, Object> map){
		return apiDao.sea12_list2(map);
	}
	
	//PJT ���ֳ��� ��ȸ (�μ���) ��ȸ
	public List<Map<String, Object>> sea12_list3(Map<String, Object> map){
		return apiDao.sea12_list3(map);
	}
	
	//���⳻�� ������Ȳ(����Ȳ) ��ȸ
	public List<Map<String, Object>> sfa05_list1(Map<String, Object> map){
		return apiDao.sfa05_list1(map);
	}
	
	//���⳻�� ������Ȳ(�ŷ�ó��) ��ȸ
	public List<Map<String, Object>> sfa05_list2(Map<String, Object> map){
		return apiDao.sfa05_list2(map);
	}
	
	//���⳻�� ������Ȳ(�μ���) ��ȸ
	public List<Map<String, Object>> sfa05_list3(Map<String, Object> map){
		return apiDao.sfa05_list3(map);
	}
	
	//���ݳ��� ������Ȳ(����Ȳ) ��ȸ
	public List<Map<String, Object>> shb04_list1(Map<String, Object> map){
		return apiDao.shb04_list1(map);
	}
	
	//���ݳ��� ������Ȳ(�ŷ�ó��) ��ȸ
	public List<Map<String, Object>> shb04_list2(Map<String, Object> map){
		return apiDao.shb04_list2(map);
	}
	
	//���ݳ��� ������Ȳ(�μ���) ��ȸ
	public List<Map<String, Object>> shb04_list3(Map<String, Object> map){
		return apiDao.shb04_list3(map);
	}
	
	//��ǥ���ʿ��� ����(�������� ��ȹ��(����))
	public List<Map<String, Object>> pdh04_list1(Map<String, Object> map){
		return apiDao.pdh04_list1(map);
	}
	
	//��ǥ���ʿ��� ����(�������� ��ȹ��(����))
	public List<Map<String, Object>> pdh04_list2(Map<String, Object> map){
		return apiDao.pdh04_list2(map);
	}
	
	//���� ���԰˻���Ȳ ��ȸ
	public List<Map<String, Object>> pha03_list(Map<String, Object> map){
		return apiDao.pha03_list(map);
	}
	
	//�˻� �ҷ���Ȳ ���� ��ȸ
	public List<Map<String, Object>> phb04_list(Map<String, Object> map){
		return apiDao.phb04_list(map);
	}
	
	
}
