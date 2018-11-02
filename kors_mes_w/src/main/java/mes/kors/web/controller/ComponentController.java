package mes.kors.web.controller;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import mes.kors.web.service.ComponentService;

@Controller
public class ComponentController {

	@Inject
	ComponentService componentService;
	
	

	/*
	 * component (selectbox) 
	 * 
	 * ��ȸ���� ���� ��ȸ
	 */
	
	
	
	//ǰ������ (selectbox) ��ȸ
	@RequestMapping("/common/component/getIform")
	public void getIform(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.getIform(map);
		common2(response, list);
	}
	

	//���� ���� (selectBox) ��ȸ 
	@RequestMapping("/common/component/getStatus")
	public void getStatus(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.getStatus(map);
		common2(response, list);
	}
	
	//��ǰ�� ���� ��ȸ
	@RequestMapping("/common/component/getItcls")
	public void getItcls(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.getItcls(map);
		common2(response, list);
	}
	
	//�����ڱ��� ���� ��ȸ
	@RequestMapping("/common/component/getMccod")
	public void getMccod(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.getMccod(map);
		common2(response, list);
	}
	
	//ǰ������ ���� ��ȸ
	@RequestMapping("/common/component/getItemtype")
	public void getItemtype(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.getItemtype(map);
		common2(response, list);
	}
	
	//����
	@RequestMapping("/common/component/commonCode1")
	public void commonCode1(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode1(map);
		common2(response, list);
	}

