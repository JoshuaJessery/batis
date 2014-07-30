/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : batis

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2014-07-30 11:48:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_pet
-- ----------------------------
DROP TABLE IF EXISTS `t_pet`;
CREATE TABLE `t_pet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `sex` varchar(4) DEFAULT NULL,
  `aliases` varchar(100) DEFAULT NULL,
  `age` int(3) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_pet
-- ----------------------------
INSERT INTO `t_pet` VALUES ('1', 'xb', '男', 'little bai', '1');
INSERT INTO `t_pet` VALUES ('2', 'hh', '女', 'xh', '3');
INSERT INTO `t_pet` VALUES ('3', 'hh', '女', 'xh', '3');
INSERT INTO `t_pet` VALUES ('4', 'hh', '男', 'xh', '3');
