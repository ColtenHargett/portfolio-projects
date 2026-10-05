## Recursive Method Design

**Method Name:** `isPalindrome`  
**Parameters:** `String word`  
**Return Type:** `boolean`

### Base Case
1. If the length of `word` is less than or equal to `1`, return `true`.

### General Case
1. Convert `word` to lowercase and save it to `lowerCaseWord`.
2. Get the first character of `lowerCaseWord` and save it to `firstChar`.
3. Get the last character of `lowerCaseWord` and save it to `lastChar`.
4. If `firstChar` is not equal to `lastChar`, return `false`.
5. Otherwise, get the substring from index `1` to `lowerCaseWord.length() - 1` and save it to `middleWordSubstring`.
6. Return the result of `isPalindrome(middleWordSubstring)`.