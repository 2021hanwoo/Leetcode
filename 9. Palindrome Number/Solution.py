class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False        #return False if the input is a negative number
        out = True              #Initialize a return variable
        num = str(x)            #Obtain a string version of the input string
        length = len(num)       #Store the length of the string as a variable (somewhat unnecessary)
        for i in range(length/2):           #For half the length of the string
            if num[i] != num[length-1-i]:   #If the character of a certain position of the string is not equal to the opposite side.
                out = False     #Change the output variable to false as it's not a palindrome
        return out