namespace java com.dataluminosity.privacy.message

struct PrivateAnswer {
    1: i64 analystId,
    2: i64 queryId,
    3: binary privateAnswerBits,
    4: i32 bitlen,
    5: i64 joinId,
    6: i64 versionId
}
