package com.jeecg.dwcbxx.entity;

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
 单位参保信息
 */
@Entity
@Table(name = "dwcbxx", schema = "")
@SuppressWarnings("serial")
public class DwcbxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单位编号*/
	@Excel(name="单位编号",width=15,dicCode="bpm_status")
	private java.lang.String dwbh;
	/**单位类型*/
	@Excel(name="单位类型",width=15)
	private java.lang.String dwlx;
	/**参保状态*/
	@Excel(name="参保状态",width=15)
	private java.lang.String cbzt;
	/**经济类型*/
	@Excel(name="经济类型",width=15)
	private java.lang.String jjlx;
	/**风险类别*/
	@Excel(name="风险类别",width=15)
	private java.lang.String hyfxlb;
	/**隶属关系*/
	@Excel(name="隶属关系",width=15)
	private java.lang.String lsgx;
	/**统筹区*/
	@Excel(name="统筹区",width=15)
	private java.lang.String sstcq;
	/**单位编码*/
	@Excel(name="单位编码",width=15)
	private java.lang.String dwbm;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**险种类型*/
	@Excel(name="险种类型",width=15)
	private java.lang.String xzlx;
	/**参保人数*/
	@Excel(name="参保人数",width=15)
	private java.lang.String cbrs;
	
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
	 *@return: java.lang.String  参保状态
	 */

	@Column(name ="CBZT",nullable=true,length=50)
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
	 *@return: java.lang.String  风险类别
	 */

	@Column(name ="HYFXLB",nullable=true,length=50)
	public java.lang.String getHyfxlb(){
		return this.hyfxlb;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  风险类别
	 */
	public void setHyfxlb(java.lang.String hyfxlb){
		this.hyfxlb = hyfxlb;
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
	 *@return: java.lang.String  统筹区
	 */

	@Column(name ="SSTCQ",nullable=true,length=50)
	public java.lang.String getSstcq(){
		return this.sstcq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  统筹区
	 */
	public void setSstcq(java.lang.String sstcq){
		this.sstcq = sstcq;
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

	@Column(name ="DWMC",nullable=true,length=20)
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
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  参保人数
	 */

	@Column(name ="CBRS",nullable=true,length=32)
	public java.lang.String getCbrs(){
		return this.cbrs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  参保人数
	 */
	public void setCbrs(java.lang.String cbrs){
		this.cbrs = cbrs;
	}
}
