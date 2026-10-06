# Text Processing

One-line solutions to real data-cleaning problems using the classic Unix tools: `grep`, `sed`, `awk`, `tr`, `sort` and `uniq`. Every command below runs against the sample files in [`data/`](data).

---

## Word frequency (`tr`, `sort`, `uniq`)

Top 10 most common words in an article, in one pipeline:

```bash
cat global.txt | tr ' ' '\n' | tr 'A-Z' 'a-z' | sort | uniq -c | sort -nr | head -10
```

Split into one word per line, lowercase, count duplicates, sort by count, keep the top 10.

---

## Searching logs (`grep`)

```bash
grep "ERROR" logfile.txt                 # every error line
grep -i "warning" logfile.txt            # warnings, any capitalization
grep -iv "success" logfile.txt | wc -l   # count lines that aren't successes
```

---

## Validating times with a regex (`grep -E`)

Keep only valid 12-hour times like `07:20pm`, and reject things like `13:20am` or `10:80pm`:

```bash
grep -E '^(0[0-9]|1[0-2]):[0-5][0-9](am|pm)$' time.txt
```

---

## Finding 7-letter palindromes (`grep` back-references)

```bash
grep -Ew '^(.)(.)(.)(.)(\3)(\2)(\1)$' /usr/share/dict/words
```

Each `( )` captures a letter, and `\3 \2 \1` require the same letters in reverse. It finds words like *racecar*, *reviver* and *rotator*.

---

## Finding files anyone can read (`ls` + `grep`)

```bash
ls -l | grep '^.......r..'
```

The 8th character of the permission string is the "other" read bit.

---

## Cleaning XML (`sed`)

Strip every tag and blank line from a weather feed, leaving just the values:

```bash
sed '/^[[:space:]]*$/d; s/<[^>]*>//g' weather.xml
```

---

## Normalizing phone numbers (`sed -E`)

The gradebook mixes `738-323-1233` and `(921) 756-3834`. One substitution makes them all `###-###-####`:

```bash
sed -E 's/\(?([0-9]{3})\)?[ -]?([0-9]{3})[ -]?([0-9]{4})/\1-\2-\3/' gradebook.txt
```

---

## Other `sed` basics

```bash
sed '/^#/d' hello.sh               # delete comment lines
sed 's/Zeus/Colten/g' myth.txt     # replace every match
```

---

## Movie profits (`awk`)

Drop movies with missing box-office data, and add a profit column:

```bash
awk -F, 'BEGIN{OFS=","} NR == 1 {print $1,$2,$3,$4,$5,"profit"}
         NR > 1 && $4 != 0 && $5 != 0 {print $1,$2,$3,$4,$5,$5-$3}' movies.csv
```

Average profit across the 580 movies with complete data (about **$318 million**):

```bash
awk -F, 'NR > 1 && $4 != 0 && $5 != 0 {sum += ($5-$3); count++} END {print sum/count}' movies.csv
```

---

## Fixing Windows line endings (`tr`)

`windows.sh` was saved on Windows with `\r\n` line endings, so Bash can't run it. Deleting the carriage returns fixes it:

```bash
tr -d '\r' < windows.sh > linux.sh
```
