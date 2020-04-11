package com.termos.scooterrental.api.response;
import com.termos.scooterrental.api.BasicResponse;
public class AddScooterResponse extends BasicResponse {
    private Long scooterId;

    public AddScooterResponse (){

    }
    public AddScooterResponse(String responseMsg, Long scooterId){
        super(responseMsg);
        this.scooterId = scooterId;

    }

    public Long getScooterId() {
        return scooterId;
    }

    public void setScooterId(Long scooterId) {
        this.scooterId = scooterId;
    }
}
