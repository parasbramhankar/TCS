package Impl;
/**
 * 🧪 Chemical Selection Problem
 *
 * Problem Statement:
 * You are given N chemicals indexed from 0 to N-1.
 *
 * Each chemical has:
 *   - weight[i]   → weight of the chemical
 *   - toxicity[i] → toxicity value of the chemical
 *
 * You are also given an integer W (target weight).
 *
 * Your task is to select a subset of chemicals such that:
 *
 *   1. No two selected chemicals have consecutive indices.
 *      (If you select index i, you cannot select i-1 or i+1.)
 *
 *   2. The total weight of selected chemicals must be exactly equal to W.
 *
 *   3. Among all valid selections, the total toxicity must be minimum.
 *
 * If no such subset exists, print:
 *      INVALID
 *
 * Otherwise, print the minimum total toxicity.
 *
 * ------------------------------------------------------------
 * Input Format:
 *
 * N
 * weight[0] weight[1] ... weight[N-1]
 * toxicity[0] toxicity[1] ... toxicity[N-1]
 * W
 *
 * ------------------------------------------------------------
 * Example 1:
 *
 * Input:
 * 5
 * 2 3 4 5 6
 * 3 2 7 5 1
 * 8
 *
 * Explanation:
 * Possible valid selections:
 * - Index 1 and 3 → weight = 3 + 5 = 8, toxicity = 2 + 5 = 7
 * - Index 0 and 4 → weight = 2 + 6 = 8, toxicity = 3 + 1 = 4
 *
 * Minimum toxicity = 4
 *
 * Output:
 * 4
 *
 * ------------------------------------------------------------
 * Example 2:
 *
 * Input:
 * 3
 * 1 2 3
 * 10 20 30
 * 6
 *
 * No valid subset satisfies all conditions.
 *
 * Output:
 * INVALID
 *
 * ------------------------------------------------------------
 * Constraints:
 *
 * 1 ≤ N ≤ 1000
 * 1 ≤ weight[i], toxicity[i] ≤ 10^4
 * 1 ≤ W ≤ 10^4
 *
 */

public class Chemical {
}
