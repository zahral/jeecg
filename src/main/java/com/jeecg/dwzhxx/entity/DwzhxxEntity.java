package com.jeecg.dwzhxx.entity;

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
 单位综合信息
 */
@Entity
@Table(name = "dwzhxx", schema = "")
@SuppressWarnings("serial")
public class DwzhxxEntity implements java.io.Serializable {
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
	/**税号*/
	@Excel(name="税号",width=15)
	private java.lang.String sh;
	/**单位状态*/
	@Excel(name="单位状态",width=15)
	private java.lang.String dwzt;
	/**代表人*/
	@Excel(name="代表人",width=15)
	private java.lang.String fddbr;
	/**风险类型*/
	@Excel(name="风险类型",width=15)
	private java.lang.String hyfxlx;
	/**联系电话*/
	@Excel(name="联系电话",width=15)
	private java.lang.String lxdh;
	
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
	 *@return: java.lang.String  税号
	 */

	@Column(name ="SH",nullable=true,length=50)
	public java.lang.String getSh(){
		return this.sh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  税号
	 */
	public void setSh(java.lang.String sh){
		this.sh = sh;
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  代表人
	 */

	@Column(name ="FDDBR",nullable=true,length=50)
	public java.lang.String getFddbr(){
		return this.fddbr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  代表人
	 */
	public void setFddbr(java.lang.String fddbr){
		this.fddbr = fddbr;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  风险类型
	 */

	@Column(name ="HYFXLX",nullable=true,length=50)
	public java.lang.String getHyfxlx(){
		return this.hyfxlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  风险类型
	 */
	public void setHyfxlx(java.lang.String hyfxlx){
		this.hyfxlx = hyfxlx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  联系电话
	 */

	@Column(name ="LXDH",nullable=true,length=20)
	public java.lang.String getLxdh(){
		return this.lxdh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  联系电话
	 */
	public void setLxdh(java.lang.String lxdh){
		this.lxdh = lxdh;
	}
}
