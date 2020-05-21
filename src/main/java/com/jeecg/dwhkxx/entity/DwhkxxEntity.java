package com.jeecg.dwhkxx.entity;

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
单位还款信息
 */
@Entity
@Table(name = "dwhkxx", schema = "")
@SuppressWarnings("serial")
public class DwhkxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**结算期*/
	@Excel(name="结算期",width=15,format = "yyyy-MM-dd",dicCode="bpm_status")
	private java.util.Date jsq;
	/**还款金额*/
	@Excel(name="还款金额",width=15)
	private java.lang.String dwhkje;
	/**还款原因*/
	@Excel(name="还款原因",width=15)
	private java.lang.String hkyy;
	/**全部还款*/
	@Excel(name="全部还款",width=15)
	private java.lang.String qbhk;
	
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  结算期
	 */

	@Column(name ="JSQ",nullable=true,length=32)
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  还款金额
	 */

	@Column(name ="DWHKJE",nullable=true,length=50)
	public java.lang.String getDwhkje(){
		return this.dwhkje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  还款金额
	 */
	public void setDwhkje(java.lang.String dwhkje){
		this.dwhkje = dwhkje;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  还款原因
	 */

	@Column(name ="HKYY",nullable=true,length=50)
	public java.lang.String getHkyy(){
		return this.hkyy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  还款原因
	 */
	public void setHkyy(java.lang.String hkyy){
		this.hkyy = hkyy;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  全部还款
	 */

	@Column(name ="QBHK",nullable=true,length=32)
	public java.lang.String getQbhk(){
		return this.qbhk;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  全部还款
	 */
	public void setQbhk(java.lang.String qbhk){
		this.qbhk = qbhk;
	}
}
