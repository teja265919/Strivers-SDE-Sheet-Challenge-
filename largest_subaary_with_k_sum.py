from math import *
from collections import *
from sys import *
from os import *

def LongestSubsetWithZeroSum(arr):
     n = len(arr)
     mx = 0
     map = {}
     sum = 0
     for i in range(n):
         sum += arr[i];
         if(sum == 0):
             mx = i + 1;

         
         else:
             if sum in map:
                 mx = max(mx,i - map[sum])
    
             else:
                 map[sum] = i
     return mx
