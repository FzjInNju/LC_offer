public class O05 {
    public String replaceSpace(String s) {
        /* 用字符串存储数据，不合适，因为字符串是java中虚拟创建的数据结构，没有基本数据结构效率高，所以考虑使用数组array、链表、栈、队列
        数组结构最简单效率最高，能用数组则尽量用数组，条件是：相同数据类型、连续存储、索引查找
        链表不连续存储
        栈 LIFO
        队列 FIFO
        所以考虑使用数组
        String res = "";
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                res += "%20";
            }else{
                res += s.charAt(i);
            }
        }
        return res;*/
        // 思考（或者优化第一种想法）数据存储的方式
        char res[] = new char[s.length() * 3];
        int size = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                res[size++] = '%';
                res[size++] = '2';
                res[size++] = '0';
            }else{
                res[size++] = s.charAt(i);
            }
        }
        return new String(res,0,size);

    }
    public static void main(String args[]){
        O05 o05 = new O05();
        System.out.println(o05.replaceSpace("asdf as 1"));
    }
}
