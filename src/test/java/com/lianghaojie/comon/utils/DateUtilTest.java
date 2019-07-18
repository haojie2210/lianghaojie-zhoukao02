package com.lianghaojie.comon.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {
	
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Test
	public void test1() {
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(1999, 11, 28);
//		System.out.println(DateUtil.getAge(calendar.getTime()));
		int age = DateUtil.getAge(new Date(1999,12,28));
		System.out.println(age+"岁");
	}
	
	@Test
	public void test2() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Calendar calendar = Calendar.getInstance();
//		Date date = calendar.getTime();
//		Date date = new Date();
//		System.out.println(format.format(date));
		Date init = DateUtil.getDateByMonthInit(new Date());
		System.out.println(format.format(init));
	}
	
	@Test
	public void test3() {
		Date last = DateUtil.getDateByMonthLast(new Date());
		System.out.println(format.format(last));
	}
	
	@Test
	public void test4() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2020, 0, 1);
		int future = DateUtil.getDaysByFuture(calendar.getTime());
//		int future = DateUtil.getDaysByFuture(new Date(2020,01,01));
		System.out.println("还有"+future+"天；");
	}
	
	@Test
	public void test5() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2019, 6, 1);
		int future = DateUtil.getDaysByDeparted(calendar.getTime());
		System.out.println("还有"+future+"天；");
	}
}
