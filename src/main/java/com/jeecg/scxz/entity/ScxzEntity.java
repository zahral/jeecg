package com.jeecg.scxz.entity;

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
 上传下载
 */
@Entity
@Table(name = "scxz", schema = "")
@SuppressWarnings("serial")
public class ScxzEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**上传*/
	private java.math.BigDecimal shangchuan;
	/**下载*/
	@Excel(name="下载",width=15)
	private java.math.BigDecimal xiazai;
	
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
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  上传
	 */

	@Column(name ="SHANGCHUAN",nullable=true,length=32)
	public java.math.BigDecimal getShangchuan(){
		return this.shangchuan;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  上传
	 */
	public void setShangchuan(java.math.BigDecimal shangchuan){
		this.shangchuan = shangchuan;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  下载
	 */

	@Column(name ="XIAZAI",nullable=true,length=32)
	public java.math.BigDecimal getXiazai(){
		return this.xiazai;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  下载
	 */
	public void setXiazai(java.math.BigDecimal xiazai){
		this.xiazai = xiazai;
	}
}
