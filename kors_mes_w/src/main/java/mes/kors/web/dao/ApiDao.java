package mes.kors.web.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ApiDao {

	@Inject
	private SqlSession sqlSession;
	
	private static final String ApiNamespace = "mes.kors.web.mapper.ApiMapper";
	
	
	//���Ŵܰ����� ��ȸ
	public List<Map<String, Object>> paf06_list(Map<String, Object> map){
		return sqlSession.selectList(ApiNamespace + ".paf06_list", map);
	}
	
	
}
