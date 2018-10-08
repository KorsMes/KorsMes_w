package mes.kors.web.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import mes.kors.web.common.DSManager;

@Repository
public class PopupDao {

	@Inject
	DSManager dsm;
	
	private static final String PopupNamespace = "mes.kors.web.mapper.PopupMapper";
	
	

	//품목코드 정보 조회
	public List<Map<String, Object>> itnbr_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".itnbr_list", map);
	}
	
	//협력업체 정보 조회
	public List<Map<String, Object>> buyer_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".buyer_list", map);
	}
	
	//소속부서 조회
	public List<Map<String, Object>> dept_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".dept_list");
	}
	
	//사용자 조회 user_list
	public List<Map<String, Object>> user_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".user_list", map);
	}
	
	//프로젝트번호 조회
	public List<Map<String, Object>> pjtno_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".pjtno_list", map);
	}
	
	//pjt번호 조회 
	public List<Map<String, Object>> pdtno_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".pdtno_list", map);
	}
	
	//pjt번호2 조회 pjtno_list2
	public List<Map<String, Object>> pjtno_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".pjtno_list2", map);
	}
	
	//purno번호 조회 
	public List<Map<String, Object>> purno_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".purno_list", map);
	}
	
	//공정 정보 조회 
	public List<Map<String, Object>> task_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".task_list");
	}
	
	//pjt번호3 정보 조회 
	public List<Map<String, Object>> pjtno_list3(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".pjtno_list3", map);
	}
	
	//품목코드2 정보 조회 
	public List<Map<String, Object>> itnbr_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".itnbr_list2", map);
	}
}
