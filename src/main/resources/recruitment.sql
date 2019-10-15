/*
Navicat MySQL Data Transfer

Source Server         : 172.18.10.100
Source Server Version : 50537
Source Host           : 172.18.10.100:3306
Source Database       : recruitment

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2019-10-15 22:32:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for  t_resume_education
-- ----------------------------
DROP TABLE IF EXISTS ` t_resume_education`;
CREATE TABLE ` t_resume_education` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `resume_id` int(11) DEFAULT NULL COMMENT '简历id',
  `school_name` varchar(32) DEFAULT NULL COMMENT '学校名称',
  `admission_time` datetime DEFAULT NULL COMMENT '入学时间',
  `graduation_time` datetime DEFAULT NULL COMMENT '毕业时间',
  `major` varchar(32) DEFAULT NULL COMMENT '专业',
  `degree` int(11) DEFAULT NULL COMMENT '学历',
  `is_unified_recruitment` int(11) DEFAULT '1' COMMENT '是否统招 0非统招 1统招',
  `delete_status` int(11) DEFAULT '0' COMMENT '0未删除 1已删除',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='个人教育经历';

-- ----------------------------
-- Table structure for t_career_objective
-- ----------------------------
DROP TABLE IF EXISTS `t_career_objective`;
CREATE TABLE `t_career_objective` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `job_title` varchar(100) DEFAULT NULL COMMENT '职位名称',
  `work_nature` int(11) DEFAULT NULL COMMENT '工作性质',
  `job_category` int(11) DEFAULT NULL COMMENT '职位类别',
  `work_length` int(11) DEFAULT NULL COMMENT '工作时长',
  `delete_status` int(11) NOT NULL DEFAULT '0' COMMENT '删除状态',
  `work_city` varchar(300) DEFAULT NULL COMMENT '工作城市',
  `expect_salary_start` int(11) DEFAULT NULL COMMENT '期望薪资开始',
  `expect_salary_end` int(11) DEFAULT NULL COMMENT '期望薪资截止',
  `state` int(11) DEFAULT NULL COMMENT '目前状态',
  `duty_time_type` int(11) DEFAULT NULL COMMENT '到岗时间类型',
  `self_evaluation` varchar(900) DEFAULT NULL COMMENT '自我评价',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='求职意向表';

-- ----------------------------
-- Table structure for t_enterprise
-- ----------------------------
DROP TABLE IF EXISTS `t_enterprise`;
CREATE TABLE `t_enterprise` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(32) DEFAULT NULL COMMENT '企业名称',
  `fixed_phone` varchar(32) DEFAULT NULL COMMENT '企业固定电话',
  `email` varchar(32) DEFAULT NULL COMMENT '企业邮箱',
  `address` varchar(300) DEFAULT NULL COMMENT '公司地址',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业信息';

-- ----------------------------
-- Table structure for t_enterprise_certification
-- ----------------------------
DROP TABLE IF EXISTS `t_enterprise_certification`;
CREATE TABLE `t_enterprise_certification` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `enterprise_id` int(11) DEFAULT NULL COMMENT '企业id',
  `certificate_img` varchar(100) DEFAULT NULL COMMENT '营业执照',
  `credit_code` varchar(100) DEFAULT NULL COMMENT '企业信用代码',
  `corporate` varchar(32) DEFAULT NULL COMMENT '公司法人',
  `registered_address` varchar(300) DEFAULT NULL COMMENT '注册地址',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业认证资料';

-- ----------------------------
-- Table structure for t_enterprise_detail
-- ----------------------------
DROP TABLE IF EXISTS `t_enterprise_detail`;
CREATE TABLE `t_enterprise_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `enterprise_id` int(11) DEFAULT NULL COMMENT '企业id',
  `industry` varchar(100) DEFAULT NULL COMMENT '从事行业',
  `business_nature` int(11) DEFAULT NULL COMMENT '企业性质',
  `business_scale` varchar(100) DEFAULT NULL COMMENT '企业规模',
  `address` varchar(300) DEFAULT NULL COMMENT '公司地址',
  `enterprise_profile` varchar(900) DEFAULT NULL COMMENT '企业简介',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业详情';

-- ----------------------------
-- Table structure for t_manager
-- ----------------------------
DROP TABLE IF EXISTS `t_manager`;
CREATE TABLE `t_manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `telephone` varchar(32) DEFAULT NULL COMMENT '电话',
  `password` varchar(300) DEFAULT NULL COMMENT '密码',
  `dept_name` varchar(32) DEFAULT NULL COMMENT '部门名称',
  `post_name` varchar(32) DEFAULT NULL COMMENT '岗位名称',
  `delete_status` int(11) NOT NULL DEFAULT '0' COMMENT '删除状态',
  `manager_type` int(11) DEFAULT '2' COMMENT '人员类型 1 管理员 2 普通后台人员',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业人员表';

-- ----------------------------
-- Table structure for t_position_collection_record
-- ----------------------------
DROP TABLE IF EXISTS `t_position_collection_record`;
CREATE TABLE `t_position_collection_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `recruitment_position_id` int(11) DEFAULT NULL COMMENT '招聘职位id',
  `delete_status` int(11) DEFAULT '0' COMMENT '取消收藏状态 0未删除 1已删除',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='个人收藏表';

-- ----------------------------
-- Table structure for t_recruitment_position
-- ----------------------------
DROP TABLE IF EXISTS `t_recruitment_position`;
CREATE TABLE `t_recruitment_position` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `manager_id` int(11) DEFAULT NULL COMMENT '招聘manager人',
  `position_title` varchar(100) DEFAULT NULL COMMENT '职位名称',
  `age_range` varchar(100) DEFAULT NULL COMMENT '年龄范围',
  `education` int(11) DEFAULT NULL COMMENT '学历要求',
  `recruit_num` int(11) DEFAULT NULL COMMENT '招聘人数',
  `sex_enable` int(11) DEFAULT '0' COMMENT '性别限制 0 无性别限制 1有性别限制',
  `recruit_num_female` int(11) DEFAULT NULL COMMENT '招聘女性数量',
  `recruit_num_male` int(11) DEFAULT NULL COMMENT '招聘男性数量',
  `work_address` varchar(300) DEFAULT NULL COMMENT '工作地址',
  `salary_start` int(11) DEFAULT NULL COMMENT '薪资起始',
  `salary_end` int(11) DEFAULT NULL COMMENT '薪资截止',
  `schedule_code` int(11) DEFAULT NULL COMMENT '工作周期',
  `schedule_info` varchar(100) DEFAULT NULL COMMENT '自定义工作周期时 需要辅助的字段',
  `work_welfare` int(11) DEFAULT NULL COMMENT '工作福利',
  `other_welfare` varchar(900) DEFAULT NULL COMMENT '其他福利',
  `post_duty` varchar(900) DEFAULT NULL COMMENT '岗位职责',
  `job_requirement` varchar(900) DEFAULT NULL COMMENT '任职要求',
  `work_time` varchar(900) DEFAULT NULL COMMENT '工作时间要求',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='招聘职位';

-- ----------------------------
-- Table structure for t_resume
-- ----------------------------
DROP TABLE IF EXISTS `t_resume`;
CREATE TABLE `t_resume` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `resume_title` varchar(32) DEFAULT NULL COMMENT '简历名称',
  `is_default` int(11) DEFAULT '0' COMMENT '是否默认 0非默认 1默认',
  `is_private` int(11) DEFAULT '0' COMMENT '是否私有 0非私有即为公开 1私有',
  `delete_status` int(11) DEFAULT '0' COMMENT '0未删除 1已删除',
  `order` int(11) DEFAULT NULL COMMENT '简历顺序',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='个人简历';

-- ----------------------------
-- Table structure for t_resume_delivery_record
-- ----------------------------
DROP TABLE IF EXISTS `t_resume_delivery_record`;
CREATE TABLE `t_resume_delivery_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `resume_id` int(11) DEFAULT NULL COMMENT '简历id',
  `recruitment_position_id` int(11) DEFAULT NULL COMMENT '招聘职位id',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='个人简历投递表';

-- ----------------------------
-- Table structure for t_resume_project_experience
-- ----------------------------
DROP TABLE IF EXISTS `t_resume_project_experience`;
CREATE TABLE `t_resume_project_experience` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `resume_id` int(11) DEFAULT NULL COMMENT '简历id',
  `company_name` varchar(32) DEFAULT NULL COMMENT '公司名称',
  `project_name` varchar(32) DEFAULT NULL COMMENT '项目名称',
  `project_start_date` datetime DEFAULT NULL COMMENT '项目开始时间',
  `project_end_date` datetime DEFAULT NULL COMMENT '项目结束时间',
  `project_describe` varchar(900) DEFAULT NULL COMMENT '项目描述',
  `delete_status` int(11) DEFAULT '0' COMMENT '0未删除 1已删除',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='简历项目经验表';

-- ----------------------------
-- Table structure for t_resume_work
-- ----------------------------
DROP TABLE IF EXISTS `t_resume_work`;
CREATE TABLE `t_resume_work` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `resume_id` int(11) DEFAULT NULL COMMENT '简历id',
  `company_name` varchar(100) DEFAULT NULL COMMENT '公司名称',
  `industry_category` int(11) DEFAULT NULL COMMENT '行业类别',
  `position_name` varchar(100) DEFAULT NULL COMMENT '职位名称 ',
  `position_category` int(11) DEFAULT NULL COMMENT '职位类别',
  `work_date_start` datetime DEFAULT NULL COMMENT '工作开始时间',
  `work_date_end` datetime DEFAULT NULL COMMENT '工作截止时间',
  `position_salary_code` int(11) DEFAULT NULL COMMENT '职位月薪类型',
  `position_salary_money` varchar(100) DEFAULT NULL COMMENT '职位月薪 ',
  `work_describe` varchar(900) DEFAULT NULL COMMENT '工作内容描述 ',
  `delete_status` int(11) DEFAULT '0' COMMENT '0未删除 1已删除',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='个人工作经验';

-- ----------------------------
-- Table structure for t_talent_pool
-- ----------------------------
DROP TABLE IF EXISTS `t_talent_pool`;
CREATE TABLE `t_talent_pool` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `resume_id` int(11) DEFAULT NULL COMMENT '简历id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `position_id` int(11) DEFAULT NULL COMMENT '岗位id',
  `match_keyword` varchar(300) DEFAULT NULL COMMENT '匹配关键词',
  `binding_status` int(11) DEFAULT NULL COMMENT '绑定状态',
  `delete_status` int(11) DEFAULT '0' COMMENT '删除状态',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人才库';

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `telephone` varchar(32) DEFAULT NULL COMMENT '电话',
  `password` varchar(300) DEFAULT NULL COMMENT '密码',
  `delete_status` int(11) NOT NULL DEFAULT '0' COMMENT '删除状态',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Table structure for t_user_detail
-- ----------------------------
DROP TABLE IF EXISTS `t_user_detail`;
CREATE TABLE `t_user_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `sex` int(11) DEFAULT NULL COMMENT '性别',
  `birth_date` datetime DEFAULT NULL COMMENT '出生年月',
  `delete_status` int(11) NOT NULL DEFAULT '0' COMMENT '删除状态',
  `telephone` varchar(32) DEFAULT NULL COMMENT '联系电话',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `high_education` int(11) DEFAULT NULL COMMENT '最高学历',
  `address` varchar(300) DEFAULT NULL COMMENT '居住地址',
  `start_work_date` datetime DEFAULT NULL COMMENT '开始工作时间',
  `is_overseas_experience` int(11) DEFAULT '0' COMMENT '有海外经验 0 无  1有',
  `create_time` datetime DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户详情表';

-- ----------------------------
-- Table structure for t_version
-- ----------------------------
DROP TABLE IF EXISTS `t_version`;
CREATE TABLE `t_version` (
  `name` varchar(255) NOT NULL,
  `info` varchar(255) NOT NULL,
  `version` varchar(255) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
