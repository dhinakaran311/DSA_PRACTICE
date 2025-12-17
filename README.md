# DSA Practice Repository

A comprehensive collection of Data Structures and Algorithms implementations in Java, focusing on problem-solving and interview preparation.

## 📚 Table of Contents

- [Overview](#overview)
- [Topics Covered](#topics-covered)
- [Project Structure](#project-structure)
- [Implementations](#implementations)
- [How to Run](#how-to-run)
- [Future Topics](#future-topics)

## 🎯 Overview

This repository contains implementations of various data structure and algorithm problems, primarily sourced from LeetCode and GeeksforGeeks. Each solution includes comprehensive test cases to validate correctness and demonstrate usage.

## 📖 Topics Covered

### 1. Binary Heap / Priority Queue
A collection of problems utilizing heaps and priority queues for efficient solutions.

### 2. Greedy Algorithms
Placeholder directory for future greedy algorithm implementations.

## 📂 Project Structure

```
DSA_PRACTICE/
├── Binary_Heap/
│   ├── KthSmallest.java
│   ├── RankTransform.java
│   ├── TaskScheduler.java
│   ├── findKthLargest.java
│   ├── handOfStraights.java
│   └── mergeKLists.java
├── Greedy/
└── README.md
```

## 💻 Implementations

### Binary Heap Problems

#### 1. **Kth Smallest Element** ([KthSmallest.java](Binary_Heap/KthSmallest.java))
- **Problem Source**: [GeeksforGeeks](https://www.geeksforgeeks.org/problems/kth-smallest-element5635/)
- **Approach**: Max-heap of size k to maintain the k smallest elements
- **Time Complexity**: O(n log k)
- **Space Complexity**: O(k)
- **Test Cases**: 5 test cases covering various scenarios including duplicates and edge cases

#### 2. **Kth Largest Element** ([findKthLargest.java](Binary_Heap/findKthLargest.java))
- **Problem Source**: [LeetCode #215](https://leetcode.com/problems/kth-largest-element-in-an-array/)
- **Approach**: Min-heap of size k to find the kth largest element
- **Time Complexity**: O(n log k)
- **Space Complexity**: O(k)
- **Test Cases**: 5 test cases including single element, duplicates, and varied array sizes

#### 3. **Array Rank Transform** ([RankTransform.java](Binary_Heap/RankTransform.java))
- **Approach**: Priority queue with index tracking to assign ranks
- **Time Complexity**: O(n log n)
- **Space Complexity**: O(n)
- **Features**: Handles duplicates by assigning same rank
- **Test Cases**: 5 test cases including empty array, all identical elements, and mixed values

#### 4. **Task Scheduler** ([TaskScheduler.java](Binary_Heap/TaskScheduler.java))
- **Problem Source**: [LeetCode #621](https://leetcode.com/problems/task-scheduler/)
- **Approach**: Max-heap with frequency tracking and cooling period management
- **Time Complexity**: O(n)
- **Space Complexity**: O(26) for task types
- **Key Concepts**: Greedy scheduling with cooldown periods
- **Test Cases**: 5 comprehensive test cases covering various scheduling scenarios

#### 5. **Hand of Straights** ([handOfStraights.java](Binary_Heap/handOfStraights.java))
- **Approach**: Min-heap with frequency map to form consecutive groups
- **Time Complexity**: O(n log n)
- **Space Complexity**: O(n)
- **Key Features**: Validates if cards can be grouped into consecutive sequences
- **Test Cases**: 5 test cases including duplicates, gaps, and impossible configurations

#### 6. **Merge K Sorted Lists** ([mergeKLists.java](Binary_Heap/mergeKLists.java))
- **Problem Source**: [LeetCode #23](https://leetcode.com/problems/merge-k-sorted-lists/)
- **Approach**: Min-heap to efficiently merge multiple sorted linked lists
- **Time Complexity**: O(N log k) where N is total nodes and k is number of lists
- **Space Complexity**: O(k)
- **Includes**: Custom ListNode implementation and utility methods
- **Test Cases**: 5 test cases including empty lists and single element lists

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line or IDE (IntelliJ IDEA, Eclipse, VS Code)

### Running Individual Files

#### Using Command Line:
```bash
# Navigate to the specific directory
cd Binary_Heap

# Compile the Java file
javac KthSmallest.java

# Run the compiled class
java KthSmallest
```

#### Using an IDE:
1. Open the project in your preferred IDE
2. Navigate to the desired `.java` file
3. Right-click and select "Run" or use the IDE's run configuration

### Example Output
Each implementation includes a `main` method with predefined test cases that automatically execute when you run the file. The output will display the results for each test case.

## 🔮 Future Topics

The following topics are planned for future implementation:

- **Greedy Algorithms**: Activity selection, Huffman coding, job scheduling
- **Dynamic Programming**: Knapsack, longest common subsequence, matrix chain multiplication
- **Graph Algorithms**: DFS, BFS, shortest path algorithms
- **Trees**: Binary search trees, AVL trees, segment trees
- **Backtracking**: N-Queens, Sudoku solver, permutations
- **Sorting & Searching**: Various sorting algorithms and search techniques

## 📝 Notes

- All implementations include multiple test cases for validation
- Code is well-commented for better understanding
- Each solution focuses on optimal time and space complexity
- Problems are categorized by data structure/algorithm type for easy reference

## 🤝 Contributing

Feel free to add more problems and solutions following the existing structure:
1. Create appropriate directory for the topic
2. Implement the solution with clear comments
3. Include at least 5 test cases
4. Document time and space complexity

---

**Last Updated**: December 16, 2025
