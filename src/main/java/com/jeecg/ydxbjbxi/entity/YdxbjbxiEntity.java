package com.jeecg.ydxbjbxi.entity;

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
基本信息
 */
@Entity
@Table(name = "ydxbjbxi", schema = "")
@SuppressWarnings("serial")
public class YdxbjbxiEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单位编号*/
	@Excel(name="单位编号",width=15,dicCode="bpm_status")
	private java.lang.String dwbh;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**单位类别*/
	@Excel(name="单位类别",width=15)
	private java.lang.String dwlb;
	/**个人编号*/
	@Excel(name="个人编号",width=15)
	private java.lang.String grbh;
	/**姓名*/
	@Excel(name="姓名",width=15)
	private java.lang.String xm;
	/**性别*/
	@Excel(name="性别",width=15)
	private java.lang.String xb;
	/**证件类别*/
	@Excel(name="证件类别",width=15)
	private java.lang.String sszjlb;
	/**身份证号*/
	@Excel(name="身份证号",width=15)
	private java.lang.String gmsfzh;
	/**户口性质*/
	@Excel(name="户口性质",width=15)
	private java.lang.String hkxz;
	/**地行政区*/
	@Excel(name="地行政区",width=15)
	private java.lang.String hkszdxzq;
	/**工作日期*/
	@Excel(name="工作日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date cagzrq;
	/**单位日期*/
	@Excel(name="单位日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date dbdwrq;
	/**离退休日期*/
	@Excel(name="离退休日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date ltxrq;
	/**离退休状态*/
	@Excel(name="离退休状态",width=15)
	private java.lang.String ltxzt;
	/**保险证号*/
	@Excel(name="保险证号",width=15)
	private java.lang.String ylbxzh;
	/**社保卡号*/
	@Excel(name="社保卡号",width=15)
	private java.lang.String sbkh;
	/**转入月数*/
	@Excel(name="转入月数",width=15,format = "yyyy-MM-dd")
	private java.util.Date ylzrys;
	/**缴费月数*/
	@Excel(name="缴费月数",width=15)
	private java.lang.String ylstjfys;
	
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
	 *@return: java.lang.String  单位类别
	 */

	@Column(name ="DWLB",nullable=true,length=50)
	public java.lang.String getDwlb(){
		return this.dwlb;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位类别
	 */
	public void setDwlb(java.lang.String dwlb){
		this.dwlb = dwlb;
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
	 *@return: java.lang.String  证件类别
	 */

	@Column(name ="SSZJLB",nullable=true,length=50)
	public java.lang.String getSszjlb(){
		return this.sszjlb;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  证件类别
	 */
	public void setSszjlb(java.lang.String sszjlb){
		this.sszjlb = sszjlb;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  身份证号
	 */

	@Column(name ="GMSFZH",nullable=true,length=20)
	public java.lang.String getGmsfzh(){
		return this.gmsfzh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  身份证号
	 */
	public void setGmsfzh(java.lang.String gmsfzh){
		this.gmsfzh = gmsfzh;
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
	 *@return: java.lang.String  地行政区
	 */

	@Column(name ="HKSZDXZQ",nullable=true,length=32)
	public java.lang.String getHkszdxzq(){
		return this.hkszdxzq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  地行政区
	 */
	public void setHkszdxzq(java.lang.String hkszdxzq){
		this.hkszdxzq = hkszdxzq;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  工作日期
	 */

	@Column(name ="CAGZRQ",nullable=true,length=32)
	public java.util.Date getCagzrq(){
		return this.cagzrq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  工作日期
	 */
	public void setCagzrq(java.util.Date cagzrq){
		this.cagzrq = cagzrq;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  单位日期
	 */

	@Column(name ="DBDWRQ",nullable=true,length=32)
	public java.util.Date getDbdwrq(){
		return this.dbdwrq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  单位日期
	 */
	public void setDbdwrq(java.util.Date dbdwrq){
		this.dbdwrq = dbdwrq;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  离退休日期
	 */

	@Column(name ="LTXRQ",nullable=true,length=32)
	public java.util.Date getLtxrq(){
		return this.ltxrq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  离退休日期
	 */
	public void setLtxrq(java.util.Date ltxrq){
		this.ltxrq = ltxrq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  离退休状态
	 */

	@Column(name ="LTXZT",nullable=true,length=32)
	public java.lang.String getLtxzt(){
		return this.ltxzt;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  离退休状态
	 */
	public void setLtxzt(java.lang.String ltxzt){
		this.ltxzt = ltxzt;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  保险证号
	 */

	@Column(name ="YLBXZH",nullable=true,length=32)
	public java.lang.String getYlbxzh(){
		return this.ylbxzh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  保险证号
	 */
	public void setYlbxzh(java.lang.String ylbxzh){
		this.ylbxzh = ylbxzh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  社保卡号
	 */

	@Column(name ="SBKH",nullable=true,length=32)
	public java.lang.String getSbkh(){
		return this.sbkh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  社保卡号
	 */
	public void setSbkh(java.lang.String sbkh){
		this.sbkh = sbkh;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  转入月数
	 */

	@Column(name ="YLZRYS",nullable=true,length=32)
	public java.util.Date getYlzrys(){
		return this.ylzrys;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  转入月数
	 */
	public void setYlzrys(java.util.Date ylzrys){
		this.ylzrys = ylzrys;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缴费月数
	 */

	@Column(name ="YLSTJFYS",nullable=true,length=32)
	public java.lang.String getYlstjfys(){
		return this.ylstjfys;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费月数
	 */
	public void setYlstjfys(java.lang.String ylstjfys){
		this.ylstjfys = ylstjfys;
	}
}
