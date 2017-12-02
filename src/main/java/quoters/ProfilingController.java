package quoters;

public class ProfilingController implements ProfilingControllerMBean{

    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabler(boolean enabler) {
        this.enabled = enabler;
    }
}
