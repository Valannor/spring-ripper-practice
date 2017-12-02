package quoters;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

    @PostConstruct
    public void init() {

        System.out.println("Phase 2"); //Then, Spring tune it
        System.out.println(repeat);
    }

    public TerminatorQuoter() {

        System.out.println("Phase 1"); //First, Spring creates object
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void sayQuote() {
        for (int i = 0; i < repeat; i++)
            System.out.println("message = " + message);
    }
}
