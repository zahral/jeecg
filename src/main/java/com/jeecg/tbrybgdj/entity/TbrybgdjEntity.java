package com.jeecg.tbrybgdj.entity;

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
 退保人员变更单据
 */
@Entity
@Table(name = "tbrybgdj", schema = "")
@SuppressWarnings("serial")
public class TbrybgdjEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**个人编号*/
	@Excel(name="个人编号",width=15,dicCode="bpm_status")
	private java.lang.String grbh;
	/**单位类型*/
	@Excel(name="单位类型",width=15)
	private java.lang.String gzdwlx;
	/**结算期限*/
	@Excel(name="结算期限",width=15)
	private java.lang.String jsqx;
	/**缴费比例*/
	@Excel(name="缴费比例",width=15)
	private java.lang.String jxbl;
	/**缴费金额*/
	@Excel(name="缴费金额",width=15)
	private java.lang.String jfje;
	/**业务批次号*/
	@Excel(name="业务批次号",width=15)
	private java.lang.String ywpch;
	/**单位编号*/
	@Excel(name="单位编号",width=15)
	private java.lang.String dwbh;
	
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
	 *@return: java.lang.String  单位类型
	 */

	@Column(name ="GZDWLX",nullable=true,length=50)
	public java.lang.String getGzdwlx(){
		return this.gzdwlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位类型
	 */
	public void setGzdwlx(java.lang.String gzdwlx){
		this.gzdwlx = gzdwlx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  结算期限
	 */

	@Column(name ="JSQX",nullable=true,length=50)
	public java.lang.String getJsqx(){
		return this.jsqx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  结算期限
	 */
	public void setJsqx(java.lang.String jsqx){
		this.jsqx = jsqx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缴费比例
	 */

	@Column(name ="JXBL",nullable=true,length=50)
	public java.lang.String getJxbl(){
		return this.jxbl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费比例
	 */
	public void setJxbl(java.lang.String jxbl){
		this.jxbl = jxbl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缴费金额
	 */

	@Column(name ="JFJE",nullable=true,length=50)
	public java.lang.String getJfje(){
		return this.jfje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费金额
	 */
	public void setJfje(java.lang.String jfje){
		this.jfje = jfje;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  业务批次号
	 */

	@Column(name ="YWPCH",nullable=true,length=50)
	public java.lang.String getYwpch(){
		return this.ywpch;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  业务批次号
	 */
	public void setYwpch(java.lang.String ywpch){
		this.ywpch = ywpch;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位编号
	 */

	@Column(name ="DWBH",nullable=true,length=50)
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
}
