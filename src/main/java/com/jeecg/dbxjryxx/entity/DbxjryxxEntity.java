package com.jeecg.dbxjryxx.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
短保续接人员信息
 */
@Entity
@Table(name = "dbxjryxx", schema = "")
@SuppressWarnings("serial")
public class DbxjryxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单位编号*/
	@Excel(name="单位编号",width=15,dicCode="bpm_status")
	private java.lang.String dwbh;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**单位类型*/
	@Excel(name="单位类型",width=15)
	private java.lang.String dwlb;
	/**个人编号*/
	@Excel(name="个人编号",width=15)
	private java.lang.String grbh;
	/**证件号码*/
	@Excel(name="证件号码",width=15)
	private java.lang.String zjhm;
	/**姓名*/
	@Excel(name="姓名",width=15)
	private java.lang.String xm;
	/**性别*/
	@Excel(name="性别",width=15)
	private java.lang.String xb;
	/**民族*/
	@Excel(name="民族",width=15)
	private java.lang.String mz;
	/**年龄*/
	@Excel(name="年龄",width=15)
	private java.lang.String nl;
	/**出生日期*/
	@Excel(name="出生日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date csrq;
	/**个人身份*/
	@Excel(name="个人身份",width=15)
	private java.lang.String grsf;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")

	@Column(name ="ID",nullable=false,length=36)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位编号
	 */

	@Column(name ="DWBH",nullable=true,length=32)
	public java.lang.String getDwbh(){
		return this.dwbh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位编号
	 */
	public void setDwbh(java.lang.String dwbh){
		this.dwbh = dwbh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位名称
	 */

	@Column(name ="DWMC",nullable=true,length=50)
	public java.lang.String getDwmc(){
		return this.dwmc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位名称
	 */
	public void setDwmc(java.lang.String dwmc){
		this.dwmc = dwmc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位类型
	 */

	@Column(name ="DWLB",nullable=true,length=50)
	public java.lang.String getDwlb(){
		return this.dwlb;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位类型
	 */
	public void setDwlb(java.lang.String dwlb){
		this.dwlb = dwlb;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  个人编号
	 */

	@Column(name ="GRBH",nullable=true,length=50)
	public java.lang.String getGrbh(){
		return this.grbh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  个人编号
	 */
	public void setGrbh(java.lang.String grbh){
		this.grbh = grbh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  证件号码
	 */

	@Column(name ="ZJHM",nullable=true,length=50)
	public java.lang.String getZjhm(){
		return this.zjhm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  证件号码
	 */
	public void setZjhm(java.lang.String zjhm){
		this.zjhm = zjhm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  姓名
	 */

	@Column(name ="XM",nullable=true,length=50)
	public java.lang.String getXm(){
		return this.xm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  姓名
	 */
	public void setXm(java.lang.String xm){
		this.xm = xm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  性别
	 */

	@Column(name ="XB",nullable=true,length=50)
	public java.lang.String getXb(){
		return this.xb;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  性别
	 */
	public void setXb(java.lang.String xb){
		this.xb = xb;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  民族
	 */

	@Column(name ="MZ",nullable=true,length=20)
	public java.lang.String getMz(){
		return this.mz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  民族
	 */
	public void setMz(java.lang.String mz){
		this.mz = mz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  年龄
	 */

	@Column(name ="NL",nullable=true,length=20)
	public java.lang.String getNl(){
		return this.nl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  年龄
	 */
	public void setNl(java.lang.String nl){
		this.nl = nl;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  出生日期
	 */

	@Column(name ="CSRQ",nullable=true,length=32)
	public java.util.Date getCsrq(){
		return this.csrq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  出生日期
	 */
	public void setCsrq(java.util.Date csrq){
		this.csrq = csrq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  个人身份
	 */

	@Column(name ="GRSF",nullable=true,length=32)
	public java.lang.String getGrsf(){
		return this.grsf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  个人身份
	 */
	public void setGrsf(java.lang.String grsf){
		this.grsf = grsf;
	}
}
