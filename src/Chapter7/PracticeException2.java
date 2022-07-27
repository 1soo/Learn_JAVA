package Chapter7;

class Send_Exception extends Exception{}
class send_Product{
    send_Product(boolean isGood, boolean isPrint, boolean isSent){
        try{
            boxing(isGood);
            printReceipt(isPrint);
            Send(isSent);
            System.out.println("Sending Product Success!!");
        }catch(Send_Exception e){
            System.err.println("Sending Product fail..");
        }
    }
    private void boxing(boolean isGood) throws Send_Exception {
        if(isGood){
            System.out.println("Boxing Complete!");
            return;
        }
        throw new Send_Exception();
    }
    private void printReceipt(boolean isPrint) throws Send_Exception {
        if(isPrint){
            System.out.println("Printing receipt Complete!");
            return;
        }
        throw new Send_Exception();
    }
    private void Send(boolean isSent) throws Send_Exception {
        if(isSent){
            System.out.println("Sending Complete!");
            return;
        }
        throw new Send_Exception();
    }
}
public class PracticeException2 {
    public static void main(String[] args){
        send_Product sp1 = new send_Product(true, true, true);
        send_Product sp2 = new send_Product(true, false, true);
        send_Product sp3 = new send_Product(false, true, true);
        send_Product sp4 = new send_Product(true, true, false);
    }
}
