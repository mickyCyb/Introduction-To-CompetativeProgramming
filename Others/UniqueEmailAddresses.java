class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        
        for(String email : emails){
            StringBuilder builder = new StringBuilder();
            for(int i=0; i < email.length(); i++){
                char ch = email.charAt(i);
                if(ch == '.'){
                    continue;
                }else if(ch == '+'){
                    while(email.charAt(i) != '@'){
                        i++;
                    }
                    builder.append(email.substring(i));
                    break;
                }else if(ch == '@'){
                    builder.append(email.substring(i));
                    break;
                }else{
                    builder.append(ch);
                }
            }
            set.add(builder.toString());
            //System.out.println(i);
        }
        return set.size();
    }
}