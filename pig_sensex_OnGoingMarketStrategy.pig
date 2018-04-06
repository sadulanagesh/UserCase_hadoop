sensexdata = LOAD '/sensex/MapR/Output/HighDemandMarket-r-00000' USING PigStorage(',') as (SENSEX_ID:int,SENSEX_NAME:chararray,TYPEOF_TRADING:chararray,LOCATION:chararray,OPENING_BALANCE:int,CLOSING_BALANCE:int,FLUTUATION_RATE:int);
grp_data = GROUP sensexdata BY LOCATION;
top400_data = FOREACH grp_data {
	sort_data = ORDER sensexdata BY FLUTUATION_RATE desc;
	topdata = LIMIT sort_data 400;
	GENERATE group,FLATTEN(topdata); 
};
STORE top400_data INTO '/sensex/pig/Output/HighDemandMarket';
