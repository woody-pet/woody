CREATE TABLE IF NOT EXISTS `user`  (
`id` bigint(0) NOT NULL AUTO_INCREMENT,
`userName` varchar(32) NOT NULL,
`passWord` varchar(50) NOT NULL,
`realName` varchar(32) ,
PRIMARY KEY (`id`) USING BTREE
);