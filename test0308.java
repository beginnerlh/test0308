/*
 * ��������һλ�ܰ��ļҳ�����Ҫ����ĺ�����һЩС���ɡ����ǣ�ÿ���������ֻ�ܸ�һ����ɡ�
 ��ÿ������ i ������һ��θ��ֵ gi ���������ú���������θ�ڵı��ɵ���С�ߴ磻����ÿ����� j ������һ���ߴ� sj ��
 ��� sj >= gi �����ǿ��Խ�������� j ��������� i ��������ӻ�õ����㡣���Ŀ���Ǿ���������Խ�������ĺ��ӣ��������������ֵ��
ע�⣺
����Լ���θ��ֵΪ����
һ��С�������ֻ��ӵ��һ����ɡ�

ʾ�� 1:
����: [1,2,3], [1,1]
���: 1
����: 
�����������Ӻ�����С���ɣ�3�����ӵ�θ��ֵ�ֱ��ǣ�1,2,3��
��Ȼ��������С���ɣ��������ǵĳߴ綼��1����ֻ����θ��ֵ��1�ĺ������㡣
������Ӧ�����1��

ʾ�� 2:
����: [1,2], [1,2,3]
���: 2
����: 
�����������Ӻ�����С���ɣ�2�����ӵ�θ��ֵ�ֱ���1,2��
��ӵ�еı��������ͳߴ綼���������к������㡣
������Ӧ�����2.
*/
package lianxi0308;

import java.util.Arrays;

public class test0308 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int[] g = new int[] { 1, 2};
		int[] s = new int[] { 1, 2, 3};
		int a = S.findContentChildren(g, s);
		System.out.println(a);
		
	}
}

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0, sum = 0;
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                 sum ++;
                 i++;
            }
            j ++;
        }
        return sum;
    }
}