    //���ޱ��� 
	@RequestMapping("/common/component/commonCode2")
	public void commonCode2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode2(map);
		common2(response, list);
	}
	
    //��ȭ 
	@RequestMapping("/common/component/commonCode3")
	public void commonCode3(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode3(map);
		common2(response, list);
	}
    
    //ǰ������ 
	@RequestMapping("/common/component/commonCode4")
	public void commonCode4(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode4(map);
		common2(response, list);
	}
    
    //������ 
	@RequestMapping("/common/component/commonCode5")
	public void commonCode5(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode5(map);
		common2(response, list);
	}
    
    //�������� 
	@RequestMapping("/common/component/commonCode6")
	public void commonCode6(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode6(map);
		common2(response, list);
	}
    
    //�����ڷ� 
	@RequestMapping("/common/component/commonCode7")
	public void commonCode7(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode7(map);
		common2(response, list);
	}
    
    //�μ� 
	@RequestMapping("/common/component/commonCode8")
	public void commonCode8(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode8(map);
		common2(response, list);
	}
    
    //������� 
	@RequestMapping("/common/component/commonCode9")
	public void commonCode9(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode9(map);
		common2(response, list);
	}
	
    //������� 
	@RequestMapping("/common/component/commonCode10")
	public void commonCode10(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode10(map);
		common2(response, list);
	}
    
    //����ó 
	@RequestMapping("/common/component/commonCode11")
	public void commonCode11(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode11(map);
		common2(response, list);
	}
        
    //����� 
	@RequestMapping("/common/component/commonCode12")
	public void commonCode12(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode12(map);
		common2(response, list);
	}
	
    //�ŷ�ó 
	@RequestMapping("/common/component/commonCode13")
	public void commonCode13(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode13(map);
		common2(response, list);
	}
        
    //�����μ� 
	@RequestMapping("/common/component/commonCode14")
	public void commonCode14(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode14(map);
		common2(response, list);
	}
    
    //������� 
	@RequestMapping("/common/component/commonCode15")
	public void commonCode15(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode15(map);
		common2(response, list);
	}
    
    //��ǰ�ڵ� 
	@RequestMapping("/common/component/commonCode16")
	public void commonCode16(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode16(map);
		common2(response, list);
	}
    
    //���ݱ��� 
	@RequestMapping("/common/component/commonCode17")
	public void commonCode17(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode17(map);
		common2(response, list);
	}
    
    //�Աݱ��� 
	@RequestMapping("/common/component/commonCode18")
	public void commonCode18(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode18(map);
		common2(response, list);
	}
    
    //����ó 
	@RequestMapping("/common/component/commonCode19")
	public void commonCode19(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode19(map);
		common2(response, list);
	}
    
    //�������� 
	@RequestMapping("/common/component/commonCode20")
	public void commonCode20(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode20(map);
		common2(response, list);
	}
    
    //���ҹ�� 
	@RequestMapping("/common/component/commonCode21")
	public void commonCode21(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode21(map);
		common2(response, list);
	}
    
    //���ޱ��� 
	@RequestMapping("/common/component/commonCode22")
	public void commonCode22(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode22(map);
		common2(response, list);
	}
    
    //������ 
	@RequestMapping("/common/component/commonCode23")
	public void commonCode23(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode23(map);
		common2(response, list);
	}
    
    //ǰ������ 
	@RequestMapping("/common/component/commonCode24")
	public void commonCode24(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode24(map);
		common2(response, list);
	}
    
    //��ǰ�� 
	@RequestMapping("/common/component/commonCode25")
	public void commonCode25(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode25(map);
		common2(response, list);
	}
    
    //�˻籸�� 
	@RequestMapping("/common/component/commonCode26")
	public void commonCode26(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode26(map);
		common2(response, list);
	}
    
    //���� 
	@RequestMapping("/common/component/commonCode27")
	public void commonCode27(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode27(map);
		common2(response, list);
	}
    
    //ǰ�񱸺� 
	@RequestMapping("/common/component/commonCode28")
	public void commonCode28(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode28(map);
		common2(response, list);
	}
    
    //�԰����� 
	@RequestMapping("/common/component/commonCode29")
	public void commonCode29(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode29(map);
		common2(response, list);
	}
	
	//���� 
	@RequestMapping("/common/component/commonCode30")
	public void commonCode30(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode30(map);
		common2(response, list);
	}
	
	//��ġ����
	@RequestMapping("/common/component/commonCode31")
	public void commonCode31(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode31(map);
		common2(response, list);
	}
	
	//�˻���
	@RequestMapping("/common/component/commonCode32")
	public void commonCode32(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode32(map);
		common2(response, list);
	}
	
	//�ҷ��׸�
	@RequestMapping("/common/component/commonCode33")
	public void commonCode33(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode33(map);
		common2(response, list);
	}
	
	//�˻�����
	@RequestMapping("/common/component/commonCode34")
	public void commonCode34(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode34(map);
		common2(response, list);
	}
	
	//�˻籸��
	@RequestMapping("/common/component/commonCode35")
	public void commonCode35(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode35(map);
		common2(response, list);
	}
	
	//����
	@RequestMapping("/common/component/commonCode36")
	public void commonCode36(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode36(map);
		common2(response, list);
	}
	
	//��������
	@RequestMapping("/common/component/commonCode37")
	public void commonCode37(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode37(map);
		common2(response, list);
	}

	//��ġ����
	@RequestMapping("/common/component/commonCode38")
	public void commonCode38(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode38(map);
		common2(response, list);
	}
	
	//���걸��
	@RequestMapping("/common/component/commonCode39")
	public void commonCode39(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode39(map);
		common2(response, list);
	}

	//�ֹ�����
	@RequestMapping("/common/component/commonCode40")
	public void commonCode40(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode40(map);
		common2(response, list);
	}
	
	//�������
	@RequestMapping("/common/component/commonCode41")
	public void commonCode41(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode41(map);
		common2(response, list);
	}
	
	//���ֱ���
	@RequestMapping("/common/component/commonCode42")
	public void commonCode42(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode42(map);
		common2(response, list);
	}
	
	//�������
	@RequestMapping("/common/component/commonCode43")
	public void commonCode43(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode43(map);
		common2(response, list);
	}
	
	//��������
	@RequestMapping("/common/component/commonCode44")
	public void commonCode44(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = componentService.commonCode44(map);
		common2(response, list);
	}
	
	
	
	
	
	
	

	
	
	public Map<String, Object> common1(HttpServletRequest request, HttpServletResponse response, Map<String,Object> map){
		try {
			response.setContentType("text/json; charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			
			String body = IOUtils.toString(request.getInputStream(), "UTF-8");
			JsonFactory factory = new JsonFactory();
			JsonParser parser = factory.createParser(body);
			
			while(!parser.isClosed()) {
				JsonToken jsonToken = parser.nextToken();
				
				if(JsonToken.FIELD_NAME.equals(jsonToken)) {
					String fieldName = parser.getCurrentName();
					jsonToken = parser.nextToken();
					String fieldValue = parser.getValueAsString();
					Object DataValue = fieldValue;
					map.put(fieldName, fieldValue);
				}
			}
		}catch(Exception e) {}
		
		return map;
	}
	
	public void common2(HttpServletResponse response, List<Map<String, Object>> list) {
		try {
			PrintWriter out = response.getWriter();
			
			try {
				JSONArray  jsonarr = new JSONArray();
				
				for(Map<String, Object> map : list) {
					JSONObject jsonobj = new JSONObject();
					
					for(Map.Entry<String, Object> entry : map.entrySet()) {
						String key = entry.getKey();
						Object value = entry.getValue();
						
						try {
							jsonobj.put(key, value);
						}catch (Exception e) {
							e.printStackTrace();
						}
					}
					
					jsonarr.add(jsonobj);
				}
				
				System.out.println("data : " + jsonarr.toString());
				out.println(jsonarr.toString());
			}catch (Exception ex) {
				out.println("error");
			}finally {
				out.flush();
				out.close();
			}
		}catch (Exception e) {}
	}
	
}
