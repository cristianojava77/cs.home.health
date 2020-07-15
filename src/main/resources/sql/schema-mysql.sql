-- Create database
-- .....................................................................

DROP DATABASE IF EXISTS dbhealth;

CREATE DATABASE dbhealth CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

-- Create tables
-- .....................................................................
USE dbhealth;

DROP TABLE IF EXISTS `tbl_address`;

CREATE TABLE `tbl_address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `code_country` int(11) DEFAULT NULL,
  `complement` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `id_state` bigint(20) DEFAULT NULL,
  `id_user` bigint(20) NOT NULL,
  `number` varchar(255) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `zipcode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_address_iduser` (`id_user`)
);

DROP TABLE IF EXISTS `tbl_country`;

CREATE TABLE `tbl_country` (
  `id` bigint(20) NOT NULL,
  `abbreviation` varchar(255) DEFAULT NULL,
  `active` bit(1) DEFAULT NULL,
  `code` int(11) DEFAULT NULL,
  `language` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `tbl_marital_status`;

CREATE TABLE `tbl_marital_status` (
  `id` bigint(20) NOT NULL,
  `code` int(11) DEFAULT NULL,
  `language` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_maritalstatus_code` (`code`)
);

DROP TABLE IF EXISTS `tbl_measurement`;

CREATE TABLE `tbl_measurement` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `chest` int(11) DEFAULT NULL,
  `date_collected` datetime(6) NOT NULL,
  `heart_rate` int(11) DEFAULT NULL,
  `id_user` bigint(20) NOT NULL,
  `pressure_diastolic` int(11) DEFAULT NULL,
  `pressure_systolic` int(11) DEFAULT NULL,
  `saturation` int(11) DEFAULT NULL,
  `temperature` int(11) DEFAULT NULL,
  `thigh_left` int(11) DEFAULT NULL,
  `thigh_right` int(11) DEFAULT NULL,
  `upper_arm_left` int(11) DEFAULT NULL,
  `upper_arm_rigth` int(11) DEFAULT NULL,
  `waist` int(11) DEFAULT NULL,
  `weight` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_measurement_iduser` (`id_user`)
);

DROP TABLE IF EXISTS `tbl_person`;

CREATE TABLE `tbl_person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code_marital_status` int(11) DEFAULT NULL,
  `date_birth` datetime(6) DEFAULT NULL,
  `email_personal` varchar(255) DEFAULT NULL,
  `email_work` varchar(255) DEFAULT NULL,
  `full_name` varchar(255) DEFAULT NULL,
  `id_user` bigint(20) NOT NULL,
  `phone_home` varchar(255) DEFAULT NULL,
  `phone_mobile` varchar(255) DEFAULT NULL,
  `phone_work` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_person_iduser` (`id_user`)
);

DROP TABLE IF EXISTS `tbl_role`;

CREATE TABLE `tbl_role` (
  `id` bigint(20) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `active` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `tbl_state`;

CREATE TABLE `tbl_state` (
  `id` bigint(20) NOT NULL,
  `abbreviation` varchar(255) DEFAULT NULL,
  `active` bit(1) DEFAULT NULL,
  `code_country` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_state_codecountry` (`code_country`)
);

DROP TABLE IF EXISTS `tbl_user`;

-- dbhealth.tbl_user definition

CREATE TABLE `tbl_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `attempts` int(11) DEFAULT NULL,
  `blocked` bit(1) DEFAULT NULL,
  `date_blocked` datetime(6) DEFAULT NULL,
  `date_last_login` datetime(6) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);
