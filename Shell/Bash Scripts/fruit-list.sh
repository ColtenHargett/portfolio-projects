#!/bin/bash

fruits=("apple" "banana" "cherry")

while [ ${#fruits[@]} -lt 6 ]
do
    echo "Current Fruits:"
    echo "${fruits[@]}"
    echo -n "Next fruit? "
    read newFruit
    echo
    fruits+=("$newFruit")
done

echo "All Fruits:"
for fruit in "${fruits[@]}"
do
    echo "$fruit"
done
