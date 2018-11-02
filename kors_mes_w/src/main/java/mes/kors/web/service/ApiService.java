package mes.kors.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mes.kors.web.dao.ApiDao;

@Service
@Transactional
public class ApiService {

	@Inject
	ApiDao apiDao;
	
	

	//구매단가발행 조회
	public List<Map<String, Object>> paf06_list(Map<String, Object> map){
		return apiDao.paf06_list(map);
	}
	
	//지출내역발행 조회
	public List<Map<String, Object>> pda12_list(Map<String, Object> map){
		return apiDao.pda12_list(map);
	}

	//견적서 발행(을지) 대메뉴
	public List<Map<String, Object>> scb10_list(Map<String, Object> map){
		/*List<Map<String, Object>> list = apiDao.scb10_list(map);
		int tempNumber = 0; //대분류 코드
		int tempNumber2 = 0;
		
		int location_i = 0;
		
		for(int i = 0; i<list.size(); i++) {
			if(tempNumber < Integer.parseInt(String.valueOf(list.get(i).get("GROUP_NO")))) {
				tempNumber = Integer.parseInt(String.valueOf(list.get(i).get("GROUP_NO")));
				location_i = i;
			}
			
			int cnt = 0; //수량 소계
			int amount = 0; //금액 소계
			
			for(int j = 0; j<list.size(); j++) {
				if(tempNumber == Integer.parseInt(String.valueOf(list.get(j).get("GROUP_NO"))) && Integer.parseInt(String.valueOf(list.get(j).get("PNLNO"))) != tempNumber2 && Integer.parseInt(String.valueOf(list.get(j).get("PNLNO"))) > 0) {
					cnt +=  Integer.parseInt(String.valueOf(list.get(j).get("SOQTY1")));
					amount += Integer.parseInt(String.valueOf(list.get(j).get("SOWAMT1")));
					tempNumber2 = Integer.parseInt(String.valueOf(list.get(j).get("PNLNO")));
				}
			}

			if(amount > 0) {
				list.get(location_i).put("SOQTY1", cnt);
				list.get(location_i).put("SOWAMT1", amount);
			}
		}
		
		return list;*/
		
		return apiDao.scb10_list(map);
	}
	
	//견적서 발행(을지) 중메뉴
	public List<Map<String, Object>> scb10_list2(Map<String, Object> map){
		return apiDao.scb10_list2(map);
	}
	
	//PJT 수주내역 조회
	public List<Map<String, Object>> sea02_list(Map<String, Object> map){
		return apiDao.sea02_list(map);
	}
	
	//PJT 수주내역 조회 상세
	public List<Map<String, Object>> sea02_detail(Map<String, Object> map){
		return apiDao.sea02_detail(map);
	}
	
	//PJT 수주내역 조회 (상세) 조회
	public List<Map<String, Object>> sea12_list1(Map<String, Object> map){
		return apiDao.sea12_list1(map);
	}

	//PJT 수주내역 조회 (업체별) 조회
	public List<Map<String, Object>> sea12_list2(Map<String, Object> map){
		return apiDao.sea12_list2(map);
	}
	
	//PJT 수주내역 조회 (부서별) 조회
	public List<Map<String, Object>> sea12_list3(Map<String, Object> map){
		return apiDao.sea12_list3(map);
	}
	
	//매출내역 종합현황(상세현황) 조회
	public List<Map<String, Object>> sfa05_list1(Map<String, Object> map){
		return apiDao.sfa05_list1(map);
	}
	
	//매출내역 종합현황(거래처별) 조회
	public List<Map<String, Object>> sfa05_list2(Map<String, Object> map){
		return apiDao.sfa05_list2(map);
	}
	
	//매출내역 종합현황(부서별) 조회
	public List<Map<String, Object>> sfa05_list3(Map<String, Object> map){
		return apiDao.sfa05_list3(map);
	}
	
	//수금내역 종합현황(상세현황) 조회
	public List<Map<String, Object>> shb04_list1(Map<String, Object> map){
		return apiDao.shb04_list1(map);
	}
	
	//수금내역 종합현황(거래처별) 조회
	public List<Map<String, Object>> shb04_list2(Map<String, Object> map){
		return apiDao.shb04_list2(map);
	}
	
	//수금내역 종합현황(부서별) 조회
	public List<Map<String, Object>> shb04_list3(Map<String, Object> map){
		return apiDao.shb04_list3(map);
	}
	
	//목표기초원가 발행(자재투입 계획서(갑지))
	public List<Map<String, Object>> pdh04_list1(Map<String, Object> map){
		return apiDao.pdh04_list1(map);
	}
	
	//목표기초원가 발행(자재투입 계획서(을지))
	public List<Map<String, Object>> pdh04_list2(Map<String, Object> map){
		return apiDao.pdh04_list2(map);
	}
	
	//월말요약보고서
	public List<Map<String, Object>> pdd02_list(Map<String, Object> map){
		return apiDao.pdd02_list(map);
	}
	
	//월말요약보고서(stock parts 발주건)
	public List<Map<String, Object>> pdd02_list2(Map<String, Object> map){
		return apiDao.pdd02_list2(map);
	}
	
