package cn.com.jandar.lawyer.enums;
/**
 * 执业状态（正常执业，注销执业证，吊锁执业证，其他，未经年度考核）
 * @author Chengw
 * @since 2017年3月3日 下午12:52:09 
 *
 */
public enum PracticeStatusEnum {
	Normal("正常执业"),
	UnRegister("注销执业证"),
	Halt("停止执业"),
	Rovoke("吊锁执业证"),
	UnCheck("未经年度考核"),
	Other("其他");
	//正常执业(Normal)、注销执业证(UnRegister)、停止执业（Halt）、吊锁执业证(Rovoke)、其他（Other)、未经年度考核(UnCheck)
	private String value;
	
	private PracticeStatusEnum(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	
	public String toString(){
		return "value :"+ this.value;
	}
	
	public static void main(String[] args){
		String str = "Normal";
		System.out.println(PracticeStatusEnum.valueOf(str).getValue());
	}
	
}
