package com.example.classikAdmin.Service;

import com.example.classikAdmin.Entity.Licence;
import com.example.classikAdmin.Repository.LicenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LicenceService {

    private final LicenceRepository repository;

    public LicenceService(LicenceRepository repository) {
        this.repository = repository;
    }

    public List<Licence> getAllLicences() {
        return repository.findAll();
    }



    public Licence createLicence(Licence licence) {
        // Générer une licenceKey aléatoire
        String licenceKey = generateLicenceKey();
        licence.setLicenceKey(licenceKey);

        // Activer par défaut
        licence.setActive(true);

        return repository.save(licence);
    }

    public Licence updateLicence(Long id, Licence licence) {
        licence.setId(id);
        return repository.save(licence);
    }


    // Générateur simple : format XXXX-XXXX-XXXX
    private String generateLicenceKey() {
        return UUID.randomUUID().toString()
                .replaceAll("-", "")
                .toUpperCase()
                .substring(0, 12)
                .replaceAll("(.{4})(?!$)", "$1-");
    }
}
