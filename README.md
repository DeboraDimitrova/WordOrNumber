# WordOrNumber
You are given an integer number n and then n new lines of text: numbers or words. This time we concatenate words (with a dash - between them) only if they are adjacent. And we add numbers only when they are adjacent. Each time we have a number after a word we print the concatenated words so far and go on a new line. Each time we have a word after a number we print the sum so far and go on the next line.

The input starts by the number n (alone in a line) followed by n lines, each holding a text without a space.
Again all words contain no digits.
The output is like in the examples below.

input: 9, try, google, it, 2, plus, 2, =, 52, -10
output: try-google-it, 2, plus, 2, =, 42
