package Issue;
import relic.*;

/**
 * Created by raoul on 30/04/2017.
 */
public class IssuerIssueFirstMessage {

    private ep_t S_bar, S_zero_bar;
    private byte[] nonce;

    public IssuerIssueFirstMessage(ep_t S_bar, ep_t S_zero_bar, byte[] nonce)
    {
        this.S_bar = new ep_t();
        this.S_zero_bar = new ep_t();

        Relic.INSTANCE.ep_copy(this.S_bar,S_bar);
        Relic.INSTANCE.ep_copy(this.S_zero_bar,S_zero_bar);

        this.nonce = new byte[nonce.length];
        System.arraycopy(nonce,0,this.nonce,0,this.nonce.length);
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
