package InputOutput;

//sử dụng lớp có sẵn
import java.net.InetAddress;

public class LayDiaChiIp {
    public static void main(String[] args) throws Exception { //ném ra một ngoại lệ
        InetAddress myIP = InetAddress.getLocalHost();
        System.out.println("Địa chỉ IP của tôi là: ");
        System.out.println(myIP.getHostAddress());
    }
}
