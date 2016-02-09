namespace java com.dataluminosity.privacy.message

enum SensorType {
    LOCATION,
    GYROSCOPE,
    ACCELEROMETER,
    MAGNETOMETER,
    PROXIMITY,
    BRIGHTNESS,
    SOUNDLEVEL
}

enum MatchingType {
     LOCATION_MATCHING,  // range element value would be latitude,longitude,radius,description
     NUMERICAL_MATCHING, // range element value would be 0,4
     STRING_MATCHING     // range element value would be google.com
}

struct QueryVector {
    1: list<string> ranges
}

struct Query {
    1: i64 analystId,
    2: i64 queryId,
    3: i64 queryStartTime,
    4: i64 queryEndTime,
    5: i64 epoch,        //in milliseconds
    6: SensorType sensorType,
    7: MatchingType matchingType,
    8: QueryVector queryVector,
    9: double epsilon,
    10: string flipOne,
    11: string flipTwo,
    12: i64 versionId
}

