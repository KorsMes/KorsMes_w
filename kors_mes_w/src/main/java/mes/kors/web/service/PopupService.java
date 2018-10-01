package mes.kors.web.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mes.kors.web.dao.PopupDao;

@Service
@Transactional
public class PopupService {

	@Inject
	PopupDao popupDao;
	
	

	//ǰ���ڵ� ���� ��ȸ
	public List<Map<String, Object>> itnbr_list(Map<String, Object> map){
		return popupDao.itnbr_list(map);
	}
	
	//���¾�ü ���� ��ȸ
	public List<Map<String, Object>> buyer_list(Map<String, Object> map){
		return popupDao.buyer_list(map);
	}
	
	//�ҼӺμ� ��ȸ
	public List<Map<String, Object>> dept_list(){
		return popupDao.dept_list();
	}
	
	//����� ��ȸ 
	public List<Map<String, Object>> user_list(Map<String, Object> map){
		return popupDao.user_list(map);
	}
	
	//������Ʈ��ȣ ��ȸ
	public List<Map<String, Object>> pjtno_list(Map<String, Object> map){
		return popupDao.pjtno_list(map);
	}
	
	//pjt��ȣ ��ȸ 
	public List<Map<String, Object>> pdtno_list(Map<String, Object> map){
		return popupDao.pdtno_list(map);
	}
	
	//pjt��ȣ ��ȸ 
	public List<Map<String, Object>> pjtno_list2(Map<String, Object> map){
		return popupDao.pjtno_list2(map);
	}
	
	//purno��ȣ ��ȸ  
	public List<Map<String, Object>> purno_list(Map<String, Object> map){
		return popupDao.purno_list(map);
	}
	
	//���� ���� ��ȸ 
	public List<Map<String, Object>> task_list(){
		return popupDao.task_list();
	}
	
	//pjt��ȣ3 ���� ��ȸ 
	public List<Map<String, Object>> pjtno_list3(Map<String, Object> map){
		return popupDao.pjtno_list3(map);
	}
	
	//ǰ���ڵ�2 ���� ��ȸ
	public List<Map<String, Object>> itnbr_list2(Map<String, Object> map){
		return popupDao.itnbr_list2(map);
	}
	
}
