package quoters;

public class ProfilingController implements ProfilingControllerMBean{

    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabler(boolean enabled) {
        this.enabled = enabled;
    }
}
