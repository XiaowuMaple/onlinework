DROP TABLE IF EXISTS `school`;
CREATE TABLE `school` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;


LOCK TABLES `school` WRITE;

INSERT INTO `school`
	VALUES(1,'address_a','school_a')
	,(2,'address_b','school_b')
	,(3,'address_3','school_3')
	,(4,'address_4','school_4')
	,(5,'address_5','school_5')
	,(6,'address_6','school_6')
	,(7,'address_7','school_7')
	,(8,'address_8','school_8')
	,(9,'address_9','school_9')
	,(10,'address_10','school_10')
	,(11,'address_11','school_11')
	,(12,'address_12','school_12')
	,(13,'address_13','school_13')
	,(14,'address_14','school_14')
	,(15,'address_15','school_15')
	,(16,'address_16','school_16')
	,(17,'address_17','school_17')
	,(18,'address_18','school_18')
	,(19,'address_19','school_19')
	,(20,'address_20','school_20')
	,(21,'address_21','school_21')
	,(22,'address_22','school_22')
	,(23,'address_23','school_23')
	,(24,'address_24','school_24')
	,(25,'address_25','school_25')
	,(26,'address_26','school_26')
	,(27,'address_27','school_27')
	,(28,'address_28','school_28')
	,(29,'address_29','school_29')
	,(20,'address_30','school_30')

UNLOCK TABLES;


DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(50) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `photo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

--

LOCK TABLES `user` WRITE;

INSERT INTO `user`
	VALUES (1,'zhangsan','张三','123456','男','1991-01-02','13812345678','zhangsan@126.com',NULL)
	,(2,'lisi','李四','123456','男','1992-02-03','13812345678','lisi@126.com',NULL)
	,(3,'wangwu','王五','123456','男','1993-02-01','13812345678','wangwu@126.com',NULL)
	,(4,'zhangsan_parent','张三-家长','123456','男',NULL,NULL,NULL,NULL)
	,(5,'lisi_parent','李四-家长','123456','男',NULL,NULL,NULL,NULL)
	,(6,'wangwu_parent','王五-家长','123456','男',NULL,NULL,NULL,NULL)
	,(7,'zhao_teacher','赵老师','123456','女',NULL,NULL,NULL,NULL)
	,(8,'qian_teacher','钱老师','123456','男',NULL,NULL,NULL,NULL)
	,(9,'sun_teacher','孙老师','123456','男',NULL,NULL,NULL,NULL)
	,(10,'li_teacher','李老师','123456','女',NULL,NULL,NULL,NULL);

UNLOCK TABLES;

