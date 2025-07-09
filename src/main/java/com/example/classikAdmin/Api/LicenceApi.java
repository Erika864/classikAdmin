package com.example.classikAdmin.Api;

import com.example.classikAdmin.Entity.Licence;
import com.example.classikAdmin.Service.LicenceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/licences")
@CrossOrigin("*")
public class LicenceApi {

    private final LicenceService service;

    public LicenceApi(LicenceService service) {
        this.service = service;
    }

    @GetMapping
    public List<Licence> getAllLicences() {
        return service.getAllLicences();
    }



    @PostMapping
    public Licence createLicence(@RequestBody Licence licence) {
        return service.createLicence(licence);
    }

    @PutMapping("/{id}")
    public Licence updateLicence(@PathVariable Long id, @RequestBody Licence licence) {
        return service.updateLicence(id, licence);
    }


}
