package Chapter7;
// 접근제어자 종류 : private, default, protected, public
// private -> default -> protected -> public 순으로 많은 접근 허용
// private : 해당 클래스 내에서만 접근 가능
// default : 해당 패키지 내에서 접근 가능
// protected : 동일 패키지의 클래스 또는 해당 클래스를 상속받은 다른 패키지에서 접근 가능
// public : 어떤 클래스에서라도 접근 가능

class private_Class{
    private String secret;
    private String getSecret(){
        return this.secret;
    }
}
class default_Class{
    String lastName = "park";
}
class protected_Class{
    String firstName = "Chan";
}
class public_Class{
    String middleName = "Him";
}
public class PracticeAccessModifier {
    public static void main(String[] args){
        // 메인에서 접근 불가능
        private_Class pvc = new private_Class();
        //String a = pvc.secret;
        // 메인에서 접근 가능
        default_Class dc = new default_Class();
        String a = dc.lastName;
        // 메인에서 접근 가능
        protected_Class ptc = new protected_Class();
        a += ptc.firstName;
        // 메인에서 접근 가능
        public_Class puc = new public_Class();
        a += puc.middleName;

        System.out.println(a);
    }
}
