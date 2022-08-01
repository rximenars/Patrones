public class Gym
{
    private State myState;

    public void setState (State st)
    {
        this.myState = st;
    }

    public void ejecutarAccion()
    {
        myState.ejecutarAccion();
    }
}


