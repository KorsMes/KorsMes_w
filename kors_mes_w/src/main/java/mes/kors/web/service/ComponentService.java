package mes.kors.web.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mes.kors.web.dao.ComponentDao;

@Service
@Transactional
public class ComponentService {
	
	@Inject
	ComponentDao componentDao;
	

	//품목형태 (selectbox) 조회
	public List<Map<String, Object>> getIform(Map<String, Object> map){
		return componentDao.getIform(map);
	}

	//상태 정보 조회 
	public List<Map<String, Object>> getStatus(Map<String, Object> map){
		return componentDao.getStatus(map);
	}
	
	//제품군 정보 조회
	public List<Map<String, Object>> getItcls(Map<String, Object> map){
		return componentDao.getItcls(map);
	}
	
	//내외자구분 정보 조회
	public List<Map<String, Object>> getMccod(Map<String, Object> map){
		return componentDao.getMccod(map);
	}
	
	//품목형태 정보 조회
	public List<Map<String, Object>> getItemtype(Map<String, Object> map){
		return componentDao.getItemtype(map);
	}
	
	//단위
	public List<Map<String, Object>> commonCode1(Map<String, Object> map){
		return componentDao.commonCode1(map);
	}
	
    //조달구분 
	public List<Map<String, Object>> commonCode2(Map<String, Object> map){
		return componentDao.commonCode2(map);
	}
    
    //통화 
	public List<Map<String, Object>> commonCode3(Map<String, Object> map){
		return componentDao.commonCode3(map);
	}
    
    //품목형태 
	public List<Map<String, Object>> commonCode4(Map<String, Object> map){
		return componentDao.commonCode4(map);
	}
    
    //발의자 
	public List<Map<String, Object>> commonCode5(Map<String, Object> map){
		return componentDao.commonCode5(map);
	}
    
    //계정과목 
	public List<Map<String, Object>> commonCode6(Map<String, Object> map){
		return componentDao.commonCode6(map);
	}
    
    //증빙자료 
	public List<Map<String, Object>> commonCode7(Map<String, Object> map){
		return componentDao.commonCode7(map);
	}
    
    //부서 
	public List<Map<String, Object>> commonCode8(Map<String, Object> map){
		return componentDao.commonCode8(map);
	}
    
    //사업구분 
	public List<Map<String, Object>> commonCode9(Map<String, Object> map){
		return componentDao.commonCode9(map);
	}
	
    //현재상태 
	public List<Map<String, Object>> commonCode10(Map<String, Object> map){
		return componentDao.commonCode10(map);
	}
    
    //발주처 
	public List<Map<String, Object>> commonCode11(Map<String, Object> map){
		return componentDao.commonCode11(map);
	}
        
    //담당자 
	public List<Map<String, Object>> commonCode12(Map<String, Object> map){
		return componentDao.commonCode12(map);
	}
	
    //거래처 
	public List<Map<String, Object>> commonCode13(Map<String, Object> map){
		return componentDao.commonCode13(map);
	}
        
    //영업부서 
	public List<Map<String, Object>> commonCode14(Map<String, Object> map){
		return componentDao.commonCode14(map);
	}
    
    //영업담당 
	public List<Map<String, Object>> commonCode15(Map<String, Object> map){
		return componentDao.commonCode15(map);
	}
    
    //제품코드 
	public List<Map<String, Object>> commonCode16(Map<String, Object> map){
		return componentDao.commonCode16(map);
	}
    
    //수금구분 
	public List<Map<String, Object>> commonCode17(Map<String, Object> map){
		return componentDao.commonCode17(map);
	}
    
    //입금구분 
	public List<Map<String, Object>> commonCode18(Map<String, Object> map){
		return componentDao.commonCode18(map);
	}
    
    //지급처 
	public List<Map<String, Object>> commonCode19(Map<String, Object> map){
		return componentDao.commonCode19(map);
	}
    
    //발주형태 
	public List<Map<String, Object>> commonCode20(Map<String, Object> map){
		return componentDao.commonCode20(map);
	}
    
    //지불방법 
	public List<Map<String, Object>> commonCode21(Map<String, Object> map){
		return componentDao.commonCode21(map);
	}
    
    //조달구분 
	public List<Map<String, Object>> commonCode22(Map<String, Object> map){
		return componentDao.commonCode22(map);
	}
    
    //내외자 
	public List<Map<String, Object>> commonCode23(Map<String, Object> map){
		return componentDao.commonCode23(map);
	}
    
    //품목형태 
	public List<Map<String, Object>> commonCode24(Map<String, Object> map){
		return componentDao.commonCode24(map);
	}
    
    //제품군 
	public List<Map<String, Object>> commonCode25(Map<String, Object> map){
		return componentDao.commonCode25(map);
	}
    
    //검사구분 
	public List<Map<String, Object>> commonCode26(Map<String, Object> map){
		return componentDao.commonCode26(map);
	}
    
    //상태 
	public List<Map<String, Object>> commonCode27(Map<String, Object> map){
		return componentDao.commonCode27(map);
	}
    
    //품목구분 
	public List<Map<String, Object>> commonCode28(Map<String, Object> map){
		return componentDao.commonCode28(map);
	}
    
    //입고유형 
	public List<Map<String, Object>> commonCode29(Map<String, Object> map){
		return componentDao.commonCode29(map);
	}
}
