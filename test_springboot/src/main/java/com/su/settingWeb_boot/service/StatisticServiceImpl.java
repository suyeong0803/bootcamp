package com.su.settingWeb_boot.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.su.settingWeb_boot.dao.StatisticMapper;

@Service
public class StatisticServiceImpl implements StatisticService
{
	@Autowired
	private StatisticMapper uMapper;

	@Override
	public HashMap<String, Object> yearloginNum(String year)
	{
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try
		{
			retVal = uMapper.selectYearLogin(year);
			retVal.put("year", year);
			retVal.put("is_success", true);
		}
		catch(Exception e)
		{
			retVal.put("totCont", -999);
			retVal.put("year", year);
			retVal.put("is_success", false);
		}
		return retVal;
	}

	@Override
	public HashMap<String, Object> monthloginNum(String month) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try
		{
			retVal = uMapper.selectMonthLogin(month);
			retVal.put("month", month);
			retVal.put("is_success", true);
		}
		catch(Exception e)
		{
			retVal.put("totCnt", -999);
			retVal.put("month", month);
			retVal.put("is_success", false);
		}
		return retVal;
	}

	@Override
	public HashMap<String, Object> dayloginNum(String day) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try
		{
			retVal = uMapper.selectDayLogin(day);
			retVal.put("day", day);
			retVal.put("is_success", true);
		}
		catch(Exception e)
		{
			retVal.put("totCnt", -999);
			retVal.put("day", day);
			retVal.put("is_success", false);
		}
		return retVal;
	}

	@Override
	public HashMap<String, Object> avgloginNum() {
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try
		{
			retVal = uMapper.selectAvgLogin();
			retVal.put("is_success", true);
		}
		catch(Exception e)
		{
			retVal.put("cnt", -999);
			retVal.put("is_success", false);
		}
		return retVal;
	}

	@Override
	public HashMap<String, Object> hrMonthloginNum(String hr, String month) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try
		{
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("hr", hr);
			map.put("month", month);
			retVal = uMapper.selectHRMonthLogin(map);
			retVal.put("is_success", true);
		}
		catch(Exception e)
		{
			retVal.put("totCnt", -999);
			retVal.put("hr", hr);
			retVal.put("month", month);
			retVal.put("is_success", false);
		}
		return retVal;
	}
}
