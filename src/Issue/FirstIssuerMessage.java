package Issue;
import relic.*;
import irma.*;

/**
 * Created by raoul on 30/04/2017.
 */
public class FirstIssuerMessage {

    private ep_t S_bar, S_zero_bar;
    private byte[] nonce;

    public FirstIssuerMessage(ep_t S_bar,ep_t S_zero_bar, byte[] nonce)
    {
        //TODO ALSO INCLUDE NONCE SHOULD BE INPUT VALUE TO HASHFUNCTION\
        //Secure PRNG func to fill nonce
        //CHECK EP2_T AND EP_T
        this.S_bar = S_bar;
        this.S_zero_bar = S_zero_bar;
        this.nonce = nonce;
    }

    public byte[] getNonce()
    {
        byte[] copy = new byte[nonce.length];
        System.arraycopy(nonce,0,copy,0,copy.length);
        return copy;
    }

    public ep_t getS_bar()
    {
        ep_t copy = new ep_t();
        Relic.INSTANCE.ep_copy(copy,this.S_bar);
        return copy;
    }

    public ep_t getS_zero_bar()
    {
        ep_t copy = new ep_t();
        Relic.INSTANCE.ep_copy(copy,this.S_zero_bar);
        return copy;
    }
}