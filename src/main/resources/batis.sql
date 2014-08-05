/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : batis

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2014-08-05 19:48:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_category_resouce
-- ----------------------------
DROP TABLE IF EXISTS `t_category_resouce`;
CREATE TABLE `t_category_resouce` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL DEFAULT '0' COMMENT '上传资源用户的ID',
  `type` int(2) NOT NULL DEFAULT '1' COMMENT '类别标识',
  `parent_type` int(2) NOT NULL DEFAULT '0' COMMENT '父类别标识',
  `category` varchar(50) NOT NULL COMMENT '类别',
  `description` varchar(250) DEFAULT NULL COMMENT '类别描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_category_resouce
-- ----------------------------

-- ----------------------------
-- Table structure for t_imgs_resources
-- ----------------------------
DROP TABLE IF EXISTS `t_imgs_resources`;
CREATE TABLE `t_imgs_resources` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_type` int(2) NOT NULL DEFAULT '1' COMMENT '所属分类',
  `img_url` varchar(255) DEFAULT NULL COMMENT '图片地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_imgs_resources
-- ----------------------------

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_pet
-- ----------------------------
INSERT INTO `t_pet` VALUES ('1', 'hh', '男', 'xh', '3');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(50) NOT NULL COMMENT '用户昵称',
  `icon` varchar(200) DEFAULT NULL COMMENT '头像地址',
  `sex` int(1) NOT NULL DEFAULT '0' COMMENT '性别 0:男 1:女',
  `age` int(3) NOT NULL DEFAULT '0' COMMENT '年龄',
  `contact` varchar(60) DEFAULT NULL COMMENT '联系方式(邮件或者电话号码)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
