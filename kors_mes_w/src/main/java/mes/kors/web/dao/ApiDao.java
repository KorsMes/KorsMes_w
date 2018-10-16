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
	
	//PJT ���ֳ��� ��ȸ
	public List<Map<String, Object>> sea02_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".sea02_list", map);
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
	
	//�������� �󼼺м�ǥ(���ְǺ� �м�ǥ)
	public List<Map<String, Object>> pdd06_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		sqlSession.selectList(ApiNamespace + ".pdd06_list1_1", map);
		return sqlSession.selectList(ApiNamespace + ".pdd06_list1_2", map);
	}
	
	//�������� �󼼺м�ǥ(���� �м�ǥ)
	public List<Map<String, Object>> pdd06_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		sqlSession.selectList(ApiNamespace + ".pdd06_list2_1", map);
		return sqlSession.selectList(ApiNamespace + ".pdd06_list2_2", map);
	}
	
	// �� ������Ȳ(P/O�� ���ֻ󼼳���) ��ȸ
	public List<Map<String, Object>> pdb13_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pdb13_list1", map);
	}
	
	// �� ������Ȳ(��ü�� ��������ǥ) ���� �� ��ȸ
	public List<Map<String, Object>> pdb13_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		sqlSession.selectList(ApiNamespace + ".pdb13_list2-1", map);
		return sqlSession.selectList(ApiNamespace + ".pdb13_list2-2", map);
	}
	
	// �� ������Ȳ(PJT�� ��������ǥ) ��ȸ
	public List<Map<String, Object>> pdb13_list3(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pdb13_list3", map);
	}
	
	// �� ������Ȳ(ǰ�� ���� ����ǥ) ���� �� ��ȸ
	public List<Map<String, Object>> pdb13_list4(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		sqlSession.selectList(ApiNamespace + ".pdb13_list4-1", map);
		return sqlSession.selectList(ApiNamespace + ".pdb13_list4-2", map);
	}
	
	// �� ������Ȳ(��ü�� ���ֳ��� ������ǥ) ��ȸ
	public List<Map<String, Object>> pdb13_list5(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pdb13_list5", map);
	}
	
	// �� ������Ȳ(PJT�� ���ֳ��� ������ǥ) ��ȸ
	public List<Map<String, Object>> pdb13_list6(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pdb13_list6", map);
	}
	
	//��ǰ �԰��� ��Ȳ
	public List<Map<String, Object>> pea03_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pea03_list", map);
	}
	
	//���ں� �����԰� ��Ȳ
	public List<Map<String, Object>> peb14_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".peb14_list1", map);
	}
	
	//���ں� �����԰� ��Ȳ(�۾����ú� �԰���Ȳ)
	public List<Map<String, Object>> peb14_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".peb14_list2", map);
	}
	
	//���ں� �����԰� ��Ȳ(�ŷ�ó�� �԰���Ȳ)
	public List<Map<String, Object>> peb14_list3(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".peb14_list3", map);
	}
	
	//���ں� �����԰� ��Ȳ(�۾����ú�/ǰ���� �԰���Ȳ)
	public List<Map<String, Object>> peb14_list4(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".peb14_list4", map);
	}
	
	//����/����/�԰�/�����Ȳ(����������ô��Ȳ(��))
	public List<Map<String, Object>> pec12_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pec12_list1", map);
	}
	
	//����/����/�԰�/�����Ȳ(����������ô��Ȳ(����))
	public List<Map<String, Object>> pec12_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pec12_list2", map);
	}
	
	//������� ����ǥ(����/���纰 ��������ǥ)
	public List<Map<String, Object>> peg08_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".peg08_list1", map);
	}
	
	//������� ����ǥ(���� �ݾ�����ǥ)
	public List<Map<String, Object>> peg08_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".peg08_list2", map);
	}
	
	//������� ����ǥ(����(��)����ǥ)
	public List<Map<String, Object>> peg08_list3(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".peg08_list3", map);
	}
	
	//������� ����ǥ(����(��)����ǥ)
	public List<Map<String, Object>> peg08_list4(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".peg08_list4", map);
	}
	
	//������� ����ǥ(�ǻ�� �����Ʈ)
	public List<Map<String, Object>> peg08_list5(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".peg08_list5", map);
	}
	
	//������� ����ǥ(�Ⱓ��/���纰 ��������ǥ)
	public List<Map<String, Object>> peg08_list6(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".peg08_list6", map);
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
