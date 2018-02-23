# Input-Output Tasks
by Dacharat Pankong (5910546643)
I ran the tasks on a HP-ProBook with 2.8Ghz i5-6200U,
and got these results:

Task                                          |  Time
----------------------------------------------|-------:
Read file 1-char at a time to String          | 0.931797 sec
Read file 1-char at a time to StringBuilder   | 0.020275 sec
Read file line at a time using BufferedReader | 0.035683 sec

## Explanation of Results

- String is the slowest for read file because all the time that you read file
to String, it will create new String that will consume memory and time.

- BufferedReader is slower that use StringBuilder because it read file by using
BufferedReader but it correct data in String that will make it slower.

- StringBuilder is the fastest because StringBuilder will use internally an array of chars and when you use .append() method it will check if it have any space for the string to append and copy the chars of the string in the array.
