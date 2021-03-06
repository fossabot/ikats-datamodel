# ![IKATS Logo](https://ikats.github.io/img/Logo-ikats-icon.png) IKATS Datamodel

![Docker Automated build](https://img.shields.io/docker/automated/ikats/datamodel.svg)
![Docker Build Status](https://img.shields.io/docker/build/ikats/datamodel.svg)
![MicroBadger Size](https://img.shields.io/microbadger/image-size/ikats/datamodel.svg)
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2FIKATS%2Fikats-datamodel.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2FIKATS%2Fikats-datamodel?ref=badge_shield)

**An overview of IKATS global architecture is available [here](https://github.com/IKATS/IKATS)**

IKATS datamodel provides the TemporalDataManager web application to IKATS, deployed in a Tomcat server to access following IKATS resources:  

On PostgreSQL database:
* Metadata
* Dataset
* Table
* MacroOperator
* ProcessData
* Workflow  

On OpenTSDB database:
* TimeSeries (used by [ikats-ingestion](https://github.com/IKATS/ikats-ingestion) but not by [ikats-pyalgo](https://github.com/IKATS/ikats-pyalgo) which has its own connector)

Resources can be accessed through an HTTP API, including IKATS operators dealing with non temporal data.  

List of java operators at the moment:  
(see [python operators](https://github.com/IKATS/ikats-pyalgo) for other operators provided in IKATS)


## Dataset Preparation
 

### Import Export

- [Import TS](/doc/operators/importTs.html)
- [Import Metadata](/doc/operators/importMetadata.html)
 
### Dataset Management

- [Dataset Selection](/doc/operators/datasetSelection.html)
- [Manual Selection](/doc/operators/manualSelection.html)
- [TS Finder](/doc/operators/tsFinder.html)
- [Filter](/doc/operators/filter.html)
- [Merge TS lists](/doc/operators/mergeTsLists.html)
- [Save as a Dataset](/doc/operators/saveAsDataset.html)
 

## Pre-Processing on Ts 

 
### Transforming

- [Ts2Feature](/doc/operators/ts2Feature.html)
- [Discretize](/doc/operators/discretize.html)

 
 ## Processing On Tables

- [Read Table](/doc/operators/readTable.html)
- [TrainTestSplit](/doc/operators/trainTestSplit.html)
- [Merge Tables](/doc/operators/mergeTables.html)
- [Population Selection](/doc/operators/populationSelection.html)


## License
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2FIKATS%2Fikats-datamodel.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2FIKATS%2Fikats-datamodel?ref=badge_large)