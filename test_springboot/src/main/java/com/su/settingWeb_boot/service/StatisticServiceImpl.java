package com.su.settingWeb_boot.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.su.settingWeb_boot.dao.StatisticMapper;
import com.su.settingWeb_boot.dto.StatisticDto;

@Service
public class StatisticServiceImpl implements StatisticService {
	@Autowired
	private StatisticMapper uMapper;

	@Override
	public HashMap<String, Object> yearloginNum(String year) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();

		try {
			retVal = uMapper.selectYearLogin(year);
			retVal.put("year", year);
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("totCont", -999);
			retVal.put("year", year);
			retVal.put("is_success", false);
		}
		return retVal;
	}

	@Override
	public HashMap<String, Object> monthloginNum(String month) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();

		try {
			retVal = uMapper.selectMonthLogin(month);
			retVal.put("month", month);
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("month", month);
			retVal.put("is_success", false);
		}
		return retVal;
	}

	@Override
	public HashMap<String, Object> dayloginNum(String day) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();

		try {
			retVal = uMapper.selectDayLogin(day);
			retVal.put("day", day);
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("day", day);
			retVal.put("is_success", false);
		}
		return retVal;
	}

	@Override
	public HashMap<String, Object> avgloginNum() {
		HashMap<String, Object> retVal = new HashMap<String, Object>();

		try {
			retVal = uMapper.selectAvgLogin();
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("cnt", -999);
			retVal.put("is_success", false);
		}
		return retVal;
	}

	@Override
	public HashMap<String, Object> hrMonthloginNum(String hr, String month) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();

		try {
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("hr", hr);
			map.put("month", month);
			retVal = uMapper.selectHRMonthLogin(map);
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("hr", hr);
			retVal.put("month", month);
			retVal.put("is_success", false);
		}
		return retVal;
	}

	@Override
	public HashMap<String, Object> holYearloginNum(String year) {
		List<StatisticDto> dto_list = uMapper.selectHolYearLogin(year);
		
		// URL 생성
		StringBuffer sb = new StringBuffer("http://apis.data.go.kr/B090041/openapi/service/SpcdeInfoService/getRestDeInfo?");

		sb.append("ServiceKey=rhJPMswhKbiLB5UEbsTD1pYtH%2B%2FiH9bGwjDpo%2F52%2BmyuKTqQwGGWT7vBRma2sBUVd9T349%2BiDwrKNyITpgBN5Q%3D%3D");
		sb.append("&solYear=20" + year);

		URL url;
		HttpURLConnection conn;
		
		SAXBuilder builder = new SAXBuilder();
		Document document = null;
		try {
			url = new URL(sb.toString());
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestProperty("Content-Type", "application/xml");
			conn.connect();
			
			document = builder.build(conn.getInputStream());
		} catch (IOException | JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Element root = document.getRootElement();
		Element body = root.getChild("body");
		Element items = body.getChild("items");
		List<Element> item_list = items.getChildren("item");

		// 데이터 문자열로 받기
		
		for (Element item : item_list) {
			String locdate = item.getChildText("locdate");
			for(int i = 0; i<dto_list.size(); i++)
			{
				String search_year = "20" + dto_list.get(i).getCreateDate();
				if(locdate.equals(search_year)) {dto_list.remove(i); i--;}
			}
		}
		
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		retVal.put("totCount", dto_list.size());
		return retVal;
	}
}
