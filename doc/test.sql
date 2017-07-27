-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 2017-07-26 05:06:26
-- 服务器版本： 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- 表的结构 `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
`eid` int(10) NOT NULL,
  `ename` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `eusername` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `epwd` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `esex` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `eage` int(3) NOT NULL,
  `eskills` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `eemail` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `eno` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `emobileno` char(20) COLLATE utf8_unicode_ci NOT NULL,
  `eteam` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `performance` int(4) NOT NULL,
  `rper` int(4) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- 转存表中的数据 `employee`
--

INSERT INTO `employee` (`eid`, `ename`, `eusername`, `epwd`, `esex`, `eage`, `eskills`, `eemail`, `eno`, `emobileno`, `eteam`, `performance`, `rper`) VALUES
(1, '王伟杰', '王', 'a', '男', 22, 'Android', '7299902@qq.com', '111', '18873368888', 'jjjj', 0, NULL),
(2, '吕志玲', 'lv', '2', '男', 18, 'java', '32@qq.com', '22', '13245671', '222', 4, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `hr`
--

CREATE TABLE IF NOT EXISTS `hr` (
`hid` int(10) NOT NULL,
  `hname` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `husername` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `hpwd` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `hsex` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `hage` int(3) NOT NULL,
  `hemail` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `hcompany` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `hno` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `hmobileno` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- 转存表中的数据 `hr`
--

INSERT INTO `hr` (`hid`, `hname`, `husername`, `hpwd`, `hsex`, `hage`, `hemail`, `hcompany`, `hno`, `hmobileno`) VALUES
(1, 'zz周谆谆', '周谆谆', '2', '女', 16, '729990257@qq.com', '风云', '1111', '18673385786');

-- --------------------------------------------------------

--
-- 表的结构 `ro`
--

CREATE TABLE IF NOT EXISTS `ro` (
  `rusername` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `rpwd` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `rname` varchar(12) COLLATE utf8_unicode_ci NOT NULL,
`rid` int(11) NOT NULL,
  `rsex` varchar(2) COLLATE utf8_unicode_ci NOT NULL,
  `rage` int(3) NOT NULL,
  `remail` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `rmobileno` varchar(12) COLLATE utf8_unicode_ci NOT NULL,
  `rcompany` varchar(16) COLLATE utf8_unicode_ci NOT NULL,
  `rno` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `rperformance` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `rteam` varchar(14) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- 转存表中的数据 `ro`
--

INSERT INTO `ro` (`rusername`, `rpwd`, `rname`, `rid`, `rsex`, `rage`, `remail`, `rmobileno`, `rcompany`, `rno`, `rperformance`, `rteam`) VALUES
('wwj', '123456', 'wwj', 1, '男', 18, '555555', '15673393456', '1', '1', '1', 'group');

-- --------------------------------------------------------

--
-- 表的结构 `task`
--

CREATE TABLE IF NOT EXISTS `task` (
  `task` varchar(300) COLLATE utf8_unicode_ci DEFAULT NULL,
`tid` int(111) NOT NULL,
  `team` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  `publisher` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- 转存表中的数据 `task`
--

INSERT INTO `task` (`task`, `tid`, `team`, `publisher`) VALUES
('ssssssssss', 1, 'group', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
 ADD PRIMARY KEY (`eid`);

--
-- Indexes for table `hr`
--
ALTER TABLE `hr`
 ADD PRIMARY KEY (`hid`);

--
-- Indexes for table `ro`
--
ALTER TABLE `ro`
 ADD PRIMARY KEY (`rid`);

--
-- Indexes for table `task`
--
ALTER TABLE `task`
 ADD PRIMARY KEY (`tid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
MODIFY `eid` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `hr`
--
ALTER TABLE `hr`
MODIFY `hid` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `ro`
--
ALTER TABLE `ro`
MODIFY `rid` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `task`
--
ALTER TABLE `task`
MODIFY `tid` int(111) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
