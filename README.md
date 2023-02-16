# A-Star-Shortest-Pathfinding-Algorithm-Square-Grid-Java

Java based solution to find the shortest path's distance between 2 Grid Cells. [A* Shortest Pathfinding Algorithm]

### Paths and Values
```
Manhattan Path - Travels in vertical/horizontal directions (Vertical/Horizontal gCost = 1)
Chebyshev Path - Travels in both diagonal and vertical/horizontal directions (Vertical/Horizontal gCost = 1, Diagonal gCost = 1)
Euclidean Path - Travels in both diagonal and vertical/horizontal directions (Vertical/Horizontal gCost = 1, Diagonal gCost = 1.4)
```

### Input
```
Grid size (NxN) => E.g: 20
Percolation ratio (0-1) => E.g: 0.8
x, y  coordinates of the starting cell => E.g: 0, 0
x, y  coordinates of the ending cell => E.g: 19, 19
```

### Output
```
Total path gCost 
Time taken to calculate the shortest path
Manhattan Path - Yellow line
Chebyshev Path - Squares filled in red color
Euclidean Path - Black line
```

## Screenshots

**Grid Size: 20x20, Percolation Ratio: 0.8**

<img src="http://i.imgur.com/TK91JQ9.png" width="350">

**Grid Size: 20x20, Percolation Ratio: 0.6**

<img src="http://i.imgur.com/tJH5BUp.png" width="350">

# HI, I've made this thing run faster, here's dem notes bout it belorw

A* Optimizations:

### Settings:
```
N - 500
Percolation - 1
y1 - 0
x1 - 0
y2 - 499
x2 - 499
(This makes it travel a hypotenuse of 707.1 cm)
```
### Record of Improvements:
```
Regular - 18 seconds
Removing Math.sqrt() - 9 seconds
Doubles to Ints - -0.5 seconds
Changing Math.pow() to timesing the value by itself - +1 SECOND (WTF) (java has its Math class (probably) optimized to the moon and back for .pow())
```
