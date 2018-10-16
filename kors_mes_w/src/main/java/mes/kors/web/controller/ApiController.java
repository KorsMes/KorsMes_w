package mes.kors.web.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.ibatis.session.SqlSession;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import mes.kors.web.service.ApiService;

@Controller
public class ApiController {

	@Inject
	ApiService apiService;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	
	/*
	 * page�� ���� ��ȸ
	 * 
	 */
	
	@Inject
	SqlSession sqlSession;
	
	
	// ���Ŵܰ����� ��ȸ
	@RequestMapping("/paf/paf06_list")
	public void getPaf06_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.paf06_list(map);
		common2(response, list);
	}

	//���⳻������ ��ȸ
	@RequestMapping("/pda/pda12_list")
	public void getPda12_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pda12_list(map);
		common2(response, list);
	}
	
	//������ ����(����)
	@RequestMapping("/scb/scb10_list")
	public void getScb10_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.scb10_list(map);
		common2(response, list);
	}
	
	//PJT ���ֳ��� ��ȸ
	@RequestMapping("/sea/sea02_list")
	public void getSea02_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.sea02_list(map);
		common2(response, list);
	}
	
	//PJT ���ֳ��� ��ȸ (��) ��ȸ
	@RequestMapping("/sea/sea12_list1")
	public void getSea12_list1(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.sea12_list1(map);
		common2(response, list);
	}
	
	//PJT ���ֳ��� ��ȸ (��ü��) ��ȸ
	@RequestMapping("/sea/sea12_list2")
	public void getSea12_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.sea12_list2(map);
		common2(response, list);
	}
	
	//PJT ���ֳ��� ��ȸ (�μ���) ��ȸ
	@RequestMapping("/sea/sea12_list3")
	public void getSea12_list3(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.sea12_list3(map);
		common2(response, list);
	}
	
	//���⳻�� ������Ȳ(����Ȳ) ��ȸ
	@RequestMapping("/sfa/sfa05_list1")
	public void getSfa05_list1(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.sfa05_list1(map);
		common2(response, list);
	}
	
	//���⳻�� ������Ȳ(�ŷ�ó��) ��ȸ
	@RequestMapping("/sfa/sfa05_list2")
	public void getSfa05_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.sfa05_list2(map);
		common2(response, list);
	}
	
	//���⳻�� ������Ȳ(�μ���) ��ȸ
	@RequestMapping("/sfa/sfa05_list3")
	public void getSfa05_list3(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.sfa05_list3(map);
		common2(response, list);
	}
	
	//���ݳ��� ������Ȳ(����Ȳ) ��ȸ
	@RequestMapping("/shb/shb04_list1")
	public void getShb04_list1(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.shb04_list1(map);
		common2(response, list);
	}
	
	//���ݳ��� ������Ȳ(�ŷ�ó��) ��ȸ
	@RequestMapping("/shb/shb04_list2")
	public void getShb04_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.shb04_list2(map);
		common2(response, list);
	}
	
	//���ݳ��� ������Ȳ(�μ���) ��ȸ
	@RequestMapping("/shb/shb04_list3")
	public void getShb04_list3(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.shb04_list3(map);
		common2(response, list);
	}
	
	//��ǥ���ʿ��� ����(�������� ��ȹ��(����))
	@RequestMapping("/pdh/pdh04_list1")
	public void getPdh04_list1(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pdh04_list1(map);
		common2(response, list);
	}
	
	//��ǥ���ʿ��� ����(�������� ��ȹ��(����))
	@RequestMapping("/pdh/pdh04_list2")
	public void getPdh04_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pdh04_list2(map);
		common2(response, list);
	}
	
	//�������� �󼼺м�ǥ(���ְǺ� �м�ǥ)
	@RequestMapping("/pdd/pdd06_list1")
	public void getPdd06_list1(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pdd06_list1(map);
		common2(response, list);
	}
	
	//�������� �󼼺м�ǥ(���� �м�ǥ)
	@RequestMapping("/pdd/pdd06_list2")
	public void getPdd06_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pdd06_list2(map);
		common2(response, list);
	}
	
	//�� ������Ȳ(P/O�� ���ֻ󼼳���) ��ȸ
	@RequestMapping("/pdb/pdb13_list1")
	public void getPdb13_list1(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pdb13_list1(map);
		common2(response, list);
	}
	
	// �� ������Ȳ(��ü�� ��������ǥ) ���� �� ��ȸ
	@RequestMapping("/pdb/pdb13_list2")
	public void getPdb13_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pdb13_list2(map);
		common2(response, list);
	}
	
	// �� ������Ȳ(PJT�� ��������ǥ) ��ȸ
	@RequestMapping("/pdb/pdb13_list3")
	public void getPdb13_list3(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pdb13_list3(map);
		common2(response, list);
	}
	
	// �� ������Ȳ(ǰ�� ���� ����ǥ) ���� �� ��ȸ
	@RequestMapping("/pdb/pdb13_list4")
	public void getPdb13_list4(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pdb13_list4(map);
		common2(response, list);
	}
	
	// �� ������Ȳ(��ü�� ���ֳ��� ������ǥ) ��ȸ
	@RequestMapping("/pdb/pdb13_list5")
	public void getPdb13_list5(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pdb13_list5(map);
		common2(response, list);
	}
	
	// �� ������Ȳ(PJT�� ���ֳ��� ������ǥ) ��ȸ
	@RequestMapping("/pdb/pdb13_list6")
	public void getPdb13_list6(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pdb13_list6(map);
		common2(response, list);
	}
	
	//���ں� �����԰� ��Ȳ 
	@RequestMapping("/peb/peb14_list1")
	public void getPeb14_list1(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.peb14_list1(map);
		common2(response, list);
	}
	
	//���ں� �����԰� ��Ȳ(�۾����ú� �԰���Ȳ)
	@RequestMapping("/peb/peb14_list2")
	public void getPeb14_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.peb14_list2(map);
		common2(response, list);
	}
	
	//���ں� �����԰� ��Ȳ(�ŷ�ó�� �԰���Ȳ)
	@RequestMapping("/peb/peb14_list3")
	public void getPeb14_list3(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.peb14_list3(map);
		common2(response, list);
	}
	
	//���ں� �����԰� ��Ȳ(�۾����ú�/ǰ���� �԰���Ȳ)
	@RequestMapping("/peb/peb14_list4")
	public void getPeb14_list4(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.peb14_list4(map);
		common2(response, list);
	}
	
	//����/����/�԰�/�����Ȳ(����������ô��Ȳ(��))
	@RequestMapping("/pec/pec12_list1")
	public void pec12_list1(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pec12_list1(map);
		common2(response, list);
	}
	
	//����/����/�԰�/�����Ȳ(����������ô��Ȳ(����))
	@RequestMapping("/pec/pec12_list2")
	public void pec12_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pec12_list2(map);
		common2(response, list);
	}
	
	//��ǰ �԰��� ��Ȳ
	@RequestMapping("/pea/pea03_list")
	public void pea03_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pea03_list(map);
		common2(response, list);
	}
	
	//������� ����ǥ(����/���纰 ��������ǥ)
	@RequestMapping("/peg/peg08_list1")
	public void peg08_list1(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.peg08_list1(map);
		common2(response, list);
	}

	//������� ����ǥ(���� �ݾ�����ǥ)
	@RequestMapping("/peg/peg08_list2")
	public void peg08_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.peg08_list2(map);
		common2(response, list);
	}
	
	//������� ����ǥ(����(��)����ǥ)
	@RequestMapping("/peg/peg08_list3")
	public void peg08_list3(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.peg08_list3(map);
		common2(response, list);
	}
	
	//������� ����ǥ(����(��)����ǥ)
	@RequestMapping("/peg/peg08_list4")
	public void peg08_list4(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.peg08_list4(map);
		common2(response, list);
	}
	
	//������� ����ǥ(�ǻ�� �����Ʈ)
	@RequestMapping("/peg/peg08_list5")
	public void peg08_list5(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.peg08_list5(map);
		common2(response, list);
	}
	
	//������� ����ǥ(�Ⱓ��/���纰 ��������ǥ)
	@RequestMapping("/peg/peg08_list6")
	public void peg08_list6(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.peg08_list6(map);
		common2(response, list);
	}
	
	//���� ���԰˻���Ȳ ��ȸ
	@RequestMapping("/pha/pha03_list")
	public void getPha03_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pha03_list(map);
		common2(response, list);
	}
	
	//�˻� �ҷ���Ȳ ���� ��ȸ
	@RequestMapping("/phb/phb04_list")
	public void getPhb04_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.phb04_list(map);
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
				
				//System.out.println("data : " + jsonarr.toString());
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
