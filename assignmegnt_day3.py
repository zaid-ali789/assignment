vowels=['a','e','i','o','u','A','E','I','O','U']
def inp():
    string=input("Enter a string")
    result=""
    for i in range(len(string)):
        if string[i] not in vowels:
            result=result+string[i]
    print(result)
inp()    
