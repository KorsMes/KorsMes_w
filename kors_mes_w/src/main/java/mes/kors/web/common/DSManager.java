package mes.kors.web.common;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class DSManager {

	@Inject //(��)�Ѽ�����Ʈŷ ����
	SqlSession sqlSession;
	
	@Inject //(��)�Ѻ���ũ��� ����
	SqlSession sqlSession2;
	
	@Inject //(��)�Ѽ�����Ʈŷ �
	SqlSession sqlSession3;
	
	@Inject //(��)�Ѻ���ũ��� �
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
