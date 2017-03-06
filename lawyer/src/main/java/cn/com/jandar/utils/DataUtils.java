package cn.com.jandar.utils;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.lenchy.lms.service.ws.ILawyerDataService;
import com.lenchy.lms.service.ws.LawFirm;
import com.lenchy.lms.service.ws.Lawyer;
import com.lenchy.lms.service.ws.LawyerDataServiceServiceLocator;

/**
 *  律师信息 公共类
 *  webservice 调用类
 * @author Chengw
 * @since 2017年3月1日 下午5:05:57 
 *
 */
public class DataUtils {
	
	private static ILawyerDataService service;
	
	static{
		try {
			service = new LawyerDataServiceServiceLocator().getLawyerDataServicePort();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		try {
			List<Lawyer> result = searchLawyers("2010-01-01", 2, 10000);
			for(Lawyer l:result){
				System.out.println(l.getId());
			}
			System.out.println("ending ... size:" + result.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("finally")
	public static List<Lawyer> searchLawyers(String date,int pageNum,int pageSize){
		Lawyer[] result = null;
		try {
			result = service.searchLawyers(date, pageNum, pageSize);
		} catch (RemoteException e) {
			e.printStackTrace();
		}finally {
			return Arrays.asList(result);
		}
		
	}
	
	@SuppressWarnings("finally")
	public static List<LawFirm> searchLawFirms(String date,int pageNum,int pageSize){
		LawFirm[] result = null;
		try {
			result = service.searchLawFirms(date, pageNum, pageSize);
		} catch (RemoteException e) {
			e.printStackTrace();
		}finally {
			return Arrays.asList(result);
		}
		
	}
}
