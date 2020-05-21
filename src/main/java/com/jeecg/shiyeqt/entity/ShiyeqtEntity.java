package com.jeecg.shiyeqt.entity;

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
 失业其他
 */
@Entity
@Table(name = "shiyeqt", schema = "")
@SuppressWarnings("serial")
public class ShiyeqtEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**法人姓名*/
	@Excel(name="法人姓名",width=15,dicCode="bpm_status")
	private java.lang.String frxm;
	/**法人证件号码*/
	@Excel(name="法人证件号码",width=15)
	private java.lang.String frzjhm;
	/**法人参保标志*/
	@Excel(name="法人参保标志",width=15)
	private java.lang.String frcbbz;
	/**法人电话*/
	@Excel(name="法人电话",width=15)
	private java.lang.String frdh;
	/**专管员姓名*/
	@Excel(name="专管员姓名",width=15)
	private java.lang.String zgyxm;
	/**专管员电话*/
	@Excel(name="专管员电话",width=15)
	private java.lang.String zgydh;
	
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
	 *@return: java.lang.String  法人姓名
	 */

	@Column(name ="FRXM",nullable=true,length=32)
	public java.lang.String getFrxm(){
		return this.frxm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  法人姓名
	 */
	public void setFrxm(java.lang.String frxm){
		this.frxm = frxm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  法人证件号码
	 */

	@Column(name ="FRZJHM",nullable=true,length=50)
	public java.lang.String getFrzjhm(){
		return this.frzjhm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  法人证件号码
	 */
	public void setFrzjhm(java.lang.String frzjhm){
		this.frzjhm = frzjhm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  法人参保标志
	 */

	@Column(name ="FRCBBZ",nullable=true,length=50)
	public java.lang.String getFrcbbz(){
		return this.frcbbz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  法人参保标志
	 */
	public void setFrcbbz(java.lang.String frcbbz){
		this.frcbbz = frcbbz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  法人电话
	 */

	@Column(name ="FRDH",nullable=true,length=50)
	public java.lang.String getFrdh(){
		return this.frdh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  法人电话
	 */
	public void setFrdh(java.lang.String frdh){
		this.frdh = frdh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  专管员姓名
	 */

	@Column(name ="ZGYXM",nullable=true,length=50)
	public java.lang.String getZgyxm(){
		return this.zgyxm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  专管员姓名
	 */
	public void setZgyxm(java.lang.String zgyxm){
		this.zgyxm = zgyxm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  专管员电话
	 */

	@Column(name ="ZGYDH",nullable=true,length=50)
	public java.lang.String getZgydh(){
		return this.zgydh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  专管员电话
	 */
	public void setZgydh(java.lang.String zgydh){
		this.zgydh = zgydh;
	}
}
