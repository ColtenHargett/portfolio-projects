#!/bin/bash

echo "Welcome! Let's create a file."

cd "$1" || {
    echo "Directory not found!"
    exit 1
}

echo "Enter the name of the file you want to create:"
read filename

touch "$filename"

echo "File '$filename' created in $(pwd)"
