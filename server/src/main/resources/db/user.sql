/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80016
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-06-12 16:41:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `username` varchar(30) DEFAULT NULL COMMENT '用户名',
  `password` varchar(30) DEFAULT NULL COMMENT '密码',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'Jone', '123', 'test1@baomidou.com');
INSERT INTO `user` VALUES ('2', 'Jack', '321', 'test2@baomidou.com');
INSERT INTO `user` VALUES ('3', 'Tom', 'aaa', 'test3@baomidou.com');
INSERT INTO `user` VALUES ('4', 'Sandy', 'bbb', 'test4@baomidou.com');
INSERT INTO `user` VALUES ('5', 'Billie', 'ccc', 'test5@baomidou.com');
