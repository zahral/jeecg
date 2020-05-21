package com.jeecg.cbpzxxdj.entity;

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
参保凭证信息登记
 */
@Entity
@Table(name = "cbpzxxdj", schema = "")
@SuppressWarnings("serial")
public class CbpzxxdjEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**登记类型*/
	@Excel(name="登记类型",width=15,dicCode="bpm_status")
	private java.lang.String djbl;
	/**单位编号*/
	@Excel(name="单位编号",width=15)
	private java.lang.String dwbh;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**代办人*/
	@Excel(name="代办人",width=15)
	private java.lang.String dbrxm;
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

	/**转出地*/
	@Excel(name="转出地",width=15)
	private java.lang.String zcd;
	/**转入金额*/
	@Excel(name="转入金额",width=15)
	private java.lang.String grzhzrje;
	/**开始时间*/
	@Excel(name="开始时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date cbkssj;
	/**终止时间*/
	@Excel(name="终止时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date cbzzsj;
	/**缴费月数*/
	@Excel(name="缴费月数",width=15)
	private java.lang.String ljsjjfys;
	/**机构名称*/
	@Excel(name="机构名称",width=15)
	private java.lang.String zcdcbjgmc;
	/**机构地址*/
	@Excel(name="机构地址",width=15)
	private java.lang.String zcdcbjgdz;
	/**机构邮编*/
	@Excel(name="机构邮编",width=15)
	private java.lang.String zcdcbjgyb;
	/**联系人*/
	@Excel(name="联系人",width=15)
	private java.lang.String zcdcbjglxr;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String bz;
	/**联系电话*/
	@Excel(name="联系电话",width=15)
	private java.lang.String zcdcbjglxdh;
	/**经办人*/
	@Excel(name="经办人",width=15)
	private java.lang.String jbr;
	/**经办时间*/
	@Excel(name="经办时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date jbsj;
	/**凭证号*/
	@Excel(name="凭证号",width=15)
	private java.lang.String pzh;
	/**医疗保险类型*/
	@Excel(name="医疗保险类型",width=15)
	private java.lang.String ylbxlx;
	/**区划*/
	@Excel(name="区划",width=15)
	private java.lang.String zcdxzqb;
	
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
	 *@return: java.lang.String  登记类型
	 */

	@Column(name ="DJBL",nullable=true,length=32)
	public java.lang.String getDjbl(){
		return this.djbl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  登记类型
	 */
	public void setDjbl(java.lang.String djbl){
		this.djbl = djbl;
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
	 *@return: java.lang.String  代办人
	 */

	@Column(name ="DBRXM",nullable=true,length=50)
	public java.lang.String getDbrxm(){
		return this.dbrxm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  代办人
	 */
	public void setDbrxm(java.lang.String dbrxm){
		this.dbrxm = dbrxm;
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
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  转出地
	 */

	@Column(name ="ZCD",nullable=true,length=32)
	public java.lang.String getZcd(){
		return this.zcd;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  转出地
	 */
	public void setZcd(java.lang.String zcd){
		this.zcd = zcd;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  转入金额
	 */

	@Column(name ="GRZHZRJE",nullable=true,length=32)
	public java.lang.String getGrzhzrje(){
		return this.grzhzrje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  转入金额
	 */
	public void setGrzhzrje(java.lang.String grzhzrje){
		this.grzhzrje = grzhzrje;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  开始时间
	 */

	@Column(name ="CBKSSJ",nullable=true,length=32)
	public java.util.Date getCbkssj(){
		return this.cbkssj;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  开始时间
	 */
	public void setCbkssj(java.util.Date cbkssj){
		this.cbkssj = cbkssj;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  终止时间
	 */

	@Column(name ="CBZZSJ",nullable=true,length=32)
	public java.util.Date getCbzzsj(){
		return this.cbzzsj;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  终止时间
	 */
	public void setCbzzsj(java.util.Date cbzzsj){
		this.cbzzsj = cbzzsj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缴费月数
	 */

	@Column(name ="LJSJJFYS",nullable=true,length=32)
	public java.lang.String getLjsjjfys(){
		return this.ljsjjfys;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费月数
	 */
	public void setLjsjjfys(java.lang.String ljsjjfys){
		this.ljsjjfys = ljsjjfys;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  机构名称
	 */

	@Column(name ="ZCDCBJGMC",nullable=true,length=32)
	public java.lang.String getZcdcbjgmc(){
		return this.zcdcbjgmc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  机构名称
	 */
	public void setZcdcbjgmc(java.lang.String zcdcbjgmc){
		this.zcdcbjgmc = zcdcbjgmc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  机构地址
	 */

	@Column(name ="ZCDCBJGDZ",nullable=true,length=32)
	public java.lang.String getZcdcbjgdz(){
		return this.zcdcbjgdz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  机构地址
	 */
	public void setZcdcbjgdz(java.lang.String zcdcbjgdz){
		this.zcdcbjgdz = zcdcbjgdz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  机构邮编
	 */

	@Column(name ="ZCDCBJGYB",nullable=true,length=32)
	public java.lang.String getZcdcbjgyb(){
		return this.zcdcbjgyb;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  机构邮编
	 */
	public void setZcdcbjgyb(java.lang.String zcdcbjgyb){
		this.zcdcbjgyb = zcdcbjgyb;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  联系人
	 */

	@Column(name ="ZCDCBJGLXR",nullable=true,length=32)
	public java.lang.String getZcdcbjglxr(){
		return this.zcdcbjglxr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  联系人
	 */
	public void setZcdcbjglxr(java.lang.String zcdcbjglxr){
		this.zcdcbjglxr = zcdcbjglxr;
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
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  联系电话
	 */

	@Column(name ="ZCDCBJGLXDH",nullable=true,length=32)
	public java.lang.String getZcdcbjglxdh(){
		return this.zcdcbjglxdh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  联系电话
	 */
	public void setZcdcbjglxdh(java.lang.String zcdcbjglxdh){
		this.zcdcbjglxdh = zcdcbjglxdh;
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
	 *@return: java.lang.String  凭证号
	 */

	@Column(name ="PZH",nullable=true,length=32)
	public java.lang.String getPzh(){
		return this.pzh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  凭证号
	 */
	public void setPzh(java.lang.String pzh){
		this.pzh = pzh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  医疗保险类型
	 */

	@Column(name ="YLBXLX",nullable=true,length=32)
	public java.lang.String getYlbxlx(){
		return this.ylbxlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  医疗保险类型
	 */
	public void setYlbxlx(java.lang.String ylbxlx){
		this.ylbxlx = ylbxlx;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  区划
	 */

	@Column(name ="ZCDXZQB",nullable=true,length=32)
	public java.lang.String getZcdxzqb(){
		return this.zcdxzqb;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  区划
	 */
	public void setZcdxzqb(java.lang.String zcdxzqb){
		this.zcdxzqb = zcdxzqb;
	}
}
