/*
Navicat MySQL Data Transfer

Source Server         : dkf1
Source Server Version : 50096
Source Host           : localhost:3307
Source Database       : tieba

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2018-12-24 11:51:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for replay
-- ----------------------------
DROP TABLE IF EXISTS `replay`;
CREATE TABLE `replay` (
  `repid` int(30) NOT NULL,
  `repContent` varchar(200) default NULL,
  `repTime` varchar(30) default NULL,
  `tipId` int(30) default NULL,
  `usId` int(10) default NULL,
  PRIMARY KEY  (`repid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of replay
-- ----------------------------

-- ----------------------------
-- Table structure for tip
-- ----------------------------
DROP TABLE IF EXISTS `tip`;
CREATE TABLE `tip` (
  `tipId` int(30) NOT NULL,
  `tipTitle` varchar(50) default NULL,
  `tipContext` varchar(200) default NULL,
  `tipCount` int(20) default NULL,
  `userid` int(10) NOT NULL,
  `tipTime` varchar(30) default NULL,
  PRIMARY KEY  (`tipId`,`userid`),
  KEY `tipTitle` (`tipTitle`),
  KEY `userid` (`userid`),
  KEY `tipId` (`tipId`),
  CONSTRAINT `userid` FOREIGN KEY (`userid`) REFERENCES `users` (`usId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tip
-- ----------------------------

-- ----------------------------
-- Table structure for tipvo
-- ----------------------------
DROP TABLE IF EXISTS `tipvo`;
CREATE TABLE `tipvo` (
  `repCount` int(50) default NULL,
  `tipId` int(30) NOT NULL,
  `tipTitle` varchar(50) default NULL,
  `tipContext` varchar(200) default NULL,
  `userId` int(10) NOT NULL,
  `tipUser` varchar(30) default NULL,
  `lastrepcontext` varchar(200) default NULL,
  `lastreptime` varchar(30) default NULL,
  `lastrepusid` int(30) default NULL,
  `tipTime` varchar(30) default NULL,
  `userNick` varchar(30) default NULL,
  PRIMARY KEY  (`tipId`,`userId`),
  KEY `tipUser` (`tipUser`),
  KEY `userNick` (`userNick`),
  KEY `userId` (`userId`),
  KEY `tipTitle` (`tipTitle`),
  KEY `repCount` (`repCount`),
  CONSTRAINT `repCount` FOREIGN KEY (`repCount`) REFERENCES `replay` (`repid`),
  CONSTRAINT `tipId` FOREIGN KEY (`tipId`) REFERENCES `tip` (`tipId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tipvo
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `usId` int(10) NOT NULL,
  `usNo` int(10) NOT NULL,
  `usPwd` varchar(50) default NULL,
  `usNick` varchar(30) NOT NULL,
  `usHead` varchar(50) default NULL,
  `usTime` varchar(30) default NULL,
  `usState` int(30) default NULL,
  `usScore` int(30) default NULL,
  PRIMARY KEY  (`usId`),
  KEY `usNick` (`usNick`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '123', '123', '墨小白', '111', '111', '1', '111');
