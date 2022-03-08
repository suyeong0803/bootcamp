package com.su.settingWeb_boot.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.su.settingWeb_boot.service.StatisticService;
 
@Controller
public class settingTest {
	@Autowired
	private StatisticService service;
	
	@ResponseBody
	@RequestMapping("/sqlyearStatistic")
	public Map<String, Object> yearsqltest(String year) throws Exception
	{
		return service.yearloginNum(year);
	}
	
	@ResponseBody
	@RequestMapping("/sqlmonthStatistic")
	public Map<String, Object> monthsqltest(String month) throws Exception
	{
		if(month.length() == 1) month = "0" + month;
		return service.monthloginNum(month);
	}
	
	@ResponseBody
	@RequestMapping("/sqldayStatistic")
	public Map<String, Object> daysqltest(String day) throws Exception
	{
		if(day.length() == 1) day = "0" + day;
		return service.dayloginNum(day);
	}
	
	@ResponseBody
	@RequestMapping("/sqlavgStatistic")
	public Map<String, Object> avgsqltest() throws Exception
	{
		return service.avgloginNum();
	}
	
	@ResponseBody
	@RequestMapping("/sqlHRmonthStatistic")
	public Map<String, Object> HRmonthsqltest(String hr, String month) throws Exception
	{
		if(month.length() == 1) month = "0" + month;
		return service.hrMonthloginNum(hr, month);
	}
	
    
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "devfunpj"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
 
}