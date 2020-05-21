package com.jeecg.dwjfgz.entity;

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
 单位缴费工资
 */
@Entity
@Table(name = "dwjfgz", schema = "")
@SuppressWarnings("serial")
public class DwjfgzEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单位编号*/
	@Excel(name="单位编号",width=15,dicCode="bpm_status")
	private java.lang.String dwbh;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**经济类型*/
	@Excel(name="经济类型",width=15)
	private java.lang.String jjlx;
	/**单位类型*/
	@Excel(name="单位类型",width=15)
	private java.lang.String dwlx;
	/**机构代码*/
	@Excel(name="机构代码",width=15)
	private java.lang.String zzjgdm;
	/**单位状态*/
	@Excel(name="单位状态",width=15)
	private java.lang.String dwzt;
	/**行业代码*/
	@Excel(name="行业代码",width=15)
	private java.lang.String hydm;
	/**单位编码*/
	@Excel(name="单位编码",width=15)
	private java.lang.String dwbm;
	/**终止年月*/
	@Excel(name="终止年月",width=15,format = "yyyy-MM-dd")
	private java.util.Date zzny;
	/**职工人数*/
	@Excel(name="职工人数",width=15)
	private java.lang.String zgrs;
	/**人员状态*/
	@Excel(name="人员状态",width=15)
	private java.lang.String ryzt;
	/**工资总额*/
	@Excel(name="工资总额",width=15)
	private java.lang.String gzze;
	/**经办人*/
	@Excel(name="经办人",width=15)
	private java.lang.String jbr;
	/**经办日期*/
	@Excel(name="经办日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date jbrq;
	
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
	 *@return: java.lang.String  经济类型
	 */

	@Column(name ="JJLX",nullable=true,length=50)
	public java.lang.String getJjlx(){
		return this.jjlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  经济类型
	 */
	public void setJjlx(java.lang.String jjlx){
		this.jjlx = jjlx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位类型
	 */

	@Column(name ="DWLX",nullable=true,length=50)
	public java.lang.String getDwlx(){
		return this.dwlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位类型
	 */
	public void setDwlx(java.lang.String dwlx){
		this.dwlx = dwlx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  机构代码
	 */

	@Column(name ="ZZJGDM",nullable=true,length=50)
	public java.lang.String getZzjgdm(){
		return this.zzjgdm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  机构代码
	 */
	public void setZzjgdm(java.lang.String zzjgdm){
		this.zzjgdm = zzjgdm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位状态
	 */

	@Column(name ="DWZT",nullable=true,length=50)
	public java.lang.String getDwzt(){
		return this.dwzt;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位状态
	 */
	public void setDwzt(java.lang.String dwzt){
		this.dwzt = dwzt;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  行业代码
	 */

	@Column(name ="HYDM",nullable=true,length=50)
	public java.lang.String getHydm(){
		return this.hydm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  行业代码
	 */
	public void setHydm(java.lang.String hydm){
		this.hydm = hydm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位编码
	 */

	@Column(name ="DWBM",nullable=true,length=20)
	public java.lang.String getDwbm(){
		return this.dwbm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位编码
	 */
	public void setDwbm(java.lang.String dwbm){
		this.dwbm = dwbm;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  终止年月
	 */

	@Column(name ="ZZNY",nullable=true,length=20)
	public java.util.Date getZzny(){
		return this.zzny;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  终止年月
	 */
	public void setZzny(java.util.Date zzny){
		this.zzny = zzny;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  职工人数
	 */

	@Column(name ="ZGRS",nullable=true,length=32)
	public java.lang.String getZgrs(){
		return this.zgrs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  职工人数
	 */
	public void setZgrs(java.lang.String zgrs){
		this.zgrs = zgrs;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  人员状态
	 */

	@Column(name ="RYZT",nullable=true,length=32)
	public java.lang.String getRyzt(){
		return this.ryzt;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  人员状态
	 */
	public void setRyzt(java.lang.String ryzt){
		this.ryzt = ryzt;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  工资总额
	 */

	@Column(name ="GZZE",nullable=true,length=32)
	public java.lang.String getGzze(){
		return this.gzze;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  工资总额
	 */
	public void setGzze(java.lang.String gzze){
		this.gzze = gzze;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  经办人
	 */

	@Column(name ="JBR",nullable=true,length=32)
	public java.lang.String getJbr(){
		return this.jbr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  经办人
	 */
	public void setJbr(java.lang.String jbr){
		this.jbr = jbr;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  经办日期
	 */

	@Column(name ="JBRQ",nullable=true,length=32)
	public java.util.Date getJbrq(){
		return this.jbrq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  经办日期
	 */
	public void setJbrq(java.util.Date jbrq){
		this.jbrq = jbrq;
	}
}
