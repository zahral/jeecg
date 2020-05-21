package com.jeecg.dwjfqk.entity;

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
 单位缴费情况
 */
@Entity
@Table(name = "dwjfqk", schema = "")
@SuppressWarnings("serial")
public class DwjfqkEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单位编号*/
	@Excel(name="单位编号",width=15,dicCode="bpm_status")
	private java.lang.String dwbh;
	/**单位类型*/
	@Excel(name="单位类型",width=15)
	private java.lang.String dwlx;
	/**缴费类型*/
	@Excel(name="缴费类型",width=15)
	private java.lang.String jflx;
	/**开始结算*/
	@Excel(name="开始结算",width=15,format = "yyyy-MM-dd")
	private java.util.Date ksjsq;
	/**终止结算*/
	@Excel(name="终止结算",width=15,format = "yyyy-MM-dd")
	private java.util.Date zzjsq;
	/**费款开始*/
	@Excel(name="费款开始",width=15,format = "yyyy-MM-dd")
	private java.util.Date fkksny;
	/**费款终止*/
	@Excel(name="费款终止",width=15,format = "yyyy-MM-dd")
	private java.util.Date fkzzny;
	/**缴费标志*/
	@Excel(name="缴费标志",width=15)
	private java.lang.String jfbz;
	/**单位编码*/
	@Excel(name="单位编码",width=15)
	private java.lang.String dwbm;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**经济类型*/
	@Excel(name="经济类型",width=15)
	private java.lang.String jjlx;
	/**风险类型*/
	@Excel(name="风险类型",width=15)
	private java.lang.String hyfxlx;
	
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
	 *@return: java.lang.String  缴费类型
	 */

	@Column(name ="JFLX",nullable=true,length=50)
	public java.lang.String getJflx(){
		return this.jflx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费类型
	 */
	public void setJflx(java.lang.String jflx){
		this.jflx = jflx;
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  费款开始
	 */

	@Column(name ="FKKSNY",nullable=true,length=50)
	public java.util.Date getFkksny(){
		return this.fkksny;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  费款开始
	 */
	public void setFkksny(java.util.Date fkksny){
		this.fkksny = fkksny;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  费款终止
	 */

	@Column(name ="FKZZNY",nullable=true,length=50)
	public java.util.Date getFkzzny(){
		return this.fkzzny;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  费款终止
	 */
	public void setFkzzny(java.util.Date fkzzny){
		this.fkzzny = fkzzny;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缴费标志
	 */

	@Column(name ="JFBZ",nullable=true,length=20)
	public java.lang.String getJfbz(){
		return this.jfbz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费标志
	 */
	public void setJfbz(java.lang.String jfbz){
		this.jfbz = jfbz;
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
	 *@return: java.lang.String  经济类型
	 */

	@Column(name ="JJLX",nullable=true,length=32)
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
	 *@return: java.lang.String  风险类型
	 */

	@Column(name ="HYFXLX",nullable=true,length=32)
	public java.lang.String getHyfxlx(){
		return this.hyfxlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  风险类型
	 */
	public void setHyfxlx(java.lang.String hyfxlx){
		this.hyfxlx = hyfxlx;
	}
}
