package com.jeecg.dwryjf.entity;

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
单位人员缴费
 */
@Entity
@Table(name = "dwryjf", schema = "")
@SuppressWarnings("serial")
public class DwryjfEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单位编号*/
	@Excel(name="单位编号",width=15,dicCode="bpm_status")
	private java.lang.String dwbh;
	/**个人编号*/
	@Excel(name="个人编号",width=15)
	private java.lang.String grbh;
	/**开始结算*/
	@Excel(name="开始结算",width=15,format = "yyyy-MM-dd")
	private java.util.Date ksjsq;
	/**终止结算*/
	@Excel(name="终止结算",width=15,format = "yyyy-MM-dd")
	private java.util.Date zzjsq;
	/**单位类型*/
	@Excel(name="单位类型",width=15)
	private java.lang.String dwlx;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**姓名*/
	@Excel(name="姓名",width=15)
	private java.lang.String xm;
	/**身份证号*/
	@Excel(name="身份证号",width=15)
	private java.lang.String sfzh;
	/**结算期*/
	@Excel(name="结算期",width=15,format = "yyyy-MM-dd")
	private java.util.Date jsq;
	/**对应结算*/
	@Excel(name="对应结算",width=15,format = "yyyy-MM-dd")
	private java.util.Date dyjsq;
	/**缴费基数*/
	@Excel(name="缴费基数",width=15)
	private java.lang.String jfjs;
	/**单位缴纳*/
	@Excel(name="单位缴纳",width=15)
	private java.lang.String dwjn;
	/**个人缴纳*/
	@Excel(name="个人缴纳",width=15)
	private java.lang.String grjn;
	/**缴纳合计*/
	@Excel(name="缴纳合计",width=15)
	private java.lang.String jnhe;
	
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  开始结算
	 */

	@Column(name ="KSJSQ",nullable=true,length=50)
	public java.util.Date getKsjsq(){
		return this.ksjsq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  开始结算
	 */
	public void setKsjsq(java.util.Date ksjsq){
		this.ksjsq = ksjsq;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  终止结算
	 */

	@Column(name ="ZZJSQ",nullable=true,length=50)
	public java.util.Date getZzjsq(){
		return this.zzjsq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  终止结算
	 */
	public void setZzjsq(java.util.Date zzjsq){
		this.zzjsq = zzjsq;
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
	 *@return: java.lang.String  身份证号
	 */

	@Column(name ="SFZH",nullable=true,length=20)
	public java.lang.String getSfzh(){
		return this.sfzh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  身份证号
	 */
	public void setSfzh(java.lang.String sfzh){
		this.sfzh = sfzh;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  结算期
	 */

	@Column(name ="JSQ",nullable=true,length=20)
	public java.util.Date getJsq(){
		return this.jsq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  结算期
	 */
	public void setJsq(java.util.Date jsq){
		this.jsq = jsq;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  对应结算
	 */

	@Column(name ="DYJSQ",nullable=true,length=32)
	public java.util.Date getDyjsq(){
		return this.dyjsq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  对应结算
	 */
	public void setDyjsq(java.util.Date dyjsq){
		this.dyjsq = dyjsq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缴费基数
	 */

	@Column(name ="JFJS",nullable=true,length=32)
	public java.lang.String getJfjs(){
		return this.jfjs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费基数
	 */
	public void setJfjs(java.lang.String jfjs){
		this.jfjs = jfjs;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位缴纳
	 */

	@Column(name ="DWJN",nullable=true,length=32)
	public java.lang.String getDwjn(){
		return this.dwjn;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位缴纳
	 */
	public void setDwjn(java.lang.String dwjn){
		this.dwjn = dwjn;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  个人缴纳
	 */

	@Column(name ="GRJN",nullable=true,length=32)
	public java.lang.String getGrjn(){
		return this.grjn;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  个人缴纳
	 */
	public void setGrjn(java.lang.String grjn){
		this.grjn = grjn;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缴纳合计
	 */

	@Column(name ="JNHE",nullable=true,length=32)
	public java.lang.String getJnhe(){
		return this.jnhe;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴纳合计
	 */
	public void setJnhe(java.lang.String jnhe){
		this.jnhe = jnhe;
	}
}
