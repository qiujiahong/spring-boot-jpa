-- DROP table  IF EXISTS book;
-- CREATE TABLE `book` (
--   `id` bigint(20) NOT NULL AUTO_INCREMENT,
--   `isbn` varchar(30) DEFAULT NULL,
--   `name` varchar(30) DEFAULT NULL,
--   `author_id` int,
--   PRIMARY KEY (`id`)
-- )DEFAULT CHARSET=utf8;
--
-- DROP table  IF EXISTS author;
-- CREATE TABLE `author` (
--   `id` bigint(20) NOT NULL  AUTO_INCREMENT,
--   `name` varchar(30) DEFAULT NULL,
--   `phone` varchar(30) DEFAULT NULL,
--   `email` varchar(30) DEFAULT NULL,
--   PRIMARY KEY (`id`)
-- )DEFAULT CHARSET=utf8;

CREATE TABLE `author` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`name` varchar(20) NULL,
`phone` varchar(20) NULL,
`email` varchar(20) NULL,
PRIMARY KEY (`id`)
);
CREATE TABLE `book` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`name` varchar(20) NULL,
`isbn` varchar(20) NULL,
`author_id` bigint(20) NULL,
PRIMARY KEY (`id`)
);


ALTER TABLE `book` ADD CONSTRAINT `fk_author` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`);

insert into author (name,phone,email) values ('NICK','18022222222','nick@112.com');
insert into author (name,phone,email) values ('elaine','17022222222','elaine@112.com');
insert into book (isbn,name,author_id) values ('xxxxx','我的人生',1)
