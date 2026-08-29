class Solution {
    public int firstUniqChar(String s) {
        String checked="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(checked.indexOf(ch)!=-1){
                continue;
            }
            int count=0;
            for(int j=0;j<s.length();j++){
                if(ch==s.charAt(j)){
                    count++;
                }
            }
            checked=checked+ch;
            if(count==1){
                return i;
            }
        }
        return -1;
        
    }
    public void main(String[] args){
        System.out.println(firstUniqChar("neetcodeislove"));
    }
}