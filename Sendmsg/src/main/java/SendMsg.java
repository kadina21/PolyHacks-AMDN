import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendMsg {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "AC8500d78cb36d6ea0ff3c7b5c2b1df514";
    public static final String AUTH_TOKEN = "5a187a1a4144f2d38a090ab0c63e9b49";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("+14389212796"),
                        new com.twilio.type.PhoneNumber("+14303000951"),
                        "Attention un scammer a essaye de vous appeler")
                .create();

        System.out.println(message.getSid());
    }
}
