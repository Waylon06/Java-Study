/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50636
 Source Host           : localhost:3306
 Source Schema         : dms

 Target Server Type    : MySQL
 Target Server Version : 50636
 File Encoding         : 65001

 Date: 12/12/2021 00:40:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `aid` int(255) NOT NULL AUTO_INCREMENT,
  `aname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `apassword` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `power` int(255) NOT NULL,
  `classes` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`aid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, '辅导员', '123456', 1, '计科2005');
INSERT INTO `admin` VALUES (2, '宿舍管理员', '123456', 2, NULL);
INSERT INTO `admin` VALUES (3, '监管者', '123456', 3, NULL);

-- ----------------------------
-- Table structure for building
-- ----------------------------
DROP TABLE IF EXISTS `building`;
CREATE TABLE `building`  (
  `building` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `floor` int(255) NOT NULL,
  `house` int(255) NOT NULL,
  `bed` int(255) UNSIGNED NOT NULL,
  `sid` int(255) NOT NULL,
  `live` int(1) UNSIGNED ZEROFILL NOT NULL,
  INDEX `sid`(`sid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of building
-- ----------------------------
INSERT INTO `building` VALUES ('博慧1', 1, 101, 1, 1, 0);
INSERT INTO `building` VALUES ('博慧1', 4, 404, 3, 3, 0);
INSERT INTO `building` VALUES ('博慧2', 4, 401, 1, 4, 0);
INSERT INTO `building` VALUES ('博慧1', 2, 208, 2, 2, 0);
INSERT INTO `building` VALUES ('博慧1', 4, 401, 4, 5, 0);
INSERT INTO `building` VALUES ('博慧1', 4, 401, 3, 6, 0);
INSERT INTO `building` VALUES ('博慧1', 4, 401, 1, 7, 0);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `sid` int(255) NOT NULL,
  `sname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `classes` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `spower` int(1) UNSIGNED ZEROFILL NOT NULL,
  `spassword` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `back` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '靓仔', '计科2005', 0, NULL, 1);
INSERT INTO `student` VALUES (2, '王炼', '计科2005', 0, NULL, 1);
INSERT INTO `student` VALUES (3, '唐靓仔', '计科2005', 0, NULL, 0);
INSERT INTO `student` VALUES (4, '深夜', '计科2004', 0, NULL, 0);
INSERT INTO `student` VALUES (5, '孙一民', '计科2005', 0, NULL, 1);
INSERT INTO `student` VALUES (6, '雷宇', '计科2005', 0, NULL, 0);
INSERT INTO `student` VALUES (7, '黎晨曦', '计科2005', 0, NULL, 1);

SET FOREIGN_KEY_CHECKS = 1;
