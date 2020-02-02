/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50639
Source Host           : 127.0.0.1:3306
Source Database       : test0slave

Target Server Type    : MYSQL
Target Server Version : 50639
File Encoding         : 65001

Date: 2020-02-02 11:53:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user_0
-- ----------------------------
DROP TABLE IF EXISTS `t_user_0`;
CREATE TABLE `t_user_0` (
  `id` bigint(20) NOT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_user_1
-- ----------------------------
DROP TABLE IF EXISTS `t_user_1`;
CREATE TABLE `t_user_1` (
  `id` bigint(20) NOT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
