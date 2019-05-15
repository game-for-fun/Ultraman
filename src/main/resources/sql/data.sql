/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : csl

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2016-06-04 11:32:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for Card
-- ----------------------------
DROP TABLE IF EXISTS `Card`;
CREATE TABLE `Card` (
  `id` int(11) NOT NULL auto_increment,
  `cardId` int(11) default NULL,
  `characterId` int(11) default NULL,
  `characterName` varchar(255) default NULL,
  `characterLv` int(11) default NULL,
  `CharacterStarstars` int(11) default NULL,
  `characterPieces` int(11) default NULL,
  `characterPic` varchar(255) default NULL,
  `score` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Card
-- ----------------------------
INSERT INTO `Card` VALUES ('1', '3', '5', '沙鲁', '1', '1', '0', '/img/role/shalu.jpg', '1000');
INSERT INTO `Card` VALUES ('2', '2', '1', '孙悟空', '1', '1', '30', '/img/role/sunwukong.jpg', '1000');
INSERT INTO `Card` VALUES ('3', '2', '6', '贝吉塔', '1', '1', '0', '/img/role/beijita.jpg', '1000');
INSERT INTO `Card` VALUES ('4', '2', '10', '布尔玛', '1', '1', '10', '/img/role/buerma.jpg', '1000');
INSERT INTO `Card` VALUES ('5', '1', '1', '孙悟空', '1', '2', '106', '/img/role/sunwukong.jpg', '1000');
INSERT INTO `Card` VALUES ('6', '5', '6', '贝吉塔', '1', '1', '0', '/img/role/beijita.jpg', '1000');
INSERT INTO `Card` VALUES ('7', '5', '9', '小林', '1', '1', '0', '/img/role/xiaolin.jpg', '1000');
INSERT INTO `Card` VALUES ('8', '5', '3', '丹迪', '1', '1', '6', '/img/role/dandi.jpg', '1000');
INSERT INTO `Card` VALUES ('9', '5', '1', '孙悟空', '1', '1', '0', '/img/role/sunwukong.jpg', '1000');
INSERT INTO `Card` VALUES ('10', '5', '7', '拉蒂兹', '1', '1', '3', '/img/role/ladizi.jpg', '1000');
INSERT INTO `Card` VALUES ('11', '5', '5', '沙鲁', '1', '1', '3', '/img/role/shalu.jpg', '1000');
INSERT INTO `Card` VALUES ('12', '5', '8', '天津饭', '1', '1', '0', '/img/role/tianjinfan.jpg', '1000');
INSERT INTO `Card` VALUES ('13', '1', '10', '布尔玛', '1', '2', '20', '/img/role/buerma.jpg', '1000');
INSERT INTO `Card` VALUES ('14', '1', '6', '贝吉塔', '1', '2', '0', '/img/role/beijita.jpg', '1000');
INSERT INTO `Card` VALUES ('15', '1', '2', '弗利萨', '1', '2', '60', '/img/role/fulisa.jpg', '1000');
INSERT INTO `Card` VALUES ('16', '1', '7', '拉蒂兹', '1', '2', '20', '/img/role/ladizi.jpg', '1000');
INSERT INTO `Card` VALUES ('17', '1', '4', '孙悟饭', '1', '2', '120', '/img/role/sunwufan.jpg', '1000');
INSERT INTO `Card` VALUES ('18', '1', '9', '小林', '1', '2', '40', '/img/role/xiaolin.jpg', '1000');
INSERT INTO `Card` VALUES ('19', '1', '8', '天津饭', '1', '2', '20', '/img/role/tianjinfan.jpg', '1000');
INSERT INTO `Card` VALUES ('20', '1', '5', '沙鲁', '1', '2', '80', '/img/role/shalu.jpg', '1000');
INSERT INTO `Card` VALUES ('21', '1', '3', '丹迪', '1', '2', '0', '/img/role/dandi.jpg', '1000');

-- ----------------------------
-- Table structure for CharacterStars
-- ----------------------------
DROP TABLE IF EXISTS `CharacterStars`;
CREATE TABLE `CharacterStars` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL COMMENT '姓名',
  `SkillId` varchar(255) default NULL COMMENT '技能id',
  `DestinyId` varchar(255) default NULL COMMENT '缘分id',
  `attack` int(11) default NULL COMMENT '攻击',
  `defence` int(11) default NULL COMMENT '防御',
  `assist` int(11) default NULL COMMENT '辅助',
  `role` varchar(255) default NULL COMMENT '角色',
  `desc` varchar(255) default NULL COMMENT '描述',
  `pic` varchar(255) default NULL COMMENT '头像',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of CharacterStars
-- ----------------------------
INSERT INTO `CharacterStars` VALUES ('1', '孙悟空', null, null, null, null, null, null, '物理输出', '/img/role/sunwukong.jpg');
INSERT INTO `CharacterStars` VALUES ('2', '弗利萨', null, null, null, null, null, null, '物理输出', '/img/role/fulisa.jpg');
INSERT INTO `CharacterStars` VALUES ('3', '丹迪 ', null, null, null, null, null, null, '物理输出', '/img/role/dandi.jpg');
INSERT INTO `CharacterStars` VALUES ('4', '孙悟饭', null, null, null, null, null, null, '物理输出', '/img/role/sunwufan.jpg');
INSERT INTO `CharacterStars` VALUES ('5', '沙鲁', null, null, null, null, null, null, '物理输出', '/img/role/shalu.jpg');
INSERT INTO `CharacterStars` VALUES ('6', '贝吉塔', null, null, null, null, null, null, '物理输出', '/img/role/beijita.jpg');
INSERT INTO `CharacterStars` VALUES ('7', '拉蒂兹', null, null, null, null, null, null, '物理输出', '/img/role/ladizi.jpg');
INSERT INTO `CharacterStars` VALUES ('8', '天津饭', null, null, null, null, null, null, '物理输出', '/img/role/tianjinfan.jpg');
INSERT INTO `CharacterStars` VALUES ('9', '小林', null, null, null, null, null, null, '物理输出', '/img/role/xiaolin.jpg');
INSERT INTO `CharacterStars` VALUES ('10', '布尔玛', null, null, null, null, null, null, '物理输出', '/img/role/buerma.jpg');

-- ----------------------------
-- Table structure for Destiny
-- ----------------------------
DROP TABLE IF EXISTS `Destiny`;
CREATE TABLE `Destiny` (
  `id` int(11) NOT NULL,
  `desc` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Destiny
-- ----------------------------

-- ----------------------------
-- Table structure for Activity
-- ----------------------------
DROP TABLE IF EXISTS `Activity`;
CREATE TABLE `Activity` (
  `id` int(11) NOT NULL auto_increment,
  `Card` int(11) default NULL,
  `type` int(11) default NULL COMMENT '1领取龙石 2',
  `status` int(11) default '0' COMMENT '0未参加',
  `UserStatus` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Activity
-- ----------------------------
INSERT INTO `Activity` VALUES ('1', '1', '1', '1', '0,0,0,0', '领取龙石');
INSERT INTO `Activity` VALUES ('2', '1', '2', '0', '0,0,0,0', '翻牌');
INSERT INTO `Activity` VALUES ('3', '2', '1', '1', '0,0,0,0', '领取龙石');
INSERT INTO `Activity` VALUES ('4', '2', '2', '0', '0,0,0,0', '翻牌');
INSERT INTO `Activity` VALUES ('5', '3', '1', '1', '0,0,0,0', '领取龙石');
INSERT INTO `Activity` VALUES ('6', '3', '2', '0', '0,0,0,0', '翻牌');
INSERT INTO `Activity` VALUES ('7', '4', '1', '1', '0,0,0,0', '领取龙石');
INSERT INTO `Activity` VALUES ('8', '4', '2', '0', '0,0,0,0', '翻牌');
INSERT INTO `Activity` VALUES ('9', '5', '1', '1', '0,0,0,0', '领取龙石');
INSERT INTO `Activity` VALUES ('10', '5', '2', '0', '0,0,0,0', '翻牌');

-- ----------------------------
-- Table structure for Lottery
-- ----------------------------
DROP TABLE IF EXISTS `Lottery`;
CREATE TABLE `Lottery` (
  `id` int(11) NOT NULL,
  `characterName` varchar(255) default NULL,
  `rate` double default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Lottery
-- ----------------------------
INSERT INTO `Lottery` VALUES ('1', '孙悟空', '10');
INSERT INTO `Lottery` VALUES ('2', '弗利萨', '10');
INSERT INTO `Lottery` VALUES ('3', '丹迪', '10');
INSERT INTO `Lottery` VALUES ('4', '孙悟饭', '10');
INSERT INTO `Lottery` VALUES ('5', '沙鲁', '10');
INSERT INTO `Lottery` VALUES ('6', '贝吉塔', '10');
INSERT INTO `Lottery` VALUES ('7', '拉蒂兹', '10');
INSERT INTO `Lottery` VALUES ('8', '天津饭', '10');
INSERT INTO `Lottery` VALUES ('9', '小林', '10');
INSERT INTO `Lottery` VALUES ('10', '布尔玛', '10');

-- ----------------------------
-- Table structure for LotteryResult
-- ----------------------------
DROP TABLE IF EXISTS `LotteryResult`;
CREATE TABLE `LotteryResult` (
  `id` int(11) NOT NULL auto_increment,
  `UserName` varchar(255) default NULL,
  `characterName` varchar(255) default NULL,
  `createTime` datetime default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of LotteryResult
-- ----------------------------
INSERT INTO `LotteryResult` VALUES ('1', 'aaron', '沙鲁', '2016-05-18 22:04:53');
INSERT INTO `LotteryResult` VALUES ('2', '尸兄', '小林', '2016-05-18 22:43:00');
INSERT INTO `LotteryResult` VALUES ('3', '尸兄', '丹迪', '2016-05-18 22:43:35');
INSERT INTO `LotteryResult` VALUES ('4', '尸兄', '孙悟空', '2016-05-18 22:43:44');
INSERT INTO `LotteryResult` VALUES ('5', '尸兄', '拉蒂兹', '2016-05-18 22:43:54');
INSERT INTO `LotteryResult` VALUES ('6', '尸兄', '丹迪', '2016-05-18 22:44:04');
INSERT INTO `LotteryResult` VALUES ('7', '尸兄', '沙鲁', '2016-05-18 22:44:13');
INSERT INTO `LotteryResult` VALUES ('8', '尸兄', '拉蒂兹', '2016-05-18 22:44:22');
INSERT INTO `LotteryResult` VALUES ('9', '尸兄', '丹迪', '2016-05-18 22:44:30');
INSERT INTO `LotteryResult` VALUES ('10', '尸兄', '沙鲁', '2016-05-18 22:44:39');
INSERT INTO `LotteryResult` VALUES ('11', '尸兄', '天津饭', '2016-05-18 22:44:48');
INSERT INTO `LotteryResult` VALUES ('12', '我不是托', '布尔玛', '2016-05-20 16:44:57');
INSERT INTO `LotteryResult` VALUES ('13', '我不是托', '孙悟空', '2016-05-20 16:52:11');
INSERT INTO `LotteryResult` VALUES ('14', '我不是托', '弗利萨', '2016-05-20 16:57:12');
INSERT INTO `LotteryResult` VALUES ('15', '我不是托', '拉蒂兹', '2016-05-20 17:00:55');
INSERT INTO `LotteryResult` VALUES ('16', '我不是托', '孙悟饭', '2016-05-20 17:01:06');
INSERT INTO `LotteryResult` VALUES ('17', '我不是托', '小林', '2016-05-20 17:05:32');
INSERT INTO `LotteryResult` VALUES ('18', '我不是托', '小林', '2016-05-20 17:05:52');
INSERT INTO `LotteryResult` VALUES ('19', '我不是托', '贝吉塔', '2016-05-20 17:10:54');
INSERT INTO `LotteryResult` VALUES ('20', '我不是托', '贝吉塔', '2016-05-20 17:12:05');
INSERT INTO `LotteryResult` VALUES ('21', '我不是托', '拉蒂兹', '2016-05-20 17:13:25');
INSERT INTO `LotteryResult` VALUES ('22', '我不是托', '弗利萨', '2016-05-20 17:14:23');
INSERT INTO `LotteryResult` VALUES ('23', '我不是托', '天津饭', '2016-05-20 17:15:28');
INSERT INTO `LotteryResult` VALUES ('24', '我不是托', '天津饭', '2016-05-20 17:15:47');
INSERT INTO `LotteryResult` VALUES ('25', '我不是托', '沙鲁', '2016-05-20 17:18:41');
INSERT INTO `LotteryResult` VALUES ('26', '我不是托', '孙悟饭', '2016-05-20 17:22:36');
INSERT INTO `LotteryResult` VALUES ('27', '我不是托', '孙悟饭', '2016-05-20 17:22:47');
INSERT INTO `LotteryResult` VALUES ('28', '我不是托', '孙悟饭', '2016-05-20 17:22:55');
INSERT INTO `LotteryResult` VALUES ('29', '我不是托', '孙悟饭', '2016-05-20 17:22:56');
INSERT INTO `LotteryResult` VALUES ('30', '我不是托', '孙悟饭', '2016-05-20 17:23:13');
INSERT INTO `LotteryResult` VALUES ('31', '我不是托', '孙悟饭', '2016-05-20 17:23:26');
INSERT INTO `LotteryResult` VALUES ('32', '我不是托', '孙悟空', '2016-05-20 17:24:23');
INSERT INTO `LotteryResult` VALUES ('33', '我不是托', '孙悟空', '2016-05-20 17:24:31');
INSERT INTO `LotteryResult` VALUES ('34', '我不是托', '孙悟空', '2016-05-20 17:24:40');
INSERT INTO `LotteryResult` VALUES ('35', '我不是托', '孙悟空', '2016-05-20 17:30:09');
INSERT INTO `LotteryResult` VALUES ('36', '我不是托', '丹迪', '2016-05-20 17:32:34');
INSERT INTO `LotteryResult` VALUES ('37', '我不是托', '孙悟饭', '2016-05-20 17:32:44');
INSERT INTO `LotteryResult` VALUES ('38', '我不是托', '孙悟饭', '2016-05-20 17:32:52');
INSERT INTO `LotteryResult` VALUES ('39', '我不是托', '沙鲁', '2016-05-20 17:33:01');
INSERT INTO `LotteryResult` VALUES ('40', '我不是托', '拉蒂兹', '2016-05-20 17:33:10');
INSERT INTO `LotteryResult` VALUES ('41', '我不是托', '布尔玛', '2016-05-20 17:33:18');
INSERT INTO `LotteryResult` VALUES ('42', '我不是托', '天津饭', '2016-05-20 17:33:27');
INSERT INTO `LotteryResult` VALUES ('43', '我不是托', '布尔玛', '2016-05-20 17:33:36');
INSERT INTO `LotteryResult` VALUES ('44', '我不是托', '丹迪', '2016-05-20 17:33:45');
INSERT INTO `LotteryResult` VALUES ('45', '我不是托', '小林', '2016-05-20 17:33:54');
INSERT INTO `LotteryResult` VALUES ('46', '我不是托', '拉蒂兹', '2016-05-22 10:50:24');
INSERT INTO `LotteryResult` VALUES ('47', '我不是托', '天津饭', '2016-05-22 10:50:31');
INSERT INTO `LotteryResult` VALUES ('48', '我不是托', '孙悟空', '2016-05-22 10:52:36');
INSERT INTO `LotteryResult` VALUES ('49', '我不是托', '弗利萨', '2016-05-22 11:15:08');
INSERT INTO `LotteryResult` VALUES ('50', '我不是托', '孙悟空', '2016-05-22 11:25:15');
INSERT INTO `LotteryResult` VALUES ('51', '我不是托', '弗利萨', '2016-05-22 11:25:27');
INSERT INTO `LotteryResult` VALUES ('52', '我不是托', '弗利萨', '2016-05-22 11:25:36');
INSERT INTO `LotteryResult` VALUES ('53', '我不是托', '弗利萨', '2016-05-22 11:26:33');
INSERT INTO `LotteryResult` VALUES ('54', '我不是托', '孙悟空', '2016-05-22 11:26:45');
INSERT INTO `LotteryResult` VALUES ('55', '我不是托', '丹迪', '2016-05-22 15:57:59');
INSERT INTO `LotteryResult` VALUES ('56', '我不是托', '小林', '2016-05-22 15:58:10');
INSERT INTO `LotteryResult` VALUES ('57', '我不是托', '孙悟空', '2016-05-22 15:58:18');
INSERT INTO `LotteryResult` VALUES ('58', '我不是托', '小林', '2016-05-22 15:58:27');

-- ----------------------------
-- Table structure for onlineUser
-- ----------------------------
DROP TABLE IF EXISTS `onlineUser`;
CREATE TABLE `onlineUser` (
  `id` int(11) NOT NULL auto_increment,
  `Card` int(11) default NULL,
  `lastLoginTime` datetime default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of onlineUser
-- ----------------------------
INSERT INTO `onlineUser` VALUES ('1', '1', '2016-05-20 17:36:03');
INSERT INTO `onlineUser` VALUES ('2', '1', '2016-05-21 15:43:53');
INSERT INTO `onlineUser` VALUES ('3', '2', '2016-05-20 18:11:44');
INSERT INTO `onlineUser` VALUES ('4', '1', '2016-05-22 16:35:14');

-- ----------------------------
-- Table structure for Question
-- ----------------------------
DROP TABLE IF EXISTS `Question`;
CREATE TABLE `Question` (
  `id` int(11) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Question
-- ----------------------------

-- ----------------------------
-- Table structure for Skill
-- ----------------------------
DROP TABLE IF EXISTS `Skill`;
CREATE TABLE `Skill` (
  `id` int(11) NOT NULL,
  `name` varchar(255) default NULL,
  `desc` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Skill
-- ----------------------------

-- ----------------------------
-- Table structure for User
-- ----------------------------
DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
  `id` int(11) NOT NULL auto_increment,
  `User_name` varchar(255) default NULL COMMENT '用户名',
  `nick_name` varchar(255) default NULL COMMENT '昵称',
  `vip` int(11) default NULL,
  `level` int(11) default '1' COMMENT '等级',
  `money` int(11) default NULL COMMENT '金币',
  `rmb` int(11) default NULL COMMENT '龙石',
  `score` int(11) default '0' COMMENT '战力',
  `User_img` varchar(255) default NULL COMMENT '头像',
  `regist_time` datetime default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of User
-- ----------------------------
INSERT INTO `User` VALUES ('1', 'admin', '我不是托', '1', '1', '0', '12560', '0', '/img/role/buerma.jpg', '2016-05-18 21:55:40');
INSERT INTO `User` VALUES ('2', 'moveal', '堂堂夹心饼', '0', '1', '0', '3366', '0', '/img/role/beijita.jpg', '2016-05-18 22:01:01');
INSERT INTO `User` VALUES ('3', 'aaron', 'aaron', '0', '1', '0', '0', '0', '/img/role/defaultImg1.jpg', '2016-05-18 22:04:36');
INSERT INTO `User` VALUES ('4', '123456789', '啦啦啦', '0', '1', '0', '2000', '0', '/img/role/defaultImg1.jpg', '2016-05-18 22:20:26');
INSERT INTO `User` VALUES ('5', '1234567', '尸兄', '0', '1', '0', '114', '0', '/img/role/sunwukong.jpg', '2016-05-18 22:21:00');

-- ----------------------------
-- Table structure for UserRmbRecord
-- ----------------------------
DROP TABLE IF EXISTS `UserRmbRecord`;
CREATE TABLE `UserRmbRecord` (
  `id` int(11) NOT NULL auto_increment,
  `Card` int(11) default NULL,
  `characterPic` varchar(255) default NULL,
  `picIndex` int(11) default NULL,
  `ActivityType` int(11) default NULL COMMENT '1.领取 2.翻牌 6.注册 7.登录',
  `getRmb` varchar(255) default NULL,
  `createTime` datetime default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of UserRmbRecord
-- ----------------------------
INSERT INTO `UserRmbRecord` VALUES ('1', '1', null, '0', '6', '+2000', '2016-05-18 21:55:40');
INSERT INTO `UserRmbRecord` VALUES ('2', '2', null, '0', '6', '+2000', '2016-05-18 22:01:01');
INSERT INTO `UserRmbRecord` VALUES ('3', '3', null, '0', '6', '+2000', '2016-05-18 22:04:36');
INSERT INTO `UserRmbRecord` VALUES ('4', '2', null, '0', '0', '+10', '2016-05-18 22:12:40');
INSERT INTO `UserRmbRecord` VALUES ('5', '2', null, '0', '0', '+58', '2016-05-18 22:12:46');
INSERT INTO `UserRmbRecord` VALUES ('6', '2', null, '0', '0', '+132', '2016-05-18 22:12:52');
INSERT INTO `UserRmbRecord` VALUES ('7', '2', null, '0', '0', '+195', '2016-05-18 22:12:58');
INSERT INTO `UserRmbRecord` VALUES ('8', '2', '/img/role/sunwukong.jpg', '0', '2', '-0', '2016-05-18 22:13:06');
INSERT INTO `UserRmbRecord` VALUES ('9', '2', '/img/role/beijita.jpg', '1', '2', '-50', '2016-05-18 22:15:14');
INSERT INTO `UserRmbRecord` VALUES ('10', '2', '/img/role/buerma.jpg', '2', '2', '-100', '2016-05-18 22:15:16');
INSERT INTO `UserRmbRecord` VALUES ('11', '4', null, '0', '6', '+2000', '2016-05-18 22:20:26');
INSERT INTO `UserRmbRecord` VALUES ('12', '5', null, '0', '6', '+2000', '2016-05-18 22:21:00');
INSERT INTO `UserRmbRecord` VALUES ('13', '1', '/img/role/sunwukong.jpg', '1', '2', '-0', '2016-05-18 22:41:20');
INSERT INTO `UserRmbRecord` VALUES ('14', '5', null, '0', '0', '+143', '2016-05-18 22:42:33');
INSERT INTO `UserRmbRecord` VALUES ('15', '5', null, '0', '0', '+83', '2016-05-18 22:42:34');
INSERT INTO `UserRmbRecord` VALUES ('16', '5', null, '0', '0', '+28', '2016-05-18 22:42:35');
INSERT INTO `UserRmbRecord` VALUES ('17', '5', null, '0', '0', '+60', '2016-05-18 22:42:37');
INSERT INTO `UserRmbRecord` VALUES ('18', '5', '/img/role/beijita.jpg', '1', '2', '-0', '2016-05-18 22:42:45');
INSERT INTO `UserRmbRecord` VALUES ('19', '1', null, '0', '0', '+125', '2016-05-18 23:47:06');
INSERT INTO `UserRmbRecord` VALUES ('20', '1', null, '0', '0', '+200', '2016-05-18 23:47:06');
INSERT INTO `UserRmbRecord` VALUES ('21', '1', null, '0', '0', '+35', '2016-05-18 23:47:07');
INSERT INTO `UserRmbRecord` VALUES ('22', '1', null, '0', '0', '+145', '2016-05-18 23:47:07');
INSERT INTO `UserRmbRecord` VALUES ('23', '1', '/img/role/buerma.jpg', '2', '2', '-50', '2016-05-18 23:47:14');
INSERT INTO `UserRmbRecord` VALUES ('24', '2', '/img/role/sunwukong.jpg', '3', '2', '-150', '2016-05-18 23:48:55');
INSERT INTO `UserRmbRecord` VALUES ('25', '2', null, '0', '0', '+130', '2016-05-19 17:59:14');
INSERT INTO `UserRmbRecord` VALUES ('26', '2', null, '0', '0', '+49', '2016-05-19 17:59:20');
INSERT INTO `UserRmbRecord` VALUES ('27', '2', '/img/role/buerma.jpg', '0', '2', '-0', '2016-05-19 17:59:28');
INSERT INTO `UserRmbRecord` VALUES ('28', '2', null, '0', '0', '+92', '2016-05-20 07:59:56');
INSERT INTO `UserRmbRecord` VALUES ('29', '1', '/img/role/beijita.jpg', '0', '2', '-0', '2016-05-20 09:27:34');
INSERT INTO `UserRmbRecord` VALUES ('30', '1', null, '0', '7', '+1000', '2016-05-20 15:43:01');
INSERT INTO `UserRmbRecord` VALUES ('31', '1', null, '0', '7', '+1000', '2016-05-21 15:43:53');
INSERT INTO `UserRmbRecord` VALUES ('32', '2', null, '0', '7', '+1000', '2016-05-20 18:03:00');
INSERT INTO `UserRmbRecord` VALUES ('33', '1', null, '0', '7', '+1000', '2016-05-22 10:50:17');
