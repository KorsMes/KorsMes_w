package mes.kors.web.controller;

import java.io.PrintWriter;
import java.util.HashMap;
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
	 * page별 정보 조회
	 * 
	 */
	
	
	// 구매단가발행 조회
	@RequestMapping("/paf/paf06_list")
	public void getPaf06_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.paf06_list(map);
		common2(response, list);
	}

	//지출내역발행 조회
	@RequestMapping("/pda/pda12_list")
	public void getPda12_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pda12_list(map);
		common2(response, list);
	}
	
	//견적서 발행(을지)
	@RequestMapping("/scb/scb10_list")
	public void getScb10_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.scb10_list(map);
		common2(response, list);
	}
	
	//PJT 수주내역 조회 (상세) 조회
	@RequestMapping("/sea/sea12_list1")
	public void getSea12_list1(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.sea12_list1(map);
		common2(response, list);
	}
	
	//PJT 수주내역 조회 (업체별) 조회
	@RequestMapping("/sea/sea12_list2")
	public void getSea12_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.sea12_list2(map);
		common2(response, list);
	}
	
	//PJT 수주내역 조회 (부서별) 조회
	@RequestMapping("/sea/sea12_list3")
	public void getSea12_list3(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.sea12_list3(map);
		common2(response, list);
	}
	
	//매출내역 종합현황(상세현황) 조회
	@RequestMapping("/sfa/sfa05_list1")
	public void getSfa05_list1(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.sfa05_list1(map);
		common2(response, list);
	}
	
	//매출내역 종합현황(거래처별) 조회
	@RequestMapping("/sfa/sfa05_list2")
	public void getSfa05_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.sfa05_list2(map);
		common2(response, list);
	}
	
	//매출내역 종합현황(부서별) 조회
	@RequestMapping("/sfa/sfa05_list3")
	public void getSfa05_list3(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.sfa05_list3(map);
		common2(response, list);
	}
	
	//수금내역 종합현황(상세현황) 조회
	@RequestMapping("/shb/shb04_list1")
	public void getShb04_list1(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.shb04_list1(map);
		common2(response, list);
	}
	
	//수금내역 종합현황(거래처별) 조회
	@RequestMapping("/shb/shb04_list2")
	public void getShb04_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.shb04_list2(map);
		common2(response, list);
	}
	
	//수금내역 종합현황(부서별) 조회
	@RequestMapping("/shb/shb04_list3")
	public void getShb04_list3(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.shb04_list3(map);
		common2(response, list);
	}
	
	//목표기초원가 발행(자재투입 계획서(갑지))
	@RequestMapping("/pdh/pdh04_list1")
	public void getPdh04_list1(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pdh04_list1(map);
		common2(response, list);
	}
	
	//목표기초원가 발행(자재투입 계획서(을지))
	@RequestMapping("/pdh/pdh04_list2")
	public void getPdh04_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pdh04_list2(map);
		common2(response, list);
	}
	
	//월별 수입검사현황 조회
	@RequestMapping("/pha/pha03_list")
	public void getPha03_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = apiService.pha03_list(map);
		common2(response, list);
	}
	
	//검사 불량현황 발행 조회
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
