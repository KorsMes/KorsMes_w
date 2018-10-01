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
	
	

	//구매단가발행 조회
	public List<Map<String, Object>> paf06_list(Map<String, Object> map){
		return apiDao.paf06_list(map);
	}
	
	
}
