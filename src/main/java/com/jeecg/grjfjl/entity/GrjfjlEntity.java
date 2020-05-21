package com.jeecg.grjfjl.entity;

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
个人缴费记录
 */
@Entity
@Table(name = "grjfjl", schema = "")
@SuppressWarnings("serial")
public class GrjfjlEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**年度*/
	@Excel(name="年度",width=15)
	private java.lang.String nd;
	/**缴费基数*/
	@Excel(name="缴费基数",width=15)
	private java.lang.String jfjs;
	/**个人缴纳*/
	@Excel(name="个人缴纳",width=15)
	private java.lang.String grjnje;
	/**单位缴纳*/
	@Excel(name="单位缴纳",width=15)
	private java.lang.String dwjnje;
	/**合计缴纳*/
	@Excel(name="合计缴纳",width=15)
	private java.lang.String hjjnje;
	/**个人比例*/
	@Excel(name="个人比例",width=15)
	private java.lang.String grbl;
	/**单位比例*/
	@Excel(name="单位比例",width=15)
	private java.lang.String dwbl;
	/**合计比例*/
	@Excel(name="合计比例",width=15)
	private java.lang.String hjbl;
	/**起止月*/
	@Excel(name="起止月",width=15,format = "yyyy-MM-dd")
	private java.util.Date qzy;
	/**终止月*/
	@Excel(name="终止月",width=15,format = "yyyy-MM-dd")
	private java.util.Date zzy;
	
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
	 *@return: java.lang.String  缴费基数
	 */

	@Column(name ="JFJS",nullable=true,length=50)
	public java.lang.String getJfjs(){
		return this.jfjs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费基数
	 */
	public void setJfjs(java.lang.String jfjs){
		this.jfjs = jfjs;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  个人缴纳
	 */

	@Column(name ="GRJNJE",nullable=true,length=50)
	public java.lang.String getGrjnje(){
		return this.grjnje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  个人缴纳
	 */
	public void setGrjnje(java.lang.String grjnje){
		this.grjnje = grjnje;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位缴纳
	 */

	@Column(name ="DWJNJE",nullable=true,length=50)
	public java.lang.String getDwjnje(){
		return this.dwjnje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位缴纳
	 */
	public void setDwjnje(java.lang.String dwjnje){
		this.dwjnje = dwjnje;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合计缴纳
	 */

	@Column(name ="HJJNJE",nullable=true,length=50)
	public java.lang.String getHjjnje(){
		return this.hjjnje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合计缴纳
	 */
	public void setHjjnje(java.lang.String hjjnje){
		this.hjjnje = hjjnje;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  个人比例
	 */

	@Column(name ="GRBL",nullable=true,length=50)
	public java.lang.String getGrbl(){
		return this.grbl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  个人比例
	 */
	public void setGrbl(java.lang.String grbl){
		this.grbl = grbl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位比例
	 */

	@Column(name ="DWBL",nullable=true,length=50)
	public java.lang.String getDwbl(){
		return this.dwbl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位比例
	 */
	public void setDwbl(java.lang.String dwbl){
		this.dwbl = dwbl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合计比例
	 */

	@Column(name ="HJBL",nullable=true,length=20)
	public java.lang.String getHjbl(){
		return this.hjbl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合计比例
	 */
	public void setHjbl(java.lang.String hjbl){
		this.hjbl = hjbl;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  起止月
	 */

	@Column(name ="QZY",nullable=true,length=20)
	public java.util.Date getQzy(){
		return this.qzy;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  起止月
	 */
	public void setQzy(java.util.Date qzy){
		this.qzy = qzy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  终止月
	 */

	@Column(name ="ZZY",nullable=true,length=32)
	public java.util.Date getZzy(){
		return this.zzy;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  终止月
	 */
	public void setZzy(java.util.Date zzy){
		this.zzy = zzy;
	}
}
