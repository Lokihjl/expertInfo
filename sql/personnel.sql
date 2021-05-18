/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : personnel

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2021-05-18 08:43:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '唯一id',
  `name` varchar(50) DEFAULT NULL COMMENT '类别名称',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专家类别';

-- ----------------------------
-- Records of category
-- ----------------------------

-- ----------------------------
-- Table structure for experience
-- ----------------------------
DROP TABLE IF EXISTS `experience`;
CREATE TABLE `experience` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '唯一id',
  `expert_id` bigint(20) DEFAULT NULL COMMENT '专家关联id',
  `start_date` datetime DEFAULT NULL COMMENT '开始年月',
  `end_date` datetime DEFAULT NULL COMMENT '结束年月',
  `work` varchar(10) DEFAULT NULL COMMENT '学习或工作单位',
  `education` varchar(10) DEFAULT NULL COMMENT '学历',
  `degree` varchar(10) DEFAULT NULL COMMENT '学位',
  `position` varchar(10) DEFAULT NULL COMMENT '职位',
  `title` varchar(10) DEFAULT NULL COMMENT '职称',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专家专业水平（经历）';

-- ----------------------------
-- Records of experience
-- ----------------------------

-- ----------------------------
-- Table structure for expert
-- ----------------------------
DROP TABLE IF EXISTS `expert`;
CREATE TABLE `expert` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(2) DEFAULT NULL COMMENT '0、男； 1、女',
  `category_id` int(11) DEFAULT NULL COMMENT '类别id',
  `category_name` varchar(50) DEFAULT NULL COMMENT '类别名称',
  `birthday` datetime DEFAULT NULL COMMENT '出生日期',
  `card_number` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `work_code` varchar(8) DEFAULT NULL COMMENT '所在单位代码',
  `professional_discipline` varchar(20) DEFAULT NULL COMMENT '专业学科',
  `final_education` varchar(20) DEFAULT NULL COMMENT '最后学历',
  `highest_degree` varchar(10) DEFAULT NULL COMMENT '最高学位',
  `postal_address` varchar(50) DEFAULT NULL COMMENT '通讯地址',
  `postal_code` varchar(10) DEFAULT NULL COMMENT '邮件编号',
  `tel` varchar(11) DEFAULT NULL COMMENT '手机号',
  `nation` varchar(20) DEFAULT NULL COMMENT '民族',
  `political` varchar(10) DEFAULT NULL COMMENT '政治面貌',
  `remark` varchar(800) DEFAULT NULL COMMENT '备注个人说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专家用户信息';

-- ----------------------------
-- Records of expert
-- ----------------------------

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `content` text COMMENT '内容',
  `createDate` char(20) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='公告';

-- ----------------------------
-- Records of notice
-- ----------------------------

-- ----------------------------
-- Table structure for paper
-- ----------------------------
DROP TABLE IF EXISTS `paper`;
CREATE TABLE `paper` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `expert_id` bigint(20) DEFAULT NULL COMMENT '专家关联id',
  `name` varchar(20) DEFAULT NULL COMMENT '论文或著作名称',
  `type` varchar(2) DEFAULT NULL COMMENT '著作类别',
  `publication` varchar(20) DEFAULT NULL COMMENT '刊物名称',
  `paper_time` datetime DEFAULT NULL COMMENT '论文时间',
  `volume` varchar(50) DEFAULT NULL COMMENT '卷',
  `start_page` varchar(50) DEFAULT NULL COMMENT '起始页码',
  `end_page` varchar(50) DEFAULT NULL COMMENT '止页',
  `write_time` datetime DEFAULT NULL COMMENT '著作时间',
  `adress` varchar(50) DEFAULT NULL COMMENT '社地址',
  `total` varchar(50) DEFAULT NULL COMMENT '总共页数',
  `ranking` varchar(10) DEFAULT NULL COMMENT '排名',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='论文发表及专著出版情况';

-- ----------------------------
-- Records of paper
-- ----------------------------

-- ----------------------------
-- Table structure for patent
-- ----------------------------
DROP TABLE IF EXISTS `patent`;
CREATE TABLE `patent` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `expert_id` bigint(20) DEFAULT NULL COMMENT '专家关联id',
  `type` varchar(20) DEFAULT NULL COMMENT '专利种类',
  `name` varchar(20) DEFAULT NULL COMMENT '专利项目名称',
  `country` varchar(10) DEFAULT NULL COMMENT '国别',
  `grant` varchar(2) DEFAULT NULL COMMENT '是否授权（是、否）',
  `year` datetime DEFAULT NULL COMMENT '年度',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专利获取情况';

-- ----------------------------
-- Records of patent
-- ----------------------------

-- ----------------------------
-- Table structure for reward
-- ----------------------------
DROP TABLE IF EXISTS `reward`;
CREATE TABLE `reward` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `expert_id` bigint(20) DEFAULT NULL COMMENT '专家关联id',
  `type` varchar(20) DEFAULT NULL COMMENT '奖励种类',
  `program` varchar(20) DEFAULT NULL COMMENT '奖励项目',
  `grade` varchar(3) DEFAULT NULL COMMENT '奖励等级',
  `ranking` varchar(10) DEFAULT NULL COMMENT '排名',
  `year` datetime DEFAULT NULL COMMENT '年度',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专家科研项目成果获奖';

-- ----------------------------
-- Records of reward
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `expert_id` bigint(20) DEFAULT NULL COMMENT '专家扩展信息',
  `loginname` varchar(20) DEFAULT NULL COMMENT '登录名称',
  `password` char(32) DEFAULT NULL COMMENT '密码',
  `level` varchar(4) DEFAULT NULL COMMENT '级别（0： 管理员； 1： 专家； 2 用户）',
  `createdate` char(50) DEFAULT NULL COMMENT '创建时间',
  `username` varchar(20) DEFAULT NULL COMMENT '用户显示名称',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('9', null, 'admin', 'e10adc3949ba59abbe56e057f20f883e', '0', '19-05-17 02:04:50', '管理员');
INSERT INTO `user` VALUES ('10', null, 'huangjie', 'e10adc3949ba59abbe56e057f20f883e', '1', '19-05-17 02:13:13', '黄杰');
