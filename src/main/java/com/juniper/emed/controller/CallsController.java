package com.juniper.emed.controller;

import com.juniper.emed.entity.Calls;
import com.juniper.emed.payload.CallsDto;
import com.juniper.emed.service.CallsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/calls")
public class CallsController {

    @Autowired
    private CallsService callsService;

    @PostMapping("/save")
    public ResponseEntity saveCall(@RequestBody CallsDto callsDto)
    {
        return ResponseEntity.ok(callsService.save(callsDto));
    }

    @GetMapping("/get-one/{id}")
    public ResponseEntity getOneCall(@PathVariable("id") Long id)
    {
        return ResponseEntity.ok(callsService.getOne(id));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Calls>> getAllCalls()
    {
        return ResponseEntity.ok(callsService.getAll());
    }

    @PutMapping("/confirm-call/{callId}/{deseaseId}")
    public ResponseEntity confirmCalls(@PathVariable("callId") Long callId, @PathVariable("deseaseId") Long deseaseId)
    {
        return ResponseEntity.ok(callsService.confirmCall(callId,deseaseId));
    }
}
