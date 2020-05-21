package com.jeecg.ydxjbgxx.entity;

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
 异地续接变更信息
 */
@Entity
@Table(name = "ydxjbgxx", schema = "")
@SuppressWarnings("serial")
public class YdxjbgxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**凭证号*/
	@Excel(name="凭证号",width=15)
	private java.lang.String pzh;
	/**医疗保障*/
	@Excel(name="医疗保障",width=15)
	private java.lang.String ylbz;
	/**基本医疗*/
	@Excel(name="基本医疗",width=15)
	private java.lang.String jbyl;
	/**起始时间*/
	@Excel(name="起始时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date jfqssj;
	/**终止时间*/
	@Excel(name="终止时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date jfzzsj;
	/**转出参数*/
	@Excel(name="转出参数",width=15)
	private java.lang.String zcdcs;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String bz;
	
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
	 *@return: java.lang.String  凭证号
	 */

	@Column(name ="PZH",nullable=true,length=32)
	public java.lang.String getPzh(){
		return this.pzh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  凭证号
	 */
	public void setPzh(java.lang.String pzh){
		this.pzh = pzh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  医疗保障
	 */

	@Column(name ="YLBZ",nullable=true,length=50)
	public java.lang.String getYlbz(){
		return this.ylbz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  医疗保障
	 */
	public void setYlbz(java.lang.String ylbz){
		this.ylbz = ylbz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  基本医疗
	 */

	@Column(name ="JBYL",nullable=true,length=50)
	public java.lang.String getJbyl(){
		return this.jbyl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  基本医疗
	 */
	public void setJbyl(java.lang.String jbyl){
		this.jbyl = jbyl;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  起始时间
	 */

	@Column(name ="JFQSSJ",nullable=true,length=50)
	public java.util.Date getJfqssj(){
		return this.jfqssj;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  起始时间
	 */
	public void setJfqssj(java.util.Date jfqssj){
		this.jfqssj = jfqssj;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  终止时间
	 */

	@Column(name ="JFZZSJ",nullable=true,length=50)
	public java.util.Date getJfzzsj(){
		return this.jfzzsj;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  终止时间
	 */
	public void setJfzzsj(java.util.Date jfzzsj){
		this.jfzzsj = jfzzsj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  转出参数
	 */

	@Column(name ="ZCDCS",nullable=true,length=50)
	public java.lang.String getZcdcs(){
		return this.zcdcs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  转出参数
	 */
	public void setZcdcs(java.lang.String zcdcs){
		this.zcdcs = zcdcs;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="BZ",nullable=true,length=50)
	public java.lang.String getBz(){
		return this.bz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setBz(java.lang.String bz){
		this.bz = bz;
	}
}
