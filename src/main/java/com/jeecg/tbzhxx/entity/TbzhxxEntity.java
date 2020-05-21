package com.jeecg.tbzhxx.entity;

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
退保账号信息
 */
@Entity
@Table(name = "tbzhxx", schema = "")
@SuppressWarnings("serial")
public class TbzhxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**账号余额*/
	@Excel(name="账号余额",width=15,dicCode="bpm_status")
	private java.lang.String zhye;
	/**返款余额*/
	@Excel(name="返款余额",width=15)
	private java.lang.String fkye;
	/**违规金额*/
	@Excel(name="违规金额",width=15)
	private java.lang.String wgje;
	/**并入统筹金额*/
	@Excel(name="并入统筹金额",width=15)
	private java.lang.String brtcje;
	
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
	 *@return: java.lang.String  账号余额
	 */

	@Column(name ="ZHYE",nullable=true,length=32)
	public java.lang.String getZhye(){
		return this.zhye;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  账号余额
	 */
	public void setZhye(java.lang.String zhye){
		this.zhye = zhye;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  返款余额
	 */

	@Column(name ="FKYE",nullable=true,length=50)
	public java.lang.String getFkye(){
		return this.fkye;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  返款余额
	 */
	public void setFkye(java.lang.String fkye){
		this.fkye = fkye;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  违规金额
	 */

	@Column(name ="WGJE",nullable=true,length=50)
	public java.lang.String getWgje(){
		return this.wgje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  违规金额
	 */
	public void setWgje(java.lang.String wgje){
		this.wgje = wgje;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  并入统筹金额
	 */

	@Column(name ="BRTCJE",nullable=true,length=50)
	public java.lang.String getBrtcje(){
		return this.brtcje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  并入统筹金额
	 */
	public void setBrtcje(java.lang.String brtcje){
		this.brtcje = brtcje;
	}
}
