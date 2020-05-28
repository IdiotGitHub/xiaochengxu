/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 100137
 Source Host           : localhost:3306
 Source Schema         : xiaochengxu

 Target Server Type    : MySQL
 Target Server Version : 100137
 File Encoding         : 65001

 Date: 28/05/2020 17:20:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hr_info
-- ----------------------------
DROP TABLE IF EXISTS `hr_info`;
CREATE TABLE `hr_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '姓名',
  `company` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '公司名',
  `position` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '职位',
  `avatar_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '头像链接',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'hr_info' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of hr_info
-- ----------------------------
INSERT INTO `hr_info` VALUES (1, 'hello', '浪潮软件集团', '人事经理', 'https://dss1.bdstatic.com/6OF1bjeh1BF3odCf/it/u=1278259604,2122110986&fm=85&app=92&f=JPEG?w=121&h=75&s=BFA5CD040ED838C6381F54C90300E0A8');

-- ----------------------------
-- Table structure for job_info
-- ----------------------------
DROP TABLE IF EXISTS `job_info`;
CREATE TABLE `job_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '职位名称',
  `salary` decimal(10, 2) NULL DEFAULT NULL COMMENT '薪资',
  `company` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '公司名',
  `hr` int(20) NOT NULL DEFAULT 0 COMMENT 'hr',
  `workplace` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '工作地',
  `years` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '工作年限',
  `education` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '学历要求',
  `requirements` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '职位要求',
  `benefits` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '福利',
  `datetime` datetime(0) NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '发布时间',
  `view_count` int(255) NOT NULL DEFAULT 0 COMMENT '浏览次数',
  `interviewee` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '简历投递者',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '职位信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of job_info
-- ----------------------------
INSERT INTO `job_info` VALUES (1, 'java初级程序员', 5000.00, '浪潮软件集团', 1, '济南', '1-3', '本科', '1. 一本及以上院校统招全日制毕业，本科及以上学历，工作积极主动，态度端正，认真负责。&&3.熟悉主流开发框架，如Spring、Spring MVC、Springboot、MyBatis。&&4.熟悉Mysql、Oracle数据库，熟悉Sql编写，数据库优化。&&5.熟悉常用的数据结构及算法。&&6.熟悉Javascript、Ajax、bootstrap、easyui、Jquery等前端框架技术。&&7.具有一定的文档编写能力和沟通理解能力，具有需求分析、设计、编码、单元测试能力。', '全勤奖&&五险一金&&餐补&&bala', '2020-05-28 01:00:00', 0, NULL);

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '姓名',
  `id_num` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '身份证号码',
  `telephone` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '手机号',
  `gender` tinyint(2) NOT NULL DEFAULT 0 COMMENT '性别0未知、1男、2女',
  `birthday` datetime(0) NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '出生日期',
  `education` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '学历',
  `nick_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '昵称',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '居住地',
  `avatar_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '头像链接',
  `is_complete` tinyint(2) NOT NULL DEFAULT 0 COMMENT '用户信息是否完整1完整，0不完整',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户信息表' ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
