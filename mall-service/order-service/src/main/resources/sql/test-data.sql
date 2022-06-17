/*
 Navicat Premium Data Transfer

 Source Server         : 自己的
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : test-data

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 12/07/2021 16:49:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id',
  `user_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `age` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '年龄',
  `sex` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '性别',
  `remarks` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `index_name_age`(`user_name`, `age`) USING BTREE,
  FULLTEXT INDEX `index_remarks_name`(`remarks`, `user_name`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '14', '男', '嚄嚄嚄嚄嚄噢哇哇哇哇哇哇哇哇哇哇哇哇哇哦扫到都怕都怕都跑到店铺破爬爬山都卡都卡帕克打破扩大破开的破案闹i山东i阿娇代价的怕见到跑啥的炮击的');
INSERT INTO `user` VALUES ('2', '李四', '14', '女', '嚄嚄嚄嚄嚄噢哇哇哇哇哇哇哇哇哇哇哇哇哇哦扫到都怕都怕都跑到店铺破爬爬山都卡都卡帕克打破扩大破开的破案闹i山东i阿娇代价的怕见到跑啥的炮击的阿斯顿撒打算');
INSERT INTO `user` VALUES ('3', '王麻子', '19', '男', '啊阿萨大大大大苏打，奥看到考的卡泼点卡泼点卡泼上看到跑得快');
INSERT INTO `user` VALUES ('4', '王五', '18', '男', NULL);
INSERT INTO `user` VALUES ('5', '张无忌', '15', '女', NULL);
INSERT INTO `user` VALUES ('6', '李四', '14', '男', NULL);
INSERT INTO `user` VALUES ('7', '张三', '15', '女', NULL);

SET FOREIGN_KEY_CHECKS = 1;
