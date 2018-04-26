package com.demo;

public class Demo {
    private int compare(String str, String target) {
        int d[][]; // 矩阵
        int n = str.length();
        int m = target.length();
        int i; // 遍历str的
        int j; // 遍历target的
        char ch1; // str的
        char ch2; // target的
        int temp; // 记录相同字符,在某个矩阵位置值的增量,不是0就是1

        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }
        d = new int[n + 1][m + 1];
        for (i = 0; i <= n; i++) { // 初始化第一列
            d[i][0] = i;
        }
        for (j = 0; j <= m; j++) { // 初始化第一行
            d[0][j] = j;
        }
        for (i = 1; i <= n; i++) { // 遍历str
            ch1 = str.charAt(i - 1);
            // 去匹配target
            for (j = 1; j <= m; j++) {
                ch2 = target.charAt(j - 1);
                if (ch1 == ch2) {
                    temp = 0;
                } else {
                    temp = 1;
                }
                // 左边+1,上边+1, 左上角+temp取最小
                d[i][j] = min(d[i - 1][j] + 1, d[i][j - 1] + 1, d[i - 1][j - 1] + temp);
            }
        }
        return d[n][m];
    }

    private int min(int one, int two, int three) {
        return (one = one < two ? one : two) < three ? one : three;
    }

    /**
     * 获取两字符串的相似度
     *
     * @param str
     * @param target
     * @return
     */
    public float getSimilarityRatio(String str, String target) {
        return 1 - (float) compare(str, target) / Math.max(str.length(), target.length());
    }

    public static void main(String[] args) {
        Demo t = new Demo();
        String tag = "MySQL Server 5.6";//正确的
        String test1 = "mysql";
        String test2 = "MySQL";
        String test3 = "MySQL Server";
        String test4 = "MySQL 5.6";
        String test5 = "Server 5.6";
        String test6 = "SQL Server 5.6";
        String test7 = "MySQL Server 5.6";
        System.out.println("similarityRatio=" + t.getSimilarityRatio(test1, tag));
        System.out.println("similarityRatio=" + t.getSimilarityRatio(test2, tag));
        System.out.println("similarityRatio=" + t.getSimilarityRatio(test3, tag));
        System.out.println("similarityRatio=" + t.getSimilarityRatio(test4, tag));
        System.out.println("similarityRatio=" + t.getSimilarityRatio(test5, tag));
        System.out.println("similarityRatio=" + t.getSimilarityRatio(test6, tag));
        System.out.println("similarityRatio=" + t.getSimilarityRatio(test7, tag));
    }
}
