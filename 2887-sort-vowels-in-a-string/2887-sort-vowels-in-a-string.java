class Solution1 {
    public String sortVowels(String s) {
        List<Character> vw = new ArrayList<>();
        for(char c : s.toCharArray())
        {
            if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U')
                vw.add(c);
        }
        Collections.sort(vw);

        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(char c : s.toCharArray())
        {
            if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U')
            {
                sb.append(vw.get(idx));
                idx++;
            }
            else
                sb.append(c);
        }
        return sb.toString();
    }
}




//In-Place Sorting Without Using Extra Space.
class Solution2 {
    private boolean isVowel(char c)
    {
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U')
            return true;
        return false;
    }
    private String swap(String s, int i, int j)
    {
        String pre = s.substring(0,i);
        pre=pre+s.charAt(j);
        pre=pre+s.substring(i+1,j);
        pre=pre+s.charAt(i);
        pre=pre+s.substring(j+1);
        return pre;
    }
    public String sortVowels(String s) {
        int len = s.length();
        for(int i=0;i<len-1;i++)
        {
            if(isVowel(s.charAt(i)))
            {
                for(int j=i+1;j<len;j++)
                {
                    if(isVowel(s.charAt(j)))
                    {
                        if(s.charAt(i)>s.charAt(j))
                        {
                            s=swap(s, i, j);
                        }
                    }
                }
            }
        }
        return s;
    }
}


class Solution3 {
    // Returns true if the character is a vowel.
    boolean isVowel(Character c) {
        return c == 'a' || c == 'e' || c == 'o'|| c == 'u'|| c == 'i'
                || c == 'A' || c == 'E' || c == 'O'|| c == 'U'|| c == 'I';
    }

    public String sortVowels(String s) {
        int[] count = new int[1000];

        // Store the frequencies for each character.
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                count[c - 'A']++;
            }
        }

        // Sorted string having all the vowels.
        String sortedVowel = "AEIOUaeiou";
        StringBuilder ans = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!isVowel(s.charAt(i))) {
                ans.append(s.charAt(i));
            } else {
                // Skip to the character which is having remaining count.
                while (count[sortedVowel.charAt(j) - 'A'] == 0) {
                    j++;
                }

                ans.append(sortedVowel.charAt(j));
                count[sortedVowel.charAt(j) - 'A']--;
            }
        }
        return ans.toString();
    }
}




class Solution {
    // Returns true if the character is a vowel.
    boolean isVowel(Character c) {
        return c == 'a' || c == 'e' || c == 'o'|| c == 'u'|| c == 'i'
                || c == 'A' || c == 'E' || c == 'O'|| c == 'U'|| c == 'I';
    }

    public String sortVowels(String s) {
        Queue<Integer> pq = new PriorityQueue<>();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                pq.offer((int) c);
            }
        }

        StringBuilder t = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); ++i) {
            if (isVowel(s.charAt(i))) {
                t.append((char) ((int) pq.poll()));
            } else {
                t.append(s.charAt(i));
            }
        }
        return t.toString();
    }
}