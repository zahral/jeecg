package com.jeecg.tbryjbxx.entity;

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
 退保人员基本信息
 */
@Entity
@Table(name = "tbryjbxx", schema = "")
@SuppressWarnings("serial")
public class TbryjbxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**个人编号*/
	@Excel(name="个人编号",width=15)
	private java.lang.String grbh;
	/**证件类型*/
	@Excel(name="证件类型",width=15)
	private java.lang.String zjlx;
	/**证件号码*/
	@Excel(name="证件号码",width=15)
	private java.lang.String zjhm;
	/**姓名*/
	@Excel(name="姓名",width=15)
	private java.lang.String xm;
	/**性别*/
	@Excel(name="性别",width=15)
	private java.lang.String xb;
	/**出生日期*/
	@Excel(name="出生日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date csrq;
	/**民族*/
	@Excel(name="民族",width=15)
	private java.lang.String mz;
	/**人员类别*/
	@Excel(name="人员类别",width=15)
	private java.lang.String ylrylb;
	/**账号余额*/
	@Excel(name="账号余额",width=15,dicCode="bpm_status")
	private java.lang.String grzhye;
	/**地址*/
	@Excel(name="地址",width=15)
	private java.lang.String hkszdxxdz;
	/**参保状态*/
	@Excel(name="参保状态",width=15)
	private java.lang.String cbzt;
	/**单位编号*/
	@Excel(name="单位编号",width=15)
	private java.lang.String dwbh;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**单位类别*/
	@Excel(name="单位类别",width=15)
	private java.lang.String dwlx;
	
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
	 *@return: java.lang.String  证件类型
	 */

	@Column(name ="ZJLX",nullable=true,length=50)
	public java.lang.String getZjlx(){
		return this.zjlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  证件类型
	 */
	public void setZjlx(java.lang.String zjlx){
		this.zjlx = zjlx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  证件号码
	 */

	@Column(name ="ZJHM",nullable=true,length=20)
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  出生日期
	 */

	@Column(name ="CSRQ",nullable=true,length=20)
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
	 *@return: java.lang.String  民族
	 */

	@Column(name ="MZ",nullable=true,length=50)
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
	 *@return: java.lang.String  人员类别
	 */

	@Column(name ="YLRYLB",nullable=true,length=50)
	public java.lang.String getYlrylb(){
		return this.ylrylb;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  人员类别
	 */
	public void setYlrylb(java.lang.String ylrylb){
		this.ylrylb = ylrylb;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  账号余额
	 */

	@Column(name ="GRZHYE",nullable=true,length=32)
	public java.lang.String getGrzhye(){
		return this.grzhye;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  账号余额
	 */
	public void setGrzhye(java.lang.String grzhye){
		this.grzhye = grzhye;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  地址
	 */

	@Column(name ="HKSZDXXDZ",nullable=true,length=32)
	public java.lang.String getHkszdxxdz(){
		return this.hkszdxxdz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  地址
	 */
	public void setHkszdxxdz(java.lang.String hkszdxxdz){
		this.hkszdxxdz = hkszdxxdz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  参保状态
	 */

	@Column(name ="CBZT",nullable=true,length=32)
	public java.lang.String getCbzt(){
		return this.cbzt;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  参保状态
	 */
	public void setCbzt(java.lang.String cbzt){
		this.cbzt = cbzt;
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

	@Column(name ="DWMC",nullable=true,length=32)
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
	 *@return: java.lang.String  单位类别
	 */

	@Column(name ="DWLX",nullable=true,length=32)
	public java.lang.String getDwlx(){
		return this.dwlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位类别
	 */
	public void setDwlx(java.lang.String dwlx){
		this.dwlx = dwlx;
	}
}
