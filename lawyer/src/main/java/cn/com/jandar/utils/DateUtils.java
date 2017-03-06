package cn.com.jandar.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * 时间公共类
 * @author Chengw
 * @since 2017年3月3日 上午10:22:33 
 *
 */
public class DateUtils {
	
	/**
	 * 当前时间位移n年
	 * @param nowDate
	 * @param n
	 * @return
	 */
	public static Date getDateByYear(Date nowDate,Integer n){
		Calendar c = Calendar.getInstance();
		c.setTime(nowDate);
		c.set(Calendar.YEAR, n);
		return c.getTime();
	}
	/**
	 * 当前时间位移n月
	 * @param nowDate
	 * @param n
	 * @return
	 */
	public static Date getDateByMonth(Date nowDate,Integer n){
		Calendar c = Calendar.getInstance();
		c.setTime(nowDate);
		c.set(Calendar.MONTH, n);
		return c.getTime();
	}
	/**
	 * 当前时间位移n天
	 * @param nowDate
	 * @param n
	 * @return
	 */
	public static Date getDateByDay(Date nowDate,Integer n){
		Calendar c = Calendar.getInstance();
		c.setTime(nowDate);
		c.set(Calendar.DAY_OF_YEAR, n);
		return c.getTime();
	}
	/**
	 * 当前时间位移n小时
	 * @param nowDate
	 * @param n
	 * @return
	 */
	public static Date getDateByHour(Date nowDate,Integer n){
		Calendar c = Calendar.getInstance();
		c.setTime(nowDate);
		c.set(Calendar.HOUR_OF_DAY, n);
		return c.getTime();
	}
	
	public static String getFormatDate(Date date){
		return formatDate(date,"yyyy-MM-dd");
	}
	
	public static Date getDateFormat(String dateStr){
		return dateFormat(dateStr,"yyyy-MM-dd");
	}
	
	public static String formatDate(Date date,String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
	
	public static Date dateFormat(String dateStr,String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
