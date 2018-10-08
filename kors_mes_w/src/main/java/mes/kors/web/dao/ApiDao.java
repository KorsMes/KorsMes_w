package mes.kors.web.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import mes.kors.web.common.DSManager;

@Repository
public class ApiDao {

	@Inject
	DSManager dsm;
	
	private static final String ApiNamespace = "mes.kors.web.mapper.ApiMapper";
	
	
	//���Ŵܰ����� ��ȸ
	public List<Map<String, Object>> paf06_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".paf06_list", map);
	}
	
	//���⳻������ ��ȸ
	public List<Map<String, Object>> pda12_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pda12_list", map);
	}

	//������ ����(����)
	public List<Map<String, Object>> scb10_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".scb10_list", map);
	}
	
	//PJT ���ֳ��� ��ȸ (��) ��ȸ
	public List<Map<String, Object>> sea12_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".sea12_list1", map);
	}

	//PJT ���ֳ��� ��ȸ (��ü��) ��ȸ
	public List<Map<String, Object>> sea12_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".sea12_list2", map);
	}
	
	//PJT ���ֳ��� ��ȸ (�μ���) ��ȸ
	public List<Map<String, Object>> sea12_list3(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".sea12_list3", map);
	}
	
	//���⳻�� ������Ȳ(����Ȳ) ��ȸ
	public List<Map<String, Object>> sfa05_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".sfa05_list1", map);
	}
	
	//���⳻�� ������Ȳ(�ŷ�ó��) ��ȸ
	public List<Map<String, Object>> sfa05_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".sfa05_list2", map);
	}
	
	//���⳻�� ������Ȳ(�μ���) ��ȸ
	public List<Map<String, Object>> sfa05_list3(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".sfa05_list3", map);
	}
	
	//���ݳ��� ������Ȳ(����Ȳ) ��ȸ
	public List<Map<String, Object>> shb04_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".shb04_list1", map);
	}
	
	//���ݳ��� ������Ȳ(�ŷ�ó��) ��ȸ
	public List<Map<String, Object>> shb04_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".shb04_list2", map);
	}
	
	//���ݳ��� ������Ȳ(�μ���) ��ȸ
	public List<Map<String, Object>> shb04_list3(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".shb04_list3", map);
	}
	
	//��ǥ���ʿ��� ����(�������� ��ȹ��(����))
	public List<Map<String, Object>> pdh04_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pdh04_list1", map);
	}
	
	//��ǥ���ʿ��� ����(�������� ��ȹ��(����))
	public List<Map<String, Object>> pdh04_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pdh04_list2", map);
	}
	
	// �� ������Ȳ(P/O�� ���ֻ󼼳���) ��ȸ
	public List<Map<String, Object>> pdb13_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pdb13_list1", map);
	}
	
	//���� ���԰˻���Ȳ ��ȸ
	public List<Map<String, Object>> pha03_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pha03_list", map);
	}
	
	//�˻� �ҷ���Ȳ ���� ��ȸ
	public List<Map<String, Object>> phb04_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".phb04_list", map);
	}
	

	
	
	
	
}
