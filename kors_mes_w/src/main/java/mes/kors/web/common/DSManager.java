package mes.kors.web.common;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class DSManager {

	@Inject
	SqlSession sqlSession;
	
	@Inject
	SqlSession sqlSession2;
	
	public SqlSession getDS(Map<String, Object> map) {
		SqlSession s = null;
		
		String company_code = (String) map.get("c_code");
		
		
		if(company_code.equals("c00000001")) {
			s = sqlSession;
		}else if(company_code.equals("c00000002")) {
			s = sqlSession2;
		}
		
		return s;
	}
	
}
