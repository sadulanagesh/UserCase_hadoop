highDemanddata = LOAD '/sensex/MapR/Output/HighDemandMarket-r-00000' USING PigStorage(',') as (SENSEX_ID:int,SENSEX_NAME:chararray,TYPEOF_TRADING:chararray,LOCATION:chararray,OPENING_BALANCE:int,CLOSING_BALANCE:int,FLUTUATION_RATE:int);

onGoingMarketdata = LOAD '/sensex/MapR/Output/OnGoingMarketStrategy-r-00000' USING PigStorage(',') as (SENSEX_ID:int,SENSEX_NAME:chararray,TYPEOF_TRADING:chararray,LOCATION:chararray,OPENING_BALANCE:int,CLOSING_BALANCE:int,FLUTUATION_RATE:int);

reliableProductsdata = LOAD '/sensex/MapR/Output/Reliable Products-r-00000' USING PigStorage(',') as (SENSEX_ID:int,SENSEX_NAME:chararray,TYPEOF_TRADING:chararray,LOCATION:chararray,OPENING_BALANCE:int,CLOSING_BALANCE:int,FLUTUATION_RATE:int);

wealthyProductsdata = LOAD '/sensex/MapR/Output/Wealthy Products-r-00000' USING PigStorage(',') as (SENSEX_ID:int,SENSEX_NAME:chararray,TYPEOF_TRADING:chararray,LOCATION:chararray,OPENING_BALANCE:int,CLOSING_BALANCE:int,FLUTUATION_RATE:int);

otherProductsdata = LOAD '/sensex/MapR/Output/Other Products-r-00000' USING PigStorage(',') as (SENSEX_ID:int,SENSEX_NAME:chararray,TYPEOF_TRADING:chararray,LOCATION:chararray,OPENING_BALANCE:int,CLOSING_BALANCE:int,FLUTUATION_RATE:int);

grp_highdemand = GROUP highDemanddata BY LOCATION;
top400_highdemand = FOREACH grp_highdemand {
	sort_highdemand = ORDER highDemanddata BY FLUTUATION_RATE desc;
	tophighdemand = LIMIT sort_highdemand 400;
	GENERATE FLATTEN(tophighdemand); 
};
STORE top400_highdemand INTO '/sensex/pig/Output/HighDemandMarket';

grp_onGoing = GROUP onGoingMarketdata BY LOCATION;
top400_onGoing = FOREACH grp_onGoing {
	sort_onGoing = ORDER onGoingMarketdata BY FLUTUATION_RATE desc;
	toponGoing = LIMIT sort_onGoing 400;
	GENERATE FLATTEN(toponGoing); 
};
STORE top400_onGoing INTO '/sensex/pig/Output/onGoingMarketdata';

grp_reliable = GROUP reliableProductsdata BY LOCATION;
top400_reliable = FOREACH grp_reliable {
	sort_reliable = ORDER reliableProductsdata BY FLUTUATION_RATE desc;
	topreliable = LIMIT sort_reliable 400;
	GENERATE FLATTEN(topreliable); 
};
STORE top400_reliable INTO '/sensex/pig/Output/reliableProductsdata';

grp_wealthy = GROUP wealthyProductsdata BY LOCATION;
top400_wealthy = FOREACH grp_wealthy {
	sort_wealthy = ORDER wealthyProductsdata BY FLUTUATION_RATE desc;
	topwealthy = LIMIT sort_wealthy 400;
	GENERATE FLATTEN(topwealthy); 
};
STORE top400_wealthy INTO '/sensex/pig/Output/wealthyProductsdata';

grp_other = GROUP otherProductsdata BY LOCATION;
top400_other = FOREACH grp_other {
	sort_other = ORDER otherProductsdata BY FLUTUATION_RATE desc;
	topother = LIMIT sort_other 400;
	GENERATE FLATTEN(topother); 
};
STORE top400_other INTO '/sensex/pig/Output/otherProductsdata';

