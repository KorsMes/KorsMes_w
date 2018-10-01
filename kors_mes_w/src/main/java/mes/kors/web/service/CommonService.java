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

	//로그인 정보 조회
	public List<Map<String, Object>> getUserInfo(Map<String, Object> map){
		return commonDao.getUserInfo(map);
	}
	
	//user별 프로그램 정보 조회
	public List<Map<String, Object>> getMenuAuth(Map<String, Object> map){
		return commonDao.getMenuAuth(map);
	}

}
