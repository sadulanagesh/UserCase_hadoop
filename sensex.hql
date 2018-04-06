--Set Dynamic Partition

set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;

drop table if exists HighDemandMarket;
drop table if exists HighDemandMarket_PART;

drop table if exists onGoingMarketdata;
drop table if exists onGoingMarketdata_PART;

drop table if exists reliableProductsdata;
drop table if exists reliableProductsdata_PART;

drop table if exists wealthyProductsdata;
drop table if exists wealthyProductsdata_PART;

drop table if exists reliableProductsdata;
drop table if exists reliableProductsdata_PART;

create external table if not exists HighDemandMarket(SENSEX_ID int,SENSEX_NAME varchar(500),TYPEOF_TRADING varchar(500),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int) 
row format delimited 
fields terminated by '\t' 
location '/sensex/pig/Output/HighDemandMarket';

create table if not exists HighDemandMarket_PART(SENSEX_ID int,SENSEX_NAME varchar(500),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int) 
PARTITIONED BY (TYPEOF_TRADING string)
row format delimited 
fields terminated by '\t';

INSERT OVERWRITE TABLE HighDemandMarket_PART PARTITION(TYPEOF_TRADING="SIP") SELECT SENSEX_ID ,SENSEX_NAME ,LOCATION ,OPENING_BALANCE ,CLOSING_BALANCE ,FLUTUATION_RATE 
FROM HighDemandMarket;

create external table if not exists onGoingMarketdata(SENSEX_ID int,SENSEX_NAME varchar(500),TYPEOF_TRADING varchar(500),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int) 
row format delimited 
fields terminated by '\t' 
location '/sensex/pig/Output/onGoingMarketdata';

create table if not exists onGoingMarketdata_PART(SENSEX_ID int,SENSEX_NAME varchar(500),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int) 
PARTITIONED BY (TYPEOF_TRADING string)
row format delimited 
fields terminated by '\t' ;

INSERT OVERWRITE TABLE onGoingMarketdata_PART PARTITION(TYPEOF_TRADING="SIP") SELECT SENSEX_ID ,SENSEX_NAME ,LOCATION ,OPENING_BALANCE ,CLOSING_BALANCE ,FLUTUATION_RATE 
FROM onGoingMarketdata;


create external table if not exists onGoingMarketdata(SENSEX_ID int,SENSEX_NAME varchar(500),TYPEOF_TRADING varchar(500),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int) 
row format delimited 
fields terminated by '\t' 
location '/sensex/pig/Output/onGoingMarketdata';

create table if not exists onGoingMarketdata_PART(SENSEX_ID int,SENSEX_NAME varchar(500),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int) 
PARTITIONED BY (TYPEOF_TRADING string)
row format delimited 
fields terminated by '\t' ;

INSERT OVERWRITE TABLE onGoingMarketdata_PART PARTITION(TYPEOF_TRADING) SELECT SENSEX_ID ,SENSEX_NAME ,LOCATION ,OPENING_BALANCE ,CLOSING_BALANCE ,FLUTUATION_RATE,TYPEOF_TRADING 
FROM onGoingMarketdata;

create external table if not exists reliableProductsdata(SENSEX_ID int,SENSEX_NAME varchar(500),TYPEOF_TRADING varchar(500),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int) 
row format delimited 
fields terminated by '\t' 
location '/sensex/pig/Output/reliableProductsdata';

create table if not exists reliableProductsdata_PART(SENSEX_ID int,SENSEX_NAME varchar(500),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int) 
PARTITIONED BY (TYPEOF_TRADING string)
row format delimited 
fields terminated by '\t' ;

INSERT OVERWRITE TABLE reliableProductsdata_PART PARTITION(TYPEOF_TRADING) SELECT SENSEX_ID ,SENSEX_NAME ,LOCATION ,OPENING_BALANCE ,CLOSING_BALANCE ,FLUTUATION_RATE,TYPEOF_TRADING 
FROM reliableProductsdata;

create external table if not exists wealthyProductsdata(SENSEX_ID int,SENSEX_NAME varchar(500),TYPEOF_TRADING varchar(500),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int) 
row format delimited 
fields terminated by '\t' 
location '/sensex/pig/Output/wealthyProductsdata';

create table if not exists wealthyProductsdata_PART(SENSEX_ID int,SENSEX_NAME varchar(500),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int) 
PARTITIONED BY (TYPEOF_TRADING string)
row format delimited 
fields terminated by '\t' ;

INSERT OVERWRITE TABLE wealthyProductsdata_PART PARTITION(TYPEOF_TRADING) SELECT SENSEX_ID ,SENSEX_NAME ,LOCATION ,OPENING_BALANCE ,CLOSING_BALANCE ,FLUTUATION_RATE,TYPEOF_TRADING 
FROM wealthyProductsdata;

create external table if not exists otherProductsdata(SENSEX_ID int,SENSEX_NAME varchar(500),TYPEOF_TRADING varchar(500),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int) 
row format delimited 
fields terminated by '\t' 
location '/sensex/pig/Output/otherProductsdata';

create table if not exists otherProductsdata_PART(SENSEX_ID int,SENSEX_NAME varchar(500),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int) 
PARTITIONED BY (TYPEOF_TRADING string)
row format delimited 
fields terminated by '\t' ;

INSERT OVERWRITE TABLE otherProductsdata_PART PARTITION(TYPEOF_TRADING) SELECT SENSEX_ID ,SENSEX_NAME ,LOCATION ,OPENING_BALANCE ,CLOSING_BALANCE ,FLUTUATION_RATE,TYPEOF_TRADING 
FROM otherProductsdata;

