package mes.kors.web.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import mes.kors.web.common.DSManager;

@Repository
public class CommonDao {

	@Inject
	DSManager dsm;
	
	private static final String CommonNamespace = "mes.kors.web.mapper.CommonMapper";
	

	//�α��� ���� ��ȸ
	public List<Map<String, Object>> getUserInfo(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(CommonNamespace + ".getUserInfo", map);
	}
	
	//user�� ���α׷� ���� ��ȸ
	public List<Map<String, Object>> getMenuAuth(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(CommonNamespace + ".getMenuAuth", map);
	}
	
	
	//�����ڵ� : ȸ������ 
	public List<Map<String, Object>> getCompanyInfo(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(CommonNamespace + ".getCompanyInfo");
	}
	
	//�����ڵ� : �������� 
	public List<Map<String, Object>> getPlantInfo(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(CommonNamespace + ".getPlantInfo");
	}
}
