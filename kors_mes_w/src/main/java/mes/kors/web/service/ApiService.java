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
	
	

	//���Ŵܰ����� ��ȸ
	public List<Map<String, Object>> paf06_list(Map<String, Object> map){
		return apiDao.paf06_list(map);
	}
	
	//���⳻������ ��ȸ
	public List<Map<String, Object>> pda12_list(Map<String, Object> map){
		return apiDao.pda12_list(map);
	}

	//������ ����(����) ��޴�
	public List<Map<String, Object>> scb10_list(Map<String, Object> map){
		/*List<Map<String, Object>> list = apiDao.scb10_list(map);
		int tempNumber = 0; //��з� �ڵ�
		int tempNumber2 = 0;
		
		int location_i = 0;
		
		for(int i = 0; i<list.size(); i++) {
			if(tempNumber < Integer.parseInt(String.valueOf(list.get(i).get("GROUP_NO")))) {
				tempNumber = Integer.parseInt(String.valueOf(list.get(i).get("GROUP_NO")));
				location_i = i;
			}
			
			int cnt = 0; //���� �Ұ�
			int amount = 0; //�ݾ� �Ұ�
			
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
	
	//������ ����(����) �߸޴�
	public List<Map<String, Object>> scb10_list2(Map<String, Object> map){
		return apiDao.scb10_list2(map);
	}
	
	//PJT ���ֳ��� ��ȸ
	public List<Map<String, Object>> sea02_list(Map<String, Object> map){
		return apiDao.sea02_list(map);
	}
	
	//PJT ���ֳ��� ��ȸ ��
	public List<Map<String, Object>> sea02_detail(Map<String, Object> map){
		return apiDao.sea02_detail(map);
	}
	
	//PJT ���ֳ��� ��ȸ (��) ��ȸ
	public List<Map<String, Object>> sea12_list1(Map<String, Object> map){
		return apiDao.sea12_list1(map);
	}

	//PJT ���ֳ��� ��ȸ (��ü��) ��ȸ
	public List<Map<String, Object>> sea12_list2(Map<String, Object> map){
		return apiDao.sea12_list2(map);
	}
	
	//PJT ���ֳ��� ��ȸ (�μ���) ��ȸ
	public List<Map<String, Object>> sea12_list3(Map<String, Object> map){
		return apiDao.sea12_list3(map);
	}
	
	//���⳻�� ������Ȳ(����Ȳ) ��ȸ
	public List<Map<String, Object>> sfa05_list1(Map<String, Object> map){
		return apiDao.sfa05_list1(map);
	}
	
	//���⳻�� ������Ȳ(�ŷ�ó��) ��ȸ
	public List<Map<String, Object>> sfa05_list2(Map<String, Object> map){
		return apiDao.sfa05_list2(map);
	}
	
	//���⳻�� ������Ȳ(�μ���) ��ȸ
	public List<Map<String, Object>> sfa05_list3(Map<String, Object> map){
		return apiDao.sfa05_list3(map);
	}
	
	//���ݳ��� ������Ȳ(����Ȳ) ��ȸ
	public List<Map<String, Object>> shb04_list1(Map<String, Object> map){
		return apiDao.shb04_list1(map);
	}
	
	//���ݳ��� ������Ȳ(�ŷ�ó��) ��ȸ
	public List<Map<String, Object>> shb04_list2(Map<String, Object> map){
		return apiDao.shb04_list2(map);
	}
	
	//���ݳ��� ������Ȳ(�μ���) ��ȸ
	public List<Map<String, Object>> shb04_list3(Map<String, Object> map){
		return apiDao.shb04_list3(map);
	}
	
	//��ǥ���ʿ��� ����(�������� ��ȹ��(����))
	public List<Map<String, Object>> pdh04_list1(Map<String, Object> map){
		return apiDao.pdh04_list1(map);
	}
	
	//��ǥ���ʿ��� ����(�������� ��ȹ��(����))
	public List<Map<String, Object>> pdh04_list2(Map<String, Object> map){
		return apiDao.pdh04_list2(map);
	}
	
	//������ຸ��
	public List<Map<String, Object>> pdd02_list(Map<String, Object> map){
		return apiDao.pdd02_list(map);
	}
	
	//������ຸ��(stock parts ���ְ�)
	public List<Map<String, Object>> pdd02_list2(Map<String, Object> map){
		return apiDao.pdd02_list2(map);
	}
	
	//�������� �󼼺м�ǥ(���ְǺ� �м�ǥ)
	public List<Map<String, Object>> pdd06_list1(Map<String, Object> map){
		return apiDao.pdd06_list1(map);
	}
	
	//�������� �󼼺м�ǥ(���ְǺ� �м�ǥ) ��
	public List<Map<String, Object>> pdd06_detail1(Map<String, Object> map){
		return apiDao.pdd06_detail1(map);
	}
	
	//�������� �󼼺м�ǥ(���� �м�ǥ)
	public List<Map<String, Object>> pdd06_list2(Map<String, Object> map){
		return apiDao.pdd06_list2(map);
	}
	
	//�������� �󼼺м�ǥ(���� �м�ǥ)��
	public List<Map<String, Object>> pdd06_detail2(Map<String, Object> map){
		return apiDao.pdd06_detail2(map);
	}
	
	// �� ������Ȳ(P/O�� ���ֻ󼼳���) ��ȸ
	public List<Map<String, Object>> pdb13_list1(Map<String, Object> map){
		return apiDao.pdb13_list1(map);
	}
	
	// �� ������Ȳ(��ü�� ��������ǥ) ���� �� ��ȸ
	public List<Map<String, Object>> pdb13_list2(Map<String, Object> map){
		return apiDao.pdb13_list2(map);
	}
	
	// �� ������Ȳ(PJT�� ��������ǥ) ��ȸ
	public List<Map<String, Object>> pdb13_list3(Map<String, Object> map){
		return apiDao.pdb13_list3(map);
	}
	
	// �� ������Ȳ(ǰ�� ���� ����ǥ) ���� �� ��ȸ
	public List<Map<String, Object>> pdb13_list4(Map<String, Object> map){
		return apiDao.pdb13_list4(map);
	}
	
	// �� ������Ȳ(��ü�� ���ֳ��� ������ǥ) ��ȸ
	public List<Map<String, Object>> pdb13_list5(Map<String, Object> map){
		return apiDao.pdb13_list5(map);
	}
	
	// �� ������Ȳ(PJT�� ���ֳ��� ������ǥ) ��ȸ
	public List<Map<String, Object>> pdb13_list6(Map<String, Object> map){
		return apiDao.pdb13_list6(map);
	}
	
	//���ں� �����԰� ��Ȳ
	public List<Map<String, Object>> peb14_list1(Map<String, Object> map){
		return apiDao.peb14_list1(map);
	}
	
	//���ں� �����԰� ��Ȳ(�۾����ú� �԰���Ȳ)
	public List<Map<String, Object>> peb14_list2(Map<String, Object> map){
		return apiDao.peb14_list2(map);
	}
	
	//���ں� �����԰� ��Ȳ(�ŷ�ó�� �԰���Ȳ)
	public List<Map<String, Object>> peb14_list3(Map<String, Object> map){
		return apiDao.peb14_list3(map);
	}
	
	//���ں� �����԰� ��Ȳ(�۾����ú�/ǰ���� �԰���Ȳ)
	public List<Map<String, Object>> peb14_list4(Map<String, Object> map){
		return apiDao.peb14_list4(map);
	}
	
	//����/����/�԰�/�����Ȳ(����������ô��Ȳ(��))
	public List<Map<String, Object>> pec12_list1(Map<String, Object> map){
		return apiDao.pec12_list1(map);
	}
	
	//����/����/�԰�/�����Ȳ(����������ô��Ȳ(����))
	public List<Map<String, Object>> pec12_list2(Map<String, Object> map){
		return apiDao.pec12_list2(map);
	}
	
	//��ǰ �԰��� ��Ȳ
	public List<Map<String, Object>> pea03_list(Map<String, Object> map){
		return apiDao.pea03_list(map);
	}
	
	//��ǰ�����Ȳ��ȸ
	public List<Map<String, Object>> peg01_list(Map<String, Object> map){
		return apiDao.peg01_list(map);
	}
	
	//������� ����ǥ(����/���纰 ��������ǥ)
	public List<Map<String, Object>> peg08_list1(Map<String, Object> map){
		return apiDao.peg08_list1(map);
	}

	//������� ����ǥ(���� �ݾ�����ǥ)
	public List<Map<String, Object>> peg08_list2(Map<String, Object> map){
		return apiDao.peg08_list2(map);
	}
	
	//������� ����ǥ(����(��)����ǥ)
	public List<Map<String, Object>> peg08_list3(Map<String, Object> map){
		return apiDao.peg08_list3(map);
	}
	
	//������� ����ǥ(����(��)����ǥ)
	public List<Map<String, Object>> peg08_list4(Map<String, Object> map){
		return apiDao.peg08_list4(map);
	}
	
	//������� ����ǥ(�ǻ�� �����Ʈ)
	public List<Map<String, Object>> peg08_list5(Map<String, Object> map){
		return apiDao.peg08_list5(map);
	}
	
	//������� ����ǥ(�Ⱓ��/���纰 ��������ǥ)
	public List<Map<String, Object>> peg08_list6(Map<String, Object> map){
		return apiDao.peg08_list6(map);
	}
	
	//���� ���԰˻���Ȳ ��ȸ
	public List<Map<String, Object>> pha03_list(Map<String, Object> map){
		return apiDao.pha03_list(map);
	}
	
	//�˻� �ҷ���Ȳ ���� ��ȸ
	public List<Map<String, Object>> phb04_list(Map<String, Object> map){
		return apiDao.phb04_list(map);
	}
	
	
}
