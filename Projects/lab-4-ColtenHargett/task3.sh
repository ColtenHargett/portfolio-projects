#!/bin/bash
echo "Type stop to end"
input=""

while [[ $input != "stop" ]]; do
	read input
	echo "You entered: $input"
done
