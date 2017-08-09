/*
SQLyog Ultimate v8.55 
MySQL - 5.5.8 : Database - invoice
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`invoice` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `invoice`;

/*Table structure for table `bill_details` */

DROP TABLE IF EXISTS `bill_details`;

CREATE TABLE `bill_details` (
  `invoice_id` varchar(50) NOT NULL,
  `item_code` varchar(10) NOT NULL,
  `hsn_sac` varchar(12) NOT NULL,
  `gst_rate` double(4,2) DEFAULT NULL,
  `quantity` double(12,2) DEFAULT NULL,
  `rate` double(12,2) DEFAULT NULL,
  `per` varchar(5) DEFAULT NULL,
  `discount` double(5,2) DEFAULT NULL,
  `amount` double(12,2) DEFAULT NULL,
  `tax_amt_central` double(12,2) DEFAULT NULL,
  `tax_amt_state` double(12,2) DEFAULT NULL,
  `tax_percent_central` double(4,2) DEFAULT NULL,
  `tax_percent_state` double(4,2) DEFAULT NULL,
  `ts` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`invoice_id`,`item_code`,`hsn_sac`),
  KEY `FK_bill_details_1` (`item_code`),
  CONSTRAINT `FK_bill_details` FOREIGN KEY (`invoice_id`) REFERENCES `bill_master` (`Invoice_no`),
  CONSTRAINT `FK_bill_details_1` FOREIGN KEY (`item_code`) REFERENCES `item_master` (`item_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bill_details` */

insert  into `bill_details`(`invoice_id`,`item_code`,`hsn_sac`,`gst_rate`,`quantity`,`rate`,`per`,`discount`,`amount`,`tax_amt_central`,`tax_amt_state`,`tax_percent_central`,`tax_percent_state`,`ts`) values ('PROV/17-18/1','T0001','123',12.00,1.00,100.00,'P',0.00,112.00,6.00,6.00,6.00,6.00,NULL),('PROV/17-18/1','T0002','324',12.00,1.00,100.00,'P',0.00,112.00,6.00,6.00,6.00,6.00,NULL),('PROV/17-18/14','K0001','500.500.500',18.00,20.00,30.00,'PEC',0.00,708.00,54.00,54.00,9.00,9.00,'2017-08-06 20:31:28'),('PROV/17-18/15','T0005','1234',12.00,10.00,60.00,'PEC',0.00,672.00,36.00,36.00,6.00,6.00,'2017-08-08 10:43:21'),('PROV/17-18/15','T0006','8443.99.53',12.00,30.00,110.00,'DSSD',0.00,3696.00,198.00,198.00,6.00,6.00,'2017-08-08 10:43:57'),('PROV/17-18/15','T0007','8443.99.53',18.00,20.00,210.00,'PEC',0.00,4956.00,378.00,378.00,9.00,9.00,'2017-08-08 10:44:21'),('PROV/17-18/2','T0001','123',12.00,2.00,100.00,'A',0.00,224.00,12.00,12.00,6.00,6.00,NULL),('PROV/17-18/2','T0002','324',12.00,2.00,200.00,'S',0.00,448.00,24.00,24.00,6.00,6.00,NULL),('PROV/17-18/3','T0001','123',12.00,6.00,100.00,'PC',0.00,672.00,36.00,36.00,6.00,6.00,NULL),('PROV/17-18/4','T0001','123',12.00,101.00,100.00,'PC',0.00,11312.00,606.00,606.00,6.00,6.00,NULL),('PROV/17-18/5','T0001','123',12.00,20.00,100.00,'E',0.00,2240.00,120.00,120.00,6.00,6.00,'2017-08-03 12:32:15'),('PROV/17-18/5','T0002','324',12.00,1.00,200.00,'2',10.00,214.00,12.00,12.00,6.00,6.00,'2017-08-03 12:32:32'),('PROV/17-18/6','T0001','123',12.00,5.00,100.00,'P',0.00,560.00,30.00,30.00,6.00,6.00,'2017-08-03 14:14:18'),('PROV/17-18/7','T0001','123',12.00,5.00,100.00,'P',0.00,560.00,30.00,30.00,6.00,6.00,'2017-08-03 14:15:00'),('PROV/17-18/8','T0002','324',12.00,10.00,200.00,'PEC',0.00,2240.00,120.00,120.00,6.00,6.00,'2017-08-04 19:34:32'),('PROV/17-18/8','T0003','7867',12.00,10.00,110.00,'PEC',0.00,1232.00,66.00,66.00,6.00,6.00,'2017-08-04 19:34:14'),('PROV/17-18/9','T0002','324',12.00,100.00,200.00,'PC',0.00,22400.00,1200.00,1200.00,6.00,6.00,'2017-08-05 14:37:11');

/*Table structure for table `bill_master` */

DROP TABLE IF EXISTS `bill_master`;

CREATE TABLE `bill_master` (
  `parent_company_code` varchar(3) NOT NULL,
  `buyer_code` varbinary(4) DEFAULT NULL,
  `Invoice_no` varchar(20) NOT NULL,
  `invoice_date` date DEFAULT NULL,
  `delivery_note` varchar(20) DEFAULT NULL,
  `supplier_ref_no` varchar(40) DEFAULT NULL,
  `buyer_order_no` varchar(40) DEFAULT NULL,
  `buyer_order_date` date DEFAULT NULL,
  `other_reference` varchar(50) DEFAULT NULL,
  `despatch_document_no` varchar(50) DEFAULT NULL,
  `delivery_note_date` date DEFAULT NULL,
  `despatch_through` varchar(50) DEFAULT NULL,
  `destination` varchar(100) DEFAULT NULL,
  `tot_amt` double(12,2) DEFAULT NULL,
  `tot_amt_word` varchar(500) DEFAULT NULL,
  `igst_flag` varchar(1) DEFAULT 'N',
  `s_gst` double(12,2) DEFAULT NULL,
  `c_gst` double(12,2) DEFAULT NULL,
  `tot_tax` double(12,2) DEFAULT NULL,
  `ts` datetime DEFAULT NULL,
  PRIMARY KEY (`Invoice_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bill_master` */

insert  into `bill_master`(`parent_company_code`,`buyer_code`,`Invoice_no`,`invoice_date`,`delivery_note`,`supplier_ref_no`,`buyer_order_no`,`buyer_order_date`,`other_reference`,`despatch_document_no`,`delivery_note_date`,`despatch_through`,`destination`,`tot_amt`,`tot_amt_word`,`igst_flag`,`s_gst`,`c_gst`,`tot_tax`,`ts`) values ('001','','PROV/17-18/1','2017-08-02','sa','sa','sa','2017-01-01','sa','sa','2017-01-01','ASA','SA',224.00,'Rupees Two  Hundred Twenty Four','N',12.00,12.00,24.00,NULL),('001','0002','PROV/17-18/10','2017-08-06','lsklds','dsll','dsds','2017-01-01','dsd','dsd','2017-01-01','DSD','DSD',NULL,NULL,'N',NULL,NULL,NULL,'2017-08-06 20:03:45'),('001','','PROV/17-18/11','2017-08-06','xzz','xz','xz','2017-01-01','sasa','sas','2017-01-01','DSD','DS',NULL,NULL,'N',NULL,NULL,NULL,'2017-08-06 20:14:49'),('001','0002','PROV/17-18/12','2017-08-06','xcx','cxc','cxc','2017-01-01','cx','cxc','2017-01-01','CX','CX',NULL,NULL,'N',NULL,NULL,NULL,'2017-08-06 20:20:38'),('001','0002','PROV/17-18/13','2017-08-06','sd','ds','ds','2017-01-01','dsd','ds','2017-01-01','DSD','DS',NULL,NULL,'N',NULL,NULL,NULL,'2017-08-06 20:25:50'),('001','0002','PROV/17-18/14','2017-08-06','cxc','cx','cx','2017-01-01','cxc','cx','2017-01-01','CX','CX',708.00,'Rupees Seven  Hundred Eight ','N',54.00,54.00,108.00,'2017-08-06 20:30:22'),('001','0002','PROV/17-18/15','2017-08-08','jfdjfhjhf','fdnfknd','fdnkf','2017-01-01','dsds','ds','2017-01-01','DSD','DSDSDS',9324.00,'Rupees Nine  Thousand Three  Hundred Twenty Four','N',612.00,612.00,1224.00,'2017-08-08 10:43:00'),('001','0002','PROV/17-18/16','2017-08-08','sasa','sasa','sa','2017-01-01','sa','sa','2017-01-01','SA','SA',NULL,NULL,'N',NULL,NULL,NULL,'2017-08-08 11:19:24'),('001','02','PROV/17-18/17','2017-08-08','jgj','jhj','kjk','2017-01-01','jkjkjk','0101','2017-01-01','5555','55455',NULL,NULL,'N',NULL,NULL,NULL,'2017-08-08 11:27:51'),('001','02','PROV/17-18/2','2017-08-02','sa','sa','sa','2017-01-01','sa','sa','2017-01-01','SA','SA',672.00,'Rupees Six  Hundred Seventy Two','N',36.00,36.00,72.00,NULL),('001','2','PROV/17-18/3','2017-08-02','xz','xz','xz','2017-01-01','xzx','xz','2017-01-01','XZ','XZ',672.00,'Rupees Six  Hundred Seventy Two','N',36.00,36.00,72.00,NULL),('001','01','PROV/17-18/4','2017-08-02','xz','xz','xz','2017-01-01','sasa','sa','2017-01-01','SA','SA',11312.00,'Rupees Eleven  Thousand Three  Hundred Twelve ','N',606.00,606.00,1212.00,NULL),('001','02','PROV/17-18/5','2017-08-03','asa','sa','s','2007-01-01','dsd','ds','2017-01-01','DSD','DS',2454.00,'Rupees Two  Thousand Four  Hundred Fifty Four','N',132.00,132.00,264.00,'2017-08-03 12:31:45'),('001','02','PROV/17-18/6','2017-08-03','jhgg','nj','nkn','2017-01-01','kljl','ml','2017-01-01','JKJ','HK',560.00,'Rupees Five  Hundred Sixty ','N',30.00,30.00,60.00,'2017-08-03 14:14:01'),('001','02','PROV/17-18/7','2017-08-03','121','211','12','2017-01-01','121','121','2070-01-01','211','12',560.00,'Rupees Five  Hundred Sixty ','N',30.00,30.00,60.00,'2017-08-03 14:14:45'),('001','02','PROV/17-18/8','2017-08-04','test','test','test','2017-01-01','red','r3d','2017-01-01','RRR','RRR',3472.00,'Rupees Three  Thousand Four  Hundred Seventy Two','N',186.00,186.00,372.00,'2017-08-04 19:33:39'),('001','02','PROV/17-18/9','2017-08-05','test delivery note','hjhsjhxjsj','jjxsjx','2017-01-01','kjskj','hjdhs','2017-01-01','KJKS','JS',22400.00,'Rupees Twenty Two Thousand Four  Hundred  ','N',1200.00,1200.00,2400.00,'2017-08-05 14:35:21');

/*Table structure for table `client_master` */

DROP TABLE IF EXISTS `client_master`;

CREATE TABLE `client_master` (
  `client_code` varchar(4) DEFAULT NULL,
  `client_name` varchar(200) DEFAULT NULL,
  `address1` varchar(200) DEFAULT NULL,
  `address2` varchar(200) DEFAULT NULL,
  `pin` varchar(6) DEFAULT NULL,
  `state` varchar(30) DEFAULT NULL,
  `gst_no` varchar(50) DEFAULT NULL,
  `uin` varchar(50) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `mobile` varchar(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `reg_date` datetime DEFAULT NULL,
  `pan` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `client_master` */

insert  into `client_master`(`client_code`,`client_name`,`address1`,`address2`,`pin`,`state`,`gst_no`,`uin`,`phone`,`mobile`,`email`,`reg_date`,`pan`) values ('02','KKFDK','KFDKF','KFJDK','454545','MDMFD','MDMF','MFDM','455','454545','45454',NULL,NULL),('0002','PETER','F-1J/RENU APARTMENT','GOPALPUR','713213','WEST BENGAL','KDKLKDS','KSLKD','dlsld','dsls','dslsl','2017-08-06 20:01:31','DSLDLSKD');

/*Table structure for table `company_master` */

DROP TABLE IF EXISTS `company_master`;

CREATE TABLE `company_master` (
  `com_id` varchar(3) DEFAULT NULL,
  `com_name` varchar(150) DEFAULT NULL,
  `com_address` varchar(200) DEFAULT NULL,
  `GST` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `mobile` varchar(11) DEFAULT NULL,
  `pan` varchar(12) DEFAULT NULL,
  `banker` varchar(100) DEFAULT NULL,
  `bank_ac` varchar(30) DEFAULT NULL,
  `ifsc` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `company_master` */

insert  into `company_master`(`com_id`,`com_name`,`com_address`,`GST`,`email`,`phone`,`mobile`,`pan`,`banker`,`bank_ac`,`ifsc`) values ('001','Test Company','Infinity Tower','123456789','test@test.com','0332569856','9879879874',NULL,NULL,NULL,NULL),('002','JKJFKD','JFDKJ','JFKDJ','FDKJFD','fdkj','FDKJ',NULL,NULL,NULL,NULL),('003','JHDSJHDJ','JHJDSHJH','JHDJSHJH','DSKJ','ljdskj','DSJKD','DSKJ','DSNKDS','DSK','DSKDS');

/*Table structure for table `hsn_master` */

DROP TABLE IF EXISTS `hsn_master`;

CREATE TABLE `hsn_master` (
  `trgt_group_code` varchar(20) DEFAULT NULL,
  `trgt_group_desc` varchar(200) DEFAULT NULL,
  `group_code` varchar(20) DEFAULT NULL,
  `group_description` varchar(100) DEFAULT NULL,
  `tgt_prod` varchar(20) DEFAULT NULL,
  `hsn` varchar(50) DEFAULT NULL,
  `sgst` double(14,2) DEFAULT NULL,
  `cgst` double(14,2) DEFAULT NULL,
  `igst` double(14,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hsn_master` */

insert  into `hsn_master`(`trgt_group_code`,`trgt_group_desc`,`group_code`,`group_description`,`tgt_prod`,`hsn`,`sgst`,`cgst`,`igst`) values ('905','OTHER CONS','86','CANON INKJET REMANUFACTURED','CONS','8443.99.53',14.00,14.00,28.00),('905','OTHER CONS','115','EPSON INKJET REMANUFACTURED','CONS','8443.99.53',14.00,14.00,28.00),('905','OTHER CONS','120','MEMORY CARD','CONS','8542.92.00',9.00,9.00,18.00),('905','OTHER CONS','157','IMPORTED TONERS - LEXMARK','CONS','3707.90.90',9.00,9.00,18.00),('905','OTHER CONS','162','INKJET- BROTHER','CONS','8443.99.53',9.00,9.00,18.00),('910','THERMAL CONS','191','ATM CONSUMABLE','CONS','4802.69.50',6.00,6.00,12.00),('914','TONER POWDER','90','BOTTLED TONER LOCAL','CONS','3707.90.90',9.00,9.00,18.00),('902','IMP RIBBONS','68','IMPORTED RIBBONS','CONS','9612.10.10',9.00,9.00,18.00),('905','OTHER CONS','80','TONER','CONS','3707.90.90',9.00,9.00,18.00),('905','OTHER CONS','71','HP INKJET REMANUFACTURED','CONS','8443.99.53',14.00,14.00,28.00),('905','OTHER CONS','158','IMPORTED TONERS - PSI','CONS','3707.90.90',9.00,9.00,18.00),('911','LABEL TAPES','289','LABEL TAPE','CONS','3919.90.90',0.00,0.00,0.00),('905','OTHER CONS','261','IMPORTED TONERS - RICOH','CONS','3707.90.90',9.00,9.00,18.00),('904','LIPI RIBBIONS','67','LIPI RIBBONS','CONS','9612.10.10',9.00,9.00,18.00),('905','OTHER CONS','75','IMPORTED TONERS - TALLY','CONS','8443.99.59',14.00,14.00,28.00),('907','OTHER - INKJET','89','INKJETS - TALLY','CONS','8443.99.53',9.00,9.00,18.00),('912','PACKING MATERIAL','127','PACKING MATERIAL','CONS','4819.10.90',6.00,6.00,12.00),('905','OTHER CONS','159','IMPORTED TONERS - PENTAX','CONS','3707.90.90',9.00,9.00,18.00),('905','OTHER CONS','186','COMPUTER ASSESSORIES-LIPI','CONS','8473.30.99',9.00,9.00,18.00),('905','OTHER CONS','187','IMPORTED TONER - WEP','CONS','3707.90.90',9.00,9.00,18.00),('905','OTHER CONS','146','CONSUMABLE - IMATION','CONS','',0.00,0.00,0.00),('913','IMPORTED  TONER - BROTHER','155','IMPORTED TONER - BROTHER','CONS','3707.90.90',9.00,9.00,18.00),('905','OTHER CONS','156','IMPORTED TONERS - SAMSUNG','CONS','3707.90.90',9.00,9.00,18.00),('905','OTHER CONS','171','IMPORTED TONER - ROWE','CONS','3707.90.90',9.00,9.00,18.00),('905','OTHER CONS','214','IMPORTED TONER BROTHER(S)','CONS','3707.90.90',9.00,9.00,18.00),('909','LIPI RIFFILS','69','LIPI RIFFILS','CONS','9612.10.10',9.00,9.00,18.00),('902','IMP RIBBONS','70','IMPORTED RIFFILS','CONS','9612.10.10',9.00,9.00,18.00),('901','CTC','73','CTC (Compitable Toner Cartridges)','CONS','3707.90.90',9.00,9.00,18.00),('905','OTHER CONS','81','CHARACTER BAND','CONS','8443.99.59',14.00,14.00,28.00),('910','THERMAL CONS','76','PAPER THERMAL','CONS','4802.69.50',6.00,6.00,12.00),('905','OTHER CONS','98','STORAGE DEVICE - TANDBERG','CONS','8471.70.90',9.00,9.00,18.00),('905','OTHER CONS','160','IMPORTED TONERS - HITACHI','CONS','3707.90.90',9.00,9.00,18.00),('905','OTHER CONS','74','EXPORT - CTC','CONS','3707.90.90',9.00,9.00,18.00),(NULL,NULL,'500','KEY BOARD',NULL,'500.500.500',NULL,NULL,NULL),(NULL,NULL,'501','SPEAKER',NULL,'501.501.501',NULL,NULL,NULL);

/*Table structure for table `item_category` */

DROP TABLE IF EXISTS `item_category`;

CREATE TABLE `item_category` (
  `id` varchar(6) DEFAULT NULL,
  `segment` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `item_category` */

insert  into `item_category`(`id`,`segment`) values ('1','MONITOR'),('2','CABINET'),('3','SMPS'),('4','MOTHER BOARD'),('5','CPU'),('6','RAM'),('7','HDD'),('8','LAN CARD'),('9','GRAPHICS CARD'),('10','KEY BOARD'),('11','SPEAKER'),('12','DESKJET PRINTER'),('13','LASERJET PRINTER'),('14','LAN CABLE'),('15','TONER'),('16','POWER CABLE'),('17','LAPTOP'),('18','POWER CABLE'),('19','UPS'),('20','LAPTOP HDD'),('21','LAPTOP KEYBOARD'),('22','LAPTOP BOARD'),('23','LAPTOP BATTERY'),('','');

/*Table structure for table `item_master` */

DROP TABLE IF EXISTS `item_master`;

CREATE TABLE `item_master` (
  `item_code` varchar(5) NOT NULL,
  `item_description` varchar(500) DEFAULT NULL,
  `hsn_code` varchar(15) DEFAULT NULL,
  `tax_code` varchar(10) DEFAULT NULL,
  `unit` varchar(10) DEFAULT NULL,
  `unit_price` double(12,2) DEFAULT NULL,
  `purchase_price` double(12,2) DEFAULT NULL,
  `stock` double(12,2) DEFAULT NULL,
  `segment` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`item_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `item_master` */

insert  into `item_master`(`item_code`,`item_description`,`hsn_code`,`tax_code`,`unit`,`unit_price`,`purchase_price`,`stock`,`segment`) values ('I0001','IIJKK','501.501.501','004','PEC',NULL,NULL,NULL,NULL),('K0001','KEY BOARD','500.500.500','001','PC',NULL,NULL,NULL,NULL),('S0001','SPEAKER','501.501.501','001','PC',NULL,NULL,NULL,NULL),('T0001','TEST ITEM1','123','001','PEC',120.00,100.00,140.00,NULL),('T0002','TEST ITEM2','324','001','PEC',200.00,90.00,-10.00,NULL),('T0003','TEST ITEM3','7867','001','PEC',110.00,100.00,10.00,NULL),('T0004','TEST ITEM 5','12345','002','PEC',NULL,NULL,NULL,NULL),('T0005','TEST ITME','1234','001','PEC',60.00,50.00,90.00,NULL),('T0006','TEST ITEM','8443.99.53','001','PEC',110.00,100.00,70.00,NULL),('T0007','TEST ITEM','8443.99.53','001','PEC',210.00,200.00,80.00,NULL),('T0008','TEST ITEM','8542.92.00','002','PEC',NULL,NULL,NULL,NULL);

/*Table structure for table `item_master_transaction` */

DROP TABLE IF EXISTS `item_master_transaction`;

CREATE TABLE `item_master_transaction` (
  `item_code` varchar(10) DEFAULT NULL,
  `quantity` double(12,2) DEFAULT NULL,
  `unit_price` double(12,2) DEFAULT NULL,
  `dc` varchar(1) DEFAULT NULL COMMENT ',',
  `item_balance` double(12,2) DEFAULT NULL,
  `reference` varchar(200) DEFAULT NULL,
  `ts_transaction` datetime DEFAULT NULL,
  `parent_code` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `item_master_transaction` */

insert  into `item_master_transaction`(`item_code`,`quantity`,`unit_price`,`dc`,`item_balance`,`reference`,`ts_transaction`,`parent_code`) values ('T0001',101.00,NULL,'D',-1.00,'PROV/17-18/4','2017-08-02 14:30:04',NULL),('T0001',20.00,NULL,'D',-21.00,'PROV/17-18/5','2017-08-03 12:32:15',NULL),('T0002',1.00,NULL,'D',-5.00,'PROV/17-18/5','2017-08-03 12:32:33',NULL),('T0001',5.00,NULL,'D',95.00,'PROV/17-18/6','2017-08-03 14:14:18',NULL),('T0001',5.00,NULL,'D',90.00,'PROV/17-18/7','2017-08-03 14:15:00',NULL),('T0003',20.00,NULL,'C',20.00,'PURCHASE FROM ABC COMPANY ON 04/08/2017','2017-08-04 19:33:00',NULL),('T0003',10.00,NULL,'D',10.00,'PROV/17-18/8','2017-08-04 19:34:14',NULL),('T0002',10.00,NULL,'D',90.00,'PROV/17-18/8','2017-08-04 19:34:32',NULL),('T0001',20.00,NULL,'C',110.00,'PURCHASED FROM ABC COMPANY ON 05/08/2017','2017-08-05 14:31:16',NULL),('T0002',100.00,NULL,'D',-10.00,'PROV/17-18/9','2017-08-05 14:37:11',NULL),('T0001',10.00,NULL,'C',120.00,'TEST','2017-08-06 08:29:53',NULL),('K0001',20.00,NULL,'D',-20.00,'PROV/17-18/14','2017-08-06 20:31:28',NULL),('T0005',100.00,NULL,'C',100.00,'TEST INVOICE2','2017-08-08 10:41:35',NULL),('T0006',100.00,NULL,'C',100.00,'TEST INVOICE2','2017-08-08 10:42:10',NULL),('T0007',100.00,NULL,'C',100.00,'TEST INVOICE2','2017-08-08 10:42:28',NULL),('T0005',10.00,NULL,'D',90.00,'PROV/17-18/15','2017-08-08 10:43:21',NULL),('T0006',30.00,NULL,'D',70.00,'PROV/17-18/15','2017-08-08 10:43:57',NULL),('T0007',20.00,NULL,'D',80.00,'PROV/17-18/15','2017-08-08 10:44:21',NULL),('T0001',20.00,NULL,'C',140.00,'TEST99877','2017-08-08 11:00:26',NULL);

/*Table structure for table `login_log` */

DROP TABLE IF EXISTS `login_log`;

CREATE TABLE `login_log` (
  `user_id` varchar(20) DEFAULT NULL,
  `login_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login_log` */

/*Table structure for table `payment` */

DROP TABLE IF EXISTS `payment`;

CREATE TABLE `payment` (
  `transaction_date` date DEFAULT NULL,
  `seller_no` varchar(10) DEFAULT NULL,
  `invoice_no` varchar(30) DEFAULT NULL,
  `invoice_amt` double(12,2) DEFAULT NULL,
  `payment_amt` double(12,2) DEFAULT NULL,
  `reference` varchar(100) DEFAULT NULL,
  `parent_code` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `payment` */

insert  into `payment`(`transaction_date`,`seller_no`,`invoice_no`,`invoice_amt`,`payment_amt`,`reference`,`parent_code`) values ('2017-08-06','001','TEST',1180.00,1180.00,'TEST REFERENCE',NULL),('2017-08-02','02','PROV/17-18/2',672.00,672.00,'CSSD',NULL);

/*Table structure for table `purchase_master` */

DROP TABLE IF EXISTS `purchase_master`;

CREATE TABLE `purchase_master` (
  `seller_code` varchar(4) DEFAULT NULL,
  `seller_invoice_no` varchar(40) DEFAULT NULL,
  `seller_invoice_date` date DEFAULT NULL,
  `item_code` varchar(30) DEFAULT NULL,
  `quantity` double(10,2) DEFAULT NULL,
  `unit_purchase_price` double(12,2) DEFAULT NULL,
  `tax_percent` double(4,2) DEFAULT NULL,
  `tax_amt` double(8,2) DEFAULT NULL,
  `gross_amt` double(16,2) DEFAULT NULL,
  `parent_code` varchar(10) DEFAULT NULL,
  `discount_percent` double(4,2) DEFAULT '0.00',
  `unit_selling_price` double(12,2) DEFAULT NULL,
  `item_description` varchar(200) DEFAULT NULL,
  `unit` varchar(15) DEFAULT NULL,
  `allocated_flag` varchar(2) DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `purchase_master` */

insert  into `purchase_master`(`seller_code`,`seller_invoice_no`,`seller_invoice_date`,`item_code`,`quantity`,`unit_purchase_price`,`tax_percent`,`tax_amt`,`gross_amt`,`parent_code`,`discount_percent`,`unit_selling_price`,`item_description`,`unit`,`allocated_flag`) values ('001','TEST','2017-08-06','T0001',10.00,100.00,18.00,180.00,1180.00,NULL,NULL,NULL,NULL,NULL,'N'),('001','TEST INVOICE2','2017-01-01','T0005',100.00,50.00,18.00,900.00,5900.00,NULL,NULL,25.00,'hdjhdhj','jskdj','N'),('001','TEST INVOICE2','2017-01-01','T0006',100.00,100.00,18.00,1800.00,11800.00,NULL,NULL,NULL,'dsdksk\\','dsd','N'),('001','TEST INVOICE2','2017-01-01','T0007',100.00,200.00,18.00,3600.00,23600.00,NULL,NULL,NULL,'dsd','ds','N'),('001','TEST99877','2017-01-01','T0001',20.00,100.00,18.00,360.00,2360.00,NULL,NULL,NULL,'ds','dsd','N');

/*Table structure for table `receipt` */

DROP TABLE IF EXISTS `receipt`;

CREATE TABLE `receipt` (
  `transaction_date` date DEFAULT NULL,
  `client_no` varchar(10) DEFAULT NULL,
  `invoice_no` varchar(30) DEFAULT NULL,
  `invoice_amt` double(12,2) DEFAULT NULL,
  `payment_amt` double(12,2) DEFAULT NULL,
  `reference` varchar(100) DEFAULT NULL,
  `parent_code` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `receipt` */

insert  into `receipt`(`transaction_date`,`client_no`,`invoice_no`,`invoice_amt`,`payment_amt`,`reference`,`parent_code`) values ('2017-08-02','001','PROV/17-18/2',672.00,672.00,'DSSS',NULL),(NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `report` */

DROP TABLE IF EXISTS `report`;

CREATE TABLE `report` (
  `report_id` varchar(3) DEFAULT NULL,
  `report_name` varchar(50) DEFAULT NULL,
  `file_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `report` */

insert  into `report`(`report_id`,`report_name`,`file_name`) values ('1','DEBTOR LEDGER-RECONCILED','dr_led_recon.jasper'),('2','CREDITOR LEDGER-RECONCILED','cr_led_recon.jasper'),('3','CREDITOR-ALL','cr_all.jasper'),('4','DEBTOR-ALL','dr_all.jasper');

/*Table structure for table `seller_master` */

DROP TABLE IF EXISTS `seller_master`;

CREATE TABLE `seller_master` (
  `seller_code` varchar(10) DEFAULT NULL,
  `seller_name` varchar(200) DEFAULT NULL,
  `seller_address` varchar(300) DEFAULT NULL,
  `seller_phone` varchar(20) DEFAULT NULL,
  `seller_mobile` varchar(11) DEFAULT NULL,
  `seller_gst` varchar(20) DEFAULT NULL,
  `reg_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `seller_master` */

insert  into `seller_master`(`seller_code`,`seller_name`,`seller_address`,`seller_phone`,`seller_mobile`,`seller_gst`,`reg_date`) values ('001','TINNI','SDS','DSD','DSD','DS','2017-08-06 08:21:19');

/*Table structure for table `tax_master` */

DROP TABLE IF EXISTS `tax_master`;

CREATE TABLE `tax_master` (
  `tax_code` varchar(3) DEFAULT NULL,
  `tax_name` varchar(50) DEFAULT NULL,
  `tax_percent` double(4,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tax_master` */

insert  into `tax_master`(`tax_code`,`tax_name`,`tax_percent`) values ('001','GST',12.00),('002','GST',18.00),('003','GST',28.00),('004','DSD',25.00);

/*Table structure for table `user_master` */

DROP TABLE IF EXISTS `user_master`;

CREATE TABLE `user_master` (
  `user_id` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_master` */

/*Table structure for table `v_all_creditor` */

DROP TABLE IF EXISTS `v_all_creditor`;

/*!50001 DROP VIEW IF EXISTS `v_all_creditor` */;
/*!50001 DROP TABLE IF EXISTS `v_all_creditor` */;

/*!50001 CREATE TABLE  `v_all_creditor`(
 `com_id` varchar(3) ,
 `com_name` varchar(150) ,
 `seller_invoice_no` varchar(40) ,
 `seller_invoice_date` date ,
 `gross_amt` double(16,2) ,
 `ref` varchar(100) ,
 `debit_credit` varchar(6) 
)*/;

/*Table structure for table `v_all_debtor` */

DROP TABLE IF EXISTS `v_all_debtor`;

/*!50001 DROP VIEW IF EXISTS `v_all_debtor` */;
/*!50001 DROP TABLE IF EXISTS `v_all_debtor` */;

/*!50001 CREATE TABLE  `v_all_debtor`(
 `com_id` varchar(3) ,
 `com_name` varchar(150) ,
 `invoice_no` varchar(30) ,
 `invoice_date` date ,
 `tot_amt` double(12,2) ,
 `ref` varchar(100) ,
 `debit_credit` varchar(6) 
)*/;

/*Table structure for table `v_creditor_ledger` */

DROP TABLE IF EXISTS `v_creditor_ledger`;

/*!50001 DROP VIEW IF EXISTS `v_creditor_ledger` */;
/*!50001 DROP TABLE IF EXISTS `v_creditor_ledger` */;

/*!50001 CREATE TABLE  `v_creditor_ledger`(
 `com_name` varchar(150) ,
 `seller_invoice_no` varchar(40) ,
 `seller_invoice_date` date ,
 `gross_amt` double(19,2) ,
 `payment_amt` double(12,2) ,
 `transaction_date` date ,
 `reference` varchar(100) ,
 `seller_code` varchar(4) 
)*/;

/*Table structure for table `v_debtor_ledger` */

DROP TABLE IF EXISTS `v_debtor_ledger`;

/*!50001 DROP VIEW IF EXISTS `v_debtor_ledger` */;
/*!50001 DROP TABLE IF EXISTS `v_debtor_ledger` */;

/*!50001 CREATE TABLE  `v_debtor_ledger`(
 `com_name` varchar(150) ,
 `invoice_no` varchar(20) ,
 `invoice_date` date ,
 `tot_amt` double(12,2) ,
 `payment_amt` double(12,2) ,
 `transaction_date` date ,
 `reference` varchar(100) ,
 `buyer_code` varbinary(4) 
)*/;

/*Table structure for table `v_purchase` */

DROP TABLE IF EXISTS `v_purchase`;

/*!50001 DROP VIEW IF EXISTS `v_purchase` */;
/*!50001 DROP TABLE IF EXISTS `v_purchase` */;

/*!50001 CREATE TABLE  `v_purchase`(
 `gross_amt` double(19,2) ,
 `tax_amt` double(19,2) ,
 `seller_invoice_no` varchar(40) ,
 `seller_invoice_date` date ,
 `seller_code` varchar(4) ,
 `parent_code` varchar(10) 
)*/;

/*View structure for view v_all_creditor */

/*!50001 DROP TABLE IF EXISTS `v_all_creditor` */;
/*!50001 DROP VIEW IF EXISTS `v_all_creditor` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_all_creditor` AS select `a`.`com_id` AS `com_id`,`a`.`com_name` AS `com_name`,`b`.`seller_invoice_no` AS `seller_invoice_no`,`b`.`seller_invoice_date` AS `seller_invoice_date`,`b`.`gross_amt` AS `gross_amt`,'Item purchased' AS `ref`,'Credit' AS `debit_credit` from (`company_master` `a` join `purchase_master` `b`) where (`b`.`parent_code` = `a`.`com_id`) union select `a`.`com_id` AS `com_id`,`a`.`com_name` AS `com_name`,`b`.`invoice_no` AS `invoice_no`,`b`.`transaction_date` AS `transaction_date`,`b`.`invoice_amt` AS `invoice_amt`,`b`.`reference` AS `reference`,'Debit' AS `debit_credit` from (`company_master` `a` join `payment` `b`) where (`b`.`seller_no` = `a`.`com_id`) */;

/*View structure for view v_all_debtor */

/*!50001 DROP TABLE IF EXISTS `v_all_debtor` */;
/*!50001 DROP VIEW IF EXISTS `v_all_debtor` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_all_debtor` AS select `a`.`com_id` AS `com_id`,`a`.`com_name` AS `com_name`,`b`.`Invoice_no` AS `invoice_no`,`b`.`invoice_date` AS `invoice_date`,`b`.`tot_amt` AS `tot_amt`,'invoice issued' AS `ref`,'Debit' AS `debit_credit` from (`company_master` `a` join `bill_master` `b`) where (`b`.`parent_company_code` = `a`.`com_id`) union select `a`.`com_id` AS `com_id`,`a`.`com_name` AS `com_name`,`b`.`invoice_no` AS `invoice_no`,`b`.`transaction_date` AS `transaction_date`,`b`.`payment_amt` AS `payment_amt`,`b`.`reference` AS `reference`,'Credit' AS `debit_credit` from (`company_master` `a` join `receipt` `b`) where (`b`.`client_no` = `a`.`com_id`) */;

/*View structure for view v_creditor_ledger */

/*!50001 DROP TABLE IF EXISTS `v_creditor_ledger` */;
/*!50001 DROP VIEW IF EXISTS `v_creditor_ledger` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_creditor_ledger` AS select `a`.`com_name` AS `com_name`,`b`.`seller_invoice_no` AS `seller_invoice_no`,`b`.`seller_invoice_date` AS `seller_invoice_date`,`b`.`gross_amt` AS `gross_amt`,`c`.`payment_amt` AS `payment_amt`,`c`.`transaction_date` AS `transaction_date`,`c`.`reference` AS `reference`,`b`.`seller_code` AS `seller_code` from ((`company_master` `a` join `v_purchase` `b`) join `payment` `c`) where ((`b`.`parent_code` = `a`.`com_id`) and (`b`.`seller_code` = `c`.`seller_no`) and (`b`.`seller_invoice_no` = `c`.`invoice_no`)) */;

/*View structure for view v_debtor_ledger */

/*!50001 DROP TABLE IF EXISTS `v_debtor_ledger` */;
/*!50001 DROP VIEW IF EXISTS `v_debtor_ledger` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_debtor_ledger` AS select `a`.`com_name` AS `com_name`,`b`.`Invoice_no` AS `invoice_no`,`b`.`invoice_date` AS `invoice_date`,`b`.`tot_amt` AS `tot_amt`,`c`.`payment_amt` AS `payment_amt`,`c`.`transaction_date` AS `transaction_date`,`c`.`reference` AS `reference`,`b`.`buyer_code` AS `buyer_code` from ((`company_master` `a` join `bill_master` `b`) join `receipt` `c`) where ((`b`.`parent_company_code` = `a`.`com_id`) and (`b`.`buyer_code` = `c`.`client_no`) and (`b`.`Invoice_no` = `c`.`invoice_no`)) */;

/*View structure for view v_purchase */

/*!50001 DROP TABLE IF EXISTS `v_purchase` */;
/*!50001 DROP VIEW IF EXISTS `v_purchase` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_purchase` AS select sum(`purchase_master`.`gross_amt`) AS `gross_amt`,sum(`purchase_master`.`tax_amt`) AS `tax_amt`,`purchase_master`.`seller_invoice_no` AS `seller_invoice_no`,`purchase_master`.`seller_invoice_date` AS `seller_invoice_date`,`purchase_master`.`seller_code` AS `seller_code`,`purchase_master`.`parent_code` AS `parent_code` from `purchase_master` group by `purchase_master`.`seller_invoice_no` */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
