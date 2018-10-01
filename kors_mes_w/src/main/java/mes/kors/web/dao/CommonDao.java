package mes.kors.web.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class CommonDao {

	@Inject
	private SqlSession sqlSession;
	
	private static final String CommonNamespace = "mes.kors.web.mapper.CommonMapper";
	

	//로그인 정보 조회
	public List<Map<String, Object>> getUserInfo(Map<String, Object> map){
		return sqlSession.selectList(CommonNamespace + ".getUserInfo", map);
	}
	
	//user별 프로그램 정보 조회
	public List<Map<String, Object>> getMenuAuth(Map<String, Object> map){
		return sqlSession.selectList(CommonNamespace + ".getMenuAuth", map);
	}
	
}
