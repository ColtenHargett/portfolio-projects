#!/bin/bash

greet() {
    echo "Hello, $1!"
}

greet "Alice"
greet "Bob"
greet "Charlie"

for name in "$@"
do
    greet "$name"
done
