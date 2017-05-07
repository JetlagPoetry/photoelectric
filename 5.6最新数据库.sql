/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50528
Source Host           : 127.0.0.1:3306
Source Database       : base

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-05-07 00:53:05
*/

SET FOREIGN_KEY_CHECKS=0;
use base;
-- ----------------------------
-- Table structure for allocation
-- ----------------------------
DROP TABLE IF EXISTS `allocation`;
CREATE TABLE `allocation` (
  `Allocation_id` int(11) NOT NULL AUTO_INCREMENT,
  `Repository_id` int(11) NOT NULL,
  `Allocation_stockNo` int(11) NOT NULL,
  `Allocation_isOccupied` int(11) DEFAULT NULL,
  `Allocation_stocktype` int(11) DEFAULT NULL,
  `Allocation_stocknum` int(11) DEFAULT NULL,
  `Allocation_stockid` int(11) DEFAULT NULL,
  PRIMARY KEY (`Allocation_id`),
  UNIQUE KEY `Allocation_PK` (`Allocation_id`),
  KEY `allocatein_FK` (`Repository_id`),
  CONSTRAINT `FK_ALLOCATI_ALLOCATEI_REPOSITO` FOREIGN KEY (`Repository_id`) REFERENCES `repository` (`Repository_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of allocation
-- ----------------------------

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `Category_id` int(11) NOT NULL,
  `Category_name` varchar(50) NOT NULL,
  PRIMARY KEY (`Category_id`,`Category_name`),
  UNIQUE KEY `Category_PK` (`Category_id`,`Category_name`),
  KEY `Category_id` (`Category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `Department_id` int(11) NOT NULL AUTO_INCREMENT,
  `Department_name` varchar(20) NOT NULL,
  PRIMARY KEY (`Department_id`),
  UNIQUE KEY `Department_PK` (`Department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------

-- ----------------------------
-- Table structure for materials
-- ----------------------------
DROP TABLE IF EXISTS `materials`;
CREATE TABLE `materials` (
  `Materials_id` int(11) NOT NULL AUTO_INCREMENT,
  `Materials_name` varchar(50) NOT NULL,
  `Materials_notes` varchar(70) DEFAULT NULL,
  `Materials_minPur` int(11) DEFAULT NULL,
  `Materials_isLack` smallint(6) DEFAULT NULL,
  `Materials_remains` int(11) DEFAULT NULL,
  `Materials_allowed` int(11) DEFAULT NULL,
  PRIMARY KEY (`Materials_id`),
  UNIQUE KEY `Materials_PK` (`Materials_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of materials
-- ----------------------------

-- ----------------------------
-- Table structure for materialsstore
-- ----------------------------
DROP TABLE IF EXISTS `materialsstore`;
CREATE TABLE `materialsstore` (
  `MaterialsStore_ RepositoryID` int(11) NOT NULL,
  `MaterialsStore _ MaterialsID` int(11) NOT NULL,
  `MaterialsStore_ MaterialsNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaterialsStore_ RepositoryID`,`MaterialsStore _ MaterialsID`),
  KEY `MaterialsStore _ MaterialsID` (`MaterialsStore _ MaterialsID`),
  CONSTRAINT `materialsstore_ibfk_1` FOREIGN KEY (`MaterialsStore_ RepositoryID`) REFERENCES `repository` (`Repository_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `materialsstore_ibfk_2` FOREIGN KEY (`MaterialsStore _ MaterialsID`) REFERENCES `materials` (`Materials_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of materialsstore
-- ----------------------------

-- ----------------------------
-- Table structure for materials_wip
-- ----------------------------
DROP TABLE IF EXISTS `materials_wip`;
CREATE TABLE `materials_wip` (
  `Materials_id` int(11) NOT NULL,
  `Wip_id` int(11) NOT NULL,
  `Material_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`Materials_id`,`Wip_id`),
  KEY `half_compose_FK` (`Materials_id`),
  KEY `half_compose2_FK` (`Wip_id`),
  CONSTRAINT `FK_HALF_COM_HALF_COMP_MATERIAL` FOREIGN KEY (`Materials_id`) REFERENCES `materials` (`Materials_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_HALF_COM_HALF_COMP_WIP` FOREIGN KEY (`Wip_id`) REFERENCES `wip` (`Wip_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of materials_wip
-- ----------------------------

-- ----------------------------
-- Table structure for material_get
-- ----------------------------
DROP TABLE IF EXISTS `material_get`;
CREATE TABLE `material_get` (
  `MaterialsGet_id` int(11) NOT NULL AUTO_INCREMENT,
  `Materials_id` int(11) NOT NULL,
  `Station_id` int(11) NOT NULL,
  `StationGetMaterials_time` timestamp NULL DEFAULT NULL,
  `StationGetMaterials_amount` int(11) DEFAULT NULL,
  `StationGetMaterials_location` int(11) DEFAULT NULL,
  `StationGetMaterials_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaterialsGet_id`),
  KEY `Material_get_FK` (`Materials_id`),
  KEY `Material_get2_FK` (`Station_id`),
  KEY `StationGetMaterials_location` (`StationGetMaterials_location`),
  CONSTRAINT `FK_MATERIAL_MATERIAL__STATION` FOREIGN KEY (`Station_id`) REFERENCES `station` (`Station_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `material_get_ibfk_1` FOREIGN KEY (`Materials_id`) REFERENCES `materials` (`Materials_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `material_get_ibfk_2` FOREIGN KEY (`StationGetMaterials_location`) REFERENCES `repository` (`Repository_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of material_get
-- ----------------------------

-- ----------------------------
-- Table structure for material_stockmanage
-- ----------------------------
DROP TABLE IF EXISTS `material_stockmanage`;
CREATE TABLE `material_stockmanage` (
  `Materials_id` int(11) NOT NULL,
  `Allocation_id` int(11) NOT NULL,
  `Materials_amount` int(11) DEFAULT NULL,
  `Materials_StockDealPersonID` int(11) DEFAULT NULL,
  `Materials_takeMaterialPersonID` int(11) DEFAULT NULL,
  `Materials_bringMaterialPersonID` int(11) DEFAULT NULL,
  `MaterialsStockManage_type` int(11) DEFAULT NULL,
  `MaterialsStockManage_id` varchar(12) NOT NULL,
  `MaterialsStockManage_Date` datetime DEFAULT NULL,
  `Repository_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaterialsStockManage_id`),
  KEY `Material_StockManage_FK` (`Materials_id`),
  KEY `Material_StockManage2_FK` (`Allocation_id`),
  KEY `Repository_id` (`Repository_id`),
  KEY `Materials_StockDealPersonID` (`Materials_StockDealPersonID`),
  CONSTRAINT `FK_MATERIAL_MATERIAL__ALLOCATI` FOREIGN KEY (`Allocation_id`) REFERENCES `allocation` (`Allocation_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_MATERIAL_MATERIAL__MATERIAL` FOREIGN KEY (`Materials_id`) REFERENCES `materials` (`Materials_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `material_stockmanage_ibfk_1` FOREIGN KEY (`Repository_id`) REFERENCES `repository` (`Repository_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `material_stockmanage_ibfk_2` FOREIGN KEY (`Materials_StockDealPersonID`) REFERENCES `staff` (`Staff_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of material_stockmanage
-- ----------------------------

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `Order_id` int(11) NOT NULL AUTO_INCREMENT,
  `Order_beginTime` datetime NOT NULL,
  `Order_endTime` datetime DEFAULT NULL,
  `Order_dealPersonID` int(11) NOT NULL,
  `Order_totalPrice` decimal(10,0) DEFAULT NULL,
  `Order_status` int(11) NOT NULL,
  `Order_notes` varchar(255) DEFAULT NULL,
  `Order_buyer` varchar(255) NOT NULL,
  `Order_buyerContact` varchar(255) NOT NULL,
  `Order_buyerRepresantName` varchar(255) NOT NULL,
  PRIMARY KEY (`Order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for ots
-- ----------------------------
DROP TABLE IF EXISTS `ots`;
CREATE TABLE `ots` (
  `Ots_id` int(11) NOT NULL AUTO_INCREMENT,
  `Category_id` int(11) DEFAULT NULL,
  `Category_name` varchar(50) DEFAULT NULL,
  `Ost_name` varchar(50) NOT NULL,
  `Ost_notes` varchar(70) DEFAULT NULL,
  `Ost_remains` int(11) NOT NULL,
  `Ost_allowed` int(11) NOT NULL,
  `Ost_isLack` smallint(6) NOT NULL,
  PRIMARY KEY (`Ots_id`),
  UNIQUE KEY `Ots_PK` (`Ots_id`),
  KEY `belongto_FK` (`Category_id`,`Category_name`),
  CONSTRAINT `FK_OTS_BELONGTO_CATEGORY` FOREIGN KEY (`Category_id`, `Category_name`) REFERENCES `category` (`Category_id`, `Category_name`)ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ots
-- ----------------------------

-- ----------------------------
-- Table structure for otsstore
-- ----------------------------
DROP TABLE IF EXISTS `otsstore`;
CREATE TABLE `otsstore` (
  `OtsStore_RepositoryID` int(11) NOT NULL,
  `OtsStore_OtsID` int(11) NOT NULL,
  `OtsStore_OtsNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`OtsStore_RepositoryID`,`OtsStore_OtsID`),
  KEY `OtsStore_OtsID` (`OtsStore_OtsID`),
  CONSTRAINT `otsstore_ibfk_1` FOREIGN KEY (`OtsStore_RepositoryID`) REFERENCES `repository` (`Repository_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `otsstore_ibfk_2` FOREIGN KEY (`OtsStore_OtsID`) REFERENCES `ots` (`Ots_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of otsstore
-- ----------------------------

-- ----------------------------
-- Table structure for ots_category
-- ----------------------------
DROP TABLE IF EXISTS `ots_category`;
CREATE TABLE `ots_category` (
  `Ots_id` int(11) NOT NULL,
  `Category_id` int(11) NOT NULL,
  PRIMARY KEY (`Ots_id`,`Category_id`),
  KEY `Category_id` (`Category_id`),
  CONSTRAINT `ots_category_ibfk_1` FOREIGN KEY (`Ots_id`) REFERENCES `ots` (`Ots_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ots_category_ibfk_2` FOREIGN KEY (`Category_id`) REFERENCES `category` (`Category_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ots_category
-- ----------------------------

-- ----------------------------
-- Table structure for ots_stockmanage
-- ----------------------------
DROP TABLE IF EXISTS `ots_stockmanage`;
CREATE TABLE `ots_stockmanage` (
  `Ots_id` int(11) NOT NULL,
  `Allocation_id` int(11) NOT NULL,
  `Ots_amount` int(11) DEFAULT NULL,
  `Ots_StockDealPersonID` int(11) DEFAULT NULL,
  `Ots_takeOtsPersonID` int(11) DEFAULT NULL,
  `Ots_bringOtsPersonID` int(11) DEFAULT NULL,
  `OtsStockManage_type` int(11) DEFAULT NULL,
  `OtsStockmanage_id` varchar(12) NOT NULL,
  `Ots_Date` datetime DEFAULT NULL,
  `Repository_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`OtsStockmanage_id`),
  KEY `Ots_id` (`Ots_id`),
  KEY `Ots_StockDealPersonID` (`Ots_StockDealPersonID`),
  KEY `ots_stockmanage_ibfk_2` (`Allocation_id`),
  KEY `Repository_id` (`Repository_id`),
  CONSTRAINT `ots_stockmanage_ibfk_1` FOREIGN KEY (`Ots_id`) REFERENCES `ots` (`Ots_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ots_stockmanage_ibfk_2` FOREIGN KEY (`Allocation_id`) REFERENCES `allocation` (`Allocation_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ots_stockmanage_ibfk_3` FOREIGN KEY (`Ots_StockDealPersonID`) REFERENCES `staff` (`Staff_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ots_stockmanage_ibfk_4` FOREIGN KEY (`Repository_id`) REFERENCES `repository` (`Repository_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ots_stockmanage
-- ----------------------------

-- ----------------------------
-- Table structure for productsell
-- ----------------------------
DROP TABLE IF EXISTS `productsell`;
CREATE TABLE `productsell` (
  `Ots_id` int(11) NOT NULL,
  `Order_id` int(11) NOT NULL,
  `ProductSell_amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`Ots_id`,`Order_id`),
  KEY `ProductSell_FK` (`Ots_id`),
  KEY `ProductSell2_FK` (`Order_id`),
  CONSTRAINT `productsell_ibfk_1` FOREIGN KEY (`Order_id`) REFERENCES `order` (`Order_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_PRODUCTS_PRODUCTSE_OTS` FOREIGN KEY (`Ots_id`) REFERENCES `ots` (`Ots_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of productsell
-- ----------------------------

-- ----------------------------
-- Table structure for providematerial_period
-- ----------------------------
DROP TABLE IF EXISTS `providematerial_period`;
CREATE TABLE `providematerial_period` (
  `Provider_id` int(11) NOT NULL,
  `Materials_id` int(11) NOT NULL,
  `ProvideMaterial_period` int(11) DEFAULT NULL,
  `ProvideMaterial_cost` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`Provider_id`,`Materials_id`),
  KEY `ProvideMaterial_period_FK` (`Provider_id`),
  KEY `ProvideMaterial_period2_FK` (`Materials_id`),
  CONSTRAINT `FK_PROVIDEM_PROVIDEMA_MATERIAL` FOREIGN KEY (`Materials_id`) REFERENCES `materials` (`Materials_id`),
  CONSTRAINT `FK_PROVIDEM_PROVIDEMA_PROVIDER` FOREIGN KEY (`Provider_id`) REFERENCES `provider` (`Provider_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of providematerial_period
-- ----------------------------

-- ----------------------------
-- Table structure for provider
-- ----------------------------
DROP TABLE IF EXISTS `provider`;
CREATE TABLE `provider` (
  `Provider_id` int(11) NOT NULL,
  `Provider_name` varchar(20) NOT NULL,
  `Provider_address` varchar(70) NOT NULL,
  `Provider_contact` varchar(20) NOT NULL,
  `Provider_period` int(11) DEFAULT NULL,
  PRIMARY KEY (`Provider_id`),
  UNIQUE KEY `Provider_PK` (`Provider_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of provider
-- ----------------------------

-- ----------------------------
-- Table structure for purchaseorder
-- ----------------------------
DROP TABLE IF EXISTS `purchaseorder`;
CREATE TABLE `purchaseorder` (
  `Materials_id` int(11) DEFAULT NULL,
  `Provider_id` int(11) DEFAULT NULL,
  `PurchaseOrder_id` int(11) NOT NULL AUTO_INCREMENT,
  `PurchaseOrder_beginTime` date DEFAULT NULL,
  `PurchaseOrder_totalprice` float DEFAULT NULL,
  `PurchaseOrder_amount` int(11) DEFAULT NULL,
  `PurchaseOrder_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`PurchaseOrder_id`),
  KEY `PurchaseOrder_FK` (`Materials_id`),
  KEY `PurchaseOrder2_FK` (`Provider_id`),
  CONSTRAINT `FK_PURCHASE_PURCHASEO_MATERIAL` FOREIGN KEY (`Materials_id`) REFERENCES `materials` (`Materials_id`),
  CONSTRAINT `FK_PURCHASE_PURCHASEO_PROVIDER` FOREIGN KEY (`Provider_id`) REFERENCES `provider` (`Provider_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of purchaseorder
-- ----------------------------

-- ----------------------------
-- Table structure for repository
-- ----------------------------
DROP TABLE IF EXISTS `repository`;
CREATE TABLE `repository` (
  `Repository_id` int(11) NOT NULL AUTO_INCREMENT,
  `Repository_address` varchar(30) NOT NULL,
  `Repository_manageID` int(11) DEFAULT NULL,
  PRIMARY KEY (`Repository_id`),
  UNIQUE KEY `Repository_PK` (`Repository_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of repository
-- ----------------------------

-- ----------------------------
-- Table structure for staff
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `Staff_id` int(11) NOT NULL AUTO_INCREMENT,
  `Staff_name` varchar(255) NOT NULL,
  `Staff_gender` varchar(255) DEFAULT NULL,
  `Staff_title` varchar(255) NOT NULL,
  `Staff_contact` varchar(255) NOT NULL,
  `Staff_priority` int(11) NOT NULL,
  `Staff_department` int(11) DEFAULT NULL,
  `Staff_station` int(11) DEFAULT NULL,
  PRIMARY KEY (`Staff_id`),
  KEY `Staff_department` (`Staff_department`),
  KEY `Staff_station` (`Staff_station`),
  CONSTRAINT `staff_ibfk_1` FOREIGN KEY (`Staff_department`) REFERENCES `department` (`Department_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `staff_ibfk_2` FOREIGN KEY (`Staff_station`) REFERENCES `station` (`Station_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff
-- ----------------------------

-- ----------------------------
-- Table structure for staff_station
-- ----------------------------
DROP TABLE IF EXISTS `staff_station`;
CREATE TABLE `staff_station` (
  `Staff_id` int(11) NOT NULL,
  `Station_id` int(11) NOT NULL,
  PRIMARY KEY (`Staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff_station
-- ----------------------------

-- ----------------------------
-- Table structure for station
-- ----------------------------
DROP TABLE IF EXISTS `station`;
CREATE TABLE `station` (
  `Station_id` int(11) NOT NULL AUTO_INCREMENT,
  `Station_name` varchar(20) NOT NULL,
  PRIMARY KEY (`Station_id`),
  UNIQUE KEY `Station_PK` (`Station_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of station
-- ----------------------------

-- ----------------------------
-- Table structure for storelog
-- ----------------------------
DROP TABLE IF EXISTS `storelog`;
CREATE TABLE `storelog` (
  `Repository_id` int(11) DEFAULT NULL,
  `Log_id` int(11) NOT NULL AUTO_INCREMENT,
  `Log_amount` int(11) DEFAULT NULL,
  `Log_StockDealPersonID` int(11) DEFAULT NULL,
  `Log_StockManage_type` int(11) DEFAULT NULL,
  `Log_Type` int(11) DEFAULT NULL,
  `Log_Date` datetime DEFAULT NULL,
  `Log_Orderid` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`Log_id`),
  KEY `Repository_id` (`Repository_id`),
  KEY `Log_StockDealPersonID` (`Log_StockDealPersonID`),
  CONSTRAINT `storelog_ibfk_2` FOREIGN KEY (`Log_StockDealPersonID`) REFERENCES `staff` (`Staff_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `storelog_ibfk_1` FOREIGN KEY (`Repository_id`) REFERENCES `repository` (`Repository_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of storelog
-- ----------------------------

-- ----------------------------
-- Table structure for virtualmaterialsstore
-- ----------------------------
DROP TABLE IF EXISTS `virtualmaterialsstore`;
CREATE TABLE `virtualmaterialsstore` (
  `VirtualMaterialsStore_ RepositoryID` int(11) NOT NULL,
  `VirtualMaterialsStore_ MaterialsID` int(11) NOT NULL,
  `VirtualMaterialsStore _OrderID` int(11) NOT NULL,
  `VirtualMaterialsStore_ MaterialsNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`VirtualMaterialsStore_ RepositoryID`,`VirtualMaterialsStore_ MaterialsID`,`VirtualMaterialsStore _OrderID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of virtualmaterialsstore
-- ----------------------------

-- ----------------------------
-- Table structure for virtualotsstore
-- ----------------------------
DROP TABLE IF EXISTS `virtualotsstore`;
CREATE TABLE `virtualotsstore` (
  `VirtualOtsStore_RepositoryID` int(11) NOT NULL,
  `VirtualOtsStore_OtsID` int(11) NOT NULL,
  `VirtualOtsStore_OrderID` int(11) NOT NULL,
  `VirtualOtsStore_OtsNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`VirtualOtsStore_RepositoryID`,`VirtualOtsStore_OtsID`,`VirtualOtsStore_OrderID`),
  KEY `VirtualOtsStore_OtsID` (`VirtualOtsStore_OtsID`),
  KEY `VirtualOtsStore_OrderID` (`VirtualOtsStore_OrderID`),
  CONSTRAINT `virtualotsstore_ibfk_1` FOREIGN KEY (`VirtualOtsStore_RepositoryID`) REFERENCES `repository` (`Repository_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `virtualotsstore_ibfk_2` FOREIGN KEY (`VirtualOtsStore_OtsID`) REFERENCES `ots` (`Ots_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `virtualotsstore_ibfk_3` FOREIGN KEY (`VirtualOtsStore_OrderID`) REFERENCES `order` (`Order_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of virtualotsstore
-- ----------------------------

-- ----------------------------
-- Table structure for virtualwipstore
-- ----------------------------
DROP TABLE IF EXISTS `virtualwipstore`;
CREATE TABLE `virtualwipstore` (
  `VirtualWipStore_RepositoryID` int(11) NOT NULL,
  `VirtualWipStore_WipID` int(11) NOT NULL,
  `VirtualWipStore_OrderID` int(11) NOT NULL,
  `VirtualWipStore_WipNum` int(11) NOT NULL,
  PRIMARY KEY (`VirtualWipStore_RepositoryID`,`VirtualWipStore_WipID`,`VirtualWipStore_OrderID`),
  KEY `VirtualWipStore_WipID` (`VirtualWipStore_WipID`),
  KEY `VirtualWipStore_OrderID` (`VirtualWipStore_OrderID`),
  CONSTRAINT `virtualwipstore_ibfk_1` FOREIGN KEY (`VirtualWipStore_RepositoryID`) REFERENCES `repository` (`Repository_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `virtualwipstore_ibfk_2` FOREIGN KEY (`VirtualWipStore_WipID`) REFERENCES `wip` (`Wip_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `virtualwipstore_ibfk_3` FOREIGN KEY (`VirtualWipStore_OrderID`) REFERENCES `order` (`Order_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of virtualwipstore
-- ----------------------------

-- ----------------------------
-- Table structure for wip
-- ----------------------------
DROP TABLE IF EXISTS `wip`;
CREATE TABLE `wip` (
  `Wip_id` int(11) NOT NULL AUTO_INCREMENT,
  `Wip_name` varchar(50) NOT NULL,
  `Wip_notes` varchar(70) DEFAULT NULL,
  `Wip_remains` int(11) NOT NULL,
  `Wip_allowed` int(11) NOT NULL,
  `Wip_isLack` smallint(6) NOT NULL,
  PRIMARY KEY (`Wip_id`),
  UNIQUE KEY `Wip_PK` (`Wip_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wip
-- ----------------------------

-- ----------------------------
-- Table structure for wipstore
-- ----------------------------
DROP TABLE IF EXISTS `wipstore`;
CREATE TABLE `wipstore` (
  `WipStore _ RepositoryID` int(11) NOT NULL,
  `WipStore WipID` int(11) NOT NULL,
  `WipStore _ WipNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`WipStore _ RepositoryID`,`WipStore WipID`),
  KEY `WipStore WipID` (`WipStore WipID`),
  CONSTRAINT `wipstore_ibfk_1` FOREIGN KEY (`WipStore _ RepositoryID`) REFERENCES `repository` (`Repository_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `wipstore_ibfk_2` FOREIGN KEY (`WipStore WipID`) REFERENCES `wip` (`Wip_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wipstore
-- ----------------------------

-- ----------------------------
-- Table structure for wip_get
-- ----------------------------
DROP TABLE IF EXISTS `wip_get`;
CREATE TABLE `wip_get` (
  `WipGet_id` int(11) NOT NULL,
  `Wip_id` int(11) NOT NULL,
  `Station_id` int(11) NOT NULL,
  `StationGetWip_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `StationGetWip _amount` int(11) NOT NULL,
  `StationGetWip _location` int(11) NOT NULL,
  `StationGetWip_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`WipGet_id`),
  KEY `Wip_get_FK` (`Wip_id`),
  KEY `Wip_get2_FK` (`Station_id`),
  KEY `StationGetWip _location` (`StationGetWip _location`),
  CONSTRAINT `FK_WIP_GET_WIP_GET2_STATION` FOREIGN KEY (`Station_id`) REFERENCES `station` (`Station_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_WIP_GET_WIP_GET_WIP` FOREIGN KEY (`Wip_id`) REFERENCES `wip` (`Wip_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `wip_get_ibfk_1` FOREIGN KEY (`StationGetWip _location`) REFERENCES `repository` (`Repository_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wip_get
-- ----------------------------

-- ----------------------------
-- Table structure for wip_ots
-- ----------------------------
DROP TABLE IF EXISTS `wip_ots`;
CREATE TABLE `wip_ots` (
  `Wip_id` int(11) NOT NULL,
  `Ots_id` int(11) NOT NULL,
  `Wip_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`Wip_id`,`Ots_id`),
  KEY `done_compose_FK` (`Wip_id`),
  KEY `done_compose2_FK` (`Ots_id`),
  CONSTRAINT `FK_DONE_COM_DONE_COMP_OTS` FOREIGN KEY (`Ots_id`) REFERENCES `ots` (`Ots_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_DONE_COM_DONE_COMP_WIP` FOREIGN KEY (`Wip_id`) REFERENCES `wip` (`Wip_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wip_ots
-- ----------------------------

-- ----------------------------
-- Table structure for wip_stockmanage
-- ----------------------------
DROP TABLE IF EXISTS `wip_stockmanage`;
CREATE TABLE `wip_stockmanage` (
  `Wip_id` int(11) NOT NULL,
  `Repository_id` int(11) DEFAULT NULL,
  `Allocation_id` int(11) NOT NULL,
  `Wip_amount` int(11) NOT NULL,
  `Wip_StockDealPersonID` int(11) NOT NULL,
  `Wip_takePersonID` int(11) NOT NULL,
  `WipStockManage_type` int(11) NOT NULL,
  `Wip_bringPersonID` int(11) DEFAULT NULL,
  `WipStockManage_ID` varchar(12) NOT NULL,
  `WipStockManage_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`WipStockManage_ID`),
  KEY `Wip_StockManage_FK` (`Wip_id`),
  KEY `Wip_StockManage2_FK` (`Allocation_id`),
  KEY `Repository_id` (`Repository_id`),
  CONSTRAINT `FK_WIP_STOC_WIP_STOCK_ALLOCATI` FOREIGN KEY (`Allocation_id`) REFERENCES `allocation` (`Allocation_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_WIP_STOC_WIP_STOCK_WIP` FOREIGN KEY (`Wip_id`) REFERENCES `wip` (`Wip_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `wip_stockmanage_ibfk_1` FOREIGN KEY (`Repository_id`) REFERENCES `repository` (`Repository_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wip_stockmanage
-- ----------------------------
