import re
# now we'll talk about the special sequences used in the reg expression
txt="hello A quick fox is juming inside the forest in the hello uttarakhand"
txtj="hello A quick fox is juming inside the forest in the  56 hello uttarakhand"
# ^ --> starts with
print(re.findall("^hell",txt))

# "\b"--> returns a match where a specified string is at the start or end of a string txt
#r"..."" ->> it just show the stirng is raw
print(re.findall(r"\bhell",txt))# for begiaing

print(re.findall(r"and\b",txt))#for the end

# \B--> return a match wehre a specified string is in the txt or not but not in the beganing of the word
print(re.findall(r"\Box",txt))
# \B--> return a match wehre a specified string is in the txt or not but not in the end of the word
print(re.findall(r"and\B",txt))
print(re.findall(r"utt\B",txt))

#\d -> return match if there is a digit in the txt
print(re.findall("\d",txtj))
#\D -> return match if there is not Digit in the txt
print(re.split("\D",txt))
print(re.split("\D",txtj))
# \s	Returns a match where the string contains a white space character
# \S	Returns a match where the string DOES NOT contain a white space character

#"\W"
#Return a match at every NON word character
#  (characters NOT between a and Z. Like "!", "?" white-space etc.):

#"\Z"--> check if the string ends with specific chars or not
print(re.findall("\W",txt))

txtr = "The rain in Spain"

#Check if the string ends with "Spain":

x = re.findall("Spain\Z", txtr)

print(x)

if x:
  print("Yes, there is a match!")
else:
  print("No match")

