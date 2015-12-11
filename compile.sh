#!/bin/bash -ev

ls *.thrift |
while read line;do
    thrift -r --gen py ${line}
    thrift -r --gen java ${line}
    thrift -r --gen cocoa ${line}
done

