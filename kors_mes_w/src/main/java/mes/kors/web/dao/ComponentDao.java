package mes.kors.web.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import mes.kors.web.common.DSManager;

@Repository
public class ComponentDao {

	@Inject
	DSManager dsm;
	
	private static final String ComponentNamespace = "mes.kors.web.mapper.ComponentMapper";
	
	
	//품목형태 (selectbox) 조회
	public List<Map<String, Object>> getIform(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".getIform");
	}
		
	//상태 정보 조회
	public List<Map<String, Object>> getStatus(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".getStatus");
	}
	
	//제품군 정보 조회
	public List<Map<String, Object>> getItcls(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".getItcls");
	}
	
	//내외자구분 정보 조회
	public List<Map<String, Object>> getMccod(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".getMccod");
	}
	
	//품목형태 정보 조회
	public List<Map<String, Object>> getItemtype(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".getItemtype");
	}
	
	//단위
	public List<Map<String, Object>> commonCode1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode1");
	}
    //조달구분 
	public List<Map<String, Object>> commonCode2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode2");
	}
    
    //통화 
	public List<Map<String, Object>> commonCode3(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode3");
	}
    
    //품목형태 
	public List<Map<String, Object>> commonCode4(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode4");
	}
    
    //발의자 
	public List<Map<String, Object>> commonCode5(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode5");
	}
    
    //계정과목 
	public List<Map<String, Object>> commonCode6(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode6");
	}
    
    //증빙자료 
	public List<Map<String, Object>> commonCode7(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode7");
	}
    
    //부서 
	public List<Map<String, Object>> commonCode8(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode8");
	}
    
    //사업구분 
	public List<Map<String, Object>> commonCode9(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode9");
	}
	
    //현재상태 
	public List<Map<String, Object>> commonCode10(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode10");
	}
    
    //발주처 
	public List<Map<String, Object>> commonCode11(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode11");
	}
        
    //담당자 
	public List<Map<String, Object>> commonCode12(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode12");
	}
    
    //거래처 
	public List<Map<String, Object>> commonCode13(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode13");
	}
        
    //영업부서 
	public List<Map<String, Object>> commonCode14(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode14");
	}
    
    //영업담당 
	public List<Map<String, Object>> commonCode15(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode15");
	}
    
    //제품코드 
	public List<Map<String, Object>> commonCode16(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode16");
	}
    
    //수금구분 
	public List<Map<String, Object>> commonCode17(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode17");
	}
    
    //입금구분 
	public List<Map<String, Object>> commonCode18(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode18");
	}
    
    //지급처 
	public List<Map<String, Object>> commonCode19(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode19");
	}
    
    //발주형태 
	public List<Map<String, Object>> commonCode20(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode20");
	}
    
    //지불방법 
	public List<Map<String, Object>> commonCode21(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode21");
	}
    
    //조달구분 
	public List<Map<String, Object>> commonCode22(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode22");
	}
    
    //내외자 
	public List<Map<String, Object>> commonCode23(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode23");
	}
    
    //품목형태 
	public List<Map<String, Object>> commonCode24(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode24");
	}
    
    //제품군 
	public List<Map<String, Object>> commonCode25(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode25");
	}
    
    //검사구분 
	public List<Map<String, Object>> commonCode26(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode26");
	} 
    
    //상태 
	public List<Map<String, Object>> commonCode27(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode27");
	}
    
    //품목구분 
	public List<Map<String, Object>> commonCode28(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode28");
	}
    
    //입고유형 
	public List<Map<String, Object>> commonCode29(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode29");
	}
	
	//상태 
	public List<Map<String, Object>> commonCode30(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode30");
	}
	
	//조치구분
	public List<Map<String, Object>> commonCode31(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode31");
	}
	
	//검사결과
	public List<Map<String, Object>> commonCode32(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode32");
	}
	
	//불량항목
	public List<Map<String, Object>> commonCode33(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode33");
	}
	
	//검사종류
	public List<Map<String, Object>> commonCode34(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode34");
	}
	
	//검사구분
	public List<Map<String, Object>> commonCode35(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode35");
	}
	
		
}
