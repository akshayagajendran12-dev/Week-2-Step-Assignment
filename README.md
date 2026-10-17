# Week-2-Step-Assignment
Java String Manipulation Assignment
Question 2: Word Reversal Encoder

File: WordReversalEncoder.java

Algorithm
Start.
Read a sentence from the user.
Split the sentence into words using split(" ").
Create a StringBuilder to store the result.
Traverse each word using a loop.
Reverse each word using StringBuilder.reverse().
Append the reversed word to the result, adding spaces between words.
Print the final reversed sentence.
Stop.
Question 3: Product Inventory CSV Parser

File: ProductInventoryCSVParser.java

Algorithm
Start.
Read a CSV record containing the product name, SKU, and quantity.
Split the input using split(",", -1).
Check whether the record contains exactly three fields.
If the number of fields is not three, print Invalid Record and stop processing.
Remove leading and trailing spaces from each field.
Check whether any field is empty.
If any field is empty, print Invalid Record.
Otherwise, print the product name, SKU, and quantity in the required format.
Stop.
Question 4: Library ISBN Normalizer & Validator

File: LibraryISBNNormalizerValidator.java

Algorithm
Start.
Read the ISBN-style code from the user.
Remove leading and trailing spaces using trim().
Check whether the string contains at least three characters.
Convert the first three characters to uppercase using substring() and toUpperCase().
Combine the uppercase prefix with the remaining characters.
Check whether the normalized code contains exactly 13 characters.
Verify that the first three characters are letters using Character.isLetter().
Verify that the remaining ten characters are digits using Character.isDigit().
If any validation fails, print the appropriate error message.
Otherwise, print the normalized and validated code.
Stop.
Question 5: Stop-Word-Filtered Word Frequency Report

File: StopWordFilteredWordFrequencyReport.java

Algorithm
Start.
Read a feedback paragraph from the user.
Convert the paragraph to lowercase.
Remove punctuation using replaceAll().
Split the cleaned paragraph into words using split("\\s+").
Create a set containing the stop words: the, was, and, a, is, of, and in.
Create a HashMap to store words and their frequencies.
Traverse each word in the paragraph.
Skip empty words and words present in the stop-word set.
Count the occurrences of each remaining word using the HashMap.
Convert the map entries into a list.
Sort the list by frequency in descending order.
Print each unique word and its frequency.
Stop.
Concepts Covered
String manipulation
split(), trim(), and substring()
StringBuilder and reverse()
Loops and conditional statements
Arrays and array-length validation
Character.isLetter() and Character.isDigit()
String concatenation and formatted output
HashSet and HashMap
Word frequency counting and sorting
