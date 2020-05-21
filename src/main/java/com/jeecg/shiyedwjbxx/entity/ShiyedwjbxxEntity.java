package com.jeecg.shiyedwjbxx.entity;

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
事业单位基本信息
 */
@Entity
@Table(name = "shiyedwjbxx", schema = "")
@SuppressWarnings("serial")
public class ShiyedwjbxxEntity implements java.io.Serializable {
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
	/**单位电话*/
	@Excel(name="单位电话",width=15)
	private java.lang.String dwdh;
	/**邮政编码*/
	@Excel(name="邮政编码",width=15)
	private java.lang.String yzbm;
	/**单位简称*/
	@Excel(name="单位简称",width=15)
	private java.lang.String dwjc;
	
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
	 *@return: java.lang.String  单位电话
	 */

	@Column(name ="DWDH",nullable=true,length=50)
	public java.lang.String getDwdh(){
		return this.dwdh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位电话
	 */
	public void setDwdh(java.lang.String dwdh){
		this.dwdh = dwdh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  邮政编码
	 */

	@Column(name ="YZBM",nullable=true,length=50)
	public java.lang.String getYzbm(){
		return this.yzbm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  邮政编码
	 */
	public void setYzbm(java.lang.String yzbm){
		this.yzbm = yzbm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位简称
	 */

	@Column(name ="DWJC",nullable=true,length=50)
	public java.lang.String getDwjc(){
		return this.dwjc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位简称
	 */
	public void setDwjc(java.lang.String dwjc){
		this.dwjc = dwjc;
	}
}