	//자재투입 상세분석표(수주건별 분석표)
	public List<Map<String, Object>> pdd06_list1(Map<String, Object> map){
		return apiDao.pdd06_list1(map);
	}
	
	//자재투입 상세분석표(수주건별 분석표) 상세
	public List<Map<String, Object>> pdd06_detail1(Map<String, Object> map){
		return apiDao.pdd06_detail1(map);
	}
	
	//자재투입 상세분석표(월별 분석표)
	public List<Map<String, Object>> pdd06_list2(Map<String, Object> map){
		return apiDao.pdd06_list2(map);
	}
	
	//자재투입 상세분석표(월별 분석표)상세
	public List<Map<String, Object>> pdd06_detail2(Map<String, Object> map){
		return apiDao.pdd06_detail2(map);
	}
	
	// 월 발주현황(P/O별 발주상세내역) 조회
	public List<Map<String, Object>> pdb13_list1(Map<String, Object> map){
		return apiDao.pdb13_list1(map);
	}
	
	// 월 발주현황(업체별 발주집계표) 생성 및 조회
	public List<Map<String, Object>> pdb13_list2(Map<String, Object> map){
		return apiDao.pdb13_list2(map);
	}
	
	// 월 발주현황(PJT별 발주집계표) 조회
	public List<Map<String, Object>> pdb13_list3(Map<String, Object> map){
		return apiDao.pdb13_list3(map);
	}
	
	// 월 발주현황(품목별 발주 집계표) 생성 및 조회
	public List<Map<String, Object>> pdb13_list4(Map<String, Object> map){
		return apiDao.pdb13_list4(map);
	}
	
	// 월 발주현황(업체별 발주내역 총집계표) 조회
	public List<Map<String, Object>> pdb13_list5(Map<String, Object> map){
		return apiDao.pdb13_list5(map);
	}
	
	// 월 발주현황(PJT별 발주내역 총집계표) 조회
	public List<Map<String, Object>> pdb13_list6(Map<String, Object> map){
		return apiDao.pdb13_list6(map);
	}
	
	//일자별 자재입고 현황
	public List<Map<String, Object>> peb14_list1(Map<String, Object> map){
		return apiDao.peb14_list1(map);
	}
	
	//일자별 자재입고 현황(작업지시별 입고현황)
	public List<Map<String, Object>> peb14_list2(Map<String, Object> map){
		return apiDao.peb14_list2(map);
	}
	
	//일자별 자재입고 현황(거래처별 입고현황)
	public List<Map<String, Object>> peb14_list3(Map<String, Object> map){
		return apiDao.peb14_list3(map);
	}
	
	//일자별 자재입고 현황(작업지시별/품번별 입고현황)
	public List<Map<String, Object>> peb14_list4(Map<String, Object> map){
		return apiDao.peb14_list4(map);
	}
	
	//설계/발주/입고/출고현황(자재투입진척현황(상세))
	public List<Map<String, Object>> pec12_list1(Map<String, Object> map){
		return apiDao.pec12_list1(map);
	}
	
	//설계/발주/입고/출고현황(자재투입진척현황(집계))
	public List<Map<String, Object>> pec12_list2(Map<String, Object> map){
		return apiDao.pec12_list2(map);
	}
	
	//부품 입고대기 현황
	public List<Map<String, Object>> pea03_list(Map<String, Object> map){
		return apiDao.pea03_list(map);
	}
	
	//부품재고현황조회
	public List<Map<String, Object>> peg01_list(Map<String, Object> map){
		return apiDao.peg01_list(map);
	}
	
	//자재수불 집계표(월별/자재별 수불집계표)
	public List<Map<String, Object>> peg08_list1(Map<String, Object> map){
		return apiDao.peg08_list1(map);
	}

	//자재수불 집계표(월별 금액집계표)
	public List<Map<String, Object>> peg08_list2(Map<String, Object> map){
		return apiDao.peg08_list2(map);
	}
	
	//자재수불 집계표(마감(전)집계표)
	public List<Map<String, Object>> peg08_list3(Map<String, Object> map){
		return apiDao.peg08_list3(map);
	}
	
	//자재수불 집계표(마감(후)집계표)
	public List<Map<String, Object>> peg08_list4(Map<String, Object> map){
		return apiDao.peg08_list4(map);
	}
	
	//자재수불 집계표(실사용 재고리스트)
	public List<Map<String, Object>> peg08_list5(Map<String, Object> map){
		return apiDao.peg08_list5(map);
	}
	
	//자재수불 집계표(기간별/자재별 수불집계표)
	public List<Map<String, Object>> peg08_list6(Map<String, Object> map){
		return apiDao.peg08_list6(map);
	}
	
	//월별 수입검사현황 조회
	public List<Map<String, Object>> pha03_list(Map<String, Object> map){
		return apiDao.pha03_list(map);
	}
	
	//검사 불량현황 발행 조회
	public List<Map<String, Object>> phb04_list(Map<String, Object> map){
		return apiDao.phb04_list(map);
	}
	
	
}
