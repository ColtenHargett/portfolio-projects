#!/bin/bash

if [[ $# -eq 3 ]]; then
	echo "It's a magic number"
elif [[ $# -lt 3 ]]; then
	echo "More power!"
else
	echo "Too much!"
fi
	
