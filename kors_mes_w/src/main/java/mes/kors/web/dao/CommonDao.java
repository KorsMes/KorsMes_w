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
	

	//로그인 정보 조회
	public List<Map<String, Object>> getUserInfo(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(CommonNamespace + ".getUserInfo", map);
	}
	
	//user별 프로그램 정보 조회
	public List<Map<String, Object>> getMenuAuth(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(CommonNamespace + ".getMenuAuth", map);
	}
	
	
	//공통코드 : 회사정보 
	public List<Map<String, Object>> getCompanyInfo(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(CommonNamespace + ".getCompanyInfo");
	}
	
	//공통코드 : 공장정보 
	public List<Map<String, Object>> getPlantInfo(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(CommonNamespace + ".getPlantInfo");
	}
}
