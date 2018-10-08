package mes.kors.web.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mes.kors.web.dao.ComponentDao;

@Service
@Transactional
public class ComponentService {
	
	@Inject
	ComponentDao componentDao;
	

	//ǰ������ (selectbox) ��ȸ
	public List<Map<String, Object>> getIform(Map<String, Object> map){
		return componentDao.getIform(map);
	}

	//���� ���� ��ȸ 
	public List<Map<String, Object>> getStatus(Map<String, Object> map){
		return componentDao.getStatus(map);
	}
	
	//��ǰ�� ���� ��ȸ
	public List<Map<String, Object>> getItcls(Map<String, Object> map){
		return componentDao.getItcls(map);
	}
	
	//�����ڱ��� ���� ��ȸ
	public List<Map<String, Object>> getMccod(Map<String, Object> map){
		return componentDao.getMccod(map);
	}
	
	//ǰ������ ���� ��ȸ
	public List<Map<String, Object>> getItemtype(Map<String, Object> map){
		return componentDao.getItemtype(map);
	}
	
	//����
	public List<Map<String, Object>> commonCode1(Map<String, Object> map){
		return componentDao.commonCode1(map);
	}
	
    //���ޱ��� 
	public List<Map<String, Object>> commonCode2(Map<String, Object> map){
		return componentDao.commonCode2(map);
	}
    
    //��ȭ 
	public List<Map<String, Object>> commonCode3(Map<String, Object> map){
		return componentDao.commonCode3(map);
	}
    
    //ǰ������ 
	public List<Map<String, Object>> commonCode4(Map<String, Object> map){
		return componentDao.commonCode4(map);
	}
    
    //������ 
	public List<Map<String, Object>> commonCode5(Map<String, Object> map){
		return componentDao.commonCode5(map);
	}
    
    //�������� 
	public List<Map<String, Object>> commonCode6(Map<String, Object> map){
		return componentDao.commonCode6(map);
	}
    
    //�����ڷ� 
	public List<Map<String, Object>> commonCode7(Map<String, Object> map){
		return componentDao.commonCode7(map);
	}
    
    //�μ� 
	public List<Map<String, Object>> commonCode8(Map<String, Object> map){
		return componentDao.commonCode8(map);
	}
    
    //������� 
	public List<Map<String, Object>> commonCode9(Map<String, Object> map){
		return componentDao.commonCode9(map);
	}
	
    //������� 
	public List<Map<String, Object>> commonCode10(Map<String, Object> map){
		return componentDao.commonCode10(map);
	}
    
    //����ó 
	public List<Map<String, Object>> commonCode11(Map<String, Object> map){
		return componentDao.commonCode11(map);
	}
        
    //����� 
	public List<Map<String, Object>> commonCode12(Map<String, Object> map){
		return componentDao.commonCode12(map);
	}
	
    //�ŷ�ó 
	public List<Map<String, Object>> commonCode13(Map<String, Object> map){
		return componentDao.commonCode13(map);
	}
        
    //�����μ� 
	public List<Map<String, Object>> commonCode14(Map<String, Object> map){
		return componentDao.commonCode14(map);
	}
    
    //������� 
	public List<Map<String, Object>> commonCode15(Map<String, Object> map){
		return componentDao.commonCode15(map);
	}
    
    //��ǰ�ڵ� 
	public List<Map<String, Object>> commonCode16(Map<String, Object> map){
		return componentDao.commonCode16(map);
	}
    
    //���ݱ��� 
	public List<Map<String, Object>> commonCode17(Map<String, Object> map){
		return componentDao.commonCode17(map);
	}
    
    //�Աݱ��� 
	public List<Map<String, Object>> commonCode18(Map<String, Object> map){
		return componentDao.commonCode18(map);
	}
    
    //����ó 
	public List<Map<String, Object>> commonCode19(Map<String, Object> map){
		return componentDao.commonCode19(map);
	}
    
    //�������� 
	public List<Map<String, Object>> commonCode20(Map<String, Object> map){
		return componentDao.commonCode20(map);
	}
    
    //���ҹ�� 
	public List<Map<String, Object>> commonCode21(Map<String, Object> map){
		return componentDao.commonCode21(map);
	}
    
    //���ޱ��� 
	public List<Map<String, Object>> commonCode22(Map<String, Object> map){
		return componentDao.commonCode22(map);
	}
    
    //������ 
	public List<Map<String, Object>> commonCode23(Map<String, Object> map){
		return componentDao.commonCode23(map);
	}
    
    //ǰ������ 
	public List<Map<String, Object>> commonCode24(Map<String, Object> map){
		return componentDao.commonCode24(map);
	}
    
    //��ǰ�� 
	public List<Map<String, Object>> commonCode25(Map<String, Object> map){
		return componentDao.commonCode25(map);
	}
    
    //�˻籸�� 
	public List<Map<String, Object>> commonCode26(Map<String, Object> map){
		return componentDao.commonCode26(map);
	}
    
    //���� 
	public List<Map<String, Object>> commonCode27(Map<String, Object> map){
		return componentDao.commonCode27(map);
	}
    
    //ǰ�񱸺� 
	public List<Map<String, Object>> commonCode28(Map<String, Object> map){
		return componentDao.commonCode28(map);
	}
    
    //�԰����� 
	public List<Map<String, Object>> commonCode29(Map<String, Object> map){
		return componentDao.commonCode29(map);
	}
}
