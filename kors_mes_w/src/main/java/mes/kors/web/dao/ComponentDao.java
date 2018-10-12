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
	
	
	//ǰ������ (selectbox) ��ȸ
	public List<Map<String, Object>> getIform(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".getIform");
	}
		
	//���� ���� ��ȸ
	public List<Map<String, Object>> getStatus(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".getStatus");
	}
	
	//��ǰ�� ���� ��ȸ
	public List<Map<String, Object>> getItcls(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".getItcls");
	}
	
	//�����ڱ��� ���� ��ȸ
	public List<Map<String, Object>> getMccod(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".getMccod");
	}
	
	//ǰ������ ���� ��ȸ
	public List<Map<String, Object>> getItemtype(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".getItemtype");
	}
	
	//����
	public List<Map<String, Object>> commonCode1(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode1");
	}
    //���ޱ��� 
	public List<Map<String, Object>> commonCode2(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode2");
	}
    
    //��ȭ 
	public List<Map<String, Object>> commonCode3(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode3");
	}
    
    //ǰ������ 
	public List<Map<String, Object>> commonCode4(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode4");
	}
    
    //������ 
	public List<Map<String, Object>> commonCode5(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode5");
	}
    
    //�������� 
	public List<Map<String, Object>> commonCode6(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode6");
	}
    
    //�����ڷ� 
	public List<Map<String, Object>> commonCode7(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode7");
	}
    
    //�μ� 
	public List<Map<String, Object>> commonCode8(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode8");
	}
    
    //������� 
	public List<Map<String, Object>> commonCode9(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode9");
	}
	
    //������� 
	public List<Map<String, Object>> commonCode10(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode10");
	}
    
    //����ó 
	public List<Map<String, Object>> commonCode11(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode11");
	}
        
    //����� 
	public List<Map<String, Object>> commonCode12(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode12");
	}
    
    //�ŷ�ó 
	public List<Map<String, Object>> commonCode13(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode13");
	}
        
    //�����μ� 
	public List<Map<String, Object>> commonCode14(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode14");
	}
    
    //������� 
	public List<Map<String, Object>> commonCode15(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode15");
	}
    
    //��ǰ�ڵ� 
	public List<Map<String, Object>> commonCode16(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode16");
	}
    
    //���ݱ��� 
	public List<Map<String, Object>> commonCode17(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode17");
	}
    
    //�Աݱ��� 
	public List<Map<String, Object>> commonCode18(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode18");
	}
    
    //����ó 
	public List<Map<String, Object>> commonCode19(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode19");
	}
    
    //�������� 
	public List<Map<String, Object>> commonCode20(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode20");
	}
    
    //���ҹ�� 
	public List<Map<String, Object>> commonCode21(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode21");
	}
    
    //���ޱ��� 
	public List<Map<String, Object>> commonCode22(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode22");
	}
    
    //������ 
	public List<Map<String, Object>> commonCode23(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode23");
	}
    
    //ǰ������ 
	public List<Map<String, Object>> commonCode24(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode24");
	}
    
    //��ǰ�� 
	public List<Map<String, Object>> commonCode25(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode25");
	}
    
    //�˻籸�� 
	public List<Map<String, Object>> commonCode26(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode26");
	} 
    
    //���� 
	public List<Map<String, Object>> commonCode27(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode27");
	}
    
    //ǰ�񱸺� 
	public List<Map<String, Object>> commonCode28(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode28");
	}
    
    //�԰����� 
	public List<Map<String, Object>> commonCode29(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode29");
	}
	
	//���� 
	public List<Map<String, Object>> commonCode30(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode30");
	}
	
	//��ġ����
	public List<Map<String, Object>> commonCode31(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode31");
	}
	
	//�˻���
	public List<Map<String, Object>> commonCode32(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode32");
	}
	
	//�ҷ��׸�
	public List<Map<String, Object>> commonCode33(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode33");
	}
	
	//�˻�����
	public List<Map<String, Object>> commonCode34(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode34");
	}
	
	//�˻籸��
	public List<Map<String, Object>> commonCode35(Map<String, Object> map){
		SqlSession sqlSession = dsm.getDS(map);
		return sqlSession.selectList(ComponentNamespace + ".commonCode35");
	}
	
		
}
