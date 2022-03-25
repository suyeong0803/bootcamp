package com.su.settingWeb_boot.dao;

import java.util.HashMap;
import java.util.List;

import com.su.settingWeb_boot.dto.StatisticDto;

public interface StatisticMapper
{
	public HashMap<String, Object> selectYearLogin(String year);
	public HashMap<String, Object> selectMonthLogin(String month);
	public HashMap<String, Object> selectDayLogin(String day);
	public HashMap<String, Object> selectAvgLogin();
	public HashMap<String, Object> selectHRMonthLogin(HashMap<String, String> map);
	public List<StatisticDto> selectHolYearLogin(String year);
}
