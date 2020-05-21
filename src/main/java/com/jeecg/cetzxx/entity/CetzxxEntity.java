package com.jeecg.cetzxx.entity;

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
  差额调整信息
 */
@Entity
@Table(name = "cetzxx", schema = "")
@SuppressWarnings("serial")
public class CetzxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**险种列表*/
	@Excel(name="险种列表",width=15,dicCode="bpm_status")
	private java.lang.String xzlb;
	/**人员列表*/
	@Excel(name="人员列表",width=15)
	private java.lang.String rylb;
	/**个人编号*/
	@Excel(name="个人编号",width=15)
	private java.lang.String grbh;
	/**姓名*/
	@Excel(name="姓名",width=15)
	private java.lang.String xm;
	/**身份证*/
	@Excel(name="身份证",width=15)
	private java.lang.String sfzjh;
	/**补缴处理*/
	@Excel(name="补缴处理",width=15)
	private java.lang.String bjcl;
	/**滞纳金*/
	@Excel(name="滞纳金",width=15)
	private java.lang.String jsznj;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String bz;
	/**所属期*/
	@Excel(name="所属期",width=15)
	private java.lang.String cbzzfkssq;
	/**险种类型*/
	@Excel(name="险种类型",width=15)
	private java.lang.String xzlx;
	/**缴费对象*/
	@Excel(name="缴费对象",width=15)
	private java.lang.String jfdx;
	
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
	 *@return: java.lang.String  险种列表
	 */

	@Column(name ="XZLB",nullable=true,length=32)
	public java.lang.String getXzlb(){
		return this.xzlb;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  险种列表
	 */
	public void setXzlb(java.lang.String xzlb){
		this.xzlb = xzlb;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  人员列表
	 */

	@Column(name ="RYLB",nullable=true,length=50)
	public java.lang.String getRylb(){
		return this.rylb;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  人员列表
	 */
	public void setRylb(java.lang.String rylb){
		this.rylb = rylb;
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
	 *@return: java.lang.String  身份证
	 */

	@Column(name ="SFZJH",nullable=true,length=50)
	public java.lang.String getSfzjh(){
		return this.sfzjh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  身份证
	 */
	public void setSfzjh(java.lang.String sfzjh){
		this.sfzjh = sfzjh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  补缴处理
	 */

	@Column(name ="BJCL",nullable=true,length=50)
	public java.lang.String getBjcl(){
		return this.bjcl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  补缴处理
	 */
	public void setBjcl(java.lang.String bjcl){
		this.bjcl = bjcl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  滞纳金
	 */

	@Column(name ="JSZNJ",nullable=true,length=50)
	public java.lang.String getJsznj(){
		return this.jsznj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  滞纳金
	 */
	public void setJsznj(java.lang.String jsznj){
		this.jsznj = jsznj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="BZ",nullable=true,length=20)
	public java.lang.String getBz(){
		return this.bz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setBz(java.lang.String bz){
		this.bz = bz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属期
	 */

	@Column(name ="CBZZFKSSQ",nullable=true,length=20)
	public java.lang.String getCbzzfkssq(){
		return this.cbzzfkssq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属期
	 */
	public void setCbzzfkssq(java.lang.String cbzzfkssq){
		this.cbzzfkssq = cbzzfkssq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  险种类型
	 */

	@Column(name ="XZLX",nullable=true,length=32)
	public java.lang.String getXzlx(){
		return this.xzlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  险种类型
	 */
	public void setXzlx(java.lang.String xzlx){
		this.xzlx = xzlx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缴费对象
	 */

	@Column(name ="JFDX",nullable=true,length=32)
	public java.lang.String getJfdx(){
		return this.jfdx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费对象
	 */
	public void setJfdx(java.lang.String jfdx){
		this.jfdx = jfdx;
	}
}
