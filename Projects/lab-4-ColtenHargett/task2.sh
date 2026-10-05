#!/bin/bash

if [[ -f $1 ]]; then
	echo "File exists!"
elif [[ -d $1 ]]; then
	echo "Directory exists!"
else
	echo "File not found!"
fi
