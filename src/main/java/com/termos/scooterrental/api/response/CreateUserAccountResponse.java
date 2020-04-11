package com.termos.scooterrental.api.response;

import com.termos.scooterrental.api.BasicResponse;

public class CreateUserAccountResponse extends BasicResponse {
    private Long accountId;

    public CreateUserAccountResponse(){

    }
    public CreateUserAccountResponse(String responseMsg, Long acoountId){
super(responseMsg);
this.accountId = acoountId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}
