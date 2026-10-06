# Bash Scripts

A set of small command-line tools written in Bash, covering arguments, input validation, loops, arrays, functions and file handling.

---

## Scripts

| Script | What it does |
|---|---|
| `calculator.sh` | `./calculator.sh 6 x 7` → does integer math (`+ - x / %`) and names the operation. Rejects anything else with a usage message. |
| `count-extensions.sh` | Lists every unique file extension in a directory and counts them. Defaults to the current directory. |
| `preview-files.sh` | `./preview-files.sh <dir> <ext>` → prints the first and last line of every matching file. |
| `check-path.sh` | Tells you whether a path is a file, a directory, or doesn't exist. |
| `make-file.sh` | Moves into a directory, asks for a filename and creates it, with an error if the directory doesn't exist. |
| `fruit-list.sh` | Grows an array from user input until it has six items, then prints them. |
| `introductions.sh` | Uses a function and `shift` to process any number of name/age/city triples from the arguments. |
| `.bash_profile` | My shell setup: aliases for `ls`, `git status`, and a safer `rm -i`. |

---

## Example

```
$ ./calculator.sh 6 x 7
Multiplication:
42

$ ./count-extensions.sh "../Text Processing/data"
txt
sh
csv
xml
You have 4 unique extensions in ../Text Processing/data
```

---

## Concepts used

- Positional arguments (`$1`, `$#`, `$@`) and `shift`
- `if` / `elif` tests on numbers, strings, files and directories
- `for` and `while` loops, including loops over globs
- Arrays, functions and parameter expansion (`${file##*/}`, `${name#*.}`)
- Arithmetic expansion and exit codes
