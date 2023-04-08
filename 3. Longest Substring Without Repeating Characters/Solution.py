class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        maxval = 0          #Initialize a return variable
        pt1 = 0             #Initialize a second pointer that stores the starting index of the current substring
        dictionary = {}     #Create an empty dictionary to keep track of each character's most recent index
        for pt2 in range(len(s)):   #Cycle through all characters in the string, and initialize the first pointer
            if not(s[pt2] in dictionary):    
                dictionary[s[pt2]] = pt2        #Add as a new element in the dictionary if the character was not there before
            else:
                pt1 = max(pt1,dictionary[s[pt2]]+1) #Find the maximum length for the given position of pointer 1
            dictionary[s[pt2]] = pt2                #Update the dictionary accordingly
            maxval = max(maxval,pt2-pt1+1)          #Update the return variable if it was exceeded
        return maxval
