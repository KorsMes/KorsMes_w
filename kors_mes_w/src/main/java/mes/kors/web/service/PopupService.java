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
	
	

	//품목코드 정보 조회
	public List<Map<String, Object>> itnbr_list(Map<String, Object> map){
		return popupDao.itnbr_list(map);
	}
	
	//협력업체 정보 조회
	public List<Map<String, Object>> buyer_list(Map<String, Object> map){
		return popupDao.buyer_list(map);
	}
	
	//소속부서 조회
	public List<Map<String, Object>> dept_list(){
		return popupDao.dept_list();
	}
	
	//사용자 조회 
	public List<Map<String, Object>> user_list(Map<String, Object> map){
		return popupDao.user_list(map);
	}
	
	//프로젝트번호 조회
	public List<Map<String, Object>> pjtno_list(Map<String, Object> map){
		return popupDao.pjtno_list(map);
	}
	
	//pjt번호 조회 
	public List<Map<String, Object>> pdtno_list(Map<String, Object> map){
		return popupDao.pdtno_list(map);
	}
	
	//pjt번호 조회 
	public List<Map<String, Object>> pjtno_list2(Map<String, Object> map){
		return popupDao.pjtno_list2(map);
	}
	
	//purno번호 조회  
	public List<Map<String, Object>> purno_list(Map<String, Object> map){
		return popupDao.purno_list(map);
	}
	
	//공정 정보 조회 
	public List<Map<String, Object>> task_list(){
		return popupDao.task_list();
	}
	
	//pjt번호3 정보 조회 
	public List<Map<String, Object>> pjtno_list3(Map<String, Object> map){
		return popupDao.pjtno_list3(map);
	}
	
	//품목코드2 정보 조회
	public List<Map<String, Object>> itnbr_list2(Map<String, Object> map){
		return popupDao.itnbr_list2(map);
	}
	
}
