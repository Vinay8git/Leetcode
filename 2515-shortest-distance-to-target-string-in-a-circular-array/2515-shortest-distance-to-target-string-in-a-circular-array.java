class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {

        if(words[startIndex].equals(target)) return 0;
        int k=1, n=words.length;
        System.out.println(n);
        int i=(startIndex-1+n)%n;
        int j=(startIndex+1)%n;
        do{
            if(words[i].equals(target) || words[j].equals(target)) return k;
            i=(i-1+n)%n;
            j=(j+1)%n;
            k++;
        }while(i!=j);
        if(words[i].equals(target) || words[j].equals(target)) return k;
        return -1;
    }
}