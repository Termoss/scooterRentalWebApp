package com.termos.scooterrental.controller;

import com.termos.scooterrental.api.BasicResponse;
import com.termos.scooterrental.api.request.CreateUserAccountRequest;
import com.termos.scooterrental.api.response.CreateUserAccountResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user-account")
public class UserAccountContoller {
    @PostMapping(value = "/create", produces = "application/json")
    public ResponseEntity<CreateUserAccountResponse> createUserAccount(
        @RequestBody CreateUserAccountRequest request
    ){
        return null;
    }
    @PutMapping(value = "/{accountId/recharge", produces = "application/json")
    public ResponseEntity<BasicResponse> rechargeUserAccount(
            @PathVariable Long accountId,
            @RequestParam String amount
    ){
        return null;
    }
}
