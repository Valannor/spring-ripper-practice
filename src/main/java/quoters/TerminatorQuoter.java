package quoters;

import javax.annotation.PostConstruct;

@Profiling
@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

    @PostConstruct
    public void init() {

        System.out.println("Phase 2"); //Then, Spring tunes it
        System.out.println(repeat);
    }

    public TerminatorQuoter() {

        System.out.println("Phase 1"); //First, Spring creates object
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostProxy
    public void sayQuote() {

        System.out.println("Phase 3"); //After object created and tuned. Only context listener works later

        for (int i = 0; i < repeat; i++)
            System.out.println("message = " + message);
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }
}
