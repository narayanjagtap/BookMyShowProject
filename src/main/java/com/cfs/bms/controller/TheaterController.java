package com.cfs.bms.controller;

import com.cfs.bms.dto.TheaterDto;
import com.cfs.bms.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/theaters")
public class TheaterController {

    @Autowired
    private TheaterService theaterService;

    @PostMapping
    public ResponseEntity<TheaterDto> createTheater(@RequestBody TheaterDto theaterDto) {
        TheaterDto createdTheater = theaterService.createTheater(theaterDto);
        return new ResponseEntity<>(createdTheater, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TheaterDto> getTheaterById(@PathVariable Long id) {
        TheaterDto theaterDto = theaterService.getTheaterById(id);
        return ResponseEntity.ok(theaterDto);
    }

    @GetMapping
    public ResponseEntity<List<TheaterDto>> getAllTheaters() {
        List<TheaterDto> theaters = theaterService.getAllTheaters();
        return ResponseEntity.ok(theaters);
    }

    @GetMapping("/city/{city}")
    public ResponseEntity<List<TheaterDto>> getTheatersByCity(@PathVariable String city) {
        List<TheaterDto> theaters = theaterService.getAllTheaterByCity(city);
        return ResponseEntity.ok(theaters);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TheaterDto> updateTheater(
            @PathVariable Long id,
            @RequestBody TheaterDto theaterDto) {
        TheaterDto updatedTheater = theaterService.updateTheater(id, theaterDto);
        return ResponseEntity.ok(updatedTheater);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTheater(@PathVariable Long id) {
        theaterService.deleteTheater(id);
        return ResponseEntity.ok("Theater deleted successfully with id: " + id);
    }
}