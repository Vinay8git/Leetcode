class Solution {
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