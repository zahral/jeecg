package com.jeecg.bgxx.entity;

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
变更信息
 */
@Entity
@Table(name = "bgxx", schema = "")
@SuppressWarnings("serial")
public class BgxxEntity implements java.io.Serializable {
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
	/**变更类别*/
	@Excel(name="变更类别",width=15)
	private java.lang.String dwlb;
	/**险种类型*/
	@Excel(name="险种类型",width=15)
	private java.lang.String xzlx;
	/**变更原因*/
	@Excel(name="变更原因",width=15)
	private java.lang.String bgyy;
	/**变更日期*/
	@Excel(name="变更日期",width=15)
	private java.lang.String bgrq;
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

	@Column(name ="DWLB",nullable=true,length=50)
	public java.lang.String getDwlb(){
		return this.dwlb;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位类型
	 */
	public void setDwlb(java.lang.String dwlb){
		this.dwlb = dwlb;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  变更类别
	 */

	@Column(name ="DWLX",nullable=true,length=50)
	public java.lang.String getDwlx(){
		return this.dwlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  变更类别
	 */
	public void setDwlx(java.lang.String dwlx){
		this.dwlx = dwlx;
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  变更日期
	 */

	@Column(name ="BGRQ",nullable=true,length=50)
	public java.lang.String getBgrq(){
		return this.bgrq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  变更日期
	 */
	public void setBgrq(java.lang.String bgrq){
		this.bgrq = bgrq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  经办人
	 */

	@Column(name ="JBR",nullable=true,length=20)
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

	@Column(name ="JBSJ",nullable=true,length=20)
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
