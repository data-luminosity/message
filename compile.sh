#!/bin/bash -ev

ls *.thrift |
while read line;do
    rm -rf query_privateanswer
    mkdir query_privateanswer
    thrift -out query_privateanswer -r --gen py ${line}
    thrift -r --gen java ${line}
    thrift -r --gen cocoa ${line}
    thrift -r --gen go ${line}
done

