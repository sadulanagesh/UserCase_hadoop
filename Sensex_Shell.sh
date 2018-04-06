#cd sensex

hdfs dfs -rm -r /sensex/input
hdfs dfs -mkdir -p /sensex/input

hdfs dfs -put SENSEXDATA.csv /sensex/input

hdfs dfs -rm -r /sensex/MapR/Output
hdfs dfs -rm -r /sensex/out
yarn jar Sensex_MR_Csv.jar com/hadoop/sensexcsv/Sensex_MR_Csv /sensex/input/SENSEXDATA.csv /sensex/out

#=========================================================
#======================= Pig =============================

echo "Pig Execution Starts Here"

hdfs dfs -rm -r /sensex/pig/Output/HighDemandMarket
hdfs dfs -rm -r /sensex/pig/Output/onGoingMarketdata
hdfs dfs -rm -r /sensex/pig/Output/reliableProductsdata
hdfs dfs -rm -r /sensex/pig/Output/wealthyProductsdata
hdfs dfs -rm -r /sensex/pig/Output/otherProductsdata

pig pig_sensex_HighDemand.pig

echo 'Pig Execution Stops Here'

#======================= Pig ============================
#========================================================

#========================================================
#======================= mysql ==========================

echo "Mysql Execution Starts Here"

sqoop eval -connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --query "create database sensexdb;";
sqoop eval -connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --query "use sensexdb;";

sqoop eval -connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --query "drop table if exists HighDemandMarket;";
sqoop eval -connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --query "drop table if exists onGoingMarketdata;";
sqoop eval -connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --query "drop table if exists reliableProductsdata;";
sqoop eval -connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --query "drop table if exists wealthyProductsdata;";
sqoop eval -connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --query "drop table if exists otherProductsdata;";

sqoop eval -connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --query "create table if not exists HighDemandMarket(SENSEX_ID int,SENSEX_NAME varchar(500),TYPEOF_TRADING varchar(250),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int);";

sqoop eval -connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --query "create table if not exists onGoingMarketdata(SENSEX_ID int,SENSEX_NAME varchar(500),TYPEOF_TRADING varchar(250),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int);";

sqoop eval -connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --query "create table if not exists reliableProductsdata(SENSEX_ID int,SENSEX_NAME varchar(500),TYPEOF_TRADING varchar(250),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int);";

sqoop eval -connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --query "create table if not exists wealthyProductsdata(SENSEX_ID int,SENSEX_NAME varchar(500),TYPEOF_TRADING varchar(250),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int);";

sqoop eval -connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --query "create table if not exists otherProductsdata(SENSEX_ID int,SENSEX_NAME varchar(500),TYPEOF_TRADING varchar(250),LOCATION varchar(250),OPENING_BALANCE int,CLOSING_BALANCE int,FLUTUATION_RATE int);";

echo "Mysql Execution Stops Here"

#======================= mysql ==========================
#========================================================



#========================================================
#======================= sqoop ==========================

echo "Sqoop Execution Starts Here"

sqoop export --connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --table HighDemandMarket --export-dir /sensex/pig/Output/HighDemandMarket/part-r-00000 --fields-terminated-by '\t';

sqoop export --connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --table onGoingMarketdata --export-dir /sensex/pig/Output/onGoingMarketdata/part-r-00000 --fields-terminated-by '\t';

sqoop export --connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --table reliableProductsdata --export-dir /sensex/pig/Output/reliableProductsdata/part-r-00000 --fields-terminated-by '\t';

sqoop export --connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --table wealthyProductsdata --export-dir /sensex/pig/Output/wealthyProductsdata/part-r-00000 --fields-terminated-by '\t';

sqoop export --connect jdbc:mysql://localhost:3306/sensexdb --username root --password root --table otherProductsdata --export-dir /sensex/pig/Output/otherProductsdata/part-r-00000 --fields-terminated-by '\t';

echo "Sqoop Execution Stops Here"

#======================= sqoop ==========================
#========================================================

#========================================================
#======================= hbase ==========================



#======================= hbase ==========================
#========================================================

#========================================================
#======================= hive ==========================

hive -e "sensex.hql";

#======================= hive ==========================
#========================================================
