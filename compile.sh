#!/bin/bash -ev

rm -rf query_privateanswer
mkdir query_privateanswer

ls *.thrift |
while read line;do
    thrift -out query_privateanswer -r --gen py ${line}
    thrift -r --gen java ${line}
    thrift -r --gen cocoa ${line}
    thrift -r --gen go ${line}
done

