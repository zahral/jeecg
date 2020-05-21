package com.jeecg.dwlsnsxx.entity;

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
单位历史年审信息
 */
@Entity
@Table(name = "dwlsnsxx", schema = "")
@SuppressWarnings("serial")
public class DwlsnsxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单位编号*/
	@Excel(name="单位编号",width=15,dicCode="bpm_status")
	private java.lang.String dwbh;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**工资总额*/
	@Excel(name="工资总额",width=15)
	private java.lang.String ndgzze;
	/**标准工资*/
	@Excel(name="标准工资",width=15)
	private java.lang.String nbzgz;
	/**缴费基数*/
	@Excel(name="缴费基数",width=15)
	private java.lang.String jfjs;
	/**应缴金额*/
	@Excel(name="应缴金额",width=15)
	private java.lang.String bnyjje;
	/**已缴金额*/
	@Excel(name="已缴金额",width=15)
	private java.lang.String bnjyjje;
	/**欠缴金额*/
	@Excel(name="欠缴金额",width=15)
	private java.lang.String bnqjje;
	
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
	 *@return: java.lang.String  工资总额
	 */

	@Column(name ="NDGZZE",nullable=true,length=50)
	public java.lang.String getNdgzze(){
		return this.ndgzze;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  工资总额
	 */
	public void setNdgzze(java.lang.String ndgzze){
		this.ndgzze = ndgzze;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  标准工资
	 */

	@Column(name ="NBZGZ",nullable=true,length=50)
	public java.lang.String getNbzgz(){
		return this.nbzgz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  标准工资
	 */
	public void setNbzgz(java.lang.String nbzgz){
		this.nbzgz = nbzgz;
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
	 *@return: java.lang.String  应缴金额
	 */

	@Column(name ="BNYJJE",nullable=true,length=50)
	public java.lang.String getBnyjje(){
		return this.bnyjje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  应缴金额
	 */
	public void setBnyjje(java.lang.String bnyjje){
		this.bnyjje = bnyjje;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  已缴金额
	 */

	@Column(name ="BNJYJJE",nullable=true,length=50)
	public java.lang.String getBnjyjje(){
		return this.bnjyjje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  已缴金额
	 */
	public void setBnjyjje(java.lang.String bnjyjje){
		this.bnjyjje = bnjyjje;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  欠缴金额
	 */

	@Column(name ="BNQJJE",nullable=true,length=20)
	public java.lang.String getBnqjje(){
		return this.bnqjje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  欠缴金额
	 */
	public void setBnqjje(java.lang.String bnqjje){
		this.bnqjje = bnqjje;
	}
}
