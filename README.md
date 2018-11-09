# Painting the fence  

Goal: Given a fence with n posts and k colors, find out the number of ways of painting the fence such that at most 2 adjacent posts have the same color.  
  
Input: Both n and k are positive integers.
  
Example: We have 4 colors and 2 posts.  
Ways when both posts have same color : 4  
Ways when both posts have diff color :  
4*(choices for 1st post) * 3(choices for  
2nd post) = 12  
Then the output must be 4+12= 16  
Input : n = 2 k = 4  
Output : 16  
Please use dynamic programming and write code which is according to the rules above!  
  
Watch out the type- it is possible to become a big number!!!  