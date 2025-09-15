// class Solution1 {
//     public int canBeTypedWords(String text, String bl) {
//         List<String> al = new ArrayList<>();
//         text=text+" ";

//         String wd="";

//         for(int i=0;i<text.length();i++)
//         {
//             if(text.charAt(i) == ' ')
//             {
//                 al.add(wd);
//                 wd="";
//                 continue;
//             }
//             wd+=text.charAt(i);
//         }

//         int flag=0, count=0;
//         for(String word : al)
//         {
//             flag=0;
//             for(int i=0;i<word.length();i++)
//             {
                
//                 for(int j=0;j<bl.length();j++)
//                 {
//                     if(word.charAt(i)==bl.charAt(j))
//                     {
//                         flag=1;
//                         break;
//                     }
                    
//                 }
//                 if(flag==1)
//                     break;
//             }
//             if(flag==0) count++;
//         }
//         return count;
//     }
// }


// class Solution2 {
//     public int canBeTypedWords(String text, String bl) {
//         List<String> al = new ArrayList<>();
//         text=text+" ";

//         String wd="";

//         for(int i=0;i<text.length();i++)
//         {
//             if(text.charAt(i) == ' ')
//             {
//                 al.add(wd);
//                 wd="";
//                 continue;
//             }
//             wd+=text.charAt(i);
//         }

//         int flag=0, count=0;
//         for(String word : al)
//         {
//             flag=0;
//             for(int i=0;i<word.length();i++)
//             {
                
//                 if(bl.contains(word.substring(i,i+1)))
//                 {
//                     flag=1;
//                     break;
//                 }
                
//             }
//             if(flag==0) count++;
//         }
//         return count;
//     }
// }





// class Solution3 {
//     public int canBeTypedWords(String text, String bl) {
//         List<String> al = new ArrayList<>();
//         text=text+" ";

//         String wd="";

//         for(int i=0;i<text.length();i++)
//         {
//             if(text.charAt(i) == ' ')
//             {
//                 al.add(wd);
//                 wd="";
//                 continue;
//             }
//             wd+=text.charAt(i);
//         }

//         int flag=0, count=0;
//         for(char c : s.toCharArray())
//         {
//             for(String wd : al)
//             {
//                 if(wd.contains(c))            //CHarSequence as C
//                     count++;
//             }
//         }
//         return count;
//     }
// }




class Solution {
    public int canBeTypedWords(String text, String bl) {
        
        int flag=0, count=0;
        text=text+" ";
        String wd="";

        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i) == ' ')
            {
                flag=0;
                for(int j=0;j<wd.length();j++)
                {
                    if(bl.contains(wd.substring(j,j+1)))
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==0) count++;
                wd="";

            }
            wd+=text.charAt(i);
        }

        return count;
    }
}