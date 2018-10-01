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
	
	
	//ǰ������ (selectbox) ��ȸ
	public List<Map<String, Object>> getIform(){
		return sqlSession.selectList(ComponentNamespace + ".getIform");
	}
		
	//���� ���� ��ȸ
	public List<Map<String, Object>> getStatus(){
		return sqlSession.selectList(ComponentNamespace + ".getStatus");
	}
	
	//��ǰ�� ���� ��ȸ
	public List<Map<String, Object>> getItcls(){
		return sqlSession.selectList(ComponentNamespace + ".getItcls");
	}
	
	//�����ڱ��� ���� ��ȸ
	public List<Map<String, Object>> getMccod(){
		return sqlSession.selectList(ComponentNamespace + ".getMccod");
	}
	
	//ǰ������ ���� ��ȸ
	public List<Map<String, Object>> getItemtype(){
		return sqlSession.selectList(ComponentNamespace + ".getItemtype");
	}
		
}
