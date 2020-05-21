package com.jeecg.dwzhxxcx.entity;

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
@Table(name = "dwzhxxcx", schema = "")
@SuppressWarnings("serial")
public class DwzhxxcxEntity implements java.io.Serializable {
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
	private java.lang.String dwlb;
	/**联系电话*/
	@Excel(name="联系电话",width=15)
	private java.lang.String lxdh;
	/**邮政编码*/
	@Excel(name="邮政编码",width=15)
	private java.lang.String yzbm;
	/**经济类型*/
	@Excel(name="经济类型",width=15)
	private java.lang.String jjlx;
	/**险种类型*/
	@Excel(name="险种类型",width=15)
	private java.lang.String xzlx;
	/**参保信息*/
	@Excel(name="参保信息",width=15)
	private java.lang.String bccbxx;
	/**参保状态*/
	@Excel(name="参保状态",width=15)
	private java.lang.String cazt;
	/**机构*/
	@Excel(name="机构",width=15)
	private java.lang.String shbxjbjg;
	/**统筹区*/
	@Excel(name="统筹区",width=15)
	private java.lang.String sstcq;
	
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
	 *@return: java.lang.String  联系电话
	 */

	@Column(name ="LXDH",nullable=true,length=50)
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
	 *@return: java.lang.String  经济类型
	 */

	@Column(name ="JJLX",nullable=true,length=50)
	public java.lang.String getJjlx(){
		return this.jjlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  经济类型
	 */
	public void setJjlx(java.lang.String jjlx){
		this.jjlx = jjlx;
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
	 *@return: java.lang.String  参保信息
	 */

	@Column(name ="BCCBXX",nullable=true,length=32)
	public java.lang.String getBccbxx(){
		return this.bccbxx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  参保信息
	 */
	public void setBccbxx(java.lang.String bccbxx){
		this.bccbxx = bccbxx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  参保状态
	 */

	@Column(name ="CAZT",nullable=true,length=32)
	public java.lang.String getCazt(){
		return this.cazt;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  参保状态
	 */
	public void setCazt(java.lang.String cazt){
		this.cazt = cazt;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  机构
	 */

	@Column(name ="SHBXJBJG",nullable=true,length=32)
	public java.lang.String getShbxjbjg(){
		return this.shbxjbjg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  机构
	 */
	public void setShbxjbjg(java.lang.String shbxjbjg){
		this.shbxjbjg = shbxjbjg;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  统筹区
	 */

	@Column(name ="SSTCQ",nullable=true,length=32)
	public java.lang.String getSstcq(){
		return this.sstcq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  统筹区
	 */
	public void setSstcq(java.lang.String sstcq){
		this.sstcq = sstcq;
	}
}
