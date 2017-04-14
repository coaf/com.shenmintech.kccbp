/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 100116
Source Host           : 127.0.0.1:3306
Source Database       : test_v1

Target Server Type    : MYSQL
Target Server Version : 100116
File Encoding         : 65001

Date: 2017-01-12 15:42:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_kc_clazzwork
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_clazzwork`;
CREATE TABLE `t_kc_clazzwork` (
  `id` varchar(64) NOT NULL COMMENT '任务名称',
  `work_name` varchar(255) DEFAULT NULL,
  `work_type_fid` varchar(64) DEFAULT NULL COMMENT '作业类型 t_kc_work_type的fid',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_kc_clazzwork
-- ----------------------------

-- ----------------------------
-- Table structure for t_kc_company
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_company`;
CREATE TABLE `t_kc_company` (
  `id` varchar(64) NOT NULL COMMENT '主键生成策略id',
  `company_name` varchar(255) NOT NULL COMMENT '公司名称',
  `estimated_students_num` int(11) DEFAULT NULL COMMENT '预计学员数量',
  `create_by_uid` varchar(255) DEFAULT NULL COMMENT '公司信息录入者的user_id',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '公司创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '公司更新时间',
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark_1` varchar(255) DEFAULT NULL COMMENT '备注1',
  `remark_2` varchar(255) DEFAULT NULL,
  `remark_3` varchar(255) DEFAULT NULL,
  `remark_4` varchar(255) DEFAULT NULL,
  `remark_5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `companyGenerateId` (`id`) USING BTREE,
  UNIQUE KEY `companyName` (`company_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖公司表，游离于课程之外的表，目前由导师创建，任意导师可复用其他导师创建的公司。';

-- ----------------------------
-- Records of t_kc_company
-- ----------------------------
INSERT INTO `t_kc_company` VALUES ('测试', '1111', '8888', null, '2017-01-11 18:28:51', null, '0', null, null, null, null, null);

-- ----------------------------
-- Table structure for t_kc_course
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_course`;
CREATE TABLE `t_kc_course` (
  `id` varchar(64) NOT NULL,
  `company_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_company 的fid，不强制关联公司',
  `teacher_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_teacher表的fid',
  `course_type_fid` varchar(255) DEFAULT NULL COMMENT 't_kc_course_type表fid 课程类型，如：减肥，塑身，高血压，血糖',
  `course_name` varchar(255) DEFAULT NULL COMMENT '课程名',
  `create_by_uid` varchar(255) DEFAULT NULL COMMENT '课程信息录入者的user_id',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '课程创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '课程更新时间',
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark_1` varchar(255) DEFAULT NULL COMMENT '备注1',
  `remark_2` varchar(255) DEFAULT NULL,
  `remark_3` varchar(255) DEFAULT NULL,
  `remark_4` varchar(255) DEFAULT NULL,
  `remark_5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖抽象课程表，未具体制定时间，只是一个课程，公司（可不关联），导师，学员的管理表。';

-- ----------------------------
-- Records of t_kc_course
-- ----------------------------

-- ----------------------------
-- Table structure for t_kc_course_table
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_course_table`;
CREATE TABLE `t_kc_course_table` (
  `id` varchar(64) NOT NULL,
  `clazz_name` varchar(255) DEFAULT NULL COMMENT '课程名称',
  `course_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_course表的fid',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark_1` varchar(255) DEFAULT NULL COMMENT '备注1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖课程表，导师制定课程的节数。此表为导师正式的上课时间，上课实例表';

-- ----------------------------
-- Records of t_kc_course_table
-- ----------------------------

-- ----------------------------
-- Table structure for t_kc_course_type
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_course_type`;
CREATE TABLE `t_kc_course_type` (
  `id` varchar(64) NOT NULL,
  `type_name` varchar(255) DEFAULT NULL COMMENT '课程类型描述',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark_1` varchar(255) DEFAULT NULL COMMENT '备注1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖课程类型表，导师选定当前系列授课内容的类别。--初始化业务属性表';

-- ----------------------------
-- Records of t_kc_course_type
-- ----------------------------

-- ----------------------------
-- Table structure for t_kc_employee
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_employee`;
CREATE TABLE `t_kc_employee` (
  `id` varchar(64) NOT NULL,
  `user_id` varchar(255) NOT NULL COMMENT '用户表ID',
  `company_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_company表fid,学生所属公司+',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(255) DEFAULT NULL COMMENT '备注2',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uid_compgid` (`user_id`,`company_fid`) USING BTREE COMMENT '用户id+公司id形成的名单记录唯一'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖公司员工表，通过扫描二维码或导师手工录入报名记录，一对一关联用户表，多对一关联公司表';

-- ----------------------------
-- Records of t_kc_employee
-- ----------------------------

-- ----------------------------
-- Table structure for t_kc_group
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_group`;
CREATE TABLE `t_kc_group` (
  `id` varchar(64) NOT NULL,
  `course_fid` varchar(64) DEFAULT NULL COMMENT '课程id，当前组所属某个课程',
  `group_name` varchar(255) DEFAULT NULL COMMENT '组名',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖分组表，导师的授课小组实例（导师以组为单位进行授课）。';

-- ----------------------------
-- Records of t_kc_group
-- ----------------------------

-- ----------------------------
-- Table structure for t_kc_homework
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_homework`;
CREATE TABLE `t_kc_homework` (
  `id` varchar(64) NOT NULL COMMENT '任务名称',
  `teacher_fid` varchar(64) DEFAULT NULL COMMENT '导师的主键',
  `work_name` varchar(255) DEFAULT NULL COMMENT '作业名',
  `work_type_fid` varchar(64) DEFAULT NULL COMMENT '作业类型 t_kc_work_type的fid',
  `work_describe` varchar(500) DEFAULT NULL COMMENT '作业描述',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_kc_homework
-- ----------------------------

-- ----------------------------
-- Table structure for t_kc_homework_type
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_homework_type`;
CREATE TABLE `t_kc_homework_type` (
  `id` varchar(64) NOT NULL,
  `type_name` varchar(255) DEFAULT NULL COMMENT '类型描述',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_kc_homework_type
-- ----------------------------

-- ----------------------------
-- Table structure for t_kc_student
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_student`;
CREATE TABLE `t_kc_student` (
  `id` varchar(64) NOT NULL,
  `employee_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_employee表的fid',
  `group_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_group的fid',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(255) DEFAULT NULL COMMENT '备注2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工被导师拉入小组，成为学生';

-- ----------------------------
-- Records of t_kc_student
-- ----------------------------

-- ----------------------------
-- Table structure for t_kc_students
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_students`;
CREATE TABLE `t_kc_students` (
  `id` varchar(64) NOT NULL,
  `employee_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_employee表的fid',
  `group_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_group的fid',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(255) DEFAULT NULL COMMENT '备注2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工被导师拉入小组，成为学生';

-- ----------------------------
-- Records of t_kc_students
-- ----------------------------

-- ----------------------------
-- Table structure for t_kc_teacher
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_teacher`;
CREATE TABLE `t_kc_teacher` (
  `id` varchar(64) NOT NULL COMMENT '主键生成策略生成的教师唯一id',
  `user_id` varchar(64) DEFAULT NULL COMMENT '用户表ID',
  `nick_name` varchar(128) DEFAULT NULL COMMENT '教师的昵称',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间（不更新）',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark_1` varchar(255) DEFAULT NULL COMMENT '备注1',
  `remark_2` varchar(255) DEFAULT NULL,
  `remark_3` varchar(255) DEFAULT NULL,
  `remark_4` varchar(255) DEFAULT NULL,
  `remark_5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖教师表，user表的下级业务用户表。';

-- ----------------------------
-- Records of t_kc_teacher
-- ----------------------------

-- ----------------------------
-- Table structure for t_kc_teachers
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_teachers`;
CREATE TABLE `t_kc_teachers` (
  `id` varchar(64) NOT NULL COMMENT '主键生成策略生成的教师唯一id',
  `user_id` varchar(64) DEFAULT NULL COMMENT '用户表ID',
  `nick_name` varchar(128) DEFAULT NULL COMMENT '教师的昵称',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间（不更新）',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark_1` varchar(255) DEFAULT NULL COMMENT '备注1',
  `remark_2` varchar(255) DEFAULT NULL,
  `remark_3` varchar(255) DEFAULT NULL,
  `remark_4` varchar(255) DEFAULT NULL,
  `remark_5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖教师表，user表的下级业务用户表。';

-- ----------------------------
-- Records of t_kc_teachers
-- ----------------------------

-- ----------------------------
-- Table structure for t_kc_teach_clazz
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_teach_clazz`;
CREATE TABLE `t_kc_teach_clazz` (
  `id` varchar(64) NOT NULL,
  `group_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_group表fid',
  `course_table_fid` varchar(64) DEFAULT NULL,
  `pre_start_time` timestamp NULL DEFAULT NULL COMMENT '预计课程开始时间',
  `pre_end_time` timestamp NULL DEFAULT NULL COMMENT '预计课程结束时间',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖导师授课时间表';

-- ----------------------------
-- Records of t_kc_teach_clazz
-- ----------------------------

-- ----------------------------
-- Table structure for t_kc_teach_time
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_teach_time`;
CREATE TABLE `t_kc_teach_time` (
  `id` varchar(64) NOT NULL,
  `group_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_group表fid',
  `pre_start_time` timestamp NULL DEFAULT NULL COMMENT '预计课程开始时间',
  `pre_end_time` timestamp NULL DEFAULT NULL COMMENT '预计课程结束时间',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖导师授课时间表';

-- ----------------------------
-- Records of t_kc_teach_time
-- ----------------------------

-- ----------------------------
-- Table structure for t_kc_work_type
-- ----------------------------
DROP TABLE IF EXISTS `t_kc_work_type`;
CREATE TABLE `t_kc_work_type` (
  `id` varchar(64) NOT NULL,
  `type_describe` varchar(255) DEFAULT NULL COMMENT '类型描述',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_kc_work_type
-- ----------------------------
