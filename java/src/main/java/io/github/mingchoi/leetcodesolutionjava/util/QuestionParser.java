package io.github.mingchoi.leetcodesolutionjava.util;

import java.io.File;
import java.util.ArrayList;

public class QuestionParser {

    private static final String page1Data = "\t1\t\n" +
            "Two Sum    \n" +
            "\t\t42.8%\tEasy\t\n" +
            "\t2\t\n" +
            "Add Two Numbers    \n" +
            "\t\t30.8%\tMedium\t\n" +
            "\t3\t\n" +
            "Longest Substring Without Repeating Characters    \n" +
            "\t\t28.1%\tMedium\t\n" +
            "\t4\t\n" +
            "Median of Two Sorted Arrays    \n" +
            "\t\t25.8%\tHard\t\n" +
            "\t5\t\n" +
            "Longest Palindromic Substring    \n" +
            "\t\t26.9%\tMedium\t\n" +
            "\t7\t\n" +
            "Reverse Integer    \n" +
            "\t\t25.2%\tEasy\t\n" +
            "\t8\t\n" +
            "String to Integer (atoi)    \n" +
            "\t\t14.6%\tMedium\t\n" +
            "\t10\t\n" +
            "Regular Expression Matching    \n" +
            "\t\t25.1%\tHard\t\n" +
            "\t11\t\n" +
            "Container With Most Water    \n" +
            "\t\t43.3%\tMedium\t\n" +
            "\t13\t\n" +
            "Roman to Integer    \n" +
            "\t\t51.8%\tEasy\t\n" +
            "\t14\t\n" +
            "Longest Common Prefix    \n" +
            "\t\t33.2%\tEasy\t\n" +
            "\t15\t\n" +
            "3Sum    \n" +
            "\t\t23.6%\tMedium\t\n" +
            "\t17\t\n" +
            "Letter Combinations of a Phone Number    \n" +
            "\t\t40.8%\tMedium\t\n" +
            "\t19\t\n" +
            "Remove Nth Node From End of List    \n" +
            "\t\t34.1%\tMedium\t\n" +
            "\t20\t\n" +
            "Valid Parentheses    \n" +
            "\t\t36.1%\tEasy\t\n" +
            "\t21\t\n" +
            "Merge Two Sorted Lists    \n" +
            "\t\t46.3%\tEasy\t\n" +
            "\t22\t\n" +
            "Generate Parentheses    \n" +
            "\t\t53.7%\tMedium\t\n" +
            "\t23\t\n" +
            "Merge k Sorted Lists    \n" +
            "\t\t33.5%\tHard\t\n" +
            "\t26\t\n" +
            "Remove Duplicates from Sorted Array    \n" +
            "\t\t40.0%\tEasy\t\n" +
            "\t28\t\n" +
            "Implement strStr()    \n" +
            "\t\t31.5%\tEasy\t\n" +
            "\t29\t\n" +
            "Divide Two Integers    \n" +
            "\t\t16.1%\tMedium\t\n" +
            "\t33\t\n" +
            "Search in Rotated Sorted Array    \n" +
            "\t\t32.7%\tMedium\t\n" +
            "\t34\t\n" +
            "Find First and Last Position of Element in Sorted Array    \n" +
            "\t\t33.2%\tMedium\t\n" +
            "\t36\t\n" +
            "Valid Sudoku    \n" +
            "\t\t42.3%\tMedium\t\n" +
            "\t38\t\n" +
            "Count and Say    \n" +
            "\t\t39.9%\tEasy\t\n" +
            "\t41\t\n" +
            "First Missing Positive    \n" +
            "\t\t28.4%\tHard\t\n" +
            "\t42\t\n" +
            "Trapping Rain Water    \n" +
            "\t\t42.4%\tHard\t\n" +
            "\t44\t\n" +
            "Wildcard Matching    \n" +
            "\t\t22.5%\tHard\t\n" +
            "\t46\t\n" +
            "Permutations    \n" +
            "\t\t54.0%\tMedium\t\n" +
            "\t48\t\n" +
            "Rotate Image    \n" +
            "\t\t47.4%\tMedium\t\n" +
            "\t49\t\n" +
            "Group Anagrams    \n" +
            "\t\t45.4%\tMedium\t\n" +
            "\t50\t\n" +
            "Pow(x, n)    \n" +
            "\t\t27.7%\tMedium\t\n" +
            "\t53\t\n" +
            "Maximum Subarray    \n" +
            "\t\t43.1%\tEasy\t\n" +
            "\t54\t\n" +
            "Spiral Matrix    \n" +
            "\t\t29.9%\tMedium\t\n" +
            "\t55\t\n" +
            "Jump Game    \n" +
            "\t\t31.5%\tMedium\t\n" +
            "\t56\t\n" +
            "Merge Intervals    \n" +
            "\t\t35.1%\tMedium\t\n" +
            "\t62\t\n" +
            "Unique Paths    \n" +
            "\t\t46.8%\tMedium\t\n" +
            "\t66\t\n" +
            "Plus One    \n" +
            "\t\t40.9%\tEasy\t\n" +
            "\t69\t\n" +
            "Sqrt(x)    \n" +
            "\t\t30.9%\tEasy\t\n" +
            "\t70\t\n" +
            "Climbing Stairs    \n" +
            "\t\t43.7%\tEasy\t\n" +
            "\t73\t\n" +
            "Set Matrix Zeroes    \n" +
            "\t\t39.2%\tMedium\t\n" +
            "\t75\t\n" +
            "Sort Colors    \n" +
            "\t\t41.6%\tMedium\t\n" +
            "\t76\t\n" +
            "Minimum Window Substring    \n" +
            "\t\t30.2%\tHard\t\n" +
            "\t78\t\n" +
            "Subsets    \n" +
            "\t\t51.6%\tMedium\t\n" +
            "\t79\t\n" +
            "Word Search    \n" +
            "\t\t30.7%\tMedium\t\n" +
            "\t84\t\n" +
            "Largest Rectangle in Histogram    \n" +
            "\t\t30.5%\tHard\t\n" +
            "\t88\t\n" +
            "Merge Sorted Array    \n" +
            "\t\t35.1%\tEasy\t\n" +
            "\t91\t\n" +
            "Decode Ways    \n" +
            "\t\t22.0%\tMedium\t\n" +
            "\t94\t\n" +
            "Binary Tree Inorder Traversal    \n" +
            "\t\t55.6%\tMedium\t\n" +
            "\t98\t\n" +
            "Validate Binary Search Tree    \n" +
            "\t\t25.4%\tMedium\t";
    private static final String page2Data = "\t101\t\n" +
            "Symmetric Tree    \n" +
            "\t\t43.0%\tEasy\t\n" +
            "\t102\t\n" +
            "Binary Tree Level Order Traversal    \n" +
            "\t\t47.5%\tMedium\t\n" +
            "\t103\t\n" +
            "Binary Tree Zigzag Level Order Traversal    \n" +
            "\t\t40.9%\tMedium\t\n" +
            "\t104\t\n" +
            "Maximum Depth of Binary Tree    \n" +
            "\t\t59.6%\tEasy\t\n" +
            "\t105\t\n" +
            "Construct Binary Tree from Preorder and Inorder Traversal    \n" +
            "\t\t40.0%\tMedium\t\n" +
            "\t108\t\n" +
            "Convert Sorted Array to Binary Search Tree    \n" +
            "\t\t49.7%\tEasy\t\n" +
            "\t116\t\n" +
            "Populating Next Right Pointers in Each Node    \n" +
            "\t\t37.1%\tMedium\t\n" +
            "\t118\t\n" +
            "Pascal's Triangle    \n" +
            "\t\t45.0%\tEasy\t\n" +
            "\t121\t\n" +
            "Best Time to Buy and Sell Stock    \n" +
            "\t\t46.6%\tEasy\t\n" +
            "\t122\t\n" +
            "Best Time to Buy and Sell Stock II    \n" +
            "\t\t51.2%\tEasy\t\n" +
            "\t124\t\n" +
            "Binary Tree Maximum Path Sum    \n" +
            "\t\t29.5%\tHard\t\n" +
            "\t125\t\n" +
            "Valid Palindrome    \n" +
            "\t\t30.5%\tEasy\t\n" +
            "\t127\t\n" +
            "Word Ladder    \n" +
            "\t\t23.3%\tMedium\t\n" +
            "\t128\t\n" +
            "Longest Consecutive Sequence    \n" +
            "\t\t41.1%\tHard\t\n" +
            "\t130\t\n" +
            "Surrounded Regions    \n" +
            "\t\t22.3%\tMedium\t\n" +
            "\t131\t\n" +
            "Palindrome Partitioning    \n" +
            "\t\t40.0%\tMedium\t\n" +
            "\t134\t\n" +
            "Gas Station    \n" +
            "\t\t33.2%\tMedium\t\n" +
            "\t136\t\n" +
            "Single Number    \n" +
            "\t\t59.4%\tEasy\t\n" +
            "\t138\t\n" +
            "Copy List with Random Pointer    \n" +
            "\t\t26.2%\tMedium\t\n" +
            "\t139\t\n" +
            "Word Break    \n" +
            "\t\t34.7%\tMedium\t\n" +
            "\t140\t\n" +
            "Word Break II    \n" +
            "\t\t26.9%\tHard\t\n" +
            "\t141\t\n" +
            "Linked List Cycle    \n" +
            "\t\t36.2%\tEasy\t\n" +
            "\t146\t\n" +
            "LRU Cache    \n" +
            "\t\t24.5%\tHard\t\n" +
            "\t148\t\n" +
            "Sort List    \n" +
            "\t\t34.4%\tMedium\t\n" +
            "\t149\t\n" +
            "Max Points on a Line    \n" +
            "\t\t15.6%\tHard\t\n" +
            "\t150\t\n" +
            "Evaluate Reverse Polish Notation    \n" +
            "\t\t31.6%\tMedium\t\n" +
            "\t152\t\n" +
            "Maximum Product Subarray    \n" +
            "\t\t28.7%\tMedium\t\n" +
            "\t155\t\n" +
            "Min Stack    \n" +
            "\t\t36.1%\tEasy\t\n" +
            "\t160\t\n" +
            "Intersection of Two Linked Lists    \n" +
            "\t\t32.8%\tEasy\t\n" +
            "\t162\t\n" +
            "Find Peak Element    \n" +
            "\t\t40.9%\tMedium\t\n" +
            "\t163\t\n" +
            "Missing Ranges    \n" +
            "\t\t23.0%\tMedium\t\n" +
            "\t166\t\n" +
            "Fraction to Recurring Decimal    \n" +
            "\t\t19.3%\tMedium\t\n" +
            "\t169\t\n" +
            "Majority Element    \n" +
            "\t\t51.9%\tEasy\t\n" +
            "\t171\t\n" +
            "Excel Sheet Column Number    \n" +
            "\t\t51.1%\tEasy\t\n" +
            "\t172\t\n" +
            "Factorial Trailing Zeroes    \n" +
            "\t\t37.3%\tEasy\t\n" +
            "\t179\t\n" +
            "Largest Number    \n" +
            "\t\t25.4%\tMedium\t\n" +
            "\t189\t\n" +
            "Rotate Array    \n" +
            "\t\t29.3%\tEasy\t\n" +
            "\t190\t\n" +
            "Reverse Bits    \n" +
            "\t\t30.5%\tEasy\t\n" +
            "\t191\t\n" +
            "Number of 1 Bits    \n" +
            "\t\t42.4%\tEasy\t\n" +
            "\t198\t\n" +
            "House Robber    \n" +
            "\t\t40.9%\tEasy\t\n" +
            "\t200\t\n" +
            "Number of Islands    \n" +
            "\t\t40.7%\tMedium\t\n" +
            "\t202\t\n" +
            "Happy Number    \n" +
            "\t\t44.5%\tEasy\t\n" +
            "\t204\t\n" +
            "Count Primes    \n" +
            "\t\t28.5%\tEasy\t\n" +
            "\t206\t\n" +
            "Reverse Linked List    \n" +
            "\t\t53.4%\tEasy\t\n" +
            "\t207\t\n" +
            "Course Schedule    \n" +
            "\t\t37.1%\tMedium\t\n" +
            "\t208\t\n" +
            "Implement Trie (Prefix Tree)    \n" +
            "\t\t37.3%\tMedium\t\n" +
            "\t210\t\n" +
            "Course Schedule II    \n" +
            "\t\t34.0%\tMedium\t\n" +
            "\t212\t\n" +
            "Word Search II    \n" +
            "\t\t27.9%\tHard\t\n" +
            "\t215\t\n" +
            "Kth Largest Element in an Array    \n" +
            "\t\t46.6%\tMedium\t\n" +
            "\t217\t\n" +
            "Contains Duplicate    \n" +
            "\t\t51.2%\tEasy\t";
    private static final String page3Data = "\t218\t\n" +
            "The Skyline Problem    \n" +
            "\t\t31.3%\tHard\t\n" +
            "\t227\t\n" +
            "Basic Calculator II    \n" +
            "\t\t32.9%\tMedium\t\n" +
            "\t230\t\n" +
            "Kth Smallest Element in a BST    \n" +
            "\t\t50.4%\tMedium\t\n" +
            "\t234\t\n" +
            "Palindrome Linked List    \n" +
            "\t\t35.5%\tEasy\t\n" +
            "\t236\t\n" +
            "Lowest Common Ancestor of a Binary Tree    \n" +
            "\t\t36.1%\tMedium\t\n" +
            "\t237\t\n" +
            "Delete Node in a Linked List    \n" +
            "\t\t52.5%\tEasy\t\n" +
            "\t238\t\n" +
            "Product of Array Except Self    \n" +
            "\t\t54.2%\tMedium\t\n" +
            "\t239\t\n" +
            "Sliding Window Maximum    \n" +
            "\t\t37.5%\tHard\t\n" +
            "\t240\t\n" +
            "Search a 2D Matrix II    \n" +
            "\t\t40.4%\tMedium\t\n" +
            "\t242\t\n" +
            "Valid Anagram    \n" +
            "\t\t51.3%\tEasy\t\n" +
            "\t251\t\n" +
            "Flatten 2D Vector    \n" +
            "\t\t43.5%\tMedium\t\n" +
            "\t253\t\n" +
            "Meeting Rooms II    \n" +
            "\t\t42.5%\tMedium\t\n" +
            "\t268\t\n" +
            "Missing Number    \n" +
            "\t\t47.8%\tEasy\t\n" +
            "\t269\t\n" +
            "Alien Dictionary    \n" +
            "\t\t30.4%\tHard\t\n" +
            "\t277\t\n" +
            "Find the Celebrity    \n" +
            "\t\t35.9%\tMedium\t\n" +
            "\t279\t\n" +
            "Perfect Squares    \n" +
            "\t\t41.2%\tMedium\t\n" +
            "\t283\t\n" +
            "Move Zeroes    \n" +
            "\t\t53.9%\tEasy\t\n" +
            "\t285\t\n" +
            "Inorder Successor in BST    \n" +
            "\t\t33.9%\tMedium\t\n" +
            "\t287\t\n" +
            "Find the Duplicate Number    \n" +
            "\t\t48.7%\tMedium\t\n" +
            "\t289\t\n" +
            "Game of Life    \n" +
            "\t\t44.1%\tMedium\t\n" +
            "\t295\t\n" +
            "Find Median from Data Stream    \n" +
            "\t\t35.5%\tHard\t\n" +
            "\t297\t\n" +
            "Serialize and Deserialize Binary Tree    \n" +
            "\t\t39.9%\tHard\t\n" +
            "\t300\t\n" +
            "Longest Increasing Subsequence    \n" +
            "\t\t40.4%\tMedium\t\n" +
            "\t308\t\n" +
            "Range Sum Query 2D - Mutable    \n" +
            "\t\t31.3%\tHard\t\n" +
            "\t315\t\n" +
            "Count of Smaller Numbers After Self    \n" +
            "\t\t37.5%\tHard\t\n" +
            "\t322\t\n" +
            "Coin Change    \n" +
            "\t\t29.6%\tMedium\t\n" +
            "\t324\t\n" +
            "Wiggle Sort II    \n" +
            "\t\t27.6%\tMedium\t\n" +
            "\t326\t\n" +
            "Power of Three    \n" +
            "\t\t41.5%\tEasy\t\n" +
            "\t328\t\n" +
            "Odd Even Linked List    \n" +
            "\t\t48.5%\tMedium\t\n" +
            "\t329\t\n" +
            "Longest Increasing Path in a Matrix    \n" +
            "\t\t39.5%\tHard\t\n" +
            "\t334\t\n" +
            "Increasing Triplet Subsequence    \n" +
            "\t\t39.5%\tMedium\t\n" +
            "\t340\t\n" +
            "Longest Substring with At Most K Distinct Characters    \n" +
            "\t\t39.3%\tHard\t\n" +
            "\t341\t\n" +
            "Flatten Nested List Iterator    \n" +
            "\t\t47.1%\tMedium\t\n" +
            "\t344\t\n" +
            "Reverse String    \n" +
            "\t\t63.0%\tEasy\t\n" +
            "\t347\t\n" +
            "Top K Frequent Elements    \n" +
            "\t\t53.9%\tMedium\t\n" +
            "\t348\t\n" +
            "Design Tic-Tac-Toe    \n" +
            "\t\t48.9%\tMedium\t\n" +
            "\t350\t\n" +
            "Intersection of Two Arrays II    \n" +
            "\t\t47.1%\tEasy\t\n" +
            "\t371\t\n" +
            "Sum of Two Integers    \n" +
            "\t\t51.1%\tEasy\t\n" +
            "\t378\t\n" +
            "Kth Smallest Element in a Sorted Matrix    \n" +
            "\t\t48.7%\tMedium\t\n" +
            "\t380\t\n" +
            "Insert Delete GetRandom O(1)    \n" +
            "\t\t42.2%\tMedium\t\n" +
            "\t384\t\n" +
            "Shuffle an Array    \n" +
            "\t\t49.7%\tMedium\t\n" +
            "\t387\t\n" +
            "First Unique Character in a String    \n" +
            "\t\t49.5%\tEasy\t\n" +
            "\t395\t\n" +
            "Longest Substring with At Least K Repeating Characters    \n" +
            "\t\t38.1%\tMedium\t\n" +
            "\t412\t\n" +
            "Fizz Buzz    \n" +
            "\t\t59.1%\tEasy\t\n" +
            "\t454\t\n" +
            "4Sum II    \n" +
            "\t\t50.0%\tMedium\t";

