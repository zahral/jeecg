package com.jeecg.dwjjzj.entity;

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
 单位基金征集
 */
@Entity
@Table(name = "dwjjzj", schema = "")
@SuppressWarnings("serial")
public class DwjjzjEntity implements java.io.Serializable {
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
	/**单位状态*/
	@Excel(name="单位状态",width=15)
	private java.lang.String dwzt;
	/**隶属关系*/
	@Excel(name="隶属关系",width=15)
	private java.lang.String lsgx;
	/**行业代码*/
	@Excel(name="行业代码",width=15)
	private java.lang.String hydm;
	/**单位编码*/
	@Excel(name="单位编码",width=15)
	private java.lang.String dwbm;
	/**结算期*/
	@Excel(name="结算期",width=15,format = "yyyy-MM-dd")
	private java.util.Date jsq;
	/**对应结算*/
	@Excel(name="对应结算",width=15,format = "yyyy-MM-dd")
	private java.util.Date dyjsq;
	/**征收方式*/
	@Excel(name="征收方式",width=15)
	private java.lang.String zsfs;
	/**缴费方式*/
	@Excel(name="缴费方式",width=15)
	private java.lang.String jffs;
	/**险种类型*/
	@Excel(name="险种类型",width=15)
	private java.lang.String xzlx;
	
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
	 *@return: java.lang.String  隶属关系
	 */

	@Column(name ="LSGX",nullable=true,length=50)
	public java.lang.String getLsgx(){
		return this.lsgx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  隶属关系
	 */
	public void setLsgx(java.lang.String lsgx){
		this.lsgx = lsgx;
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
	 *@return: java.lang.String  征收方式
	 */

	@Column(name ="ZSFS",nullable=true,length=32)
	public java.lang.String getZsfs(){
		return this.zsfs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  征收方式
	 */
	public void setZsfs(java.lang.String zsfs){
		this.zsfs = zsfs;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缴费方式
	 */

	@Column(name ="JFFS",nullable=true,length=32)
	public java.lang.String getJffs(){
		return this.jffs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费方式
	 */
	public void setJffs(java.lang.String jffs){
		this.jffs = jffs;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  险种类型
	 */

	@Column(name ="XZLX",nullable=true,length=32)
	public java.lang.String getXzlx(){
		return this.xzlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  险种类型
	 */
	public void setXzlx(java.lang.String xzlx){
		this.xzlx = xzlx;
	}
}
