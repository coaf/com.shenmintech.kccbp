CREATE TABLE IF not EXISTS `t_kc_company`(
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
  UNIQUE KEY `companyGenerateId` (`id`) USING BTREE COMMENT '主键索引',
  UNIQUE KEY `companyName` (`company_name`) USING BTREE COMMENT '公司名唯一索引'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖公司表，游离于课程之外的表，目前由导师创建，任意导师可复用其他导师创建的公司。';^

CREATE TABLE if not exists `t_kc_course` (
  `id` varchar(64) NOT NULL,
  `company_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_company 的fid，不强制关联公司',
  `teacher_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_teacher表的fid',
  `course_type_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_course_type表fid 课程类型，如：减肥，塑身，高血压，血糖',
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖抽象课程表，未具体制定时间，只是一个课程，公司（可不关联），导师，学员的管理表。';^

CREATE TABLE if not exists `t_kc_course_table` (
  `id` varchar(64) NOT NULL,
  `clazz_no` int(11) DEFAULT NULL COMMENT '第N节课,课号',
  `clazz_name` varchar(255) DEFAULT NULL COMMENT '课程名称',
  `pic_id` varchar(64) DEFAULT NULL,
  `course_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_course表的fid',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark_1` varchar(255) DEFAULT NULL COMMENT '备注1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖课程表，导师制定课程的节数。此表为导师正式的上课时间，上课实例表';^

CREATE TABLE if not exists `t_kc_course_table_group_relation` (
  `id` varchar(64) NOT NULL,
  `group_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_group表fid',
  `course_table_fid` varchar(64) DEFAULT NULL,
  `pre_start_time` timestamp NULL DEFAULT NULL COMMENT '预计课程开始时间',
  `pre_end_time` timestamp NULL DEFAULT NULL COMMENT '预计课程结束时间',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `ntes_room_id` varchar(255) DEFAULT NULL COMMENT '网易直播房间ID',
  `ntes_room_name` varchar(255) DEFAULT NULL COMMENT '网易直播房间名',
  `ntes_rtmp_pull_url` varchar(255) DEFAULT NULL COMMENT '网易直播推流地址',
  `ntes_http_pull_url` varchar(255) DEFAULT NULL COMMENT '网易直播拉流地址',
  `ntes_push_url` varchar(255) DEFAULT NULL COMMENT '推流地址',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖导师授课时间表';^

CREATE TABLE if not exists `t_kc_course_type` (
  `id` varchar(64) NOT NULL,
  `type_name` varchar(255) DEFAULT NULL COMMENT '课程类型描述',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark_1` varchar(255) DEFAULT NULL COMMENT '备注1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖课程类型表，导师选定当前系列授课内容的类别。--初始化业务属性表';^

CREATE TABLE if not exists `t_kc_employee` (
  `id` varchar(64) NOT NULL,
  `user_id` varchar(255) NOT NULL COMMENT '用户表ID',
  `company_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_company表fid,学生所属公司+',
  `real_name` varchar(128) DEFAULT NULL,
  `employee_no` varchar(64) DEFAULT NULL,
  `ntes_acc_id` varchar(64) DEFAULT NULL COMMENT '网易第三方入房间用户id',
  `ntes_token` varchar(64) DEFAULT NULL COMMENT '网易入房间token',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(255) DEFAULT NULL COMMENT '备注2',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uid_compgid` (`user_id`,`company_fid`) USING BTREE COMMENT '用户id+公司id形成的名单记录唯一'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖公司员工表，通过扫描二维码或导师手工录入报名记录，一对一关联用户表，多对一关联公司表';^

CREATE TABLE if not exists `t_kc_group` (
  `id` varchar(64) NOT NULL,
  `course_fid` varchar(64) DEFAULT NULL COMMENT '课程id，当前组所属某个课程',
  `group_name` varchar(255) DEFAULT NULL COMMENT '组名',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖分组表，导师的授课小组实例（导师以组为单位进行授课）。';^

CREATE TABLE if not exists `t_kc_homework` (
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;^

CREATE TABLE if not exists `t_kc_homework_card_selection` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `card_name` varchar(255) DEFAULT NULL,
  `pic_id` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;^

CREATE TABLE if not exists `t_kc_homework_pic_txt` (
  `id` varchar(64) NOT NULL,
  `homework_student_relation_fid` varchar(64) DEFAULT NULL COMMENT '作业流水主键',
  `content` varchar(512) DEFAULT NULL COMMENT '学生提交的作业文字',
  `pic_id` varchar(128) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '课程创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '课程更新时间',
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark_1` varchar(255) DEFAULT NULL COMMENT '备注1',
  `remark_2` varchar(255) DEFAULT NULL,
  `remark_3` varchar(255) DEFAULT NULL,
  `remark_4` varchar(255) DEFAULT NULL,
  `remark_5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;^

CREATE TABLE if not exists `t_kc_homework_sign_card` (
  `id` varchar(64) NOT NULL,
  `homework_student_relation_fid` varchar(64) DEFAULT NULL COMMENT '作业流水主键',
  `mark_date` varchar(64) DEFAULT NULL,
  `breakfast_flag` int(11) DEFAULT NULL,
  `lunch_flag` int(11) DEFAULT NULL,
  `supper_flag` int(11) DEFAULT NULL,
  `drink_water` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark_1` varchar(255) DEFAULT NULL COMMENT '备注1',
  `remark_2` varchar(255) DEFAULT NULL,
  `remark_3` varchar(255) DEFAULT NULL,
  `remark_4` varchar(255) DEFAULT NULL,
  `remark_5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;^

CREATE TABLE if not exists `t_kc_homework_student_relation` (
  `id` varchar(64) NOT NULL,
  `task_fid` varchar(64) DEFAULT NULL,
  `homework_fid` varchar(64) DEFAULT NULL,
  `student_fid` varchar(64) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '任务状态,0初始状态',
  `remark1` varchar(255) DEFAULT NULL,
  `remark2` varchar(255) DEFAULT NULL,
  `remark3` varchar(255) DEFAULT NULL,
  `remark4` varchar(255) DEFAULT NULL,
  `remark5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='作业实例表，关联了每个学生的作业记录';^

CREATE TABLE if not exists `t_kc_homework_task` (
  `id` varchar(64) NOT NULL,
  `teacher_id` varchar(64) DEFAULT NULL COMMENT '创建此次推送任务的教师ID',
  `homework_fid` varchar(64) DEFAULT NULL,
  `company_fid` varchar(64) DEFAULT NULL COMMENT '公司ID',
  `course_fid` varchar(64) DEFAULT NULL COMMENT '班级ID',
  `group_fids` varchar(512) DEFAULT NULL COMMENT '小组id，用“|”隔开，全部小组的话为ALL',
  `clazz_fid` varchar(64) DEFAULT NULL COMMENT '推送标识push_time_type_fid不为0 的时候不能为空',
  `push_time_type_fid` varchar(64) DEFAULT NULL COMMENT '0：即时推送，1：课前推送，2：课后推送',
  `status` int(11) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL,
  `remark1` varchar(255) DEFAULT NULL,
  `remark2` varchar(255) DEFAULT NULL,
  `remark3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='推送课后作业表';^

CREATE TABLE if not exists `t_kc_homework_type` (
  `id` varchar(64) NOT NULL,
  `type_name` varchar(255) DEFAULT NULL COMMENT '类型描述',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;^

CREATE TABLE if not exists `t_kc_homework_work_card` (
  `id` varchar(64) NOT NULL,
  `homework_student_relation_fid` varchar(64) DEFAULT NULL,
  `selections` varchar(512) DEFAULT NULL COMMENT '用户已选selection_id',
  `current_week_target` varchar(255) DEFAULT NULL COMMENT '当前周目标减重',
  `current_week_result` varchar(255) DEFAULT NULL COMMENT '上周实际减重',
  `week_no` int(11) DEFAULT NULL COMMENT '当前记录为课程的第几周',
  `status` int(11) DEFAULT NULL,
  `commit_time` timestamp NULL DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `remark1` varchar(255) DEFAULT NULL COMMENT '当前卡片任务针对的课程的开始时间',
  `remark2` varchar(255) DEFAULT NULL,
  `remark3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;^

CREATE TABLE if not exists `t_kc_pub_course` (
  `id` varchar(64) NOT NULL,
  `rolling_fid` varchar(64) DEFAULT NULL,
  `course_name` varchar(255) DEFAULT NULL COMMENT '课程名',
  `pre_stime` timestamp NULL DEFAULT NULL COMMENT '课程开始时间',
  `pre_etime` timestamp NULL DEFAULT NULL COMMENT '课程结束时间',
  `teacher_fid` varchar(64) DEFAULT NULL COMMENT '授课老师',
  `pic_id` varchar(128) DEFAULT NULL COMMENT '公开课图片',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `ntes_room_id` varchar(255) DEFAULT NULL COMMENT '网易房间号',
  `ntes_room_name` varchar(255) DEFAULT NULL COMMENT '网易房间名',
  `ntes_rtmp_pull_url` varchar(255) DEFAULT NULL COMMENT '网易rtmp拉流地址',
  `ntes_http_pull_url` varchar(255) DEFAULT NULL COMMENT '网易http拉流地址',
  `ntes_push_url` varchar(255) DEFAULT NULL COMMENT '网易推流地址',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL,
  `remark1` varchar(255) DEFAULT NULL,
  `remark2` varchar(255) DEFAULT NULL,
  `remark3` varchar(255) DEFAULT NULL,
  `remark4` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公开课表';^

CREATE TABLE if not exists `t_kc_record` (
  `id` varchar(64) NOT NULL,
  `record_name` varchar(255) DEFAULT NULL COMMENT '视频名称',
  `record_type_fid` varchar(64) DEFAULT NULL,
  `view_permission` int(6) DEFAULT NULL COMMENT '观看权限：1，所有用户；2，企业用户',
  `title1` varchar(255) DEFAULT NULL,
  `title2` varchar(255) DEFAULT NULL,
  `title3` varchar(255) DEFAULT NULL,
  `cover_picture_id` varchar(255) DEFAULT NULL COMMENT '封面图',
  `file_id` varchar(225) DEFAULT NULL COMMENT '视频文件id',
  `format` varchar(64) DEFAULT NULL COMMENT '视频文件格式',
  `duration` int(11) DEFAULT NULL COMMENT '时长/秒',
  `hide_flag` int(3) DEFAULT NULL COMMENT '是否隐藏标识：0否（不隐藏），1是（隐藏）',
  `record_size` double DEFAULT NULL COMMENT '录播视频大小',
  `record_describe` text,
  `status` int(11) DEFAULT NULL,
  `record_index` bigint(18) NOT NULL COMMENT '排序索引',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `remark1` varchar(255) DEFAULT NULL,
  `remark2` varchar(255) DEFAULT NULL,
  `remark3` varchar(255) DEFAULT NULL,
  `remark4` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `record_index` (`record_index`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;^

CREATE TABLE if not exists `t_kc_record_type` (
  `id` varchar(64) NOT NULL,
  `type_name` varchar(255) DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `remark1` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;^

CREATE TABLE if not exists `t_kc_rolling_pic` (
  `id` varchar(64) NOT NULL,
  `roll_name` varchar(255) DEFAULT NULL,
  `roll_type_flag` int(8) DEFAULT NULL COMMENT '轮播图跳转类型标识：0直播公开课，1链接',
  `remark` varchar(512) DEFAULT NULL COMMENT '备注',
  `pic_id` varchar(255) DEFAULT NULL,
  `render_url` varchar(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '0打开状态，1关闭状态',
  `remark1` varchar(255) DEFAULT NULL,
  `remark2` varchar(255) DEFAULT NULL,
  `remark3` varchar(255) DEFAULT NULL,
  `remark4` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='轮播图表';^

CREATE TABLE if not exists `t_kc_rolling_placehd` (
  `id` varchar(64) NOT NULL,
  `his_index` int(11) DEFAULT NULL COMMENT '轮播图下标',
  `rolling_pic_fid` varchar(64) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='轮播图占位表';^

CREATE TABLE if not exists `t_kc_student` (
  `id` varchar(64) NOT NULL,
  `employee_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_employee表的fid',
  `group_fid` varchar(64) DEFAULT NULL COMMENT 't_kc_group的fid',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `remark1` varchar(255) DEFAULT NULL COMMENT '备注1',
  `remark2` varchar(255) DEFAULT NULL COMMENT '备注2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工被导师拉入小组，成为学生';^

CREATE TABLE if not exists `t_kc_teacher` (
  `id` varchar(64) NOT NULL COMMENT '主键生成策略生成的教师唯一id',
  `user_id` varchar(64) DEFAULT NULL COMMENT '用户表ID',
  `nick_name` varchar(128) DEFAULT NULL COMMENT '教师的昵称',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间（不更新）',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `status` int(11) DEFAULT NULL COMMENT '状态，用作逻辑删除',
  `ntes_token` varchar(255) DEFAULT NULL COMMENT '备注1',
  `ntes_accid` varchar(255) DEFAULT NULL,
  `remark_1` varchar(255) DEFAULT NULL,
  `remark_2` varchar(255) DEFAULT NULL,
  `remark_3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='吃不胖教师表，user表的下级业务用户表。';^

CREATE TABLE if not exists `t_tool_account` (
  `id` varchar(64) NOT NULL,
  `third_acc_id` varchar(64) DEFAULT NULL,
  `active_id` varchar(64) DEFAULT NULL COMMENT '甲方id',
  `passive_id` varchar(64) DEFAULT NULL COMMENT '已方ID',
  `action_id` varchar(64) DEFAULT NULL COMMENT '行为ID',
  `passive_root_id` varchar(64) DEFAULT NULL COMMENT '被施行方根级ID，在动作类型为评论回复的时候用得到，回复的是某一个评论，但是根级id应该为评论主体：如文章id，动态id',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(6) DEFAULT NULL,
  `remark` varchar(500) DEFAULT NULL COMMENT '行为备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='此表为抽象表，可供所有业务模块调用记录，记录甲方对乙方执行动作的流水。\r\n比如：用户ID（甲方）对文章ID（乙方）收藏了一次。学生ID（甲方）对录播视频（乙方）浏览了一次。\r\n其中收藏/浏览等行为都属于业务id，此表不做任何归纳。\r\n此表提供status提供针对某次行为生命周期的变更，但不记录单次行为的流水。';^





