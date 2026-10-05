#!/bin/bash

introduction() {
    echo "My name is $1, I am $2 years old and I am from $3."
}

introduction "Amina" 26 "Cairo"
introduction "Hiroshi" 33 "Tokyo"

while [ "$#" -gt 0 ]
do
    introduction "$1" "$2" "$3"
    shift
    shift
    shift
done
