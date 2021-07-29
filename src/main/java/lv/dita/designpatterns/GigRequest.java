package lv.dita.designpatterns;

public class GigRequest {

    State pendingState;
    State confirmedState;
    State archivedState;
    State state;

    public GigRequest(){
        pendingState = new PendingState(this);
        confirmedState = new ConfirmedState(this);
        archivedState = new ArchivedState(this);

        state = pendingState;
    }

    public void handleIncomingRequest(){
        state.handleRequest();
    }

    public State getPendingState() {
        return pendingState;
    }

    public State getConfirmedState() {
        return confirmedState;
    }

    public State getArchivedState() {
        return archivedState;
    }

    public State getState() {
        return state;
    }

    public void setState (State state){
        this.state = state;
    }

    public String toString () {
        return state.toString();
    }
}
