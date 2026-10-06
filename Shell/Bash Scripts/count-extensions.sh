#!/bin/bash

if [ $# -eq 0 ]; then
    dir="."
    echo "No directory provided, using current working directory."
else
    dir=$1
fi

if [ ! -d "$dir" ]; then
    echo "Error: $dir is not a valid directory."
    exit 1
fi

extensions=()

for file in "$dir"/*; do
    if [ -f "$file" ]; then
        name=${file##*/}
        ext=${name#*.}

        if [ "$name" != "$ext" ]; then
            exists=0

            for item in "${extensions[@]}"; do
                if [ "$item" = "$ext" ]; then
                    exists=1
                fi
            done

            if [ $exists -eq 0 ]; then
                extensions+=("$ext")
            fi
        fi
    fi
done

for item in "${extensions[@]}"; do
    echo "$item"
done

echo "You have ${#extensions[@]} unique extensions in $dir"
