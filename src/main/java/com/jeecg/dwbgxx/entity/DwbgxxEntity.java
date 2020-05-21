package com.jeecg.dwbgxx.entity;

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
 单位变更信息
 */
@Entity
@Table(name = "dwbgxx", schema = "")
@SuppressWarnings("serial")
public class DwbgxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单位编号*/
	@Excel(name="单位编号",width=15,dicCode="bpm_status")
	private java.lang.String dwbh;
	/**变更类型*/

	/**险种类型*/
	@Excel(name="险种类型",width=15)
	private java.lang.String xzlx;
	/**变更原因*/
	@Excel(name="变更原因",width=15)
	private java.lang.String bgyy;
	/**开始时间*/
	@Excel(name="开始时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date jbkssj;
	/**终止时间*/
	@Excel(name="终止时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date jbzzsj;
	/**变更类型*/
	@Excel(name="变更类型",width=15)
	private java.lang.String bglx;
	/**变更日期*/
	@Excel(name="变更日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date bgrq;
	/**经办人*/
	@Excel(name="经办人",width=15)
	private java.lang.String jbr;
	/**经办时间*/
	@Excel(name="经办时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date jbsj;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String bz;
	
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
	 *@return: java.lang.String  险种类型
	 */

	@Column(name ="XZLX",nullable=true,length=50)
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
	 *@return: java.lang.String  变更原因
	 */

	@Column(name ="BGYY",nullable=true,length=50)
	public java.lang.String getBgyy(){
		return this.bgyy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  变更原因
	 */
	public void setBgyy(java.lang.String bgyy){
		this.bgyy = bgyy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  开始时间
	 */

	@Column(name ="JBKSSJ",nullable=true,length=50)
	public java.util.Date getJbkssj(){
		return this.jbkssj;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  开始时间
	 */
	public void setJbkssj(java.util.Date jbkssj){
		this.jbkssj = jbkssj;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  终止时间
	 */

	@Column(name ="JBZZSJ",nullable=true,length=50)
	public java.util.Date getJbzzsj(){
		return this.jbzzsj;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  终止时间
	 */
	public void setJbzzsj(java.util.Date jbzzsj){
		this.jbzzsj = jbzzsj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  变更类型
	 */

	@Column(name ="BGLX",nullable=true,length=32)
	public java.lang.String getBglx(){
		return this.bglx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  变更类型
	 */
	public void setBglx(java.lang.String bglx){
		this.bglx = bglx;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  变更日期
	 */

	@Column(name ="BGRQ",nullable=true,length=32)
	public java.util.Date getBgrq(){
		return this.bgrq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  变更日期
	 */
	public void setBgrq(java.util.Date bgrq){
		this.bgrq = bgrq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  经办人
	 */

	@Column(name ="JBR",nullable=true,length=32)
	public java.lang.String getJbr(){
		return this.jbr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  经办人
	 */
	public void setJbr(java.lang.String jbr){
		this.jbr = jbr;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  经办时间
	 */

	@Column(name ="JBSJ",nullable=true,length=32)
	public java.util.Date getJbsj(){
		return this.jbsj;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  经办时间
	 */
	public void setJbsj(java.util.Date jbsj){
		this.jbsj = jbsj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="BZ",nullable=true,length=32)
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
}
