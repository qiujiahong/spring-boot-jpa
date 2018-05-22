CREATE TABLE `book` (
  `id` bigint(20) NOT NULL,
  `isbn` varchar(30) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `author_id` int,
  PRIMARY KEY (`id`)
)DEFAULT CHARSET=utf8;

