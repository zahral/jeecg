package com.jeecg.zhfhxx.entity;

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
 账号返还信息
 */
@Entity
@Table(name = "zhfhxx", schema = "")
@SuppressWarnings("serial")
public class ZhfhxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单位编号*/
	@Excel(name="单位编号",width=15,dicCode="bpm_status")
	private java.lang.String dwbh;
	/**个人编号*/
	@Excel(name="个人编号",width=15)
	private java.lang.String grbh;
	/**年度*/
	@Excel(name="年度",width=15)
	private java.lang.String nd;
	/**返还类型*/
	@Excel(name="返还类型",width=15)
	private java.lang.String fhlx;
	/**返还金额*/
	@Excel(name="返还金额",width=15)
	private java.lang.String fhje;
	/**并入统筹*/
	@Excel(name="并入统筹",width=15)
	private java.lang.String brtc;
	/**处理方式*/
	@Excel(name="处理方式",width=15)
	private java.lang.String clfs;
	
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
	 *@return: java.lang.String  个人编号
	 */

	@Column(name ="GRBH",nullable=true,length=50)
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
	 *@return: java.lang.String  年度
	 */

	@Column(name ="ND",nullable=true,length=50)
	public java.lang.String getNd(){
		return this.nd;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  年度
	 */
	public void setNd(java.lang.String nd){
		this.nd = nd;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  返还类型
	 */

	@Column(name ="FHLX",nullable=true,length=50)
	public java.lang.String getFhlx(){
		return this.fhlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  返还类型
	 */
	public void setFhlx(java.lang.String fhlx){
		this.fhlx = fhlx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  返还金额
	 */

	@Column(name ="FHJE",nullable=true,length=50)
	public java.lang.String getFhje(){
		return this.fhje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  返还金额
	 */
	public void setFhje(java.lang.String fhje){
		this.fhje = fhje;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  并入统筹
	 */

	@Column(name ="BRTC",nullable=true,length=50)
	public java.lang.String getBrtc(){
		return this.brtc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  并入统筹
	 */
	public void setBrtc(java.lang.String brtc){
		this.brtc = brtc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  处理方式
	 */

	@Column(name ="CLFS",nullable=true,length=50)
	public java.lang.String getClfs(){
		return this.clfs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  处理方式
	 */
	public void setClfs(java.lang.String clfs){
		this.clfs = clfs;
	}
}