    /**
     * Generation
     */

    private static final String targetData = page2Data;

    public static void main(String[] args) {
        ArrayList<String> folders = Question2Folder(rawData2Questions(targetData));
        for (String folder : folders) {
            new File("src/main/java/io/github/mingchoi/leetcodesolutionjava/" + folder).mkdir();
        }
    }

    private static ArrayList<Question> rawData2Questions(String rawData) {
        ArrayList<Question> questions = new ArrayList<>();
        String[] lines = targetData.split("\n");
        for (int n = 0; n < lines.length; n += 3) {
            Question q = new Question();
            q.Id = Integer.parseInt(lines[n].trim());
            q.Title = lines[n + 1].trim();
            q.Difficulty = lines[n + 2].trim().split("\t")[1];
            questions.add(q);
        }
        return questions;
    }

    private static ArrayList<String> Question2Folder(ArrayList<Question> qs) {
        ArrayList<String> folders = new ArrayList<>();
        for (int i = 0; i < qs.size(); i++) {
            Question q = qs.get(i);
            String folderName = "q" + q.Id + "_" + q.Title;
            folders.add(dashedString(folderName));
        }
        return folders;
    }

    private static String dashedString(String str) {
        return str.replaceAll(" ", "_")
                .replaceAll("[()]", "")
                .toLowerCase();
    }
}
