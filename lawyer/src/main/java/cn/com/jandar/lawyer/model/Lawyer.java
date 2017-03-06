package cn.com.jandar.lawyer.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 律师信息
 * @author Chengw
 * @since 2017年3月1日 下午3:43:09 
 *
 */
@Entity
@Table(name = "lawyer")
public class Lawyer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;//唯一标识
	
	@Column(name ="PERSON_ID")
	private String personId;//人员id
	
	@Column(name ="NAME")
	private String name;//名字
	
	@Column(name ="GENDER")
	private String gender;//性别 男/女
	
	@Column(name ="PRACTICE_TYPE")
	private String practiceType;//执业类型 （专职，兼职，公司，公职，法援）
	
	@Column(name ="LICENSE_NUMBER")
	private String licenseNumber;//执业证号 
	
	@Column(name ="LASTUPDATE_DATE")
	private Calendar lastUpdateDate;//最后更新时间
	
	@Column(name ="LICENSE_DATE")
	private Calendar licenseDate;//发证时间
	
	@Column(name ="PRACTICE_STATUS")
	private String practiceStatus;//执业状态（正常执业，注销执业证，吊锁执业证，其他，未经年度考核）
	
	@Column(name ="IDNUMBER")
	private String idNumber;//身份证号
	
	@Column(name ="PRACTICE_ORG")
	private String practiceOrg;//执业机构 UUID 为律师事务所的唯一标识
	
	@Column(name ="politic")
	private String politic;//政治面貌
	
	@Column(name ="EDUCATION")
	private String education;//最高学历
	
	@Column(name ="PHONE")
	private String phone;//联系电话
	
	@Column(name ="MOBILE")
	private String mobile;//手机
	
	@Column(name ="EMAIL")
	private String email;//电子邮箱
	
	@Column(name ="ADDRESS")
	private String address;//联系地址
	
	@Column(name ="POSTCODE")
	private String postcode;//邮政编码
	
	@Column(name ="CREATE_DATE")
	private Calendar createDate;//创建时间
	
	@Column(name ="QUALIFICATION_DATE")
	private Calendar qualificationDate;//资格日期

	@Column(name ="QUALIFICATION_NUMBER")
    private String qualificationNumber;//资格证号
    
	@Column(name ="FAX")
    private String fax;//传真
    
	@Column(name ="PORTRAIT")
    private String portrait;//肖像
	
	@Column(name = "NATION")
	private String nation;//国家

	@ManyToOne()
	@JoinColumn(name="PRACTICE_ORG",insertable = false, updatable= false)
	private LawFirm lawFirm;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPracticeType() {
		return practiceType;
	}

	public void setPracticeType(String practiceType) {
		this.practiceType = practiceType;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public Calendar getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Calendar lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Calendar getLicenseDate() {
		return licenseDate;
	}

	public void setLicenseDate(Calendar licenseDate) {
		this.licenseDate = licenseDate;
	}

	public String getPracticeStatus() {
		return practiceStatus;
	}

	public void setPracticeStatus(String practiceStatus) {
		this.practiceStatus = practiceStatus;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getPracticeOrg() {
		return practiceOrg;
	}

	public void setPracticeOrg(String practiceOrg) {
		this.practiceOrg = practiceOrg;
	}

	public String getPolitic() {
		return politic;
	}

	public void setPolitic(String politic) {
		this.politic = politic;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Calendar getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}

	public Calendar getQualificationDate() {
		return qualificationDate;
	}

	public void setQualificationDate(Calendar qualificationDate) {
		this.qualificationDate = qualificationDate;
	}

	public String getQualificationNumber() {
		return qualificationNumber;
	}

	public void setQualificationNumber(String qualificationNumber) {
		this.qualificationNumber = qualificationNumber;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getPortrait() {
		return portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public LawFirm getLawFirm() {
		return lawFirm;
	}

	public void setLawFirm(LawFirm lawFirm) {
		this.lawFirm = lawFirm;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
}
