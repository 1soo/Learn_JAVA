package study;
/*
String : 멀티쓰레드 환경에서 안전, 연산할 시 메모리 사용 많음, 빠름
StringBuffer : 멀티 쓰레드환경에서 안전, 연산할 시 메모리 사용 적음, 느림
StringBuilder : 멀티 쓰레드환경에서 불안전, 연산할 시 메모리 사용 적음, 빠름
 */
class return_Str{
    String str;
    StringBuilder sb;
    StringBuffer sbf;
    public void set_Str(String str){
        this.str = str;
    }
    public String get_Str(){
        return str;
    }
    public void set_Sb(StringBuilder sb){
        this.sb = sb;
    }
    public String get_Sb(){
        return sb.toString();
    }
    public void set_Sbf(StringBuffer sbf){
        this.sbf = sbf;
    }
    public String get_Sbf(){
        return sbf.toString();
    }
}
public class defferenceofStringNStringBufferNStringBuilder {
    public static void main(String[] args){
        return_Str rs = new return_Str();
        rs.set_Str("abc");
        rs.set_Sb(new StringBuilder("123"));
        rs.set_Sbf(new StringBuffer("ㄱㄴㄷ"));
        System.out.println("String : " + rs.get_Str());
        System.out.println("StringBuilder : " + rs.get_Sb());
        System.out.println("StringBuffer : " + rs.get_Sbf());
    }
}