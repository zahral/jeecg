package com.jeecg.ylbxpzgrxx.entity;

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
医疗保险凭证个人基本信息
 */
@Entity
@Table(name = "ylbxpzgrxx", schema = "")
@SuppressWarnings("serial")
public class YlbxpzgrxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单位类型*/
	@Excel(name="单位类型",width=15,dicCode="bpm_status")
	private java.lang.String dwlx;
	/**单位编号*/
	@Excel(name="单位编号",width=15)
	private java.lang.String dwbh;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**个人编号*/
	@Excel(name="个人编号",width=15)
	private java.lang.String grbh;
	/**身份证号*/
	@Excel(name="身份证号",width=15)
	private java.lang.String gcsfzh;
	/**姓名*/
	@Excel(name="姓名",width=15)
	private java.lang.String xm;
	/**性别*/
	@Excel(name="性别",width=15)
	private java.lang.String xb;
	/**邮政编码*/
	@Excel(name="邮政编码",width=15)
	private java.lang.String yzbm;
	/**户口性质*/
	@Excel(name="户口性质",width=15)
	private java.lang.String hkxz;
	/**户口在地*/
	@Excel(name="户口在地",width=15)
	private java.lang.String hkszdxxdz;
	/**常驻地址*/
	@Excel(name="常驻地址",width=15)
	private java.lang.String czdxxdz;
	
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
	 *@return: java.lang.String  身份证号
	 */

	@Column(name ="GCSFZH",nullable=true,length=50)
	public java.lang.String getGcsfzh(){
		return this.gcsfzh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  身份证号
	 */
	public void setGcsfzh(java.lang.String gcsfzh){
		this.gcsfzh = gcsfzh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  姓名
	 */

	@Column(name ="XM",nullable=true,length=50)
	public java.lang.String getXm(){
		return this.xm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  姓名
	 */
	public void setXm(java.lang.String xm){
		this.xm = xm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  性别
	 */

	@Column(name ="XB",nullable=true,length=50)
	public java.lang.String getXb(){
		return this.xb;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  性别
	 */
	public void setXb(java.lang.String xb){
		this.xb = xb;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  邮政编码
	 */

	@Column(name ="YZBM",nullable=true,length=20)
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
	 *@return: java.lang.String  户口性质
	 */

	@Column(name ="HKXZ",nullable=true,length=20)
	public java.lang.String getHkxz(){
		return this.hkxz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  户口性质
	 */
	public void setHkxz(java.lang.String hkxz){
		this.hkxz = hkxz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  户口在地
	 */

	@Column(name ="HKSZDXXDZ",nullable=true,length=32)
	public java.lang.String getHkszdxxdz(){
		return this.hkszdxxdz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  户口在地
	 */
	public void setHkszdxxdz(java.lang.String hkszdxxdz){
		this.hkszdxxdz = hkszdxxdz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  常驻地址
	 */

	@Column(name ="CZDXXDZ",nullable=true,length=32)
	public java.lang.String getCzdxxdz(){
		return this.czdxxdz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  常驻地址
	 */
	public void setCzdxxdz(java.lang.String czdxxdz){
		this.czdxxdz = czdxxdz;
	}
}
