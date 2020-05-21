package com.jeecg.danweixinxi.entity;

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
 单位信息
 */
@Entity
@Table(name = "danweixinxi", schema = "")
@SuppressWarnings("serial")
public class DanweixinxiEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单位编号*/
	@Excel(name="单位编号",width=15)
	private java.lang.String dwbh;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**行政区代码*/
	@Excel(name="行政区代码",width=15)
	private java.lang.String xzqdm;
	/**行业风险类别*/
	@Excel(name="行业风险类别",width=15)
	private java.lang.String hyfxlb;
	/**单位电话*/
	@Excel(name="单位电话",width=15)
	private java.lang.String dwdh;
	/**邮政编码*/
	@Excel(name="邮政编码",width=15)
	private java.lang.String yzbm;
	/**单位地址*/
	@Excel(name="单位地址",width=15)
	private java.lang.String dwdz;
	/**电子邮箱地址*/
	@Excel(name="电子邮箱地址",width=15)
	private java.lang.String dzyxdz;
	/**社保经办机构*/
	@Excel(name="社保经办机构",width=15)
	private java.lang.String sbjbjg;
	/**税号*/
	@Excel(name="税号",width=15)
	private java.lang.String sh;
	/**单位登记状态*/
	@Excel(name="单位登记状态",width=15)
	private java.lang.String dwdjzt;
	
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

	@Column(name ="DWMC",nullable=true,length=255)
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
	 *@return: java.lang.String  行政区代码
	 */

	@Column(name ="XZQDM",nullable=true,length=32)
	public java.lang.String getXzqdm(){
		return this.xzqdm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  行政区代码
	 */
	public void setXzqdm(java.lang.String xzqdm){
		this.xzqdm = xzqdm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  行业风险类别
	 */

	@Column(name ="HYFXLB",nullable=true,length=32)
	public java.lang.String getHyfxlb(){
		return this.hyfxlb;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  行业风险类别
	 */
	public void setHyfxlb(java.lang.String hyfxlb){
		this.hyfxlb = hyfxlb;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位电话
	 */

	@Column(name ="DWDH",nullable=true,length=32)
	public java.lang.String getDwdh(){
		return this.dwdh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位电话
	 */
	public void setDwdh(java.lang.String dwdh){
		this.dwdh = dwdh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  邮政编码
	 */

	@Column(name ="YZBM",nullable=true,length=32)
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
	 *@return: java.lang.String  单位地址
	 */

	@Column(name ="DWDZ",nullable=true,length=255)
	public java.lang.String getDwdz(){
		return this.dwdz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位地址
	 */
	public void setDwdz(java.lang.String dwdz){
		this.dwdz = dwdz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  电子邮箱地址
	 */

	@Column(name ="DZYXDZ",nullable=true,length=32)
	public java.lang.String getDzyxdz(){
		return this.dzyxdz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  电子邮箱地址
	 */
	public void setDzyxdz(java.lang.String dzyxdz){
		this.dzyxdz = dzyxdz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  社保经办机构
	 */

	@Column(name ="SBJBJG",nullable=true,length=32)
	public java.lang.String getSbjbjg(){
		return this.sbjbjg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  社保经办机构
	 */
	public void setSbjbjg(java.lang.String sbjbjg){
		this.sbjbjg = sbjbjg;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  税号
	 */

	@Column(name ="SH",nullable=true,length=32)
	public java.lang.String getSh(){
		return this.sh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  税号
	 */
	public void setSh(java.lang.String sh){
		this.sh = sh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位登记状态
	 */

	@Column(name ="DWDJZT",nullable=true,length=32)
	public java.lang.String getDwdjzt(){
		return this.dwdjzt;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位登记状态
	 */
	public void setDwdjzt(java.lang.String dwdjzt){
		this.dwdjzt = dwdjzt;
	}
}
