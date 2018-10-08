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
	
	

	//ǰ���ڵ� ���� ��ȸ
	public List<Map<String, Object>> itnbr_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".itnbr_list", map);
	}
	
	//���¾�ü ���� ��ȸ
	public List<Map<String, Object>> buyer_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".buyer_list", map);
	}
	
	//�ҼӺμ� ��ȸ
	public List<Map<String, Object>> dept_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".dept_list");
	}
	
	//����� ��ȸ user_list
	public List<Map<String, Object>> user_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".user_list", map);
	}
	
	//������Ʈ��ȣ ��ȸ
	public List<Map<String, Object>> pjtno_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".pjtno_list", map);
	}
	
	//pjt��ȣ ��ȸ 
	public List<Map<String, Object>> pdtno_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".pdtno_list", map);
	}
	
	//pjt��ȣ2 ��ȸ pjtno_list2
	public List<Map<String, Object>> pjtno_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".pjtno_list2", map);
	}
	
	//purno��ȣ ��ȸ 
	public List<Map<String, Object>> purno_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".purno_list", map);
	}
	
	//���� ���� ��ȸ 
	public List<Map<String, Object>> task_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".task_list");
	}
	
	//pjt��ȣ3 ���� ��ȸ 
	public List<Map<String, Object>> pjtno_list3(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".pjtno_list3", map);
	}
	
	//ǰ���ڵ�2 ���� ��ȸ 
	public List<Map<String, Object>> itnbr_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(PopupNamespace + ".itnbr_list2", map);
	}
}
