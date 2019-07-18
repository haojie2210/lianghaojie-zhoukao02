package com.lianghaojie.comon.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 时间工具类
 * @author:单击开始
 * @date: 2019年7月17日 上午8:12:48
 */
public class DateUtil {
	/**
	 * 
	 * @Title: getAge 
	 * @Description: 方法1：根据传入的日期获取年龄
	 * @param src
	 * @return
	 * @return: int
	 */
//	public static int getAge (Date src) {
//		Calendar ca = Calendar.getInstance();
//		int year = ca.get(Calendar.YEAR);
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTimeInMillis(src.getTime());
//		int i = calendar.get(Calendar.YEAR);
//		int age = year - i;
//		return age;
//	}
	public static int getAge (Date src) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.getWeekYear()-src.getYear();
	}

	/**
	 * 
	 * @Title: getDateByMonthInit 
	 * @Description: 方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“
	 * 2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date getDateByMonthInit (Date src) {
//		Calendar c = Calendar.getInstance();
//		c.setTime(src);
//		c.set(Calendar.DATE, 1);
//		c.set(Calendar.HOUR, 0);
//		c.set(Calendar.MINUTE, 0);
//		c.set(Calendar.SECOND, 0);
//		
//		return c.getTime();
		
//	    //获取Calendar对象
//		Calendar c = Calendar.getInstance();
//		  //用传入的时间初始化日历对象
//		c.setTime(src);
//		
//		//改变日期的 日,时,分.秒
//		
//		c.set(Calendar.DATE, 1);
//		c.set(Calendar.HOUR, 0);
//		c.set(Calendar.MINUTE, 0);
//		c.set(Calendar.SECOND, 0);
//		return c.getTime();
		src.setDate(1);
		src.setHours(0);
		src.setMinutes(0);
		src.setSeconds(0);
		return src;
	}

	/**
	 * 
	 * @Title: getDateByMonthLast 
	 * @Description: 方法3 :根据传入的参数获取该日器的月末日期，例如给定的日期为“
	 * 2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date getDateByMonthLast(Date src) {
		src.setMonth(src.getMonth()+1);
		src.setDate(1);
		src.setHours(0);
		src.setMinutes(0);
		src.setSeconds(0);
		src.setSeconds(src.getSeconds()-1);
		return src;
	}

	/**
	 * @Title: getDaysByFuture 
	 * @Description: 方法4：求未来日期离今天还剩的天数
	 * @param future
	 * @return
	 * @return: int
	 */
	public static int getDaysByFuture (Date future) {
		Date date = new Date();
		long time = date.getTime();
		long time2 = future.getTime();
		long index = time2-time;
		int in = (int)(index/(24*60*60*1000));
		return in;
	}

	/**
	 * @Title: getDaysByDeparted 
	 * @Description: 方法5：求过去日期离今天过去的天数
	 * @param departed
	 * @return
	 * @return: int
	 */
	public static int getDaysByDeparted (Date departed) {
		Date date = new Date();
		long time = date.getTime();
		long time2 = departed.getTime();
		long index = time-time2;
		int in = (int)(index/(24*60*60*1000));
		return in;
	}

}
