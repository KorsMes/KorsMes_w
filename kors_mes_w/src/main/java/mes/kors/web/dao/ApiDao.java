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
	
	
	//구매단가발행 조회
	public List<Map<String, Object>> paf06_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".paf06_list", map);
	}
	
	//지출내역발행 조회
	public List<Map<String, Object>> pda12_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pda12_list", map);
	}

	//견적서 발행(을지)
	public List<Map<String, Object>> scb10_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".scb10_list", map);
	}
	
	//PJT 수주내역 조회 (상세) 조회
	public List<Map<String, Object>> sea12_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".sea12_list1", map);
	}

	//PJT 수주내역 조회 (업체별) 조회
	public List<Map<String, Object>> sea12_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".sea12_list2", map);
	}
	
	//PJT 수주내역 조회 (부서별) 조회
	public List<Map<String, Object>> sea12_list3(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".sea12_list3", map);
	}
	
	//매출내역 종합현황(상세현황) 조회
	public List<Map<String, Object>> sfa05_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".sfa05_list1", map);
	}
	
	//매출내역 종합현황(거래처별) 조회
	public List<Map<String, Object>> sfa05_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".sfa05_list2", map);
	}
	
	//매출내역 종합현황(부서별) 조회
	public List<Map<String, Object>> sfa05_list3(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".sfa05_list3", map);
	}
	
	//수금내역 종합현황(상세현황) 조회
	public List<Map<String, Object>> shb04_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".shb04_list1", map);
	}
	
	//수금내역 종합현황(거래처별) 조회
	public List<Map<String, Object>> shb04_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".shb04_list2", map);
	}
	
	//수금내역 종합현황(부서별) 조회
	public List<Map<String, Object>> shb04_list3(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".shb04_list3", map);
	}
	
	//목표기초원가 발행(자재투입 계획서(갑지))
	public List<Map<String, Object>> pdh04_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pdh04_list1", map);
	}
	
	//목표기초원가 발행(자재투입 계획서(을지))
	public List<Map<String, Object>> pdh04_list2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pdh04_list2", map);
	}
	
	// 월 발주현황(P/O별 발주상세내역) 조회
	public List<Map<String, Object>> pdb13_list1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pdb13_list1", map);
	}
	
	//월별 수입검사현황 조회
	public List<Map<String, Object>> pha03_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".pha03_list", map);
	}
	
	//검사 불량현황 발행 조회
	public List<Map<String, Object>> phb04_list(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ApiNamespace + ".phb04_list", map);
	}
	

	
	
	
	
}
