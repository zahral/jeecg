package com.jeecg.zcdjbjg.entity;

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
 转出地经办机构
 */
@Entity
@Table(name = "zcdjbjg", schema = "")
@SuppressWarnings("serial")
public class ZcdjbjgEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**经办机构名称*/
	@Excel(name="经办机构名称",width=15,dicCode="bpm_status")
	private java.lang.String jbjgmc;
	/**经办人姓名*/
	@Excel(name="经办人姓名",width=15)
	private java.lang.String jbrxm;
	/**经办人电话*/
	@Excel(name="经办人电话",width=15)
	private java.lang.String jbrdh;
	
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
	 *@return: java.lang.String  经办机构名称
	 */

	@Column(name ="JBJGMC",nullable=true,length=32)
	public java.lang.String getJbjgmc(){
		return this.jbjgmc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  经办机构名称
	 */
	public void setJbjgmc(java.lang.String jbjgmc){
		this.jbjgmc = jbjgmc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  经办人姓名
	 */

	@Column(name ="JBRXM",nullable=true,length=50)
	public java.lang.String getJbrxm(){
		return this.jbrxm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  经办人姓名
	 */
	public void setJbrxm(java.lang.String jbrxm){
		this.jbrxm = jbrxm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  经办人电话
	 */

	@Column(name ="JBRDH",nullable=true,length=50)
	public java.lang.String getJbrdh(){
		return this.jbrdh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  经办人电话
	 */
	public void setJbrdh(java.lang.String jbrdh){
		this.jbrdh = jbrdh;
	}
}
