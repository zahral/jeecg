package com.jeecg.tbxxbg.entity;

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
  退保信息变更
 */
@Entity
@Table(name = "tbxxbg", schema = "")
@SuppressWarnings("serial")
public class TbxxbgEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**变更日期*/
	@Excel(name="变更日期",width=15,format = "yyyy-MM-dd",dicCode="bpm_status")
	private java.util.Date bgrq;
	/**变更原因*/
	@Excel(name="变更原因",width=15)
	private java.lang.String bgyy;
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  变更日期
	 */

	@Column(name ="BGRQ",nullable=true,length=32)
	public java.util.Date getBgrq(){
		return this.bgrq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  变更日期
	 */
	public void setBgrq(java.util.Date bgrq){
		this.bgrq = bgrq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  变更原因
	 */

	@Column(name ="BGYY",nullable=true,length=50)
	public java.lang.String getBgyy(){
		return this.bgyy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  变更原因
	 */
	public void setBgyy(java.lang.String bgyy){
		this.bgyy = bgyy;
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
