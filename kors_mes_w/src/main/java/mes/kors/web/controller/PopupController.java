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

import mes.kors.web.service.PopupService;

@Controller
public class PopupController {

	@Inject
	PopupService popupService;
	
	
	

	
	/*
	 * popup 정보 조회
	 * 
	 * param : search keyword
	 */
	
	//품목코드 정보 조회
	@RequestMapping("/common/popup/itnbr")
	public void itnbr_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = popupService.itnbr_list(map);
		common2(response, list);
	}
	
	//협력업체 정보 조회
	@RequestMapping("/common/popup/buyer")
	public void buyer_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = popupService.buyer_list(map);
		common2(response, list);
	}
	
	//소속부서 조회 	
	@RequestMapping("/common/popup/dept_list")
	public void dept_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = popupService.dept_list(map);
		common2(response, list);
	}
	
	//사용자 조회 
	@RequestMapping("/common/popup/user_list")
	public void user_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = popupService.user_list(map);
		common2(response, list);
	}
	
	//프로젝트번호 조회 
	@RequestMapping("/common/popup/pjtno_list")
	public void pjtno_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = popupService.pjtno_list(map);
		common2(response, list);
	}
	
	
	//pjt번호 조회 
	@RequestMapping("/common/popup/pdtno_list")
	public void pdtno_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = popupService.pdtno_list(map);
		common2(response, list);
	}
	
	//pjt번호 조회 
	@RequestMapping("/common/popup/pjtno_list2")
	public void pjtno_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = popupService.pjtno_list2(map);
		common2(response, list);
	}
	
	//pur번호 조회 
	@RequestMapping("/common/popup/purno_list")
	public void purno_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = popupService.purno_list(map);
		common2(response, list);
	}
	
	//공정 정보 조회 
	@RequestMapping("/common/popup/task_list")
	public void task_list(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = popupService.task_list(map);
		common2(response, list);
	}
	
	//pjt번호3 정보 조회 
	@RequestMapping("/common/popup/pjtno_list3")
	public void pjtno_list3(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = popupService.pjtno_list3(map);
		common2(response, list);
	}
	
	//품목코드2 정보 조회 
	@RequestMapping("/common/popup/itnbr_list2")
	public void itnbr_list2(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		map = common1(request, response, map);
		List<Map<String, Object>> list = popupService.itnbr_list2(map);
		common2(response, list);
	}
	
	
	//test222
	
	
	

	
	
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
