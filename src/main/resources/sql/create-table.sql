CREATE TABLE `order_entity_0` (
  `order_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `total_amount` decimal(10,2) DEFAULT NULL COMMENT '订单金额',
  `date_created` datetime DEFAULT NULL,
  `last_modified` datetime DEFAULT NULL,
  `record_status` int(11) DEFAULT '0',
  `remarks` varchar(255) DEFAULT NULL,
  `sort_priority` int(11) DEFAULT NULL COMMENT '优先级',
  `version` int(11) DEFAULT '0',
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `order_entity_1` (
  `order_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `total_amount` decimal(10,2) DEFAULT NULL COMMENT '订单金额',
  `date_created` datetime DEFAULT NULL,
  `last_modified` datetime DEFAULT NULL,
  `record_status` int(11) DEFAULT '0',
  `remarks` varchar(255) DEFAULT NULL,
  `sort_priority` int(11) DEFAULT NULL COMMENT '优先级',
  `version` int(11) DEFAULT '0',
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_entity_0` (
  `user_id` bigint(20) NOT NULL,
  `date_created` datetime DEFAULT NULL,
  `last_modified` datetime DEFAULT NULL,
  `record_status` int(11) DEFAULT '0',
  `remarks` varchar(255) DEFAULT NULL,
  `sort_priority` int(11) DEFAULT NULL COMMENT '优先级',
  `version` int(11) DEFAULT '0',
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `user_entity_1` (
  `user_id` bigint(20) NOT NULL,
  `date_created` datetime DEFAULT NULL,
  `last_modified` datetime DEFAULT NULL,
  `record_status` int(11) DEFAULT '0',
  `remarks` varchar(255) DEFAULT NULL,
  `sort_priority` int(11) DEFAULT NULL COMMENT '优先级',
  `version` int(11) DEFAULT '0',
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
