public class Solution {
    List<String> list;
    
    public List<String> letterCombinations(String digits) {
        list = new ArrayList<>();       
        if(digits.length()==0)
            return list;

        helper(digits, 0, "");
        return list;
    }
    
    public void helper(String digits, int index, String buffer){
        if(index==digits.length()){
            list.add(buffer);
            return;
        }
        if(digits.charAt(index)=='1' || digits.charAt(index)=='0'){
            helper(digits, index+1, buffer);
        }
        else{
            switch(digits.charAt(index)){
                case '2':
                    helper(digits, index+1, buffer+"a");
                    helper(digits, index+1, buffer+"b");
                    helper(digits, index+1, buffer+"c");
                    break;
                case '3':
                    helper(digits, index+1, buffer+"d");
                    helper(digits, index+1, buffer+"e");
                    helper(digits, index+1, buffer+"f");
                    break;
                case '4':
                    helper(digits, index+1, buffer+"g");
                    helper(digits, index+1, buffer+"h");
                    helper(digits, index+1, buffer+"i");
                    break;                   
                case '5':
                    helper(digits, index+1, buffer+"j");
                    helper(digits, index+1, buffer+"k");
                    helper(digits, index+1, buffer+"l");
                    break;
                case '6':
                    helper(digits, index+1, buffer+"m");
                    helper(digits, index+1, buffer+"n");
                    helper(digits, index+1, buffer+"o");
                    break;
                case '7':
                    helper(digits, index+1, buffer+"p");
                    helper(digits, index+1, buffer+"q");
                    helper(digits, index+1, buffer+"r");
                    helper(digits, index+1, buffer+"s");
                    break;
                case '8':
                    helper(digits, index+1, buffer+"t");
                    helper(digits, index+1, buffer+"v");
                    helper(digits, index+1, buffer+"u");
                    break;
                case '9':
                    helper(digits, index+1, buffer+"w");
                    helper(digits, index+1, buffer+"x");
                    helper(digits, index+1, buffer+"y");
                    helper(digits, index+1, buffer+"z");
                    break;
            }
        }
        return;
    }
    
}
