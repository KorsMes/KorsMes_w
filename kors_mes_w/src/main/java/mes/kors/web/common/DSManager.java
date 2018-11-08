package mes.kors.web.common;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class DSManager {

	@Inject //(주)한성더스트킹 개발
	SqlSession sqlSession;
	
	@Inject //(주)한빛테크놀러지 개발
	SqlSession sqlSession2;
	
	@Inject //(주)한성더스트킹 운영
	SqlSession sqlSession3;
	
	@Inject //(주)한빛테크놀러지 운영
	SqlSession sqlSession4;
	
	public SqlSession getDS(Map<String, Object> map) {
		SqlSession s = null;
		
		String company_code = (String) map.get("c_code");
		
		
		if(company_code.equals("c00000001")) {
			s = sqlSession;
		}else if(company_code.equals("c00000002")) {
			s = sqlSession2;
		}else if(company_code.equals("c00000003")) {
			s = sqlSession3;
		}else if(company_code.equals("c00000004")) {
			s = sqlSession4;
		}
		
		return s;
	}
	
}
