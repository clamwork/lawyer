package cn.com.jandar.lawyer.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 律师事务所
 * @author Chengw
 * @since 2017年3月1日 下午4:03:22 
 *
 */
@Entity
@Table(name = "lawfirm")
public class LawFirm  implements java.io.Serializable {
 
	private static final long serialVersionUID = 1L;

	@Id
	private String id;//唯一标识
	
	@Column(name ="ADDRESS")
	private String address;//联系地址

	@Column(name ="APPROVE_DATE")
    private Calendar approveDate;//批准日期

	@Column(name ="CREATE_DATE")
    private Calendar createDate;//创建时间

	@Column(name ="DIRECTOR")
    private String director;//责任人

	@Column(name ="DIRECTOR_ID")
    private String directorId;//责任人id

	@Column(name ="EMAIL")
    private String email;//电子邮箱

	@Column(name ="FAX")
    private String fax;//传真

	@Column(name ="JUSTICE_BUREAU")
    private String justiceBureau;//司法机构

	@Column(name ="LASTUPDATE_DATE")
    private Calendar lastUpdateDate;//最后更新时间

	@Column(name ="LAWFIRM_TYPE")
    private String lawFirmType;//组织类型 (普通合伙，特殊合伙，个人，国资)

	@Column(name ="LICENSE_NUMBER")
    private String licenseNumber;//执业证号

	@Column(name ="NAME")
    private String name;//事务所名称

	@Column(name ="PERSON_ID")
    private String personId;//人员id

	@Column(name ="PHONE")
    private String phone;//手机号码

	@Column(name ="POSTCODE")
    private String postcode;//邮政编码

	@Column(name ="PRACTICE_STATUS")
    private String practiceStatus;//执业状态

	@Column(name ="REGISTERED_CAPITAL")
    private String registeredCapital;//注册资本

	@Column(name ="WEBSITE")
    private String website;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Calendar getApproveDate() {
		return approveDate;
	}

	public void setApproveDate(Calendar approveDate) {
		this.approveDate = approveDate;
	}

	public Calendar getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDirectorId() {
		return directorId;
	}

	public void setDirectorId(String directorId) {
		this.directorId = directorId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getJusticeBureau() {
		return justiceBureau;
	}

	public void setJusticeBureau(String justiceBureau) {
		this.justiceBureau = justiceBureau;
	}

	public Calendar getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Calendar lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getLawFirmType() {
		return lawFirmType;
	}

	public void setLawFirmType(String lawFirmType) {
		this.lawFirmType = lawFirmType;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPracticeStatus() {
		return practiceStatus;
	}

	public void setPracticeStatus(String practiceStatus) {
		this.practiceStatus = practiceStatus;
	}

	public String getRegisteredCapital() {
		return registeredCapital;
	}

	public void setRegisteredCapital(String registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}
