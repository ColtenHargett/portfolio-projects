#!/bin/bash

cd $1

for file in "$DIRECTORY"/*."$2"; do
	echo $file
	head -1 $file
	tail -1 $file
done

