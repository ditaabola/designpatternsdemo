package lv.dita.designpatterns.GigRequest;

import lv.dita.designpatterns.GigRequest.State;

public class ConfirmedState extends State {
    private GigRequest request;

    public ConfirmedState (GigRequest request){
        this.request = request;
    }

    @Override
    public void handleRequest(){
        System.out.println("Turning this request into done");
        request.setState(request.getArchivedState());
    }

    @Override
    public String toString() {
        return "This is a confirmed request";
    }
}
