package com.monitor.parcel.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monitor.parcel.dto.AddParcelRequest;
import com.monitor.parcel.model.ParcelInfo;
import com.monitor.parcel.service.AddParcelService;


@RestController
@RequestMapping("/api/parcel")
public class ParcelInfoController {

	@Autowired
	private AddParcelService addParcelService;

    @PostMapping("/addparcel")
    public ResponseEntity addParcel(@RequestBody AddParcelRequest addParcelRequest) {
    	addParcelService.addParcel(addParcelRequest);
        return new ResponseEntity(HttpStatus.OK);
    }
    
    @GetMapping("/track/{id}")
    public ResponseEntity<ParcelInfo> getSinglePost(@PathVariable @RequestBody Long id) {
        return new ResponseEntity<>(addParcelService.readSingleParcel(id), HttpStatus.OK);
    }
}
