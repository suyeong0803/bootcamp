package com.su.settingWeb_boot.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;

import org.jdom2.JDOMException;

public interface StatisticService 
{
	public HashMap<String, Object> yearloginNum(String year);
	public HashMap<String, Object> monthloginNum(String month);
	public HashMap<String, Object> dayloginNum(String day);
	public HashMap<String, Object> avgloginNum();
	public HashMap<String, Object> holYearloginNum(String year) throws MalformedURLException, IOException, JDOMException;
	public HashMap<String, Object> hrMonthloginNum(String hr, String month);
}
