package info.slnews.app.service.impl;

import info.slnews.app.entity.Organisation;
import info.slnews.app.repo.OrganisationRepo;
import info.slnews.app.service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganisationServiceImpl implements OrganisationService {

    @Autowired
    private OrganisationRepo organisationRepo;

    @Override
    public List<Organisation> getAll() {
        return organisationRepo.findAll();
    }
}
