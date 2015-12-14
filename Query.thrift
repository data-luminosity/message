namespace java com.dataluminosity.message

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
     LOCATION_MATCHING,  // range element value would be latitude,longitude,z,radius
     NUMERICAL_MATCHING, // range element value would be 0,4
     STRING_MATCHING     // range element value would be google.com
}

struct QueryVector {
    1: SensorType sensorType,
    2: MatchingType matchingType,
    3: list<string> ranges
}

struct Query {
    1: i64 analystId,
    2: i64 queryId,
    3: i64 queryStartTime,
    4: i64 queryEndTime,
    5: i64 epoch,        //in milliseconds
    6: SensorType queryType,
    7: double epsilon,
    8: QueryVector queryVector,
    9: string flipOne,
    10: string flipTwo,
    11: i64 versionId
}

