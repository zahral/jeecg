package com.jeecg.danwpzclxx.entity;

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
 单位批准成立信息
 */
@Entity
@Table(name = "danwpzclxx", schema = "")
@SuppressWarnings("serial")
public class DanwpzclxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**执照号码*/
	@Excel(name="执照号码",width=15,dicCode="bpm_status")
	private java.lang.String gsdjzzhm;
	/**发照日期*/
	@Excel(name="发照日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date gsdjfzrq;
	/**登记有效期限*/
	@Excel(name="登记有效期限",width=15)
	private java.lang.String gsdjyxqx;
	/**发证机构*/
	@Excel(name="发证机构",width=15)
	private java.lang.String gszzfzjg;
	/**起止日期*/
	@Excel(name="起止日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date gszzqzrq;
	/**终止日期*/
	@Excel(name="终止日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date gszzzzrq;
	/**批准成立部门*/
	@Excel(name="批准成立部门",width=15)
	private java.lang.String pzclbm;
	
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
	 *@return: java.lang.String  执照号码
	 */

	@Column(name ="GSDJZZHM",nullable=true,length=32)
	public java.lang.String getGsdjzzhm(){
		return this.gsdjzzhm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  执照号码
	 */
	public void setGsdjzzhm(java.lang.String gsdjzzhm){
		this.gsdjzzhm = gsdjzzhm;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  发照日期
	 */

	@Column(name ="GSDJFZRQ",nullable=true,length=50)
	public java.util.Date getGsdjfzrq(){
		return this.gsdjfzrq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  发照日期
	 */
	public void setGsdjfzrq(java.util.Date gsdjfzrq){
		this.gsdjfzrq = gsdjfzrq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  登记有效期限
	 */

	@Column(name ="GSDJYXQX",nullable=true,length=50)
	public java.lang.String getGsdjyxqx(){
		return this.gsdjyxqx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  登记有效期限
	 */
	public void setGsdjyxqx(java.lang.String gsdjyxqx){
		this.gsdjyxqx = gsdjyxqx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  发证机构
	 */

	@Column(name ="GSZZFZJG",nullable=true,length=50)
	public java.lang.String getGszzfzjg(){
		return this.gszzfzjg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  发证机构
	 */
	public void setGszzfzjg(java.lang.String gszzfzjg){
		this.gszzfzjg = gszzfzjg;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  起止日期
	 */

	@Column(name ="GSZZQZRQ",nullable=true,length=50)
	public java.util.Date getGszzqzrq(){
		return this.gszzqzrq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  起止日期
	 */
	public void setGszzqzrq(java.util.Date gszzqzrq){
		this.gszzqzrq = gszzqzrq;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  终止日期
	 */

	@Column(name ="GSZZZZRQ",nullable=true,length=50)
	public java.util.Date getGszzzzrq(){
		return this.gszzzzrq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  终止日期
	 */
	public void setGszzzzrq(java.util.Date gszzzzrq){
		this.gszzzzrq = gszzzzrq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  批准成立部门
	 */

	@Column(name ="PZCLBM",nullable=true,length=50)
	public java.lang.String getPzclbm(){
		return this.pzclbm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  批准成立部门
	 */
	public void setPzclbm(java.lang.String pzclbm){
		this.pzclbm = pzclbm;
	}
}
