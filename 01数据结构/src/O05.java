public class O05 {
    public String replaceSpace(String s) {
        String res = "";
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                res += "%20";
            }else{
                res += s.charAt(i);
            }
        }
        return res;
    }
    public static void main(String args[]){
        O05 o05 = new O05();
        System.out.println(o05.replaceSpace("asdf as 1"));
    }
}
