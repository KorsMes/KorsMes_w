package mes.kors.web.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDao {

	@Inject
	private SqlSession sqlSession;
	
	private static final String ComponentNamespace = "mes.kors.web.mapper.ComponentMapper";
	
	
	//품목형태 (selectbox) 조회
	public List<Map<String, Object>> getIform(){
		return sqlSession.selectList(ComponentNamespace + ".getIform");
	}
		
	//상태 정보 조회
	public List<Map<String, Object>> getStatus(){
		return sqlSession.selectList(ComponentNamespace + ".getStatus");
	}
	
	//제품군 정보 조회
	public List<Map<String, Object>> getItcls(){
		return sqlSession.selectList(ComponentNamespace + ".getItcls");
	}
	
	//내외자구분 정보 조회
	public List<Map<String, Object>> getMccod(){
		return sqlSession.selectList(ComponentNamespace + ".getMccod");
	}
	
	//품목형태 정보 조회
	public List<Map<String, Object>> getItemtype(){
		return sqlSession.selectList(ComponentNamespace + ".getItemtype");
	}
		
}
