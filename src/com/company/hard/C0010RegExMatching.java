package com.company.hard;

/**
 * @author Mike Kostenko on 03/03/2024
 */
public class C0010RegExMatching {
    public boolean isMatch(String s, String p) {
        char[] st = s.toCharArray();
        char[] pt = p.toCharArray();
        if (pt.length == 1) {
            if (st.length == 1) {
                return pt[0] == '.' || pt[0] == st[0];
            }
            return false;
        }
        if (p.indexOf('*') == -1 && p.length() != s.length()) {
            return false;
        }
        int sPointer = 0;
        for (int i = 0; i < pt.length; i++) {
            if (sPointer == st.length) {
                if ((i < pt.length - 1 && pt[i + 1] != '*')) {
                    return false;
                } else {
                    i++;
                    continue;
                }
            }
            if (pt[i] == st[sPointer] || pt[i] == '.') {
                sPointer++;
                continue;
            }
            if (i < pt.length - 1 && pt[i] != '*') {
                if (pt[i + 1] != '*') {
                    return false;
                }
                continue;
            }
            if (pt[i - 1] == st[sPointer] || pt[i - 1] == '.') {
                sPointer++;
                i--;
            }

        }
        return sPointer == st.length;
    }

    public static void main(String[] args) {
        C0010RegExMatching ob = new C0010RegExMatching();
        String s = "aa";
        String p = "a";

        System.out.println("### TEST1 ###");
        System.out.println("s: " + s + ", p: " + p + " FALSE -> " + ob.isMatch(s, p));

        System.out.println("### TEST2 ###");
        s = "aa";
        p = "a*";
        System.out.println("s: " + s + ", p: " + p + " TRUE -> " + ob.isMatch(s, p));

        System.out.println("<---TEST3-->");
        s = "ab";
        p = ".*";
        System.out.println("s: " + s + ", p: " + p + " TRUE -> " + ob.isMatch(s, p));

        System.out.println("<---TEST4-->");
        s = "aab";
        p = "c*a*b";
        System.out.println("s: " + s + ", p: " + p + " TRUE -> " + ob.isMatch(s, p));

        System.out.println("<---TEST5-->");
        s = "mississippi";
        p = "mis*is*ip*.";
        System.out.println("s: " + s + ", p: " + p + " TRUE -> " + ob.isMatch(s, p));

        System.out.println("<---TEST6-->");
        s = "ab";
        p = ".*c";
        System.out.println("s: " + s + ", p: " + p + " FALSE -> " + ob.isMatch(s, p));

        System.out.println("<---TEST7-->");
        s = "aaa";
        p = "aaaa";
        System.out.println("s: " + s + ", p: " + p + " FALSE -> " + ob.isMatch(s, p));

        System.out.println("<---TEST8-->");
        s = "aaa";
        p = "a*a";
        System.out.println("s: " + s + ", p: " + p + " TRUE -> " + ob.isMatch(s, p));
    }
}
