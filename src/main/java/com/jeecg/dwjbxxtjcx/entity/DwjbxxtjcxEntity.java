package com.jeecg.dwjbxxtjcx.entity;

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
 单位基本信息条件查询
 */
@Entity
@Table(name = "dwjbxxtjcx", schema = "")
@SuppressWarnings("serial")
public class DwjbxxtjcxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单位编号*/
	@Excel(name="单位编号",width=15,dicCode="bpm_status")
	private java.lang.String dwbh;
	/**单位类型*/
	@Excel(name="单位类型",width=15)
	private java.lang.String dwlx;
	/**险种类型*/
	@Excel(name="险种类型",width=15)
	private java.lang.String xzlx;
	/**参保状态*/
	@Excel(name="参保状态",width=15)
	private java.lang.String cbzt;
	/**趸缴标志*/
	@Excel(name="趸缴标志",width=15)
	private java.lang.String djbz;
	/**趸缴类别*/
	@Excel(name="趸缴类别",width=15)
	private java.lang.String yldjlx;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**经济类型*/
	@Excel(name="经济类型",width=15)
	private java.lang.String jjlx;
	/**单位状态*/
	@Excel(name="单位状态",width=15)
	private java.lang.String dwzt;
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
	 *@return: java.lang.String  险种类型
	 */

	@Column(name ="XZLX",nullable=true,length=50)
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
	 *@return: java.lang.String  趸缴标志
	 */

	@Column(name ="DJBZ",nullable=true,length=50)
	public java.lang.String getDjbz(){
		return this.djbz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  趸缴标志
	 */
	public void setDjbz(java.lang.String djbz){
		this.djbz = djbz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  趸缴类别
	 */

	@Column(name ="YLDJLX",nullable=true,length=50)
	public java.lang.String getYldjlx(){
		return this.yldjlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  趸缴类别
	 */
	public void setYldjlx(java.lang.String yldjlx){
		this.yldjlx = yldjlx;
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
	 *@return: java.lang.String  单位状态
	 */

	@Column(name ="DWZT",nullable=true,length=32)
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
