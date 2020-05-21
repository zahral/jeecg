package com.jeecg.qkbjcxtjlr.entity;

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
欠款补缴查询条件录入
 */
@Entity
@Table(name = "qkbjcxtjlr", schema = "")
@SuppressWarnings("serial")
public class QkbjcxtjlrEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单位编号*/
	@Excel(name="单位编号",width=15,dicCode="bpm_status")
	private java.lang.String dwbh;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**单位类型*/
	@Excel(name="单位类型",width=15)
	private java.lang.String dwlx;
	/**单位状态*/
	@Excel(name="单位状态",width=15)
	private java.lang.String dwzt;
	/**结算期*/
	@Excel(name="结算期",width=15,format = "yyyy-MM-dd")
	private java.util.Date jsq;
	/**费款开始年月*/
	@Excel(name="费款开始年月",width=15,format = "yyyy-MM-dd")
	private java.util.Date fkksny;
	/**费款终止年月*/
	@Excel(name="费款终止年月",width=15,format = "yyyy-MM-dd")
	private java.util.Date fkzzny;
	/**征集通知流水号*/
	@Excel(name="征集通知流水号",width=15)
	private java.lang.String zjtzlsh;
	
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
	 *@return: java.lang.String  单位名称
	 */

	@Column(name ="DWMC",nullable=true,length=50)
	public java.lang.String getDwmc(){
		return this.dwmc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位名称
	 */
	public void setDwmc(java.lang.String dwmc){
		this.dwmc = dwmc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位类型
	 */

	@Column(name ="DWLX",nullable=true,length=50)
	public java.lang.String getDwlx(){
		return this.dwlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位类型
	 */
	public void setDwlx(java.lang.String dwlx){
		this.dwlx = dwlx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位状态
	 */

	@Column(name ="DWZT",nullable=true,length=50)
	public java.lang.String getDwzt(){
		return this.dwzt;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位状态
	 */
	public void setDwzt(java.lang.String dwzt){
		this.dwzt = dwzt;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  结算期
	 */

	@Column(name ="JSQ",nullable=true,length=50)
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  费款开始年月
	 */

	@Column(name ="FKKSNY",nullable=true,length=50)
	public java.util.Date getFkksny(){
		return this.fkksny;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  费款开始年月
	 */
	public void setFkksny(java.util.Date fkksny){
		this.fkksny = fkksny;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  费款终止年月
	 */

	@Column(name ="FKZZNY",nullable=true,length=50)
	public java.util.Date getFkzzny(){
		return this.fkzzny;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  费款终止年月
	 */
	public void setFkzzny(java.util.Date fkzzny){
		this.fkzzny = fkzzny;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  征集通知流水号
	 */

	@Column(name ="ZJTZLSH",nullable=true,length=20)
	public java.lang.String getZjtzlsh(){
		return this.zjtzlsh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  征集通知流水号
	 */
	public void setZjtzlsh(java.lang.String zjtzlsh){
		this.zjtzlsh = zjtzlsh;
	}
}
