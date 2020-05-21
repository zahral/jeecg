package com.jeecg.dbrylbxx.entity;

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
 短保人员列表信息
 */
@Entity
@Table(name = "dbrylbxx", schema = "")
@SuppressWarnings("serial")
public class DbrylbxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**个人编号*/
	@Excel(name="个人编号",width=15,dicCode="bpm_status")
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
	/**工资*/
	@Excel(name="工资",width=15)
	private java.lang.String gz;
	
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
	 *@return: java.lang.String  工资
	 */

	@Column(name ="GZ",nullable=true,length=50)
	public java.lang.String getGz(){
		return this.gz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  工资
	 */
	public void setGz(java.lang.String gz){
		this.gz = gz;
	}
}
