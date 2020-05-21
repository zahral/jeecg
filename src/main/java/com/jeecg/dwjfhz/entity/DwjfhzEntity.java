package com.jeecg.dwjfhz.entity;

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
 * @Title: Entity
 * @Description: 单位缴费汇总
 * @author onlineGenerator
 * @date 2019-05-21 19:52:35
 * @version V1.0   
 *
 */
@Entity
@Table(name = "dwjfhz", schema = "")
@SuppressWarnings("serial")
public class DwjfhzEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单位编号*/
	@Excel(name="单位编号",width=15)
	private java.lang.String dwbh;
	/**征收方式*/
	@Excel(name="征收方式",width=15)
	private java.lang.String zsfs;
	/**缴费标志*/
	@Excel(name="缴费标志",width=15)
	private java.lang.String jfbz;
	/**结算期*/
	@Excel(name="结算期",width=15,format = "yyyy-MM-dd")
	private java.util.Date jsqkssj;
	/**结算期*/
	@Excel(name="结算期",width=15,format = "yyyy-MM-dd")
	private java.util.Date jsqzzsj;
	/**缴费类型*/
	@Excel(name="缴费类型",width=15)
	private java.lang.String jflx;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**结算期*/
	@Excel(name="结算期",width=15,format = "yyyy-MM-dd")
	private java.util.Date jsq;
	/**应收金额*/
	@Excel(name="应收金额",width=15)
	private java.lang.String ysje;
	/**到账金额*/
	@Excel(name="到账金额",width=15)
	private java.lang.String dzje;
	/**实收金额*/
	@Excel(name="实收金额",width=15)
	private java.lang.String shje;
	/**应缴人数*/
	@Excel(name="应缴人数",width=15)
	private java.lang.String yjrs;
	
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
	 *@return: java.lang.String  征收方式
	 */

	@Column(name ="ZSFS",nullable=true,length=50)
	public java.lang.String getZsfs(){
		return this.zsfs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  征收方式
	 */
	public void setZsfs(java.lang.String zsfs){
		this.zsfs = zsfs;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缴费标志
	 */

	@Column(name ="JFBZ",nullable=true,length=50)
	public java.lang.String getJfbz(){
		return this.jfbz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费标志
	 */
	public void setJfbz(java.lang.String jfbz){
		this.jfbz = jfbz;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  结算期
	 */

	@Column(name ="JSQKSSJ",nullable=true,length=50)
	public java.util.Date getJsqkssj(){
		return this.jsqkssj;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  结算期
	 */
	public void setJsqkssj(java.util.Date jsqkssj){
		this.jsqkssj = jsqkssj;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  结算期
	 */

	@Column(name ="JSQZZSJ",nullable=true,length=50)
	public java.util.Date getJsqzzsj(){
		return this.jsqzzsj;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  结算期
	 */
	public void setJsqzzsj(java.util.Date jsqzzsj){
		this.jsqzzsj = jsqzzsj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缴费类型
	 */

	@Column(name ="JFLX",nullable=true,length=50)
	public java.lang.String getJflx(){
		return this.jflx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缴费类型
	 */
	public void setJflx(java.lang.String jflx){
		this.jflx = jflx;
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  结算期
	 */

	@Column(name ="JSQ",nullable=true,length=20)
	public java.util.Date getJsq(){
		return this.jsq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  结算期
	 */
	public void setJsq(java.util.Date jsq){
		this.jsq = jsq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  应收金额
	 */

	@Column(name ="YSJE",nullable=true,length=32)
	public java.lang.String getYsje(){
		return this.ysje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  应收金额
	 */
	public void setYsje(java.lang.String ysje){
		this.ysje = ysje;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  到账金额
	 */

	@Column(name ="DZJE",nullable=true,length=32)
	public java.lang.String getDzje(){
		return this.dzje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  到账金额
	 */
	public void setDzje(java.lang.String dzje){
		this.dzje = dzje;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  实收金额
	 */

	@Column(name ="SHJE",nullable=true,length=32)
	public java.lang.String getShje(){
		return this.shje;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  实收金额
	 */
	public void setShje(java.lang.String shje){
		this.shje = shje;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  应缴人数
	 */

	@Column(name ="YJRS",nullable=true,length=32)
	public java.lang.String getYjrs(){
		return this.yjrs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  应缴人数
	 */
	public void setYjrs(java.lang.String yjrs){
		this.yjrs = yjrs;
	}
}
