package com.jeecg.bxzyxx.entity;

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
保险转移信息
 */
@Entity
@Table(name = "bxzyxx", schema = "")
@SuppressWarnings("serial")
public class BxzyxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**月数总计*/
	@Excel(name="月数总计",width=15,dicCode="bpm_status")
	private java.lang.String qcydzryszj;
	/**经办人*/
	@Excel(name="经办人",width=15)
	private java.lang.String jbr;
	/**经办时间*/
	@Excel(name="经办时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date jbsj;
	/**名称*/
	@Excel(name="名称",width=15)
	private java.lang.String dbrmc;
	/**关系*/
	@Excel(name="关系",width=15)
	private java.lang.String dbrycbrgx;
	/**联系电话*/
	@Excel(name="联系电话",width=15)
	private java.lang.String dbrlxdh;
	/**联系地址*/
	@Excel(name="联系地址",width=15)
	private java.lang.String dbrlxdz;
	/**身份证号*/
	@Excel(name="身份证号",width=15)
	private java.lang.String dbrsfzh;
	
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
	 *@return: java.lang.String  月数总计
	 */

	@Column(name ="QCYDZRYSZJ",nullable=true,length=32)
	public java.lang.String getQcydzryszj(){
		return this.qcydzryszj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  月数总计
	 */
	public void setQcydzryszj(java.lang.String qcydzryszj){
		this.qcydzryszj = qcydzryszj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  经办人
	 */

	@Column(name ="JBR",nullable=true,length=50)
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

	@Column(name ="JBSJ",nullable=true,length=50)
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
	 *@return: java.lang.String  名称
	 */

	@Column(name ="DBRMC",nullable=true,length=50)
	public java.lang.String getDbrmc(){
		return this.dbrmc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  名称
	 */
	public void setDbrmc(java.lang.String dbrmc){
		this.dbrmc = dbrmc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  关系
	 */

	@Column(name ="DBRYCBRGX",nullable=true,length=50)
	public java.lang.String getDbrycbrgx(){
		return this.dbrycbrgx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  关系
	 */
	public void setDbrycbrgx(java.lang.String dbrycbrgx){
		this.dbrycbrgx = dbrycbrgx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  联系电话
	 */

	@Column(name ="DBRLXDH",nullable=true,length=50)
	public java.lang.String getDbrlxdh(){
		return this.dbrlxdh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  联系电话
	 */
	public void setDbrlxdh(java.lang.String dbrlxdh){
		this.dbrlxdh = dbrlxdh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  联系地址
	 */

	@Column(name ="DBRLXDZ",nullable=true,length=50)
	public java.lang.String getDbrlxdz(){
		return this.dbrlxdz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  联系地址
	 */
	public void setDbrlxdz(java.lang.String dbrlxdz){
		this.dbrlxdz = dbrlxdz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  身份证号
	 */

	@Column(name ="DBRSFZH",nullable=true,length=20)
	public java.lang.String getDbrsfzh(){
		return this.dbrsfzh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  身份证号
	 */
	public void setDbrsfzh(java.lang.String dbrsfzh){
		this.dbrsfzh = dbrsfzh;
	}
}
