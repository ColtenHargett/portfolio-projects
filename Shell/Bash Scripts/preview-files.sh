#!/bin/bash
# Usage: ./preview-files.sh <directory> <extension>
# Prints the first and last line of every file with that extension.

if [[ $# -ne 2 ]]; then
	echo "Usage: $0 <directory> <extension>"
	exit 1
fi

for file in "$1"/*."$2"; do
	[[ -f $file ]] || continue
	echo "== $file"
	head -1 "$file"
	tail -1 "$file"
done
