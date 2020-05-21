package com.jeecg.sybxjbxx.entity;

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
 失业保险基本信息
 */
@Entity
@Table(name = "sybxjbxx", schema = "")
@SuppressWarnings("serial")
public class SybxjbxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**个人编号*/
	@Excel(name="个人编号",width=15,dicCode="bpm_status")
	private java.lang.String grbh;
	/**个人姓名*/
	@Excel(name="个人姓名",width=15)
	private java.lang.String grxm;
	/**性别*/
	@Excel(name="性别",width=15)
	private java.lang.String xb;
	/**缴费月数*/
	@Excel(name="缴费月数",width=15)
	private java.lang.String stjfys;
	/**工作时间*/
	@Excel(name="工作时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date cjgzsj;
	/**缴费月数*/
	@Excel(name="缴费月数",width=15)
	private java.lang.String jfys;
	/**计入时间*/
	@Excel(name="计入时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date grjfscjrsj;
	
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

	@Column(name ="GRBH",nullable=true,length=32)
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
	 *@return: java.lang.String  个人姓名
	 */

	@Column(name ="GRXM",nullable=true,length=50)
	public java.lang.String getGrxm(){
		return this.grxm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  个人姓名
	 */
	public void setGrxm(java.lang.String grxm){
		this.grxm = grxm;
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
	 *@return: java.lang.String  缴费月数
	 */

	@Column(name ="STJFYS",nullable=true,length=50)
	public java.lang.String getStjfys(){
		return this.stjfys;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费月数
	 */
	public void setStjfys(java.lang.String stjfys){
		this.stjfys = stjfys;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  工作时间
	 */

	@Column(name ="CJGZSJ",nullable=true,length=50)
	public java.util.Date getCjgzsj(){
		return this.cjgzsj;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  工作时间
	 */
	public void setCjgzsj(java.util.Date cjgzsj){
		this.cjgzsj = cjgzsj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缴费月数
	 */

	@Column(name ="JFYS",nullable=true,length=50)
	public java.lang.String getJfys(){
		return this.jfys;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费月数
	 */
	public void setJfys(java.lang.String jfys){
		this.jfys = jfys;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  计入时间
	 */

	@Column(name ="GRJFSCJRSJ",nullable=true,length=50)
	public java.util.Date getGrjfscjrsj(){
		return this.grjfscjrsj;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  计入时间
	 */
	public void setGrjfscjrsj(java.util.Date grjfscjrsj){
		this.grjfscjrsj = grjfscjrsj;
	}
}
