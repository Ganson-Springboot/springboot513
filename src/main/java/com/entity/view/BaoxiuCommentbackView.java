package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.BaoxiuCommentbackEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 报修评价
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("baoxiu_commentback")
public class BaoxiuCommentbackView extends BaoxiuCommentbackEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 报修
					 
		/**
		* 报修 的 用户
		*/
		@ColumnInfo(comment="用户",type="int(11)")
		private Integer baoxiuYonghuId;
		/**
		* 报修名称
		*/

		@ColumnInfo(comment="报修名称",type="varchar(200)")
		private String baoxiuName;
		/**
		* 报修图片
		*/

		@ColumnInfo(comment="报修图片",type="varchar(200)")
		private String baoxiuPhoto;
		/**
		* 报修类型
		*/
		@ColumnInfo(comment="报修类型",type="int(11)")
		private Integer baoxiuTypes;
			/**
			* 报修类型的值
			*/
			@ColumnInfo(comment="报修类型的字典表值",type="varchar(200)")
			private String baoxiuValue;
		/**
		* 报修状态
		*/
		@ColumnInfo(comment="报修状态",type="int(11)")
		private Integer baoxiuZhuangtaiTypes;
			/**
			* 报修状态的值
			*/
			@ColumnInfo(comment="报修状态的字典表值",type="varchar(200)")
			private String baoxiuZhuangtaiValue;
		/**
		* 报修详情
		*/

		@ColumnInfo(comment="报修详情",type="text")
		private String baoxiuContent;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public BaoxiuCommentbackView() {

	}

	public BaoxiuCommentbackView(BaoxiuCommentbackEntity baoxiuCommentbackEntity) {
		try {
			BeanUtils.copyProperties(this, baoxiuCommentbackEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 报修
		/**
		* 获取：报修 的 用户
		*/
		public Integer getBaoxiuYonghuId() {
			return baoxiuYonghuId;
		}
		/**
		* 设置：报修 的 用户
		*/
		public void setBaoxiuYonghuId(Integer baoxiuYonghuId) {
			this.baoxiuYonghuId = baoxiuYonghuId;
		}

		/**
		* 获取： 报修名称
		*/
		public String getBaoxiuName() {
			return baoxiuName;
		}
		/**
		* 设置： 报修名称
		*/
		public void setBaoxiuName(String baoxiuName) {
			this.baoxiuName = baoxiuName;
		}

		/**
		* 获取： 报修图片
		*/
		public String getBaoxiuPhoto() {
			return baoxiuPhoto;
		}
		/**
		* 设置： 报修图片
		*/
		public void setBaoxiuPhoto(String baoxiuPhoto) {
			this.baoxiuPhoto = baoxiuPhoto;
		}
		/**
		* 获取： 报修类型
		*/
		public Integer getBaoxiuTypes() {
			return baoxiuTypes;
		}
		/**
		* 设置： 报修类型
		*/
		public void setBaoxiuTypes(Integer baoxiuTypes) {
			this.baoxiuTypes = baoxiuTypes;
		}


			/**
			* 获取： 报修类型的值
			*/
			public String getBaoxiuValue() {
				return baoxiuValue;
			}
			/**
			* 设置： 报修类型的值
			*/
			public void setBaoxiuValue(String baoxiuValue) {
				this.baoxiuValue = baoxiuValue;
			}
		/**
		* 获取： 报修状态
		*/
		public Integer getBaoxiuZhuangtaiTypes() {
			return baoxiuZhuangtaiTypes;
		}
		/**
		* 设置： 报修状态
		*/
		public void setBaoxiuZhuangtaiTypes(Integer baoxiuZhuangtaiTypes) {
			this.baoxiuZhuangtaiTypes = baoxiuZhuangtaiTypes;
		}


			/**
			* 获取： 报修状态的值
			*/
			public String getBaoxiuZhuangtaiValue() {
				return baoxiuZhuangtaiValue;
			}
			/**
			* 设置： 报修状态的值
			*/
			public void setBaoxiuZhuangtaiValue(String baoxiuZhuangtaiValue) {
				this.baoxiuZhuangtaiValue = baoxiuZhuangtaiValue;
			}

		/**
		* 获取： 报修详情
		*/
		public String getBaoxiuContent() {
			return baoxiuContent;
		}
		/**
		* 设置： 报修详情
		*/
		public void setBaoxiuContent(String baoxiuContent) {
			this.baoxiuContent = baoxiuContent;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "BaoxiuCommentbackView{" +
			", baoxiuName=" + baoxiuName +
			", baoxiuPhoto=" + baoxiuPhoto +
			", baoxiuContent=" + baoxiuContent +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", newMoney=" + newMoney +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
